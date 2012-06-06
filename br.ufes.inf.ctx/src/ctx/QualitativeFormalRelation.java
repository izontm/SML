/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ctx;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qualitative Formal Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ctx.QualitativeFormalRelation#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see ctx.CtxPackage#getQualitativeFormalRelation()
 * @model
 * @generated
 */
public interface QualitativeFormalRelation extends ContextModelElement, TypedElement {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link ctx.QualitativeParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see ctx.CtxPackage#getQualitativeFormalRelation_Parameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<QualitativeParameter> getParameter();

} // QualitativeFormalRelation
