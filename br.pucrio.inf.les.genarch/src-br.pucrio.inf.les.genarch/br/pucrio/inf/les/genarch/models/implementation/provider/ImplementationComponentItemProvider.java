/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.pucrio.inf.les.genarch.models.implementation.provider;


import br.pucrio.inf.les.genarch.models.implementation.ImplementationComponent;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationFactory;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationPackage;

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
 * This is the item provider adapter for a {@link br.pucrio.inf.les.genarch.models.implementation.ImplementationComponent} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ImplementationComponentItemProvider
	extends ImplementationEntityItemProvider
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
	public ImplementationComponentItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(ImplementationPackage.Literals.IMPLEMENTATION_COMPONENT__CLASSES);
			childrenFeatures.add(ImplementationPackage.Literals.IMPLEMENTATION_COMPONENT__ASPECTS);
			childrenFeatures.add(ImplementationPackage.Literals.IMPLEMENTATION_COMPONENT__TEMPLATES);
			childrenFeatures.add(ImplementationPackage.Literals.IMPLEMENTATION_COMPONENT__FILES);
			childrenFeatures.add(ImplementationPackage.Literals.IMPLEMENTATION_COMPONENT__SUB_COMPONENTS);
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
	 * This returns ImplementationComponent.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ImplementationComponent"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ImplementationComponent)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ImplementationComponent_type") :
			getString("_UI_ImplementationComponent_type") + " " + label;
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

		switch (notification.getFeatureID(ImplementationComponent.class)) {
			case ImplementationPackage.IMPLEMENTATION_COMPONENT__CLASSES:
			case ImplementationPackage.IMPLEMENTATION_COMPONENT__ASPECTS:
			case ImplementationPackage.IMPLEMENTATION_COMPONENT__TEMPLATES:
			case ImplementationPackage.IMPLEMENTATION_COMPONENT__FILES:
			case ImplementationPackage.IMPLEMENTATION_COMPONENT__SUB_COMPONENTS:
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
				(ImplementationPackage.Literals.IMPLEMENTATION_COMPONENT__CLASSES,
				 ImplementationFactory.eINSTANCE.createImplementationClass()));

		newChildDescriptors.add
			(createChildParameter
				(ImplementationPackage.Literals.IMPLEMENTATION_COMPONENT__ASPECTS,
				 ImplementationFactory.eINSTANCE.createImplementationAspect()));

		newChildDescriptors.add
			(createChildParameter
				(ImplementationPackage.Literals.IMPLEMENTATION_COMPONENT__TEMPLATES,
				 ImplementationFactory.eINSTANCE.createImplementationTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(ImplementationPackage.Literals.IMPLEMENTATION_COMPONENT__FILES,
				 ImplementationFactory.eINSTANCE.createImplementationFile()));

		newChildDescriptors.add
			(createChildParameter
				(ImplementationPackage.Literals.IMPLEMENTATION_COMPONENT__SUB_COMPONENTS,
				 ImplementationFactory.eINSTANCE.createImplementationComponent()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ImplementationMetaModelEditPlugin.INSTANCE;
	}

}
