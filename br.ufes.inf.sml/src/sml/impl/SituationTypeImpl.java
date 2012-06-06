/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sml.SituationType;
import sml.SituationTypeElement;
import sml.SituationTypeElementContainer;
import sml.SituationTypeParameter;
import sml.SmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Situation Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sml.impl.SituationTypeImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link sml.impl.SituationTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link sml.impl.SituationTypeImpl#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SituationTypeImpl extends SMLModelElementImpl implements SituationType {
	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<SituationTypeElement> elements;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<SituationTypeParameter> parameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SituationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmlPackage.Literals.SITUATION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SituationTypeElement> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<SituationTypeElement>(SituationTypeElement.class, this, SmlPackage.SITUATION_TYPE__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmlPackage.SITUATION_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SituationTypeParameter> getParameter() {
		if (parameter == null) {
			parameter = new EObjectContainmentEList<SituationTypeParameter>(SituationTypeParameter.class, this, SmlPackage.SITUATION_TYPE__PARAMETER);
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmlPackage.SITUATION_TYPE__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
			case SmlPackage.SITUATION_TYPE__PARAMETER:
				return ((InternalEList<?>)getParameter()).basicRemove(otherEnd, msgs);
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
			case SmlPackage.SITUATION_TYPE__ELEMENTS:
				return getElements();
			case SmlPackage.SITUATION_TYPE__NAME:
				return getName();
			case SmlPackage.SITUATION_TYPE__PARAMETER:
				return getParameter();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SmlPackage.SITUATION_TYPE__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends SituationTypeElement>)newValue);
				return;
			case SmlPackage.SITUATION_TYPE__NAME:
				setName((String)newValue);
				return;
			case SmlPackage.SITUATION_TYPE__PARAMETER:
				getParameter().clear();
				getParameter().addAll((Collection<? extends SituationTypeParameter>)newValue);
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
			case SmlPackage.SITUATION_TYPE__ELEMENTS:
				getElements().clear();
				return;
			case SmlPackage.SITUATION_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SmlPackage.SITUATION_TYPE__PARAMETER:
				getParameter().clear();
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
			case SmlPackage.SITUATION_TYPE__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case SmlPackage.SITUATION_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SmlPackage.SITUATION_TYPE__PARAMETER:
				return parameter != null && !parameter.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == SituationTypeElementContainer.class) {
			switch (derivedFeatureID) {
				case SmlPackage.SITUATION_TYPE__ELEMENTS: return SmlPackage.SITUATION_TYPE_ELEMENT_CONTAINER__ELEMENTS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == SituationTypeElementContainer.class) {
			switch (baseFeatureID) {
				case SmlPackage.SITUATION_TYPE_ELEMENT_CONTAINER__ELEMENTS: return SmlPackage.SITUATION_TYPE__ELEMENTS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SituationTypeImpl
