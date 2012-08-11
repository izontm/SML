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
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sml.Node#getSourceRelation <em>Source Relation</em>}</li>
 *   <li>{@link sml.Node#getTargetRelation <em>Target Relation</em>}</li>
 * </ul>
 * </p>
 *
 * @see sml.SmlPackage#getNode()
 * @model abstract="true"
 * @generated
 */
public interface Node extends SituationTypeElement {
	/**
	 * Returns the value of the '<em><b>Source Relation</b></em>' reference list.
	 * The list contents are of type {@link sml.ComparativeRelation}.
	 * It is bidirectional and its opposite is '{@link sml.ComparativeRelation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Relation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Relation</em>' reference list.
	 * @see sml.SmlPackage#getNode_SourceRelation()
	 * @see sml.ComparativeRelation#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<ComparativeRelation> getSourceRelation();

	/**
	 * Returns the value of the '<em><b>Target Relation</b></em>' reference list.
	 * The list contents are of type {@link sml.ComparativeRelation}.
	 * It is bidirectional and its opposite is '{@link sml.ComparativeRelation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Relation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Relation</em>' reference list.
	 * @see sml.SmlPackage#getNode_TargetRelation()
	 * @see sml.ComparativeRelation#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<ComparativeRelation> getTargetRelation();

} // Node
