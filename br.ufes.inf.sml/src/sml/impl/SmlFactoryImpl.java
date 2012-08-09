/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sml.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import sml.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SmlFactoryImpl extends EFactoryImpl implements SmlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SmlFactory init() {
		try {
			SmlFactory theSmlFactory = (SmlFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.example.org/sml"); 
			if (theSmlFactory != null) {
				return theSmlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SmlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmlFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SmlPackage.SML_MODEL: return createSMLModel();
			case SmlPackage.SITUATION_TYPE: return createSituationType();
			case SmlPackage.SITUATION_TYPE_BLOCK: return createSituationTypeBlock();
			case SmlPackage.ENTITY_PARTICIPANT: return createEntityParticipant();
			case SmlPackage.RELATOR_PARTICIPANT: return createRelatorParticipant();
			case SmlPackage.LINK: return createLink();
			case SmlPackage.SITUATION_TYPE_PARAMETER: return createSituationTypeParameter();
			case SmlPackage.ATTRIBUTE_REFERENCE: return createAttributeReference();
			case SmlPackage.COMPARATIVE_RELATION: return createComparativeRelation();
			case SmlPackage.LITERAL: return createLiteral();
			case SmlPackage.SITUATION_PARTICIPANT: return createSituationParticipant();
			case SmlPackage.SITUATION_PARAMETER_REFERENCE: return createSituationParameterReference();
			case SmlPackage.TEMPORAL_OPERATOR_EXPRESSION: return createTemporalOperatorExpression();
			case SmlPackage.EXISTS_SITUATION: return createExistsSituation();
			case SmlPackage.FUNCTION: return createFunction();
			case SmlPackage.PARAMETER: return createParameter();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SmlPackage.TEMPORAL_OPERATOR_TYPE:
				return createTemporalOperatorTypeFromString(eDataType, initialValue);
			case SmlPackage.SITUATION_ATTRIBUTE_TYPE:
				return createSituationAttributeTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SmlPackage.TEMPORAL_OPERATOR_TYPE:
				return convertTemporalOperatorTypeToString(eDataType, instanceValue);
			case SmlPackage.SITUATION_ATTRIBUTE_TYPE:
				return convertSituationAttributeTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SMLModel createSMLModel() {
		SMLModelImpl smlModel = new SMLModelImpl();
		return smlModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SituationType createSituationType() {
		SituationTypeImpl situationType = new SituationTypeImpl();
		return situationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SituationTypeBlock createSituationTypeBlock() {
		SituationTypeBlockImpl situationTypeBlock = new SituationTypeBlockImpl();
		return situationTypeBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityParticipant createEntityParticipant() {
		EntityParticipantImpl entityParticipant = new EntityParticipantImpl();
		return entityParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatorParticipant createRelatorParticipant() {
		RelatorParticipantImpl relatorParticipant = new RelatorParticipantImpl();
		return relatorParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link createLink() {
		LinkImpl link = new LinkImpl();
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SituationTypeParameter createSituationTypeParameter() {
		SituationTypeParameterImpl situationTypeParameter = new SituationTypeParameterImpl();
		return situationTypeParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeReference createAttributeReference() {
		AttributeReferenceImpl attributeReference = new AttributeReferenceImpl();
		return attributeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparativeRelation createComparativeRelation() {
		ComparativeRelationImpl comparativeRelation = new ComparativeRelationImpl();
		return comparativeRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Literal createLiteral() {
		LiteralImpl literal = new LiteralImpl();
		return literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SituationParticipant createSituationParticipant() {
		SituationParticipantImpl situationParticipant = new SituationParticipantImpl();
		return situationParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SituationParameterReference createSituationParameterReference() {
		SituationParameterReferenceImpl situationParameterReference = new SituationParameterReferenceImpl();
		return situationParameterReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalOperatorExpression createTemporalOperatorExpression() {
		TemporalOperatorExpressionImpl temporalOperatorExpression = new TemporalOperatorExpressionImpl();
		return temporalOperatorExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExistsSituation createExistsSituation() {
		ExistsSituationImpl existsSituation = new ExistsSituationImpl();
		return existsSituation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function createFunction() {
		FunctionImpl function = new FunctionImpl();
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalOperatorType createTemporalOperatorTypeFromString(EDataType eDataType, String initialValue) {
		TemporalOperatorType result = TemporalOperatorType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTemporalOperatorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SituationAttributeType createSituationAttributeTypeFromString(EDataType eDataType, String initialValue) {
		SituationAttributeType result = SituationAttributeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSituationAttributeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmlPackage getSmlPackage() {
		return (SmlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SmlPackage getPackage() {
		return SmlPackage.eINSTANCE;
	}

} //SmlFactoryImpl
