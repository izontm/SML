/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sml.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import sml.SituationTypeBlock;
import sml.SmlFactory;
import sml.SmlPackage;

/**
 * This is the item provider adapter for a {@link sml.SituationTypeBlock} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SituationTypeBlockItemProvider
	extends SituationTypeElementItemProvider
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
	public SituationTypeBlockItemProvider(AdapterFactory adapterFactory) {
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

			addDisjointPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Disjoint feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDisjointPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SituationTypeBlock_disjoint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SituationTypeBlock_disjoint_feature", "_UI_SituationTypeBlock_type"),
				 SmlPackage.Literals.SITUATION_TYPE_BLOCK__DISJOINT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
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
			childrenFeatures.add(SmlPackage.Literals.SITUATION_TYPE_ELEMENT_CONTAINER__ELEMENTS);
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
	 * This returns SituationTypeBlock.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SituationTypeBlock"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		SituationTypeBlock situationTypeBlock = (SituationTypeBlock)object;
		return getString("_UI_SituationTypeBlock_type") + " " + situationTypeBlock.isDisjoint();
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

		switch (notification.getFeatureID(SituationTypeBlock.class)) {
			case SmlPackage.SITUATION_TYPE_BLOCK__DISJOINT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SmlPackage.SITUATION_TYPE_BLOCK__ELEMENTS:
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
				(SmlPackage.Literals.SITUATION_TYPE_ELEMENT_CONTAINER__ELEMENTS,
				 SmlFactory.eINSTANCE.createSituationTypeBlock()));

		newChildDescriptors.add
			(createChildParameter
				(SmlPackage.Literals.SITUATION_TYPE_ELEMENT_CONTAINER__ELEMENTS,
				 SmlFactory.eINSTANCE.createEntityParticipant()));

		newChildDescriptors.add
			(createChildParameter
				(SmlPackage.Literals.SITUATION_TYPE_ELEMENT_CONTAINER__ELEMENTS,
				 SmlFactory.eINSTANCE.createRelatorParticipant()));

		newChildDescriptors.add
			(createChildParameter
				(SmlPackage.Literals.SITUATION_TYPE_ELEMENT_CONTAINER__ELEMENTS,
				 SmlFactory.eINSTANCE.createLink()));

		newChildDescriptors.add
			(createChildParameter
				(SmlPackage.Literals.SITUATION_TYPE_ELEMENT_CONTAINER__ELEMENTS,
				 SmlFactory.eINSTANCE.createAttributeReference()));

		newChildDescriptors.add
			(createChildParameter
				(SmlPackage.Literals.SITUATION_TYPE_ELEMENT_CONTAINER__ELEMENTS,
				 SmlFactory.eINSTANCE.createComparativeRelation()));

		newChildDescriptors.add
			(createChildParameter
				(SmlPackage.Literals.SITUATION_TYPE_ELEMENT_CONTAINER__ELEMENTS,
				 SmlFactory.eINSTANCE.createLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(SmlPackage.Literals.SITUATION_TYPE_ELEMENT_CONTAINER__ELEMENTS,
				 SmlFactory.eINSTANCE.createSituationParticipant()));

		newChildDescriptors.add
			(createChildParameter
				(SmlPackage.Literals.SITUATION_TYPE_ELEMENT_CONTAINER__ELEMENTS,
				 SmlFactory.eINSTANCE.createSituationParameterReference()));

		newChildDescriptors.add
			(createChildParameter
				(SmlPackage.Literals.SITUATION_TYPE_ELEMENT_CONTAINER__ELEMENTS,
				 SmlFactory.eINSTANCE.createTemporalOperatorExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SmlPackage.Literals.SITUATION_TYPE_ELEMENT_CONTAINER__ELEMENTS,
				 SmlFactory.eINSTANCE.createSituationAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(SmlPackage.Literals.SITUATION_TYPE_ELEMENT_CONTAINER__ELEMENTS,
				 SmlFactory.eINSTANCE.createExistsSituation()));
	}

}