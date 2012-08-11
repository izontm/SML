/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sml;

import ctx.QualitativeParameter;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sml.Parameter#getValue <em>Value</em>}</li>
 *   <li>{@link sml.Parameter#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see sml.SmlPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(Node)
	 * @see sml.SmlPackage#getParameter_Value()
	 * @model required="true"
	 * @generated
	 */
	Node getValue();

	/**
	 * Sets the value of the '{@link sml.Parameter#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Node value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference.
	 * @see #setParameter(QualitativeParameter)
	 * @see sml.SmlPackage#getParameter_Parameter()
	 * @model
	 * @generated
	 */
	QualitativeParameter getParameter();

	/**
	 * Sets the value of the '{@link sml.Parameter#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(QualitativeParameter value);

} // Parameter
