/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ctx;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qualitative Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ctx.QualitativeParameter#getElement <em>Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see ctx.CtxPackage#getQualitativeParameter()
 * @model
 * @generated
 */
public interface QualitativeParameter extends NamedElement {

	/**
	 * Returns the value of the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' reference.
	 * @see #setElement(ComparableElements)
	 * @see ctx.CtxPackage#getQualitativeParameter_Element()
	 * @model
	 * @generated
	 */
	ComparableElements getElement();

	/**
	 * Sets the value of the '{@link ctx.QualitativeParameter#getElement <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(ComparableElements value);
} // QualitativeParameter
