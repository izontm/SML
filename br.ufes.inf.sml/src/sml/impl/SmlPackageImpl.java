/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sml.impl;

import ctx.CtxPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import sml.AttributeReference;
import sml.ComparativeRelation;
import sml.EntityParticipant;
import sml.ExistsSituation;
import sml.ExportableNode;
import sml.ForallSituation;
import sml.Link;
import sml.Literal;
import sml.Node;
import sml.OperatorExpression;
import sml.Participant;
import sml.RelatorParticipant;
import sml.SMLModel;
import sml.SMLModelElement;
import sml.SituationAttribute;
import sml.SituationAttributeType;
import sml.SituationParameterReference;
import sml.SituationParticipant;
import sml.SituationType;
import sml.SituationTypeBlock;
import sml.SituationTypeElement;
import sml.SituationTypeElementContainer;
import sml.SituationTypeParameter;
import sml.SmlFactory;
import sml.SmlPackage;
import sml.TemporalOperatorExpression;
import sml.TemporalOperatorType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SmlPackageImpl extends EPackageImpl implements SmlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass smlModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass smlModelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass situationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass situationTypeBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass situationTypeElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exportableNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityParticipantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relatorParticipantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass situationTypeParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operatorExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comparativeRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass situationTypeElementContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass participantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass situationParticipantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass situationParameterReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass temporalOperatorExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass situationAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass existsSituationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum temporalOperatorTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum situationAttributeTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see sml.SmlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SmlPackageImpl() {
		super(eNS_URI, SmlFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SmlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SmlPackage init() {
		if (isInited) return (SmlPackage)EPackage.Registry.INSTANCE.getEPackage(SmlPackage.eNS_URI);

		// Obtain or create and register package
		SmlPackageImpl theSmlPackage = (SmlPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SmlPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SmlPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CtxPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSmlPackage.createPackageContents();

		// Initialize created meta-data
		theSmlPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSmlPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SmlPackage.eNS_URI, theSmlPackage);
		return theSmlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSMLModel() {
		return smlModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSMLModel_Elements() {
		return (EReference)smlModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSMLModel_ContextModel() {
		return (EReference)smlModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSMLModelElement() {
		return smlModelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSituationType() {
		return situationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSituationType_Name() {
		return (EAttribute)situationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSituationType_Parameter() {
		return (EReference)situationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSituationTypeBlock() {
		return situationTypeBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSituationTypeBlock_Disjoint() {
		return (EAttribute)situationTypeBlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSituationTypeElement() {
		return situationTypeElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_NodeParameter() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_SourceRelation() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_TargetRelation() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExportableNode() {
		return exportableNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityParticipant() {
		return entityParticipantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityParticipant_IsOfType() {
		return (EReference)entityParticipantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelatorParticipant() {
		return relatorParticipantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelatorParticipant_IsOfType() {
		return (EReference)relatorParticipantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelatorParticipant_Links() {
		return (EReference)relatorParticipantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLink() {
		return linkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLink_IsOfType() {
		return (EReference)linkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLink_Entity() {
		return (EReference)linkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLink_Relator() {
		return (EReference)linkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSituationTypeParameter() {
		return situationTypeParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSituationTypeParameter_NodeReference() {
		return (EReference)situationTypeParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSituationTypeParameter_Name() {
		return (EAttribute)situationTypeParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeReference() {
		return attributeReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeReference_Entity() {
		return (EReference)attributeReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeReference_Attribute() {
		return (EReference)attributeReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperatorExpression() {
		return operatorExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperatorExpression_Parameter() {
		return (EAttribute)operatorExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperatorExpression_IsNegated() {
		return (EAttribute)operatorExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComparativeRelation() {
		return comparativeRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComparativeRelation_Source() {
		return (EReference)comparativeRelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComparativeRelation_Target() {
		return (EReference)comparativeRelationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComparativeRelation_Relation() {
		return (EReference)comparativeRelationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSituationTypeElementContainer() {
		return situationTypeElementContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSituationTypeElementContainer_Elements() {
		return (EReference)situationTypeElementContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteral() {
		return literalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteral_Value() {
		return (EAttribute)literalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLiteral_DataType() {
		return (EReference)literalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParticipant() {
		return participantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParticipant_Reference() {
		return (EReference)participantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSituationParticipant() {
		return situationParticipantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSituationParticipant_SituationType() {
		return (EReference)situationParticipantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSituationParticipant_Parameter() {
		return (EReference)situationParticipantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSituationParticipant_IsPast() {
		return (EAttribute)situationParticipantEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSituationParticipant_Attribute() {
		return (EReference)situationParticipantEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSituationParameterReference() {
		return situationParameterReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSituationParameterReference_Parameter() {
		return (EReference)situationParameterReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSituationParameterReference_Situation() {
		return (EReference)situationParameterReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemporalOperatorExpression() {
		return temporalOperatorExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemporalOperatorExpression_Source() {
		return (EReference)temporalOperatorExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemporalOperatorExpression_Target() {
		return (EReference)temporalOperatorExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemporalOperatorExpression_Operator() {
		return (EAttribute)temporalOperatorExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSituationAttribute() {
		return situationAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSituationAttribute_Situation() {
		return (EReference)situationAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSituationAttribute_IsOfType() {
		return (EAttribute)situationAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSituationAttribute_Literal() {
		return (EReference)situationAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExistsSituation() {
		return existsSituationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExistsSituation_IsNegated() {
		return (EAttribute)existsSituationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTemporalOperatorType() {
		return temporalOperatorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSituationAttributeType() {
		return situationAttributeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmlFactory getSmlFactory() {
		return (SmlFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		smlModelEClass = createEClass(SML_MODEL);
		createEReference(smlModelEClass, SML_MODEL__ELEMENTS);
		createEReference(smlModelEClass, SML_MODEL__CONTEXT_MODEL);

		smlModelElementEClass = createEClass(SML_MODEL_ELEMENT);

		situationTypeEClass = createEClass(SITUATION_TYPE);
		createEAttribute(situationTypeEClass, SITUATION_TYPE__NAME);
		createEReference(situationTypeEClass, SITUATION_TYPE__PARAMETER);

		situationTypeBlockEClass = createEClass(SITUATION_TYPE_BLOCK);
		createEAttribute(situationTypeBlockEClass, SITUATION_TYPE_BLOCK__DISJOINT);

		situationTypeElementEClass = createEClass(SITUATION_TYPE_ELEMENT);

		nodeEClass = createEClass(NODE);
		createEReference(nodeEClass, NODE__NODE_PARAMETER);
		createEReference(nodeEClass, NODE__SOURCE_RELATION);
		createEReference(nodeEClass, NODE__TARGET_RELATION);

		exportableNodeEClass = createEClass(EXPORTABLE_NODE);

		entityParticipantEClass = createEClass(ENTITY_PARTICIPANT);
		createEReference(entityParticipantEClass, ENTITY_PARTICIPANT__IS_OF_TYPE);

		relatorParticipantEClass = createEClass(RELATOR_PARTICIPANT);
		createEReference(relatorParticipantEClass, RELATOR_PARTICIPANT__IS_OF_TYPE);
		createEReference(relatorParticipantEClass, RELATOR_PARTICIPANT__LINKS);

		linkEClass = createEClass(LINK);
		createEReference(linkEClass, LINK__IS_OF_TYPE);
		createEReference(linkEClass, LINK__ENTITY);
		createEReference(linkEClass, LINK__RELATOR);

		situationTypeParameterEClass = createEClass(SITUATION_TYPE_PARAMETER);
		createEReference(situationTypeParameterEClass, SITUATION_TYPE_PARAMETER__NODE_REFERENCE);
		createEAttribute(situationTypeParameterEClass, SITUATION_TYPE_PARAMETER__NAME);

		attributeReferenceEClass = createEClass(ATTRIBUTE_REFERENCE);
		createEReference(attributeReferenceEClass, ATTRIBUTE_REFERENCE__ENTITY);
		createEReference(attributeReferenceEClass, ATTRIBUTE_REFERENCE__ATTRIBUTE);

		operatorExpressionEClass = createEClass(OPERATOR_EXPRESSION);
		createEAttribute(operatorExpressionEClass, OPERATOR_EXPRESSION__PARAMETER);
		createEAttribute(operatorExpressionEClass, OPERATOR_EXPRESSION__IS_NEGATED);

		comparativeRelationEClass = createEClass(COMPARATIVE_RELATION);
		createEReference(comparativeRelationEClass, COMPARATIVE_RELATION__SOURCE);
		createEReference(comparativeRelationEClass, COMPARATIVE_RELATION__TARGET);
		createEReference(comparativeRelationEClass, COMPARATIVE_RELATION__RELATION);

		situationTypeElementContainerEClass = createEClass(SITUATION_TYPE_ELEMENT_CONTAINER);
		createEReference(situationTypeElementContainerEClass, SITUATION_TYPE_ELEMENT_CONTAINER__ELEMENTS);

		literalEClass = createEClass(LITERAL);
		createEAttribute(literalEClass, LITERAL__VALUE);
		createEReference(literalEClass, LITERAL__DATA_TYPE);

		participantEClass = createEClass(PARTICIPANT);
		createEReference(participantEClass, PARTICIPANT__REFERENCE);

		situationParticipantEClass = createEClass(SITUATION_PARTICIPANT);
		createEReference(situationParticipantEClass, SITUATION_PARTICIPANT__SITUATION_TYPE);
		createEReference(situationParticipantEClass, SITUATION_PARTICIPANT__PARAMETER);
		createEAttribute(situationParticipantEClass, SITUATION_PARTICIPANT__IS_PAST);
		createEReference(situationParticipantEClass, SITUATION_PARTICIPANT__ATTRIBUTE);

		situationParameterReferenceEClass = createEClass(SITUATION_PARAMETER_REFERENCE);
		createEReference(situationParameterReferenceEClass, SITUATION_PARAMETER_REFERENCE__PARAMETER);
		createEReference(situationParameterReferenceEClass, SITUATION_PARAMETER_REFERENCE__SITUATION);

		temporalOperatorExpressionEClass = createEClass(TEMPORAL_OPERATOR_EXPRESSION);
		createEReference(temporalOperatorExpressionEClass, TEMPORAL_OPERATOR_EXPRESSION__SOURCE);
		createEReference(temporalOperatorExpressionEClass, TEMPORAL_OPERATOR_EXPRESSION__TARGET);
		createEAttribute(temporalOperatorExpressionEClass, TEMPORAL_OPERATOR_EXPRESSION__OPERATOR);

		situationAttributeEClass = createEClass(SITUATION_ATTRIBUTE);
		createEReference(situationAttributeEClass, SITUATION_ATTRIBUTE__SITUATION);
		createEAttribute(situationAttributeEClass, SITUATION_ATTRIBUTE__IS_OF_TYPE);
		createEReference(situationAttributeEClass, SITUATION_ATTRIBUTE__LITERAL);

		existsSituationEClass = createEClass(EXISTS_SITUATION);
		createEAttribute(existsSituationEClass, EXISTS_SITUATION__IS_NEGATED);

		// Create enums
		temporalOperatorTypeEEnum = createEEnum(TEMPORAL_OPERATOR_TYPE);
		situationAttributeTypeEEnum = createEEnum(SITUATION_ATTRIBUTE_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CtxPackage theCtxPackage = (CtxPackage)EPackage.Registry.INSTANCE.getEPackage(CtxPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		situationTypeEClass.getESuperTypes().add(this.getSMLModelElement());
		situationTypeEClass.getESuperTypes().add(this.getSituationTypeElementContainer());
		situationTypeBlockEClass.getESuperTypes().add(this.getSituationTypeElement());
		situationTypeBlockEClass.getESuperTypes().add(this.getSituationTypeElementContainer());
		nodeEClass.getESuperTypes().add(this.getSituationTypeElement());
		exportableNodeEClass.getESuperTypes().add(this.getNode());
		entityParticipantEClass.getESuperTypes().add(this.getParticipant());
		relatorParticipantEClass.getESuperTypes().add(this.getParticipant());
		linkEClass.getESuperTypes().add(this.getSituationTypeElement());
		attributeReferenceEClass.getESuperTypes().add(this.getExportableNode());
		operatorExpressionEClass.getESuperTypes().add(this.getSituationTypeElement());
		comparativeRelationEClass.getESuperTypes().add(this.getOperatorExpression());
		literalEClass.getESuperTypes().add(this.getNode());
		participantEClass.getESuperTypes().add(this.getExportableNode());
		situationParticipantEClass.getESuperTypes().add(this.getNode());
		situationParameterReferenceEClass.getESuperTypes().add(this.getNode());
		temporalOperatorExpressionEClass.getESuperTypes().add(this.getOperatorExpression());
		situationAttributeEClass.getESuperTypes().add(this.getNode());
		existsSituationEClass.getESuperTypes().add(this.getSituationParticipant());

		// Initialize classes and features; add operations and parameters
		initEClass(smlModelEClass, SMLModel.class, "SMLModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSMLModel_Elements(), this.getSMLModelElement(), null, "elements", null, 0, -1, SMLModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSMLModel_ContextModel(), theCtxPackage.getContextModel(), null, "contextModel", null, 0, 1, SMLModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(smlModelElementEClass, SMLModelElement.class, "SMLModelElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(situationTypeEClass, SituationType.class, "SituationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSituationType_Name(), ecorePackage.getEString(), "name", null, 0, 1, SituationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSituationType_Parameter(), this.getSituationTypeParameter(), null, "parameter", null, 0, -1, SituationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(situationTypeBlockEClass, SituationTypeBlock.class, "SituationTypeBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSituationTypeBlock_Disjoint(), ecorePackage.getEBoolean(), "disjoint", null, 0, 1, SituationTypeBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(situationTypeElementEClass, SituationTypeElement.class, "SituationTypeElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nodeEClass, Node.class, "Node", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNode_NodeParameter(), this.getSituationTypeParameter(), this.getSituationTypeParameter_NodeReference(), "nodeParameter", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_SourceRelation(), this.getComparativeRelation(), this.getComparativeRelation_Source(), "sourceRelation", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_TargetRelation(), this.getComparativeRelation(), this.getComparativeRelation_Target(), "targetRelation", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exportableNodeEClass, ExportableNode.class, "ExportableNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(entityParticipantEClass, EntityParticipant.class, "EntityParticipant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntityParticipant_IsOfType(), theCtxPackage.getEntityClass(), null, "isOfType", null, 0, 1, EntityParticipant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relatorParticipantEClass, RelatorParticipant.class, "RelatorParticipant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelatorParticipant_IsOfType(), theCtxPackage.getRelatorClass(), null, "isOfType", null, 0, 1, RelatorParticipant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelatorParticipant_Links(), this.getLink(), this.getLink_Relator(), "links", null, 0, -1, RelatorParticipant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLink_IsOfType(), theCtxPackage.getAssociation(), null, "isOfType", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLink_Entity(), this.getEntityParticipant(), null, "entity", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLink_Relator(), this.getRelatorParticipant(), this.getRelatorParticipant_Links(), "relator", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(situationTypeParameterEClass, SituationTypeParameter.class, "SituationTypeParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSituationTypeParameter_NodeReference(), this.getNode(), this.getNode_NodeParameter(), "nodeReference", null, 0, 1, SituationTypeParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSituationTypeParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, SituationTypeParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeReferenceEClass, AttributeReference.class, "AttributeReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeReference_Entity(), this.getParticipant(), this.getParticipant_Reference(), "entity", null, 0, 1, AttributeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributeReference_Attribute(), theCtxPackage.getAttribute(), null, "attribute", null, 0, 1, AttributeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operatorExpressionEClass, OperatorExpression.class, "OperatorExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperatorExpression_Parameter(), ecorePackage.getEString(), "parameter", null, 0, 1, OperatorExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperatorExpression_IsNegated(), ecorePackage.getEBoolean(), "isNegated", null, 0, 1, OperatorExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(comparativeRelationEClass, ComparativeRelation.class, "ComparativeRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComparativeRelation_Source(), this.getNode(), this.getNode_SourceRelation(), "source", null, 0, 1, ComparativeRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComparativeRelation_Target(), this.getNode(), this.getNode_TargetRelation(), "target", null, 0, 1, ComparativeRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComparativeRelation_Relation(), theCtxPackage.getComparativeFormalRelation(), null, "relation", null, 0, 1, ComparativeRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(situationTypeElementContainerEClass, SituationTypeElementContainer.class, "SituationTypeElementContainer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSituationTypeElementContainer_Elements(), this.getSituationTypeElement(), null, "elements", null, 0, -1, SituationTypeElementContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(literalEClass, Literal.class, "Literal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteral_Value(), ecorePackage.getEString(), "value", null, 0, 1, Literal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLiteral_DataType(), theCtxPackage.getDataType(), null, "dataType", null, 0, 1, Literal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(participantEClass, Participant.class, "Participant", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParticipant_Reference(), this.getAttributeReference(), this.getAttributeReference_Entity(), "reference", null, 0, -1, Participant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(situationParticipantEClass, SituationParticipant.class, "SituationParticipant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSituationParticipant_SituationType(), this.getSituationType(), null, "situationType", null, 0, 1, SituationParticipant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSituationParticipant_Parameter(), this.getSituationParameterReference(), this.getSituationParameterReference_Situation(), "parameter", null, 0, -1, SituationParticipant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSituationParticipant_IsPast(), ecorePackage.getEBoolean(), "isPast", null, 0, 1, SituationParticipant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSituationParticipant_Attribute(), this.getSituationAttribute(), this.getSituationAttribute_Situation(), "attribute", null, 0, -1, SituationParticipant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(situationParameterReferenceEClass, SituationParameterReference.class, "SituationParameterReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSituationParameterReference_Parameter(), this.getSituationTypeParameter(), null, "parameter", null, 0, 1, SituationParameterReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSituationParameterReference_Situation(), this.getSituationParticipant(), this.getSituationParticipant_Parameter(), "situation", null, 0, 1, SituationParameterReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(temporalOperatorExpressionEClass, TemporalOperatorExpression.class, "TemporalOperatorExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemporalOperatorExpression_Source(), this.getSituationParticipant(), null, "source", null, 0, 1, TemporalOperatorExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTemporalOperatorExpression_Target(), this.getSituationParticipant(), null, "target", null, 0, 1, TemporalOperatorExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTemporalOperatorExpression_Operator(), this.getTemporalOperatorType(), "operator", null, 0, 1, TemporalOperatorExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(situationAttributeEClass, SituationAttribute.class, "SituationAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSituationAttribute_Situation(), this.getSituationParticipant(), this.getSituationParticipant_Attribute(), "situation", null, 0, 1, SituationAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSituationAttribute_IsOfType(), this.getSituationAttributeType(), "isOfType", null, 0, 1, SituationAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSituationAttribute_Literal(), this.getLiteral(), null, "literal", null, 0, 1, SituationAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(existsSituationEClass, ExistsSituation.class, "ExistsSituation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExistsSituation_IsNegated(), ecorePackage.getEBoolean(), "isNegated", null, 0, 1, ExistsSituation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(temporalOperatorTypeEEnum, TemporalOperatorType.class, "TemporalOperatorType");
		addEEnumLiteral(temporalOperatorTypeEEnum, TemporalOperatorType.AFTER);
		addEEnumLiteral(temporalOperatorTypeEEnum, TemporalOperatorType.BEFORE);
		addEEnumLiteral(temporalOperatorTypeEEnum, TemporalOperatorType.COINCIDES);
		addEEnumLiteral(temporalOperatorTypeEEnum, TemporalOperatorType.DURING);
		addEEnumLiteral(temporalOperatorTypeEEnum, TemporalOperatorType.FINISHES);
		addEEnumLiteral(temporalOperatorTypeEEnum, TemporalOperatorType.FINISHED_BY);
		addEEnumLiteral(temporalOperatorTypeEEnum, TemporalOperatorType.INCLUDES);
		addEEnumLiteral(temporalOperatorTypeEEnum, TemporalOperatorType.MEETS);
		addEEnumLiteral(temporalOperatorTypeEEnum, TemporalOperatorType.MET_BY);
		addEEnumLiteral(temporalOperatorTypeEEnum, TemporalOperatorType.OVERLAPS);
		addEEnumLiteral(temporalOperatorTypeEEnum, TemporalOperatorType.OVERLAPPED_BY);
		addEEnumLiteral(temporalOperatorTypeEEnum, TemporalOperatorType.STARTS);
		addEEnumLiteral(temporalOperatorTypeEEnum, TemporalOperatorType.STARTED_BY);

		initEEnum(situationAttributeTypeEEnum, SituationAttributeType.class, "SituationAttributeType");
		addEEnumLiteral(situationAttributeTypeEEnum, SituationAttributeType.START_TIME);
		addEEnumLiteral(situationAttributeTypeEEnum, SituationAttributeType.FINAL_TIME);

		// Create resource
		createResource(eNS_URI);
	}

} //SmlPackageImpl
