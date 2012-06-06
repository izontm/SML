/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sml.Literal;
import sml.SituationAttribute;
import sml.SituationAttributeType;
import sml.SituationParticipant;
import sml.SmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Situation Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sml.impl.SituationAttributeImpl#getSituation <em>Situation</em>}</li>
 *   <li>{@link sml.impl.SituationAttributeImpl#getIsOfType <em>Is Of Type</em>}</li>
 *   <li>{@link sml.impl.SituationAttributeImpl#getLiteral <em>Literal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SituationAttributeImpl extends NodeImpl implements SituationAttribute {
	/**
	 * The cached value of the '{@link #getSituation() <em>Situation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSituation()
	 * @generated
	 * @ordered
	 */
	protected SituationParticipant situation;

	/**
	 * The default value of the '{@link #getIsOfType() <em>Is Of Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsOfType()
	 * @generated
	 * @ordered
	 */
	protected static final SituationAttributeType IS_OF_TYPE_EDEFAULT = SituationAttributeType.START_TIME;

	/**
	 * The cached value of the '{@link #getIsOfType() <em>Is Of Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsOfType()
	 * @generated
	 * @ordered
	 */
	protected SituationAttributeType isOfType = IS_OF_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLiteral() <em>Literal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiteral()
	 * @generated
	 * @ordered
	 */
	protected Literal literal;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SituationAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmlPackage.Literals.SITUATION_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SituationParticipant getSituation() {
		if (situation != null && situation.eIsProxy()) {
			InternalEObject oldSituation = (InternalEObject)situation;
			situation = (SituationParticipant)eResolveProxy(oldSituation);
			if (situation != oldSituation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmlPackage.SITUATION_ATTRIBUTE__SITUATION, oldSituation, situation));
			}
		}
		return situation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SituationParticipant basicGetSituation() {
		return situation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSituation(SituationParticipant newSituation, NotificationChain msgs) {
		SituationParticipant oldSituation = situation;
		situation = newSituation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmlPackage.SITUATION_ATTRIBUTE__SITUATION, oldSituation, newSituation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSituation(SituationParticipant newSituation) {
		if (newSituation != situation) {
			NotificationChain msgs = null;
			if (situation != null)
				msgs = ((InternalEObject)situation).eInverseRemove(this, SmlPackage.SITUATION_PARTICIPANT__ATTRIBUTE, SituationParticipant.class, msgs);
			if (newSituation != null)
				msgs = ((InternalEObject)newSituation).eInverseAdd(this, SmlPackage.SITUATION_PARTICIPANT__ATTRIBUTE, SituationParticipant.class, msgs);
			msgs = basicSetSituation(newSituation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmlPackage.SITUATION_ATTRIBUTE__SITUATION, newSituation, newSituation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SituationAttributeType getIsOfType() {
		return isOfType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOfType(SituationAttributeType newIsOfType) {
		SituationAttributeType oldIsOfType = isOfType;
		isOfType = newIsOfType == null ? IS_OF_TYPE_EDEFAULT : newIsOfType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmlPackage.SITUATION_ATTRIBUTE__IS_OF_TYPE, oldIsOfType, isOfType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Literal getLiteral() {
		if (literal != null && literal.eIsProxy()) {
			InternalEObject oldLiteral = (InternalEObject)literal;
			literal = (Literal)eResolveProxy(oldLiteral);
			if (literal != oldLiteral) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmlPackage.SITUATION_ATTRIBUTE__LITERAL, oldLiteral, literal));
			}
		}
		return literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Literal basicGetLiteral() {
		return literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLiteral(Literal newLiteral) {
		Literal oldLiteral = literal;
		literal = newLiteral;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmlPackage.SITUATION_ATTRIBUTE__LITERAL, oldLiteral, literal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmlPackage.SITUATION_ATTRIBUTE__SITUATION:
				if (situation != null)
					msgs = ((InternalEObject)situation).eInverseRemove(this, SmlPackage.SITUATION_PARTICIPANT__ATTRIBUTE, SituationParticipant.class, msgs);
				return basicSetSituation((SituationParticipant)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmlPackage.SITUATION_ATTRIBUTE__SITUATION:
				return basicSetSituation(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SmlPackage.SITUATION_ATTRIBUTE__SITUATION:
				if (resolve) return getSituation();
				return basicGetSituation();
			case SmlPackage.SITUATION_ATTRIBUTE__IS_OF_TYPE:
				return getIsOfType();
			case SmlPackage.SITUATION_ATTRIBUTE__LITERAL:
				if (resolve) return getLiteral();
				return basicGetLiteral();
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
			case SmlPackage.SITUATION_ATTRIBUTE__SITUATION:
				setSituation((SituationParticipant)newValue);
				return;
			case SmlPackage.SITUATION_ATTRIBUTE__IS_OF_TYPE:
				setIsOfType((SituationAttributeType)newValue);
				return;
			case SmlPackage.SITUATION_ATTRIBUTE__LITERAL:
				setLiteral((Literal)newValue);
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
			case SmlPackage.SITUATION_ATTRIBUTE__SITUATION:
				setSituation((SituationParticipant)null);
				return;
			case SmlPackage.SITUATION_ATTRIBUTE__IS_OF_TYPE:
				setIsOfType(IS_OF_TYPE_EDEFAULT);
				return;
			case SmlPackage.SITUATION_ATTRIBUTE__LITERAL:
				setLiteral((Literal)null);
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
			case SmlPackage.SITUATION_ATTRIBUTE__SITUATION:
				return situation != null;
			case SmlPackage.SITUATION_ATTRIBUTE__IS_OF_TYPE:
				return isOfType != IS_OF_TYPE_EDEFAULT;
			case SmlPackage.SITUATION_ATTRIBUTE__LITERAL:
				return literal != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isOfType: ");
		result.append(isOfType);
		result.append(')');
		return result.toString();
	}

} //SituationAttributeImpl
