/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ctx;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ctx.Association#getSource <em>Source</em>}</li>
 *   <li>{@link ctx.Association#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see ctx.CtxPackage#getAssociation()
 * @model
 * @generated
 */
public interface Association extends ContextModelElement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(RelatorClass)
	 * @see ctx.CtxPackage#getAssociation_Source()
	 * @model
	 * @generated
	 */
	RelatorClass getSource();

	/**
	 * Sets the value of the '{@link ctx.Association#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(RelatorClass value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(EntityClass)
	 * @see ctx.CtxPackage#getAssociation_Target()
	 * @model
	 * @generated
	 */
	EntityClass getTarget();

	/**
	 * Sets the value of the '{@link ctx.Association#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(EntityClass value);

} // Association
