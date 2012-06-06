/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operator Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sml.OperatorExpression#getParameter <em>Parameter</em>}</li>
 *   <li>{@link sml.OperatorExpression#isIsNegated <em>Is Negated</em>}</li>
 * </ul>
 * </p>
 *
 * @see sml.SmlPackage#getOperatorExpression()
 * @model abstract="true"
 * @generated
 */
public interface OperatorExpression extends SituationTypeElement {

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' attribute.
	 * @see #setParameter(String)
	 * @see sml.SmlPackage#getOperatorExpression_Parameter()
	 * @model
	 * @generated
	 */
	String getParameter();

	/**
	 * Sets the value of the '{@link sml.OperatorExpression#getParameter <em>Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' attribute.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(String value);

	/**
	 * Returns the value of the '<em><b>Is Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Negated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Negated</em>' attribute.
	 * @see #setIsNegated(boolean)
	 * @see sml.SmlPackage#getOperatorExpression_IsNegated()
	 * @model
	 * @generated
	 */
	boolean isIsNegated();

	/**
	 * Sets the value of the '{@link sml.OperatorExpression#isIsNegated <em>Is Negated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Negated</em>' attribute.
	 * @see #isIsNegated()
	 * @generated
	 */
	void setIsNegated(boolean value);
} // OperatorExpression
