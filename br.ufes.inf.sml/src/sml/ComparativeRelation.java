/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sml;

import ctx.ComparativeFormalRelation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comparative Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sml.ComparativeRelation#getSource <em>Source</em>}</li>
 *   <li>{@link sml.ComparativeRelation#getTarget <em>Target</em>}</li>
 *   <li>{@link sml.ComparativeRelation#getRelation <em>Relation</em>}</li>
 *   <li>{@link sml.ComparativeRelation#getParameter <em>Parameter</em>}</li>
 *   <li>{@link sml.ComparativeRelation#isIsNegated <em>Is Negated</em>}</li>
 * </ul>
 * </p>
 *
 * @see sml.SmlPackage#getComparativeRelation()
 * @model
 * @generated
 */
public interface ComparativeRelation extends SituationTypeElement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link sml.Node#getSourceRelation <em>Source Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Node)
	 * @see sml.SmlPackage#getComparativeRelation_Source()
	 * @see sml.Node#getSourceRelation
	 * @model opposite="sourceRelation" required="true"
	 * @generated
	 */
	Node getSource();

	/**
	 * Sets the value of the '{@link sml.ComparativeRelation#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Node value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link sml.Node#getTargetRelation <em>Target Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Node)
	 * @see sml.SmlPackage#getComparativeRelation_Target()
	 * @see sml.Node#getTargetRelation
	 * @model opposite="targetRelation" required="true"
	 * @generated
	 */
	Node getTarget();

	/**
	 * Sets the value of the '{@link sml.ComparativeRelation#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Node value);

	/**
	 * Returns the value of the '<em><b>Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation</em>' reference.
	 * @see #setRelation(ComparativeFormalRelation)
	 * @see sml.SmlPackage#getComparativeRelation_Relation()
	 * @model
	 * @generated
	 */
	ComparativeFormalRelation getRelation();

	/**
	 * Sets the value of the '{@link sml.ComparativeRelation#getRelation <em>Relation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relation</em>' reference.
	 * @see #getRelation()
	 * @generated
	 */
	void setRelation(ComparativeFormalRelation value);

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
	 * @see sml.SmlPackage#getComparativeRelation_Parameter()
	 * @model
	 * @generated
	 */
	String getParameter();

	/**
	 * Sets the value of the '{@link sml.ComparativeRelation#getParameter <em>Parameter</em>}' attribute.
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
	 * @see sml.SmlPackage#getComparativeRelation_IsNegated()
	 * @model
	 * @generated
	 */
	boolean isIsNegated();

	/**
	 * Sets the value of the '{@link sml.ComparativeRelation#isIsNegated <em>Is Negated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Negated</em>' attribute.
	 * @see #isIsNegated()
	 * @generated
	 */
	void setIsNegated(boolean value);

} // ComparativeRelation
