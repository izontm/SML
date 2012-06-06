/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ctx.impl;

import ctx.CtxPackage;
import ctx.DataType;
import ctx.QualitativeFormalRelation;
import ctx.QualitativeParameter;
import ctx.TypedElement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Qualitative Formal Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ctx.impl.QualitativeFormalRelationImpl#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link ctx.impl.QualitativeFormalRelationImpl#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QualitativeFormalRelationImpl extends ContextModelElementImpl implements QualitativeFormalRelation {
	/**
	 * The cached value of the '{@link #getDatatype() <em>Datatype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatatype()
	 * @generated
	 * @ordered
	 */
	protected DataType datatype;

	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<QualitativeParameter> parameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QualitativeFormalRelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CtxPackage.Literals.QUALITATIVE_FORMAL_RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getDatatype() {
		if (datatype != null && datatype.eIsProxy()) {
			InternalEObject oldDatatype = (InternalEObject)datatype;
			datatype = (DataType)eResolveProxy(oldDatatype);
			if (datatype != oldDatatype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CtxPackage.QUALITATIVE_FORMAL_RELATION__DATATYPE, oldDatatype, datatype));
			}
		}
		return datatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetDatatype() {
		return datatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatatype(DataType newDatatype) {
		DataType oldDatatype = datatype;
		datatype = newDatatype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CtxPackage.QUALITATIVE_FORMAL_RELATION__DATATYPE, oldDatatype, datatype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QualitativeParameter> getParameter() {
		if (parameter == null) {
			parameter = new EObjectContainmentEList<QualitativeParameter>(QualitativeParameter.class, this, CtxPackage.QUALITATIVE_FORMAL_RELATION__PARAMETER);
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
			case CtxPackage.QUALITATIVE_FORMAL_RELATION__PARAMETER:
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
			case CtxPackage.QUALITATIVE_FORMAL_RELATION__DATATYPE:
				if (resolve) return getDatatype();
				return basicGetDatatype();
			case CtxPackage.QUALITATIVE_FORMAL_RELATION__PARAMETER:
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
			case CtxPackage.QUALITATIVE_FORMAL_RELATION__DATATYPE:
				setDatatype((DataType)newValue);
				return;
			case CtxPackage.QUALITATIVE_FORMAL_RELATION__PARAMETER:
				getParameter().clear();
				getParameter().addAll((Collection<? extends QualitativeParameter>)newValue);
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
			case CtxPackage.QUALITATIVE_FORMAL_RELATION__DATATYPE:
				setDatatype((DataType)null);
				return;
			case CtxPackage.QUALITATIVE_FORMAL_RELATION__PARAMETER:
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
			case CtxPackage.QUALITATIVE_FORMAL_RELATION__DATATYPE:
				return datatype != null;
			case CtxPackage.QUALITATIVE_FORMAL_RELATION__PARAMETER:
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
		if (baseClass == TypedElement.class) {
			switch (derivedFeatureID) {
				case CtxPackage.QUALITATIVE_FORMAL_RELATION__DATATYPE: return CtxPackage.TYPED_ELEMENT__DATATYPE;
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
		if (baseClass == TypedElement.class) {
			switch (baseFeatureID) {
				case CtxPackage.TYPED_ELEMENT__DATATYPE: return CtxPackage.QUALITATIVE_FORMAL_RELATION__DATATYPE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //QualitativeFormalRelationImpl
