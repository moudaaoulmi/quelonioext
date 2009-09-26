/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.pucrio.inf.les.genarch.extension.dsam.mas.provider;


import br.pucrio.inf.les.genarch.extension.dsam.mas.Agent;
import br.pucrio.inf.les.genarch.extension.dsam.mas.MasFactory;
import br.pucrio.inf.les.genarch.extension.dsam.mas.MasPackage;

import br.pucrio.inf.les.genarch.models.dsamtypes.DsamtypesPackage;

import br.pucrio.inf.les.genarch.models.dsamtypes.provider.VariableElementItemProvider;

import br.pucrio.inf.les.genarch.models.implementation.ImplementationFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link br.pucrio.inf.les.genarch.extension.dsam.mas.Agent} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AgentItemProvider
	extends VariableElementItemProvider
	implements	
		IEditingDomainItemProvider,	
		IStructuredItemContentProvider,	
		ITreeItemContentProvider,	
		IItemLabelProvider,	
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgentItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(DsamtypesPackage.Literals.GROUP_TEMPLATES__TEMPLATES);
			childrenFeatures.add(DsamtypesPackage.Literals.GROUP_COMPONENTS__COMPONENTS);
			childrenFeatures.add(DsamtypesPackage.Literals.GROUP_FILES__FILES);
			childrenFeatures.add(MasPackage.Literals.AGENT__CAPABILITIES);
			childrenFeatures.add(MasPackage.Literals.AGENT__GOALS);
			childrenFeatures.add(MasPackage.Literals.AGENT__BELIEVES);
			childrenFeatures.add(MasPackage.Literals.AGENT__PLANS);
			childrenFeatures.add(MasPackage.Literals.AGENT__EVENTS);
			childrenFeatures.add(MasPackage.Literals.AGENT__EXPRESSIONS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Agent.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Agent"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Agent)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Agent_type") :
			getString("_UI_Agent_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Agent.class)) {
			case MasPackage.AGENT__TEMPLATES:
			case MasPackage.AGENT__COMPONENTS:
			case MasPackage.AGENT__FILES:
			case MasPackage.AGENT__CAPABILITIES:
			case MasPackage.AGENT__GOALS:
			case MasPackage.AGENT__BELIEVES:
			case MasPackage.AGENT__PLANS:
			case MasPackage.AGENT__EVENTS:
			case MasPackage.AGENT__EXPRESSIONS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(DsamtypesPackage.Literals.GROUP_TEMPLATES__TEMPLATES,
				 ImplementationFactory.eINSTANCE.createImplementationTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(DsamtypesPackage.Literals.GROUP_COMPONENTS__COMPONENTS,
				 ImplementationFactory.eINSTANCE.createImplementationComponent()));

		newChildDescriptors.add
			(createChildParameter
				(DsamtypesPackage.Literals.GROUP_FILES__FILES,
				 ImplementationFactory.eINSTANCE.createImplementationFile()));

		newChildDescriptors.add
			(createChildParameter
				(MasPackage.Literals.AGENT__CAPABILITIES,
				 MasFactory.eINSTANCE.createCapabilityReference()));

		newChildDescriptors.add
			(createChildParameter
				(MasPackage.Literals.AGENT__GOALS,
				 MasFactory.eINSTANCE.createGoal()));

		newChildDescriptors.add
			(createChildParameter
				(MasPackage.Literals.AGENT__BELIEVES,
				 MasFactory.eINSTANCE.createBelief()));

		newChildDescriptors.add
			(createChildParameter
				(MasPackage.Literals.AGENT__PLANS,
				 MasFactory.eINSTANCE.createPlan()));

		newChildDescriptors.add
			(createChildParameter
				(MasPackage.Literals.AGENT__EVENTS,
				 MasFactory.eINSTANCE.createEvent()));

		newChildDescriptors.add
			(createChildParameter
				(MasPackage.Literals.AGENT__EXPRESSIONS,
				 MasFactory.eINSTANCE.createExpression()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return MasDomainModelEditPlugin.INSTANCE;
	}

}
