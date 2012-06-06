/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ctx;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ctx.ContextModel#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see ctx.CtxPackage#getContextModel()
 * @model
 * @generated
 */
public interface ContextModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link ctx.ContextModelElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see ctx.CtxPackage#getContextModel_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContextModelElement> getElements();

} // ContextModel
