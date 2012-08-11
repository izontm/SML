/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exportable Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sml.ExportableNode#getNodeParameter <em>Node Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see sml.SmlPackage#getExportableNode()
 * @model abstract="true"
 * @generated
 */
public interface ExportableNode extends Node {

	/**
	 * Returns the value of the '<em><b>Node Parameter</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link sml.SituationTypeParameter#getNodeReference <em>Node Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Parameter</em>' reference.
	 * @see #setNodeParameter(SituationTypeParameter)
	 * @see sml.SmlPackage#getExportableNode_NodeParameter()
	 * @see sml.SituationTypeParameter#getNodeReference
	 * @model opposite="nodeReference"
	 * @generated
	 */
	SituationTypeParameter getNodeParameter();

	/**
	 * Sets the value of the '{@link sml.ExportableNode#getNodeParameter <em>Node Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Parameter</em>' reference.
	 * @see #getNodeParameter()
	 * @generated
	 */
	void setNodeParameter(SituationTypeParameter value);
} // ExportableNode
