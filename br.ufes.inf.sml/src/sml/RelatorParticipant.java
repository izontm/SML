/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sml;

import ctx.RelatorClass;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relator Participant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sml.RelatorParticipant#getIsOfType <em>Is Of Type</em>}</li>
 *   <li>{@link sml.RelatorParticipant#getLinks <em>Links</em>}</li>
 * </ul>
 * </p>
 *
 * @see sml.SmlPackage#getRelatorParticipant()
 * @model
 * @generated
 */
public interface RelatorParticipant extends Participant {
	/**
	 * Returns the value of the '<em><b>Is Of Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Of Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Of Type</em>' reference.
	 * @see #setIsOfType(RelatorClass)
	 * @see sml.SmlPackage#getRelatorParticipant_IsOfType()
	 * @model
	 * @generated
	 */
	RelatorClass getIsOfType();

	/**
	 * Sets the value of the '{@link sml.RelatorParticipant#getIsOfType <em>Is Of Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Of Type</em>' reference.
	 * @see #getIsOfType()
	 * @generated
	 */
	void setIsOfType(RelatorClass value);

	/**
	 * Returns the value of the '<em><b>Links</b></em>' reference list.
	 * The list contents are of type {@link sml.Link}.
	 * It is bidirectional and its opposite is '{@link sml.Link#getRelator <em>Relator</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' reference list.
	 * @see sml.SmlPackage#getRelatorParticipant_Links()
	 * @see sml.Link#getRelator
	 * @model opposite="relator"
	 * @generated
	 */
	EList<Link> getLinks();

} // RelatorParticipant
