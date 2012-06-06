/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sml.SituationParticipant;
import sml.SmlPackage;
import sml.TemporalOperatorExpression;
import sml.TemporalOperatorType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Temporal Operator Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sml.impl.TemporalOperatorExpressionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link sml.impl.TemporalOperatorExpressionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link sml.impl.TemporalOperatorExpressionImpl#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TemporalOperatorExpressionImpl extends OperatorExpressionImpl implements TemporalOperatorExpression {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected SituationParticipant source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected SituationParticipant target;

	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final TemporalOperatorType OPERATOR_EDEFAULT = TemporalOperatorType.AFTER;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected TemporalOperatorType operator = OPERATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemporalOperatorExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmlPackage.Literals.TEMPORAL_OPERATOR_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SituationParticipant getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (SituationParticipant)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmlPackage.TEMPORAL_OPERATOR_EXPRESSION__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SituationParticipant basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(SituationParticipant newSource) {
		SituationParticipant oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmlPackage.TEMPORAL_OPERATOR_EXPRESSION__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SituationParticipant getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (SituationParticipant)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmlPackage.TEMPORAL_OPERATOR_EXPRESSION__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SituationParticipant basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(SituationParticipant newTarget) {
		SituationParticipant oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmlPackage.TEMPORAL_OPERATOR_EXPRESSION__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalOperatorType getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(TemporalOperatorType newOperator) {
		TemporalOperatorType oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmlPackage.TEMPORAL_OPERATOR_EXPRESSION__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SmlPackage.TEMPORAL_OPERATOR_EXPRESSION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case SmlPackage.TEMPORAL_OPERATOR_EXPRESSION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case SmlPackage.TEMPORAL_OPERATOR_EXPRESSION__OPERATOR:
				return getOperator();
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
			case SmlPackage.TEMPORAL_OPERATOR_EXPRESSION__SOURCE:
				setSource((SituationParticipant)newValue);
				return;
			case SmlPackage.TEMPORAL_OPERATOR_EXPRESSION__TARGET:
				setTarget((SituationParticipant)newValue);
				return;
			case SmlPackage.TEMPORAL_OPERATOR_EXPRESSION__OPERATOR:
				setOperator((TemporalOperatorType)newValue);
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
			case SmlPackage.TEMPORAL_OPERATOR_EXPRESSION__SOURCE:
				setSource((SituationParticipant)null);
				return;
			case SmlPackage.TEMPORAL_OPERATOR_EXPRESSION__TARGET:
				setTarget((SituationParticipant)null);
				return;
			case SmlPackage.TEMPORAL_OPERATOR_EXPRESSION__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
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
			case SmlPackage.TEMPORAL_OPERATOR_EXPRESSION__SOURCE:
				return source != null;
			case SmlPackage.TEMPORAL_OPERATOR_EXPRESSION__TARGET:
				return target != null;
			case SmlPackage.TEMPORAL_OPERATOR_EXPRESSION__OPERATOR:
				return operator != OPERATOR_EDEFAULT;
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
		result.append(" (operator: ");
		result.append(operator);
		result.append(')');
		return result.toString();
	}

} //TemporalOperatorExpressionImpl
