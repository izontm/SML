/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Situation Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sml.SituationAttribute#getSituation <em>Situation</em>}</li>
 *   <li>{@link sml.SituationAttribute#getIsOfType <em>Is Of Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see sml.SmlPackage#getSituationAttribute()
 * @model
 * @generated
 */
public interface SituationAttribute extends Node {
	/**
	 * Returns the value of the '<em><b>Situation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link sml.SituationParticipant#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Situation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Situation</em>' reference.
	 * @see #setSituation(SituationParticipant)
	 * @see sml.SmlPackage#getSituationAttribute_Situation()
	 * @see sml.SituationParticipant#getAttribute
	 * @model opposite="attribute"
	 * @generated
	 */
	SituationParticipant getSituation();

	/**
	 * Sets the value of the '{@link sml.SituationAttribute#getSituation <em>Situation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Situation</em>' reference.
	 * @see #getSituation()
	 * @generated
	 */
	void setSituation(SituationParticipant value);

	/**
	 * Returns the value of the '<em><b>Is Of Type</b></em>' attribute.
	 * The literals are from the enumeration {@link sml.SituationAttributeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Of Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Of Type</em>' attribute.
	 * @see sml.SituationAttributeType
	 * @see #setIsOfType(SituationAttributeType)
	 * @see sml.SmlPackage#getSituationAttribute_IsOfType()
	 * @model
	 * @generated
	 */
	SituationAttributeType getIsOfType();

	/**
	 * Sets the value of the '{@link sml.SituationAttribute#getIsOfType <em>Is Of Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Of Type</em>' attribute.
	 * @see sml.SituationAttributeType
	 * @see #getIsOfType()
	 * @generated
	 */
	void setIsOfType(SituationAttributeType value);

} // SituationAttribute
