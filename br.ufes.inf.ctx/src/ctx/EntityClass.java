/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ctx;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ctx.EntityClass#getSuperclass <em>Superclass</em>}</li>
 *   <li>{@link ctx.EntityClass#isIsAbstract <em>Is Abstract</em>}</li>
 * </ul>
 * </p>
 *
 * @see ctx.CtxPackage#getEntityClass()
 * @model
 * @generated
 */
public interface EntityClass extends ModelClass, ComparableElements {
	/**
	 * Returns the value of the '<em><b>Superclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Superclass</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Superclass</em>' reference.
	 * @see #setSuperclass(EntityClass)
	 * @see ctx.CtxPackage#getEntityClass_Superclass()
	 * @model
	 * @generated
	 */
	EntityClass getSuperclass();

	/**
	 * Sets the value of the '{@link ctx.EntityClass#getSuperclass <em>Superclass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Superclass</em>' reference.
	 * @see #getSuperclass()
	 * @generated
	 */
	void setSuperclass(EntityClass value);

	/**
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see #setIsAbstract(boolean)
	 * @see ctx.CtxPackage#getEntityClass_IsAbstract()
	 * @model
	 * @generated
	 */
	boolean isIsAbstract();

	/**
	 * Sets the value of the '{@link ctx.EntityClass#isIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #isIsAbstract()
	 * @generated
	 */
	void setIsAbstract(boolean value);

} // EntityClass
