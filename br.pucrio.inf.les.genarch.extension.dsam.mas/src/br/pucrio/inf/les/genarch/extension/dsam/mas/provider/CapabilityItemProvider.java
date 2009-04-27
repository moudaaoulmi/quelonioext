/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.pucrio.inf.les.genarch.extension.dsam.mas.provider;


import br.pucrio.inf.les.genarch.extension.dsam.mas.Capability;
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
 * This is the item provider adapter for a {@link br.pucrio.inf.les.genarch.extension.dsam.mas.Capability} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CapabilityItemProvider
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
	public CapabilityItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(MasPackage.Literals.CAPABILITY__GOALS);
			childrenFeatures.add(MasPackage.Literals.CAPABILITY__BELIEVES);
			childrenFeatures.add(MasPackage.Literals.CAPABILITY__PLANS);
			childrenFeatures.add(MasPackage.Literals.CAPABILITY__EVENTS);
			childrenFeatures.add(MasPackage.Literals.CAPABILITY__EXPRESSIONS);
			childrenFeatures.add(MasPackage.Literals.CAPABILITY__CAPABILITIES);
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
	 * This returns Capability.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Capability"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Capability)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Capability_type") :
			getString("_UI_Capability_type") + " " + label;
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

		switch (notification.getFeatureID(Capability.class)) {
			case MasPackage.CAPABILITY__TEMPLATES:
			case MasPackage.CAPABILITY__GOALS:
			case MasPackage.CAPABILITY__BELIEVES:
			case MasPackage.CAPABILITY__PLANS:
			case MasPackage.CAPABILITY__EVENTS:
			case MasPackage.CAPABILITY__EXPRESSIONS:
			case MasPackage.CAPABILITY__CAPABILITIES:
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
				(MasPackage.Literals.CAPABILITY__GOALS,
				 MasFactory.eINSTANCE.createGoal()));

		newChildDescriptors.add
			(createChildParameter
				(MasPackage.Literals.CAPABILITY__BELIEVES,
				 MasFactory.eINSTANCE.createBelief()));

		newChildDescriptors.add
			(createChildParameter
				(MasPackage.Literals.CAPABILITY__PLANS,
				 MasFactory.eINSTANCE.createPlan()));

		newChildDescriptors.add
			(createChildParameter
				(MasPackage.Literals.CAPABILITY__EVENTS,
				 MasFactory.eINSTANCE.createEvent()));

		newChildDescriptors.add
			(createChildParameter
				(MasPackage.Literals.CAPABILITY__EXPRESSIONS,
				 MasFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(MasPackage.Literals.CAPABILITY__CAPABILITIES,
				 MasFactory.eINSTANCE.createCapability()));
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