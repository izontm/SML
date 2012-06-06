/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import sml.OperatorExpression;
import sml.SmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operator Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sml.impl.OperatorExpressionImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link sml.impl.OperatorExpressionImpl#isIsNegated <em>Is Negated</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class OperatorExpressionImpl extends SituationTypeElementImpl implements OperatorExpression {
	/**
	 * The default value of the '{@link #getParameter() <em>Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected static final String PARAMETER_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected String parameter = PARAMETER_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsNegated() <em>Is Negated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsNegated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_NEGATED_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isIsNegated() <em>Is Negated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsNegated()
	 * @generated
	 * @ordered
	 */
	protected boolean isNegated = IS_NEGATED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperatorExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmlPackage.Literals.OPERATOR_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParameter() {
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter(String newParameter) {
		String oldParameter = parameter;
		parameter = newParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmlPackage.OPERATOR_EXPRESSION__PARAMETER, oldParameter, parameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsNegated() {
		return isNegated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsNegated(boolean newIsNegated) {
		boolean oldIsNegated = isNegated;
		isNegated = newIsNegated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmlPackage.OPERATOR_EXPRESSION__IS_NEGATED, oldIsNegated, isNegated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SmlPackage.OPERATOR_EXPRESSION__PARAMETER:
				return getParameter();
			case SmlPackage.OPERATOR_EXPRESSION__IS_NEGATED:
				return isIsNegated();
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
			case SmlPackage.OPERATOR_EXPRESSION__PARAMETER:
				setParameter((String)newValue);
				return;
			case SmlPackage.OPERATOR_EXPRESSION__IS_NEGATED:
				setIsNegated((Boolean)newValue);
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
			case SmlPackage.OPERATOR_EXPRESSION__PARAMETER:
				setParameter(PARAMETER_EDEFAULT);
				return;
			case SmlPackage.OPERATOR_EXPRESSION__IS_NEGATED:
				setIsNegated(IS_NEGATED_EDEFAULT);
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
			case SmlPackage.OPERATOR_EXPRESSION__PARAMETER:
				return PARAMETER_EDEFAULT == null ? parameter != null : !PARAMETER_EDEFAULT.equals(parameter);
			case SmlPackage.OPERATOR_EXPRESSION__IS_NEGATED:
				return isNegated != IS_NEGATED_EDEFAULT;
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
		result.append(" (parameter: ");
		result.append(parameter);
		result.append(", isNegated: ");
		result.append(isNegated);
		result.append(')');
		return result.toString();
	}

} //OperatorExpressionImpl
