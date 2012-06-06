/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Temporal Operator Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sml.TemporalOperatorExpression#getSource <em>Source</em>}</li>
 *   <li>{@link sml.TemporalOperatorExpression#getTarget <em>Target</em>}</li>
 *   <li>{@link sml.TemporalOperatorExpression#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see sml.SmlPackage#getTemporalOperatorExpression()
 * @model
 * @generated
 */
public interface TemporalOperatorExpression extends OperatorExpression {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(SituationParticipant)
	 * @see sml.SmlPackage#getTemporalOperatorExpression_Source()
	 * @model
	 * @generated
	 */
	SituationParticipant getSource();

	/**
	 * Sets the value of the '{@link sml.TemporalOperatorExpression#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(SituationParticipant value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(SituationParticipant)
	 * @see sml.SmlPackage#getTemporalOperatorExpression_Target()
	 * @model
	 * @generated
	 */
	SituationParticipant getTarget();

	/**
	 * Sets the value of the '{@link sml.TemporalOperatorExpression#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(SituationParticipant value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link sml.TemporalOperatorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see sml.TemporalOperatorType
	 * @see #setOperator(TemporalOperatorType)
	 * @see sml.SmlPackage#getTemporalOperatorExpression_Operator()
	 * @model
	 * @generated
	 */
	TemporalOperatorType getOperator();

	/**
	 * Sets the value of the '{@link sml.TemporalOperatorExpression#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see sml.TemporalOperatorType
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(TemporalOperatorType value);

} // TemporalOperatorExpression
