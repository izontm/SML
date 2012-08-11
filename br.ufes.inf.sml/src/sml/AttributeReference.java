/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sml;

import ctx.Attribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sml.AttributeReference#getEntity <em>Entity</em>}</li>
 *   <li>{@link sml.AttributeReference#getAttribute <em>Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see sml.SmlPackage#getAttributeReference()
 * @model
 * @generated
 */
public interface AttributeReference extends ExportableNode {
	/**
	 * Returns the value of the '<em><b>Entity</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link sml.Participant#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' reference.
	 * @see #setEntity(Participant)
	 * @see sml.SmlPackage#getAttributeReference_Entity()
	 * @see sml.Participant#getReference
	 * @model opposite="reference" required="true"
	 * @generated
	 */
	Participant getEntity();

	/**
	 * Sets the value of the '{@link sml.AttributeReference#getEntity <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(Participant value);

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' reference.
	 * @see #setAttribute(Attribute)
	 * @see sml.SmlPackage#getAttributeReference_Attribute()
	 * @model
	 * @generated
	 */
	Attribute getAttribute();

	/**
	 * Sets the value of the '{@link sml.AttributeReference#getAttribute <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(Attribute value);

} // AttributeReference
