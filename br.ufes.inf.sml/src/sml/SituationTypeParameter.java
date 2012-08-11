/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Situation Type Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sml.SituationTypeParameter#getNodeReference <em>Node Reference</em>}</li>
 *   <li>{@link sml.SituationTypeParameter#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see sml.SmlPackage#getSituationTypeParameter()
 * @model
 * @generated
 */
public interface SituationTypeParameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Node Reference</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link sml.ExportableNode#getNodeParameter <em>Node Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Reference</em>' reference.
	 * @see #setNodeReference(ExportableNode)
	 * @see sml.SmlPackage#getSituationTypeParameter_NodeReference()
	 * @see sml.ExportableNode#getNodeParameter
	 * @model opposite="nodeParameter" required="true"
	 * @generated
	 */
	ExportableNode getNodeReference();

	/**
	 * Sets the value of the '{@link sml.SituationTypeParameter#getNodeReference <em>Node Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Reference</em>' reference.
	 * @see #getNodeReference()
	 * @generated
	 */
	void setNodeReference(ExportableNode value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see sml.SmlPackage#getSituationTypeParameter_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link sml.SituationTypeParameter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // SituationTypeParameter
