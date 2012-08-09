/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ctx;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ctx.Attribute#getAclass <em>Aclass</em>}</li>
 *   <li>{@link ctx.Attribute#getDatatype <em>Datatype</em>}</li>
 * </ul>
 * </p>
 *
 * @see ctx.CtxPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Aclass</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ctx.ModelClass#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aclass</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aclass</em>' container reference.
	 * @see #setAclass(ModelClass)
	 * @see ctx.CtxPackage#getAttribute_Aclass()
	 * @see ctx.ModelClass#getAttribute
	 * @model opposite="attribute" transient="false"
	 * @generated
	 */
	ModelClass getAclass();

	/**
	 * Sets the value of the '{@link ctx.Attribute#getAclass <em>Aclass</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aclass</em>' container reference.
	 * @see #getAclass()
	 * @generated
	 */
	void setAclass(ModelClass value);

	/**
	 * Returns the value of the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datatype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatype</em>' reference.
	 * @see #setDatatype(DataType)
	 * @see ctx.CtxPackage#getAttribute_Datatype()
	 * @model
	 * @generated
	 */
	DataType getDatatype();

	/**
	 * Sets the value of the '{@link ctx.Attribute#getDatatype <em>Datatype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datatype</em>' reference.
	 * @see #getDatatype()
	 * @generated
	 */
	void setDatatype(DataType value);

} // Attribute
