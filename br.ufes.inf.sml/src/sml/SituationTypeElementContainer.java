/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Situation Type Element Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sml.SituationTypeElementContainer#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see sml.SmlPackage#getSituationTypeElementContainer()
 * @model abstract="true"
 * @generated
 */
public interface SituationTypeElementContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link sml.SituationTypeElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see sml.SmlPackage#getSituationTypeElementContainer_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<SituationTypeElement> getElements();

} // SituationTypeElementContainer
