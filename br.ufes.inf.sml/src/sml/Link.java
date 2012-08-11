/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sml;

import ctx.Association;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sml.Link#getIsOfType <em>Is Of Type</em>}</li>
 *   <li>{@link sml.Link#getEntity <em>Entity</em>}</li>
 *   <li>{@link sml.Link#getRelator <em>Relator</em>}</li>
 * </ul>
 * </p>
 *
 * @see sml.SmlPackage#getLink()
 * @model
 * @generated
 */
public interface Link extends SituationTypeElement {
	/**
	 * Returns the value of the '<em><b>Is Of Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Of Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Of Type</em>' reference.
	 * @see #setIsOfType(Association)
	 * @see sml.SmlPackage#getLink_IsOfType()
	 * @model
	 * @generated
	 */
	Association getIsOfType();

	/**
	 * Sets the value of the '{@link sml.Link#getIsOfType <em>Is Of Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Of Type</em>' reference.
	 * @see #getIsOfType()
	 * @generated
	 */
	void setIsOfType(Association value);

	/**
	 * Returns the value of the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' reference.
	 * @see #setEntity(EntityParticipant)
	 * @see sml.SmlPackage#getLink_Entity()
	 * @model required="true"
	 * @generated
	 */
	EntityParticipant getEntity();

	/**
	 * Sets the value of the '{@link sml.Link#getEntity <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(EntityParticipant value);

	/**
	 * Returns the value of the '<em><b>Relator</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link sml.RelatorParticipant#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relator</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relator</em>' reference.
	 * @see #setRelator(RelatorParticipant)
	 * @see sml.SmlPackage#getLink_Relator()
	 * @see sml.RelatorParticipant#getLinks
	 * @model opposite="links" required="true"
	 * @generated
	 */
	RelatorParticipant getRelator();

	/**
	 * Sets the value of the '{@link sml.Link#getRelator <em>Relator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relator</em>' reference.
	 * @see #getRelator()
	 * @generated
	 */
	void setRelator(RelatorParticipant value);

} // Link
