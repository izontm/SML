/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sml;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Situation Attribute Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see sml.SmlPackage#getSituationAttributeType()
 * @model
 * @generated
 */
public enum SituationAttributeType implements Enumerator {
	/**
	 * The '<em><b>Start Time</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #START_TIME_VALUE
	 * @generated
	 * @ordered
	 */
	START_TIME(0, "startTime", "startTime"),

	/**
	 * The '<em><b>Final Time</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FINAL_TIME_VALUE
	 * @generated
	 * @ordered
	 */
	FINAL_TIME(0, "finalTime", "finalTime");

	/**
	 * The '<em><b>Start Time</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Start Time</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #START_TIME
	 * @model name="startTime"
	 * @generated
	 * @ordered
	 */
	public static final int START_TIME_VALUE = 0;

	/**
	 * The '<em><b>Final Time</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Final Time</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FINAL_TIME
	 * @model name="finalTime"
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_TIME_VALUE = 0;

	/**
	 * An array of all the '<em><b>Situation Attribute Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SituationAttributeType[] VALUES_ARRAY =
		new SituationAttributeType[] {
			START_TIME,
			FINAL_TIME,
		};

	/**
	 * A public read-only list of all the '<em><b>Situation Attribute Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SituationAttributeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Situation Attribute Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SituationAttributeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SituationAttributeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Situation Attribute Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SituationAttributeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SituationAttributeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Situation Attribute Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SituationAttributeType get(int value) {
		switch (value) {
			case START_TIME_VALUE: return START_TIME;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private SituationAttributeType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //SituationAttributeType
