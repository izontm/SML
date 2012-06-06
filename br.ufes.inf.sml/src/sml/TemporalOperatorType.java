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
 * A representation of the literals of the enumeration '<em><b>Temporal Operator Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see sml.SmlPackage#getTemporalOperatorType()
 * @model
 * @generated
 */
public enum TemporalOperatorType implements Enumerator {
	/**
	 * The '<em><b>After</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AFTER_VALUE
	 * @generated
	 * @ordered
	 */
	AFTER(0, "after", "after"),

	/**
	 * The '<em><b>Before</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEFORE_VALUE
	 * @generated
	 * @ordered
	 */
	BEFORE(0, "before", "before"),

	/**
	 * The '<em><b>Coincides</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COINCIDES_VALUE
	 * @generated
	 * @ordered
	 */
	COINCIDES(0, "coincides", "coincides"),

	/**
	 * The '<em><b>During</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DURING_VALUE
	 * @generated
	 * @ordered
	 */
	DURING(0, "during", "during"),

	/**
	 * The '<em><b>Finishes</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FINISHES_VALUE
	 * @generated
	 * @ordered
	 */
	FINISHES(0, "finishes", "finishes"),

	/**
	 * The '<em><b>Finished by</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FINISHED_BY_VALUE
	 * @generated
	 * @ordered
	 */
	FINISHED_BY(0, "finished_by", "finishedby"),

	/**
	 * The '<em><b>Includes</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INCLUDES_VALUE
	 * @generated
	 * @ordered
	 */
	INCLUDES(0, "includes", "includes"),

	/**
	 * The '<em><b>Meets</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEETS_VALUE
	 * @generated
	 * @ordered
	 */
	MEETS(0, "meets", "meets"),

	/**
	 * The '<em><b>Met by</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MET_BY_VALUE
	 * @generated
	 * @ordered
	 */
	MET_BY(0, "met_by", "metby"),

	/**
	 * The '<em><b>Overlaps</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OVERLAPS_VALUE
	 * @generated
	 * @ordered
	 */
	OVERLAPS(0, "overlaps", "overlaps"),

	/**
	 * The '<em><b>Overlapped by</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OVERLAPPED_BY_VALUE
	 * @generated
	 * @ordered
	 */
	OVERLAPPED_BY(0, "overlapped_by", "overlappedby"),

	/**
	 * The '<em><b>Starts</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STARTS_VALUE
	 * @generated
	 * @ordered
	 */
	STARTS(0, "starts", "starts"),

	/**
	 * The '<em><b>Started by</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STARTED_BY_VALUE
	 * @generated
	 * @ordered
	 */
	STARTED_BY(0, "started_by", "startedby");

	/**
	 * The '<em><b>After</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>After</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AFTER
	 * @model name="after"
	 * @generated
	 * @ordered
	 */
	public static final int AFTER_VALUE = 0;

	/**
	 * The '<em><b>Before</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Before</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BEFORE
	 * @model name="before"
	 * @generated
	 * @ordered
	 */
	public static final int BEFORE_VALUE = 0;

	/**
	 * The '<em><b>Coincides</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Coincides</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COINCIDES
	 * @model name="coincides"
	 * @generated
	 * @ordered
	 */
	public static final int COINCIDES_VALUE = 0;

	/**
	 * The '<em><b>During</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>During</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DURING
	 * @model name="during"
	 * @generated
	 * @ordered
	 */
	public static final int DURING_VALUE = 0;

	/**
	 * The '<em><b>Finishes</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Finishes</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FINISHES
	 * @model name="finishes"
	 * @generated
	 * @ordered
	 */
	public static final int FINISHES_VALUE = 0;

	/**
	 * The '<em><b>Finished by</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Finished by</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FINISHED_BY
	 * @model name="finished_by" literal="finishedby"
	 * @generated
	 * @ordered
	 */
	public static final int FINISHED_BY_VALUE = 0;

	/**
	 * The '<em><b>Includes</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Includes</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INCLUDES
	 * @model name="includes"
	 * @generated
	 * @ordered
	 */
	public static final int INCLUDES_VALUE = 0;

	/**
	 * The '<em><b>Meets</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Meets</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEETS
	 * @model name="meets"
	 * @generated
	 * @ordered
	 */
	public static final int MEETS_VALUE = 0;

	/**
	 * The '<em><b>Met by</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Met by</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MET_BY
	 * @model name="met_by" literal="metby"
	 * @generated
	 * @ordered
	 */
	public static final int MET_BY_VALUE = 0;

	/**
	 * The '<em><b>Overlaps</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Overlaps</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OVERLAPS
	 * @model name="overlaps"
	 * @generated
	 * @ordered
	 */
	public static final int OVERLAPS_VALUE = 0;

	/**
	 * The '<em><b>Overlapped by</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Overlapped by</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OVERLAPPED_BY
	 * @model name="overlapped_by" literal="overlappedby"
	 * @generated
	 * @ordered
	 */
	public static final int OVERLAPPED_BY_VALUE = 0;

	/**
	 * The '<em><b>Starts</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Starts</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STARTS
	 * @model name="starts"
	 * @generated
	 * @ordered
	 */
	public static final int STARTS_VALUE = 0;

	/**
	 * The '<em><b>Started by</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Started by</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STARTED_BY
	 * @model name="started_by" literal="startedby"
	 * @generated
	 * @ordered
	 */
	public static final int STARTED_BY_VALUE = 0;

	/**
	 * An array of all the '<em><b>Temporal Operator Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TemporalOperatorType[] VALUES_ARRAY =
		new TemporalOperatorType[] {
			AFTER,
			BEFORE,
			COINCIDES,
			DURING,
			FINISHES,
			FINISHED_BY,
			INCLUDES,
			MEETS,
			MET_BY,
			OVERLAPS,
			OVERLAPPED_BY,
			STARTS,
			STARTED_BY,
		};

	/**
	 * A public read-only list of all the '<em><b>Temporal Operator Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TemporalOperatorType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Temporal Operator Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TemporalOperatorType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TemporalOperatorType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Temporal Operator Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TemporalOperatorType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TemporalOperatorType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Temporal Operator Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TemporalOperatorType get(int value) {
		switch (value) {
			case AFTER_VALUE: return AFTER;
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
	private TemporalOperatorType(int value, String name, String literal) {
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
	
} //TemporalOperatorType
