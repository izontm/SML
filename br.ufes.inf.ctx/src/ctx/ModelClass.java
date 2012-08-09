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
 * A representation of the model object '<em><b>Model Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ctx.ModelClass#getAttribute <em>Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see ctx.CtxPackage#getModelClass()
 * @model abstract="true"
 * @generated
 */
public interface ModelClass extends ContextModelElement {
	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link ctx.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' containment reference list.
	 * @see ctx.CtxPackage#getModelClass_Attribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttribute();

} // ModelClass
