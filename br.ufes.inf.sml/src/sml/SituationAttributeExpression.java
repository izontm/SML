/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Situation Attribute Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sml.SituationAttributeExpression#getLiteral <em>Literal</em>}</li>
 *   <li>{@link sml.SituationAttributeExpression#getAttribute <em>Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see sml.SmlPackage#getSituationAttributeExpression()
 * @model
 * @generated
 */
public interface SituationAttributeExpression extends OperatorExpression {
	/**
	 * Returns the value of the '<em><b>Literal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literal</em>' reference.
	 * @see #setLiteral(Literal)
	 * @see sml.SmlPackage#getSituationAttributeExpression_Literal()
	 * @model
	 * @generated
	 */
	Literal getLiteral();

	/**
	 * Sets the value of the '{@link sml.SituationAttributeExpression#getLiteral <em>Literal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Literal</em>' reference.
	 * @see #getLiteral()
	 * @generated
	 */
	void setLiteral(Literal value);

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' reference.
	 * @see #setAttribute(SituationAttribute)
	 * @see sml.SmlPackage#getSituationAttributeExpression_Attribute()
	 * @model
	 * @generated
	 */
	SituationAttribute getAttribute();

	/**
	 * Sets the value of the '{@link sml.SituationAttributeExpression#getAttribute <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(SituationAttribute value);

} // SituationAttributeExpression
