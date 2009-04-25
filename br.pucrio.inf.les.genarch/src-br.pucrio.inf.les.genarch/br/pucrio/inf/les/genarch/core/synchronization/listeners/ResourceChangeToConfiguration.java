package br.pucrio.inf.les.genarch.core.synchronization.listeners;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.runtime.Path;

import br.pucrio.inf.les.genarch.core.logic.Logic;
import br.pucrio.inf.les.genarch.core.models.dsl.ConfigurationModelUtil;
import br.pucrio.inf.les.genarch.core.models.dsl.FMPModelUitl;
import br.pucrio.inf.les.genarch.core.project.GenarchProjectConfigurationFile;
import br.pucrio.inf.les.genarch.core.project.navigation.itens.FeatureItem;
import br.pucrio.inf.les.genarch.core.resources.dsl.AspectAnnotationUtil;
import br.pucrio.inf.les.genarch.core.resources.dsl.JavaAnnotationUtil;
import br.pucrio.inf.les.genarch.models.configuration.ConfigurationFactory;
import br.pucrio.inf.les.genarch.models.configuration.ConfigurationPackage;
import br.pucrio.inf.les.genarch.models.configuration.FeatureExpression;
import br.pucrio.inf.les.genarch.models.configuration.MappingEntity;
import ca.uwaterloo.gp.fmp.Feature;
import ca.uwaterloo.gp.fmp.FeatureGroup;
import ca.uwaterloo.gp.fmp.Node;
import ca.uwaterloo.gp.fmp.system.ModelNavigation;

public class ResourceChangeToConfiguration {

	private Map<String,ConfigurationModelUtil> configurationModelsChanged = new HashMap<String,ConfigurationModelUtil>();
	private Map<String,FMPModelUitl> featureModelsChanged = new HashMap<String,FMPModelUitl>();

	private ConfigurationFactory configurationFactory = ConfigurationPackage.eINSTANCE.getConfigurationFactory();
	private ModelNavigation fmpNavigation = ModelNavigation.INSTANCE;

