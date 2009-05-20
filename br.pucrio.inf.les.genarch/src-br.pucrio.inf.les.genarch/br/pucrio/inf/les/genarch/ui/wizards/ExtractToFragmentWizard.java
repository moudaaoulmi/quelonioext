package br.pucrio.inf.les.genarch.ui.wizards;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

import br.pucrio.inf.les.genarch.core.models.dsl.implementation.ImplementationFragmentBuilder;
import br.pucrio.inf.les.genarch.core.models.dsl.implementation.ImplementationModelHandle;
import br.pucrio.inf.les.genarch.core.plugin.GenArchEMFPlugin;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationFragment;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationFragmentContainer;

public class ExtractToFragmentWizard extends Wizard implements INewWizard {

	private ExtractToFragmentWizardPage extractToFragmentWizardPage;
	private ITextSelection selecion;
	private IProject project;
	private IFile file;

	public ExtractToFragmentWizard(IFile file,ITextSelection selection) {
		this.project = file.getProject();
		this.file = file;
		this.selecion = selection;
		this.extractToFragmentWizardPage = new ExtractToFragmentWizardPage("Extract Fragment Page",project);
	}

	public void addPages() {
		this.addPage(this.extractToFragmentWizardPage);
	}

	public boolean performFinish() {
		String fragmentName = this.extractToFragmentWizardPage.getFragmentName();
		String fragmentContainerName = this.extractToFragmentWizardPage.getFragmentContainerName();

		fragmentContainerName = fragmentContainerName.substring("Fragment Container".length()+1,fragmentContainerName.length());

		ImplementationModelHandle implementationModelHandle = ImplementationModelHandle.implementationModel(this.project);
		ImplementationFragmentContainer fragmentContainer = implementationModelHandle.get().fragmentContainer(fragmentContainerName);
		ImplementationFragment implementationFragment = ImplementationFragmentBuilder.implementationFragment().name(fragmentName).path(fragmentContainerName + "/" + fragmentName).content(this.selecion.getText()).build();
		fragmentContainer.getFragments().add(implementationFragment);
		implementationModelHandle.save();

		try {			
			InputStream fileContentInputStream = file.getContents();

			StringBuffer stringContent = new StringBuffer();
			BufferedReader in = new BufferedReader(new InputStreamReader(fileContentInputStream));
			String line = "";

			while ( (line = in.readLine()) != null ) {
				stringContent.append(line);
				stringContent.append("\n");				
			}
			
			String first = stringContent.substring(0,selecion.getOffset());
			String last = stringContent.substring(selecion.getOffset() + selecion.getLength(),stringContent.length());
			String comment = "«REM»Code extracted to '" + implementationFragment.getPath() + "' frament«ENDREM»";
						
			ByteArrayInputStream newInputStream = new ByteArrayInputStream((first + comment + last).getBytes());

			try {
				if ( file.exists() ) {
					file.setContents(newInputStream, true, true, new NullProgressMonitor());					
				} else {
					file.create(newInputStream, true, new NullProgressMonitor());
				}
			} catch (final CoreException e) {
				e.printStackTrace();
			}

			fileContentInputStream.close();

		} catch (CoreException e) {
			GenArchEMFPlugin.INSTANCE.log(e);
		} catch (IOException e) {
			GenArchEMFPlugin.INSTANCE.log(e);
		}

		return true;
	}

	public void init(IWorkbench arg0, IStructuredSelection arg1) {

	}
}
