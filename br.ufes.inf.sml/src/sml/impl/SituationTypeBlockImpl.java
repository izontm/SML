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

import sml.SituationTypeBlock;
import sml.SituationTypeElement;
import sml.SituationTypeElementContainer;
import sml.SmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Situation Type Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sml.impl.SituationTypeBlockImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link sml.impl.SituationTypeBlockImpl#isDisjoint <em>Disjoint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SituationTypeBlockImpl extends SituationTypeElementImpl implements SituationTypeBlock {
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
	 * The default value of the '{@link #isDisjoint() <em>Disjoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisjoint()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISJOINT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDisjoint() <em>Disjoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisjoint()
	 * @generated
	 * @ordered
	 */
	protected boolean disjoint = DISJOINT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SituationTypeBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmlPackage.Literals.SITUATION_TYPE_BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SituationTypeElement> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<SituationTypeElement>(SituationTypeElement.class, this, SmlPackage.SITUATION_TYPE_BLOCK__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDisjoint() {
		return disjoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisjoint(boolean newDisjoint) {
		boolean oldDisjoint = disjoint;
		disjoint = newDisjoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmlPackage.SITUATION_TYPE_BLOCK__DISJOINT, oldDisjoint, disjoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmlPackage.SITUATION_TYPE_BLOCK__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
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
			case SmlPackage.SITUATION_TYPE_BLOCK__ELEMENTS:
				return getElements();
			case SmlPackage.SITUATION_TYPE_BLOCK__DISJOINT:
				return isDisjoint();
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
			case SmlPackage.SITUATION_TYPE_BLOCK__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends SituationTypeElement>)newValue);
				return;
			case SmlPackage.SITUATION_TYPE_BLOCK__DISJOINT:
				setDisjoint((Boolean)newValue);
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
			case SmlPackage.SITUATION_TYPE_BLOCK__ELEMENTS:
				getElements().clear();
				return;
			case SmlPackage.SITUATION_TYPE_BLOCK__DISJOINT:
				setDisjoint(DISJOINT_EDEFAULT);
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
			case SmlPackage.SITUATION_TYPE_BLOCK__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case SmlPackage.SITUATION_TYPE_BLOCK__DISJOINT:
				return disjoint != DISJOINT_EDEFAULT;
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
				case SmlPackage.SITUATION_TYPE_BLOCK__ELEMENTS: return SmlPackage.SITUATION_TYPE_ELEMENT_CONTAINER__ELEMENTS;
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
				case SmlPackage.SITUATION_TYPE_ELEMENT_CONTAINER__ELEMENTS: return SmlPackage.SITUATION_TYPE_BLOCK__ELEMENTS;
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
		result.append(" (disjoint: ");
		result.append(disjoint);
		result.append(')');
		return result.toString();
	}

} //SituationTypeBlockImpl
