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
 * A representation of the model object '<em><b>Comparative Formal Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ctx.ComparativeFormalRelation#getTarget <em>Target</em>}</li>
 *   <li>{@link ctx.ComparativeFormalRelation#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see ctx.CtxPackage#getComparativeFormalRelation()
 * @model
 * @generated
 */
public interface ComparativeFormalRelation extends ContextModelElement {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference list.
	 * The list contents are of type {@link ctx.ComparableElements}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference list.
	 * @see ctx.CtxPackage#getComparativeFormalRelation_Target()
	 * @model
	 * @generated
	 */
	EList<ComparableElements> getTarget();

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference list.
	 * The list contents are of type {@link ctx.ComparableElements}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference list.
	 * @see ctx.CtxPackage#getComparativeFormalRelation_Source()
	 * @model
	 * @generated
	 */
	EList<ComparableElements> getSource();

} // ComparativeFormalRelation
