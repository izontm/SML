/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sml.impl;

import ctx.EntityClass;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sml.EntityParticipant;
import sml.SmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Participant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sml.impl.EntityParticipantImpl#getIsOfType <em>Is Of Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityParticipantImpl extends ParticipantImpl implements EntityParticipant {
	/**
	 * The cached value of the '{@link #getIsOfType() <em>Is Of Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsOfType()
	 * @generated
	 * @ordered
	 */
	protected EntityClass isOfType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityParticipantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmlPackage.Literals.ENTITY_PARTICIPANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityClass getIsOfType() {
		if (isOfType != null && isOfType.eIsProxy()) {
			InternalEObject oldIsOfType = (InternalEObject)isOfType;
			isOfType = (EntityClass)eResolveProxy(oldIsOfType);
			if (isOfType != oldIsOfType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmlPackage.ENTITY_PARTICIPANT__IS_OF_TYPE, oldIsOfType, isOfType));
			}
		}
		return isOfType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityClass basicGetIsOfType() {
		return isOfType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOfType(EntityClass newIsOfType) {
		EntityClass oldIsOfType = isOfType;
		isOfType = newIsOfType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmlPackage.ENTITY_PARTICIPANT__IS_OF_TYPE, oldIsOfType, isOfType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SmlPackage.ENTITY_PARTICIPANT__IS_OF_TYPE:
				if (resolve) return getIsOfType();
				return basicGetIsOfType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SmlPackage.ENTITY_PARTICIPANT__IS_OF_TYPE:
				setIsOfType((EntityClass)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SmlPackage.ENTITY_PARTICIPANT__IS_OF_TYPE:
				setIsOfType((EntityClass)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SmlPackage.ENTITY_PARTICIPANT__IS_OF_TYPE:
				return isOfType != null;
		}
		return super.eIsSet(featureID);
	}

} //EntityParticipantImpl
