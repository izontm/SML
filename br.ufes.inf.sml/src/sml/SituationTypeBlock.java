/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Situation Type Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sml.SituationTypeBlock#isDisjoint <em>Disjoint</em>}</li>
 * </ul>
 * </p>
 *
 * @see sml.SmlPackage#getSituationTypeBlock()
 * @model
 * @generated
 */
public interface SituationTypeBlock extends SituationTypeElement, SituationTypeElementContainer {
	/**
	 * Returns the value of the '<em><b>Disjoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disjoint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disjoint</em>' attribute.
	 * @see #setDisjoint(boolean)
	 * @see sml.SmlPackage#getSituationTypeBlock_Disjoint()
	 * @model
	 * @generated
	 */
	boolean isDisjoint();

	/**
	 * Sets the value of the '{@link sml.SituationTypeBlock#isDisjoint <em>Disjoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disjoint</em>' attribute.
	 * @see #isDisjoint()
	 * @generated
	 */
	void setDisjoint(boolean value);

} // SituationTypeBlock
