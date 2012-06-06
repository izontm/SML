/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sml;

import ctx.EntityClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Participant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sml.EntityParticipant#getIsOfType <em>Is Of Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see sml.SmlPackage#getEntityParticipant()
 * @model
 * @generated
 */
public interface EntityParticipant extends Participant {
	/**
	 * Returns the value of the '<em><b>Is Of Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Of Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Of Type</em>' reference.
	 * @see #setIsOfType(EntityClass)
	 * @see sml.SmlPackage#getEntityParticipant_IsOfType()
	 * @model
	 * @generated
	 */
	EntityClass getIsOfType();

	/**
	 * Sets the value of the '{@link sml.EntityParticipant#getIsOfType <em>Is Of Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Of Type</em>' reference.
	 * @see #getIsOfType()
	 * @generated
	 */
	void setIsOfType(EntityClass value);

} // EntityParticipant