	public void resourceChanged(ResourcesEventData eventData, int eventType) {
		IResource res = eventData.getResource();
		boolean exc = false;

		if ( eventData.getEventType() == IResourceDelta.ADDED ) {

			if ( "java".equals(res.getFileExtension()) || "aj".equals(res.getFileExtension()) ) {
				List<FeatureItem> features = new ArrayList<FeatureItem>();

				if ( "java".equals(res.getFileExtension()) ) {			
					features = JavaAnnotationUtil.featureAnnotations((IFile)res);
				} else {
					features = AspectAnnotationUtil.featuresAnnotations((IFile)res);
				}

				if ( features.size() > 0 ) {
					ConfigurationModelUtil configurationModelUtil = configurationModelsChanged.get(res.getProject().getName());
					FMPModelUitl featureModelUtil = featureModelsChanged.get(res.getProject().getName());

					if ( configurationModelUtil == null ) {
						GenarchProjectConfigurationFile genarchProjectConfigurationFile = GenarchProjectConfigurationFile.open(res.getProject());

						String configurationModelName = genarchProjectConfigurationFile.getConfigurationModelPath();
						configurationModelUtil = new ConfigurationModelUtil(res.getProject());
						configurationModelsChanged.put(res.getProject().getName(),configurationModelUtil);		    
					}

					if ( featureModelUtil == null ) {
						GenarchProjectConfigurationFile genarchProjectConfigurationFile = GenarchProjectConfigurationFile.open(res.getProject());

						featureModelUtil = new FMPModelUitl(res.getProject(),new Path(genarchProjectConfigurationFile.getFeatureModelPath()));
						featureModelsChanged.put(res.getProject().getName(), featureModelUtil);
					}

					MappingEntity newEntity;

					if ( "java".equals(res.getFileExtension()) ) {
						newEntity = configurationFactory.createConfigurationClass();
					} else {
						newEntity = configurationFactory.createConfigurationAspect();
					}

					newEntity.setName(res.getName());
					newEntity.setPath(res.getProjectRelativePath().toString());

					FeatureExpression featureExpression = configurationFactory.createFeatureExpression();
					StringBuilder builder = new StringBuilder();

					for ( int x = 0; x < features.size()-1; x++ ) {
						builder.append(features.get(x).getName() + " and ");
					}

					builder.append(features.get(features.size()-1).getName());

					featureExpression.setExpression(builder.toString());
					newEntity.setFeatureExpression(featureExpression);

					configurationModelUtil.addMappingElement(newEntity);

					//Modifico o Modelo de Caracteristicas		    		    
					if ( features.size() > 0 ) {
						Node model = featureModelUtil.getFmpProject().getModel();

						for ( FeatureItem featureItem : features ) {
							Feature fmpFeature = (Feature)fmpNavigation.findNodeWithName(model, featureItem.getName());

							if ( fmpFeature != null ) {				
								Feature fmpFeatureParent = (Feature)fmpFeature.eContainer();

								if ( fmpFeatureParent != null ) {
									if ( !fmpFeatureParent.getName().equals(featureItem.getParent()) ) {
										featureModelUtil.addFeature(featureItem);
									}
								}
							} else {
								featureModelUtil.addFeature(featureItem);
							}
						}
					}

					exc = true;
				}		
			}	    
		} else if ( eventData.getEventType() == IResourceDelta.CHANGED ) {

			if ( "java".equals(res.getFileExtension()) || "aj".equals(res.getFileExtension()) ) {
				ConfigurationModelUtil configurationModelUtil = configurationModelsChanged.get(res.getProject().getName());
				FMPModelUitl featureModelUtil = featureModelsChanged.get(res.getProject().getName());

				if ( configurationModelUtil == null ) {					
					GenarchProjectConfigurationFile genarchProjectConfigurationFile = GenarchProjectConfigurationFile.open(res.getProject());

					String configurationModelName = genarchProjectConfigurationFile.getConfigurationModelPath();
					configurationModelUtil = new ConfigurationModelUtil(res.getProject());
					configurationModelsChanged.put(res.getProject().getName(),configurationModelUtil);		    
				}

				if ( featureModelUtil == null ) {
					GenarchProjectConfigurationFile genarchProjectConfigurationFile = GenarchProjectConfigurationFile.open(res.getProject());

					featureModelUtil = new FMPModelUitl(res.getProject(),new Path(genarchProjectConfigurationFile.getFeatureModelPath()));
					featureModelsChanged.put(res.getProject().getName(), featureModelUtil);
				}

				List<FeatureItem> features = new ArrayList<FeatureItem>();

				if ( "java".equals(res.getFileExtension()) ) {			
					features = JavaAnnotationUtil.featureAnnotations((IFile)res);
				} else if ( "aj".equals(res.getFileExtension()) ) {
					features = AspectAnnotationUtil.featuresAnnotations((IFile)res);
				}

				//Lista vazia pode corresponder a uma remo��o de todas as features, tem que verificar se o elemento existe no modelo de
				//configuracao e remove-lo
				if ( features.size() == 0 ) {
					MappingEntity mappingEntity = configurationModelUtil.mappingElement(res.getProjectRelativePath().toString());

					if ( mappingEntity != null ) {
						configurationModelUtil.removeMappingElement(res.getProjectRelativePath().toString());
						exc = true;
					}
				} else if ( features.size() > 0 ) {
					//Verificar se o elemento existe no modelo de configuracao
					MappingEntity mappingEntity = configurationModelUtil.mappingElement(res.getProjectRelativePath().toString());

					//Se existir, verificar se a feature corresponde a feature configurada no elemento
					if ( mappingEntity != null ) {
						//Merge entre a lista de features do elemento e do resource
						List<String> expressionFeatures = Logic.toFeatures(mappingEntity.getFeatureExpression().getExpression());			    
						List<String> annotedFeatures = new ArrayList<String>();

						for ( FeatureItem featureItem : features ) {
							annotedFeatures.add(featureItem.getName());
						}

						List<String> removedFeatures = new ArrayList<String>();
						removedFeatures.addAll(expressionFeatures);
						removedFeatures.removeAll(annotedFeatures);

						annotedFeatures.removeAll(expressionFeatures);

						//Se lista estiver vazia, remover o elemento do modelo de configura��o
						if ( removedFeatures.size() > 0 ) {
							String[] tokens = Logic.hotExpression(mappingEntity.getFeatureExpression().getExpression(), removedFeatures);
							StringBuilder expression = new StringBuilder();

							if ( tokens.length > 0 ) {
								for ( int x = 0; x < tokens.length-1; x++ ) {
									expression.append(tokens[x] + " ");	   
								}

								expression.append(tokens[tokens.length-1]);

								for ( String feature : annotedFeatures ) {
									expression.append(" and ");
									expression.append(feature);
								}
							} else {					
								if ( annotedFeatures.size() == 1 ) {
									expression.append(annotedFeatures.get(0));
								} else if ( annotedFeatures.size() > 1 ) {
									for ( int x = 0; x < annotedFeatures.size()-1; x++ ) {						
										expression.append(annotedFeatures.get(x));
										expression.append(" and ");
									}

									expression.append(annotedFeatures.get(annotedFeatures.size()-1));
								} 													
							}

							mappingEntity.getFeatureExpression().setExpression(expression.toString());

							exc = true;
						} else {
							if ( annotedFeatures.size() > 0 ) {
								String oldExpression = mappingEntity.getFeatureExpression().getExpression();
								String newExpression = Logic.makeExpression(oldExpression,annotedFeatures);
								mappingEntity.getFeatureExpression().setExpression(newExpression);
								exc = true;
							}
						}

					} else { //Se nao existir, adicionar o elemento no modelo de configuracao							
						MappingEntity newEntity;

						if ( "java".equals(res.getFileExtension()) ) {
							newEntity = configurationFactory.createConfigurationClass();
						} else {
							newEntity = configurationFactory.createConfigurationAspect();
						}

						newEntity.setName(res.getName());
						newEntity.setPath(res.getProjectRelativePath().toString());

						FeatureExpression featureExpression = configurationFactory.createFeatureExpression();
						StringBuilder builder = new StringBuilder();

						for ( int x = 0; x < features.size()-1; x++ ) {
							builder.append(features.get(x).getName() + " and ");
						}

						builder.append(features.get(features.size()-1).getName());

						featureExpression.setExpression(builder.toString());
						newEntity.setFeatureExpression(featureExpression);

						configurationModelUtil.addMappingElement(newEntity);
					}
					//Modifico o Modelo de Caracteristicas		    		    
					if ( features.size() > 0 ) {
						Node model = featureModelUtil.getFmpProject().getModel();

						for ( FeatureItem featureItem : features ) {
							Feature fmpFeature = (Feature)fmpNavigation.findNodeWithName(model, featureItem.getName());

							if ( fmpFeature != null ) {				
								Feature fmpFeatureParent;

								if ( fmpFeature.eContainer() instanceof FeatureGroup ) {
									fmpFeatureParent = (Feature)fmpFeature.eContainer().eContainer();
								} else {
									fmpFeatureParent = (Feature)fmpFeature.eContainer();
								}

								if ( fmpFeatureParent != null ) {
									if ( !fmpFeatureParent.getName().equals(featureItem.getParent()) ) {
										featureModelUtil.addFeature(featureItem);
									}
								}
							} else {
								featureModelUtil.addFeature(featureItem);
							}
						}
					}

					exc = true;
				}		
			}		  
		}

		if ( exc ) {
			for ( ConfigurationModelUtil configurationModelUtil : configurationModelsChanged.values() ) {
				if ( eventType != IResourceChangeEvent.POST_CHANGE ) {
					configurationModelUtil.saveModel();
				}
			}

			configurationModelsChanged.clear();

			for ( FMPModelUitl fmpModelUitl : featureModelsChanged.values() ) {
				if ( eventType != IResourceChangeEvent.POST_CHANGE ) {
					fmpModelUitl.saveModel();
				}
			}

			featureModelsChanged.clear();
		}
	}   
}
