/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Participant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sml.Participant#getReference <em>Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see sml.SmlPackage#getParticipant()
 * @model abstract="true"
 * @generated
 */
public interface Participant extends ExportableNode {
	/**
	 * Returns the value of the '<em><b>Reference</b></em>' reference list.
	 * The list contents are of type {@link sml.AttributeReference}.
	 * It is bidirectional and its opposite is '{@link sml.AttributeReference#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' reference list.
	 * @see sml.SmlPackage#getParticipant_Reference()
	 * @see sml.AttributeReference#getEntity
	 * @model opposite="entity"
	 * @generated
	 */
	EList<AttributeReference> getReference();

} // Participant
