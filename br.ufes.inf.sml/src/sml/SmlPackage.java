/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sml;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see sml.SmlFactory
 * @model kind="package"
 * @generated
 */
public interface SmlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sml";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/sml";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sml";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SmlPackage eINSTANCE = sml.impl.SmlPackageImpl.init();

	/**
	 * The meta object id for the '{@link sml.impl.SMLModelImpl <em>SML Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sml.impl.SMLModelImpl
	 * @see sml.impl.SmlPackageImpl#getSMLModel()
	 * @generated
	 */
	int SML_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SML_MODEL__ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Context Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SML_MODEL__CONTEXT_MODEL = 1;

	/**
	 * The number of structural features of the '<em>SML Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SML_MODEL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link sml.impl.SMLModelElementImpl <em>SML Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sml.impl.SMLModelElementImpl
	 * @see sml.impl.SmlPackageImpl#getSMLModelElement()
	 * @generated
	 */
	int SML_MODEL_ELEMENT = 1;

	/**
	 * The number of structural features of the '<em>SML Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SML_MODEL_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link sml.impl.SituationTypeImpl <em>Situation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sml.impl.SituationTypeImpl
	 * @see sml.impl.SmlPackageImpl#getSituationType()
	 * @generated
	 */
	int SITUATION_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITUATION_TYPE__ELEMENTS = SML_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITUATION_TYPE__NAME = SML_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITUATION_TYPE__PARAMETER = SML_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Situation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITUATION_TYPE_FEATURE_COUNT = SML_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link sml.impl.SituationTypeElementImpl <em>Situation Type Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sml.impl.SituationTypeElementImpl
	 * @see sml.impl.SmlPackageImpl#getSituationTypeElement()
	 * @generated
	 */
	int SITUATION_TYPE_ELEMENT = 4;

	/**
	 * The number of structural features of the '<em>Situation Type Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITUATION_TYPE_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link sml.impl.SituationTypeBlockImpl <em>Situation Type Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sml.impl.SituationTypeBlockImpl
	 * @see sml.impl.SmlPackageImpl#getSituationTypeBlock()
	 * @generated
	 */
	int SITUATION_TYPE_BLOCK = 3;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITUATION_TYPE_BLOCK__ELEMENTS = SITUATION_TYPE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Disjoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITUATION_TYPE_BLOCK__DISJOINT = SITUATION_TYPE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Situation Type Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITUATION_TYPE_BLOCK_FEATURE_COUNT = SITUATION_TYPE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link sml.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sml.impl.NodeImpl
	 * @see sml.impl.SmlPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 5;

	/**
	 * The feature id for the '<em><b>Node Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NODE_PARAMETER = SITUATION_TYPE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__SOURCE_RELATION = SITUATION_TYPE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__TARGET_RELATION = SITUATION_TYPE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = SITUATION_TYPE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link sml.impl.ExportableNodeImpl <em>Exportable Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sml.impl.ExportableNodeImpl
	 * @see sml.impl.SmlPackageImpl#getExportableNode()
	 * @generated
	 */
	int EXPORTABLE_NODE = 6;

	/**
	 * The feature id for the '<em><b>Node Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORTABLE_NODE__NODE_PARAMETER = NODE__NODE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORTABLE_NODE__SOURCE_RELATION = NODE__SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORTABLE_NODE__TARGET_RELATION = NODE__TARGET_RELATION;

	/**
	 * The number of structural features of the '<em>Exportable Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORTABLE_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link sml.impl.ParticipantImpl <em>Participant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sml.impl.ParticipantImpl
	 * @see sml.impl.SmlPackageImpl#getParticipant()
	 * @generated
	 */
	int PARTICIPANT = 16;

	/**
	 * The feature id for the '<em><b>Node Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__NODE_PARAMETER = EXPORTABLE_NODE__NODE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__SOURCE_RELATION = EXPORTABLE_NODE__SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__TARGET_RELATION = EXPORTABLE_NODE__TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__REFERENCE = EXPORTABLE_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Participant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_FEATURE_COUNT = EXPORTABLE_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link sml.impl.EntityParticipantImpl <em>Entity Participant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sml.impl.EntityParticipantImpl
	 * @see sml.impl.SmlPackageImpl#getEntityParticipant()
	 * @generated
	 */
	int ENTITY_PARTICIPANT = 7;

	/**
	 * The feature id for the '<em><b>Node Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_PARTICIPANT__NODE_PARAMETER = PARTICIPANT__NODE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_PARTICIPANT__SOURCE_RELATION = PARTICIPANT__SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_PARTICIPANT__TARGET_RELATION = PARTICIPANT__TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_PARTICIPANT__REFERENCE = PARTICIPANT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Is Of Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_PARTICIPANT__IS_OF_TYPE = PARTICIPANT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entity Participant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_PARTICIPANT_FEATURE_COUNT = PARTICIPANT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link sml.impl.RelatorParticipantImpl <em>Relator Participant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sml.impl.RelatorParticipantImpl
	 * @see sml.impl.SmlPackageImpl#getRelatorParticipant()
	 * @generated
	 */
	int RELATOR_PARTICIPANT = 8;

	/**
	 * The feature id for the '<em><b>Node Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATOR_PARTICIPANT__NODE_PARAMETER = PARTICIPANT__NODE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATOR_PARTICIPANT__SOURCE_RELATION = PARTICIPANT__SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATOR_PARTICIPANT__TARGET_RELATION = PARTICIPANT__TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATOR_PARTICIPANT__REFERENCE = PARTICIPANT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Is Of Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATOR_PARTICIPANT__IS_OF_TYPE = PARTICIPANT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATOR_PARTICIPANT__LINKS = PARTICIPANT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Relator Participant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATOR_PARTICIPANT_FEATURE_COUNT = PARTICIPANT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link sml.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sml.impl.LinkImpl
	 * @see sml.impl.SmlPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 9;

	/**
	 * The feature id for the '<em><b>Is Of Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__IS_OF_TYPE = SITUATION_TYPE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__ENTITY = SITUATION_TYPE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Relator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__RELATOR = SITUATION_TYPE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = SITUATION_TYPE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link sml.impl.SituationTypeParameterImpl <em>Situation Type Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sml.impl.SituationTypeParameterImpl
	 * @see sml.impl.SmlPackageImpl#getSituationTypeParameter()
	 * @generated
	 */
	int SITUATION_TYPE_PARAMETER = 10;

	/**
	 * The feature id for the '<em><b>Node Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITUATION_TYPE_PARAMETER__NODE_REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITUATION_TYPE_PARAMETER__NAME = 1;

	/**
	 * The number of structural features of the '<em>Situation Type Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITUATION_TYPE_PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link sml.impl.AttributeReferenceImpl <em>Attribute Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sml.impl.AttributeReferenceImpl
	 * @see sml.impl.SmlPackageImpl#getAttributeReference()
	 * @generated
	 */
	int ATTRIBUTE_REFERENCE = 11;

	/**
	 * The feature id for the '<em><b>Node Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_REFERENCE__NODE_PARAMETER = EXPORTABLE_NODE__NODE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_REFERENCE__SOURCE_RELATION = EXPORTABLE_NODE__SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_REFERENCE__TARGET_RELATION = EXPORTABLE_NODE__TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_REFERENCE__ENTITY = EXPORTABLE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_REFERENCE__ATTRIBUTE = EXPORTABLE_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_REFERENCE_FEATURE_COUNT = EXPORTABLE_NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link sml.impl.OperatorExpressionImpl <em>Operator Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sml.impl.OperatorExpressionImpl
	 * @see sml.impl.SmlPackageImpl#getOperatorExpression()
	 * @generated
	 */
	int OPERATOR_EXPRESSION = 12;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_EXPRESSION__PARAMETER = SITUATION_TYPE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_EXPRESSION__IS_NEGATED = SITUATION_TYPE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Operator Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_EXPRESSION_FEATURE_COUNT = SITUATION_TYPE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link sml.impl.ComparativeRelationImpl <em>Comparative Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sml.impl.ComparativeRelationImpl
	 * @see sml.impl.SmlPackageImpl#getComparativeRelation()
	 * @generated
	 */
	int COMPARATIVE_RELATION = 13;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARATIVE_RELATION__PARAMETER = OPERATOR_EXPRESSION__PARAMETER;

	/**
	 * The feature id for the '<em><b>Is Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARATIVE_RELATION__IS_NEGATED = OPERATOR_EXPRESSION__IS_NEGATED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARATIVE_RELATION__SOURCE = OPERATOR_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARATIVE_RELATION__TARGET = OPERATOR_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARATIVE_RELATION__RELATION = OPERATOR_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Comparative Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARATIVE_RELATION_FEATURE_COUNT = OPERATOR_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link sml.impl.SituationTypeElementContainerImpl <em>Situation Type Element Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sml.impl.SituationTypeElementContainerImpl
	 * @see sml.impl.SmlPackageImpl#getSituationTypeElementContainer()
	 * @generated
	 */
	int SITUATION_TYPE_ELEMENT_CONTAINER = 14;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITUATION_TYPE_ELEMENT_CONTAINER__ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Situation Type Element Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITUATION_TYPE_ELEMENT_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link sml.impl.LiteralImpl <em>Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sml.impl.LiteralImpl
	 * @see sml.impl.SmlPackageImpl#getLiteral()
	 * @generated
	 */
	int LITERAL = 15;

	/**
	 * The feature id for the '<em><b>Node Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__NODE_PARAMETER = NODE__NODE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__SOURCE_RELATION = NODE__SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__TARGET_RELATION = NODE__TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__VALUE = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__DATA_TYPE = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link sml.impl.SituationParticipantImpl <em>Situation Participant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sml.impl.SituationParticipantImpl
	 * @see sml.impl.SmlPackageImpl#getSituationParticipant()
	 * @generated
	 */
	int SITUATION_PARTICIPANT = 17;

	/**
	 * The feature id for the '<em><b>Node Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITUATION_PARTICIPANT__NODE_PARAMETER = NODE__NODE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITUATION_PARTICIPANT__SOURCE_RELATION = NODE__SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITUATION_PARTICIPANT__TARGET_RELATION = NODE__TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Situation Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITUATION_PARTICIPANT__SITUATION_TYPE = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITUATION_PARTICIPANT__PARAMETER = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Past</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITUATION_PARTICIPANT__IS_PAST = NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITUATION_PARTICIPANT__ATTRIBUTE = NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Situation Participant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITUATION_PARTICIPANT_FEATURE_COUNT = NODE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link sml.impl.SituationParameterReferenceImpl <em>Situation Parameter Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sml.impl.SituationParameterReferenceImpl
	 * @see sml.impl.SmlPackageImpl#getSituationParameterReference()
	 * @generated
	 */
	int SITUATION_PARAMETER_REFERENCE = 18;

	/**
	 * The feature id for the '<em><b>Node Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITUATION_PARAMETER_REFERENCE__NODE_PARAMETER = NODE__NODE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITUATION_PARAMETER_REFERENCE__SOURCE_RELATION = NODE__SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITUATION_PARAMETER_REFERENCE__TARGET_RELATION = NODE__TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITUATION_PARAMETER_REFERENCE__PARAMETER = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Situation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITUATION_PARAMETER_REFERENCE__SITUATION = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Situation Parameter Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITUATION_PARAMETER_REFERENCE_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link sml.impl.TemporalOperatorExpressionImpl <em>Temporal Operator Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sml.impl.TemporalOperatorExpressionImpl
	 * @see sml.impl.SmlPackageImpl#getTemporalOperatorExpression()
	 * @generated
	 */
	int TEMPORAL_OPERATOR_EXPRESSION = 19;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_OPERATOR_EXPRESSION__PARAMETER = OPERATOR_EXPRESSION__PARAMETER;

	/**
	 * The feature id for the '<em><b>Is Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_OPERATOR_EXPRESSION__IS_NEGATED = OPERATOR_EXPRESSION__IS_NEGATED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_OPERATOR_EXPRESSION__SOURCE = OPERATOR_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_OPERATOR_EXPRESSION__TARGET = OPERATOR_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_OPERATOR_EXPRESSION__OPERATOR = OPERATOR_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Temporal Operator Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_OPERATOR_EXPRESSION_FEATURE_COUNT = OPERATOR_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link sml.impl.SituationAttributeImpl <em>Situation Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sml.impl.SituationAttributeImpl
	 * @see sml.impl.SmlPackageImpl#getSituationAttribute()
	 * @generated
	 */
	int SITUATION_ATTRIBUTE = 20;

	/**
	 * The feature id for the '<em><b>Node Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITUATION_ATTRIBUTE__NODE_PARAMETER = NODE__NODE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITUATION_ATTRIBUTE__SOURCE_RELATION = NODE__SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITUATION_ATTRIBUTE__TARGET_RELATION = NODE__TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Situation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITUATION_ATTRIBUTE__SITUATION = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Of Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITUATION_ATTRIBUTE__IS_OF_TYPE = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITUATION_ATTRIBUTE__LITERAL = NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Situation Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITUATION_ATTRIBUTE_FEATURE_COUNT = NODE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link sml.impl.ExistsSituationImpl <em>Exists Situation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sml.impl.ExistsSituationImpl
	 * @see sml.impl.SmlPackageImpl#getExistsSituation()
	 * @generated
	 */
	int EXISTS_SITUATION = 21;

	/**
	 * The feature id for the '<em><b>Node Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTS_SITUATION__NODE_PARAMETER = SITUATION_PARTICIPANT__NODE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTS_SITUATION__SOURCE_RELATION = SITUATION_PARTICIPANT__SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTS_SITUATION__TARGET_RELATION = SITUATION_PARTICIPANT__TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Situation Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTS_SITUATION__SITUATION_TYPE = SITUATION_PARTICIPANT__SITUATION_TYPE;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTS_SITUATION__PARAMETER = SITUATION_PARTICIPANT__PARAMETER;

	/**
	 * The feature id for the '<em><b>Is Past</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTS_SITUATION__IS_PAST = SITUATION_PARTICIPANT__IS_PAST;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTS_SITUATION__ATTRIBUTE = SITUATION_PARTICIPANT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Is Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTS_SITUATION__IS_NEGATED = SITUATION_PARTICIPANT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Exists Situation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTS_SITUATION_FEATURE_COUNT = SITUATION_PARTICIPANT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link sml.TemporalOperatorType <em>Temporal Operator Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sml.TemporalOperatorType
	 * @see sml.impl.SmlPackageImpl#getTemporalOperatorType()
	 * @generated
	 */
	int TEMPORAL_OPERATOR_TYPE = 22;

	/**
	 * The meta object id for the '{@link sml.SituationAttributeType <em>Situation Attribute Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sml.SituationAttributeType
	 * @see sml.impl.SmlPackageImpl#getSituationAttributeType()
	 * @generated
	 */
	int SITUATION_ATTRIBUTE_TYPE = 23;


	/**
	 * Returns the meta object for class '{@link sml.SMLModel <em>SML Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SML Model</em>'.
	 * @see sml.SMLModel
	 * @generated
	 */
	EClass getSMLModel();

	/**
	 * Returns the meta object for the containment reference list '{@link sml.SMLModel#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see sml.SMLModel#getElements()
	 * @see #getSMLModel()
	 * @generated
	 */
	EReference getSMLModel_Elements();

	/**
	 * Returns the meta object for the reference '{@link sml.SMLModel#getContextModel <em>Context Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context Model</em>'.
	 * @see sml.SMLModel#getContextModel()
	 * @see #getSMLModel()
	 * @generated
	 */
	EReference getSMLModel_ContextModel();

	/**
	 * Returns the meta object for class '{@link sml.SMLModelElement <em>SML Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SML Model Element</em>'.
	 * @see sml.SMLModelElement
	 * @generated
	 */
	EClass getSMLModelElement();

	/**
	 * Returns the meta object for class '{@link sml.SituationType <em>Situation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Situation Type</em>'.
	 * @see sml.SituationType
	 * @generated
	 */
	EClass getSituationType();

	/**
	 * Returns the meta object for the attribute '{@link sml.SituationType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sml.SituationType#getName()
	 * @see #getSituationType()
	 * @generated
	 */
	EAttribute getSituationType_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link sml.SituationType#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see sml.SituationType#getParameter()
	 * @see #getSituationType()
	 * @generated
	 */
	EReference getSituationType_Parameter();

	/**
	 * Returns the meta object for class '{@link sml.SituationTypeBlock <em>Situation Type Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Situation Type Block</em>'.
	 * @see sml.SituationTypeBlock
	 * @generated
	 */
	EClass getSituationTypeBlock();

	/**
	 * Returns the meta object for the attribute '{@link sml.SituationTypeBlock#isDisjoint <em>Disjoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disjoint</em>'.
	 * @see sml.SituationTypeBlock#isDisjoint()
	 * @see #getSituationTypeBlock()
	 * @generated
	 */
	EAttribute getSituationTypeBlock_Disjoint();

	/**
	 * Returns the meta object for class '{@link sml.SituationTypeElement <em>Situation Type Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Situation Type Element</em>'.
	 * @see sml.SituationTypeElement
	 * @generated
	 */
	EClass getSituationTypeElement();

	/**
	 * Returns the meta object for class '{@link sml.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see sml.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the reference '{@link sml.Node#getNodeParameter <em>Node Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node Parameter</em>'.
	 * @see sml.Node#getNodeParameter()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_NodeParameter();

	/**
	 * Returns the meta object for the reference list '{@link sml.Node#getSourceRelation <em>Source Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source Relation</em>'.
	 * @see sml.Node#getSourceRelation()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_SourceRelation();

	/**
	 * Returns the meta object for the reference list '{@link sml.Node#getTargetRelation <em>Target Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target Relation</em>'.
	 * @see sml.Node#getTargetRelation()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_TargetRelation();

	/**
	 * Returns the meta object for class '{@link sml.ExportableNode <em>Exportable Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exportable Node</em>'.
	 * @see sml.ExportableNode
	 * @generated
	 */
	EClass getExportableNode();

	/**
	 * Returns the meta object for class '{@link sml.EntityParticipant <em>Entity Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Participant</em>'.
	 * @see sml.EntityParticipant
	 * @generated
	 */
	EClass getEntityParticipant();

	/**
	 * Returns the meta object for the reference '{@link sml.EntityParticipant#getIsOfType <em>Is Of Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Of Type</em>'.
	 * @see sml.EntityParticipant#getIsOfType()
	 * @see #getEntityParticipant()
	 * @generated
	 */
	EReference getEntityParticipant_IsOfType();

	/**
	 * Returns the meta object for class '{@link sml.RelatorParticipant <em>Relator Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relator Participant</em>'.
	 * @see sml.RelatorParticipant
	 * @generated
	 */
	EClass getRelatorParticipant();

	/**
	 * Returns the meta object for the reference '{@link sml.RelatorParticipant#getIsOfType <em>Is Of Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Of Type</em>'.
	 * @see sml.RelatorParticipant#getIsOfType()
	 * @see #getRelatorParticipant()
	 * @generated
	 */
	EReference getRelatorParticipant_IsOfType();

	/**
	 * Returns the meta object for the reference list '{@link sml.RelatorParticipant#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Links</em>'.
	 * @see sml.RelatorParticipant#getLinks()
	 * @see #getRelatorParticipant()
	 * @generated
	 */
	EReference getRelatorParticipant_Links();

	/**
	 * Returns the meta object for class '{@link sml.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see sml.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the reference '{@link sml.Link#getIsOfType <em>Is Of Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Of Type</em>'.
	 * @see sml.Link#getIsOfType()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_IsOfType();

	/**
	 * Returns the meta object for the reference '{@link sml.Link#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see sml.Link#getEntity()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Entity();

	/**
	 * Returns the meta object for the reference '{@link sml.Link#getRelator <em>Relator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Relator</em>'.
	 * @see sml.Link#getRelator()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Relator();

	/**
	 * Returns the meta object for class '{@link sml.SituationTypeParameter <em>Situation Type Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Situation Type Parameter</em>'.
	 * @see sml.SituationTypeParameter
	 * @generated
	 */
	EClass getSituationTypeParameter();

	/**
	 * Returns the meta object for the reference '{@link sml.SituationTypeParameter#getNodeReference <em>Node Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node Reference</em>'.
	 * @see sml.SituationTypeParameter#getNodeReference()
	 * @see #getSituationTypeParameter()
	 * @generated
	 */
	EReference getSituationTypeParameter_NodeReference();

	/**
	 * Returns the meta object for the attribute '{@link sml.SituationTypeParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sml.SituationTypeParameter#getName()
	 * @see #getSituationTypeParameter()
	 * @generated
	 */
	EAttribute getSituationTypeParameter_Name();

	/**
	 * Returns the meta object for class '{@link sml.AttributeReference <em>Attribute Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Reference</em>'.
	 * @see sml.AttributeReference
	 * @generated
	 */
	EClass getAttributeReference();

	/**
	 * Returns the meta object for the reference '{@link sml.AttributeReference#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see sml.AttributeReference#getEntity()
	 * @see #getAttributeReference()
	 * @generated
	 */
	EReference getAttributeReference_Entity();

	/**
	 * Returns the meta object for the reference '{@link sml.AttributeReference#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see sml.AttributeReference#getAttribute()
	 * @see #getAttributeReference()
	 * @generated
	 */
	EReference getAttributeReference_Attribute();

	/**
	 * Returns the meta object for class '{@link sml.OperatorExpression <em>Operator Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operator Expression</em>'.
	 * @see sml.OperatorExpression
	 * @generated
	 */
	EClass getOperatorExpression();

	/**
	 * Returns the meta object for the attribute '{@link sml.OperatorExpression#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter</em>'.
	 * @see sml.OperatorExpression#getParameter()
	 * @see #getOperatorExpression()
	 * @generated
	 */
	EAttribute getOperatorExpression_Parameter();

	/**
	 * Returns the meta object for the attribute '{@link sml.OperatorExpression#isIsNegated <em>Is Negated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Negated</em>'.
	 * @see sml.OperatorExpression#isIsNegated()
	 * @see #getOperatorExpression()
	 * @generated
	 */
	EAttribute getOperatorExpression_IsNegated();

	/**
	 * Returns the meta object for class '{@link sml.ComparativeRelation <em>Comparative Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparative Relation</em>'.
	 * @see sml.ComparativeRelation
	 * @generated
	 */
	EClass getComparativeRelation();

	/**
	 * Returns the meta object for the reference '{@link sml.ComparativeRelation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see sml.ComparativeRelation#getSource()
	 * @see #getComparativeRelation()
	 * @generated
	 */
	EReference getComparativeRelation_Source();

	/**
	 * Returns the meta object for the reference '{@link sml.ComparativeRelation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see sml.ComparativeRelation#getTarget()
	 * @see #getComparativeRelation()
	 * @generated
	 */
	EReference getComparativeRelation_Target();

	/**
	 * Returns the meta object for the reference '{@link sml.ComparativeRelation#getRelation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Relation</em>'.
	 * @see sml.ComparativeRelation#getRelation()
	 * @see #getComparativeRelation()
	 * @generated
	 */
	EReference getComparativeRelation_Relation();

	/**
	 * Returns the meta object for class '{@link sml.SituationTypeElementContainer <em>Situation Type Element Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Situation Type Element Container</em>'.
	 * @see sml.SituationTypeElementContainer
	 * @generated
	 */
	EClass getSituationTypeElementContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link sml.SituationTypeElementContainer#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see sml.SituationTypeElementContainer#getElements()
	 * @see #getSituationTypeElementContainer()
	 * @generated
	 */
	EReference getSituationTypeElementContainer_Elements();

	/**
	 * Returns the meta object for class '{@link sml.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal</em>'.
	 * @see sml.Literal
	 * @generated
	 */
	EClass getLiteral();

	/**
	 * Returns the meta object for the attribute '{@link sml.Literal#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see sml.Literal#getValue()
	 * @see #getLiteral()
	 * @generated
	 */
	EAttribute getLiteral_Value();

	/**
	 * Returns the meta object for the reference '{@link sml.Literal#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Type</em>'.
	 * @see sml.Literal#getDataType()
	 * @see #getLiteral()
	 * @generated
	 */
	EReference getLiteral_DataType();

	/**
	 * Returns the meta object for class '{@link sml.Participant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Participant</em>'.
	 * @see sml.Participant
	 * @generated
	 */
	EClass getParticipant();

	/**
	 * Returns the meta object for the reference list '{@link sml.Participant#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reference</em>'.
	 * @see sml.Participant#getReference()
	 * @see #getParticipant()
	 * @generated
	 */
	EReference getParticipant_Reference();

	/**
	 * Returns the meta object for class '{@link sml.SituationParticipant <em>Situation Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Situation Participant</em>'.
	 * @see sml.SituationParticipant
	 * @generated
	 */
	EClass getSituationParticipant();

	/**
	 * Returns the meta object for the reference '{@link sml.SituationParticipant#getSituationType <em>Situation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Situation Type</em>'.
	 * @see sml.SituationParticipant#getSituationType()
	 * @see #getSituationParticipant()
	 * @generated
	 */
	EReference getSituationParticipant_SituationType();

	/**
	 * Returns the meta object for the reference list '{@link sml.SituationParticipant#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameter</em>'.
	 * @see sml.SituationParticipant#getParameter()
	 * @see #getSituationParticipant()
	 * @generated
	 */
	EReference getSituationParticipant_Parameter();

	/**
	 * Returns the meta object for the attribute '{@link sml.SituationParticipant#isIsPast <em>Is Past</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Past</em>'.
	 * @see sml.SituationParticipant#isIsPast()
	 * @see #getSituationParticipant()
	 * @generated
	 */
	EAttribute getSituationParticipant_IsPast();

	/**
	 * Returns the meta object for the reference list '{@link sml.SituationParticipant#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attribute</em>'.
	 * @see sml.SituationParticipant#getAttribute()
	 * @see #getSituationParticipant()
	 * @generated
	 */
	EReference getSituationParticipant_Attribute();

	/**
	 * Returns the meta object for class '{@link sml.SituationParameterReference <em>Situation Parameter Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Situation Parameter Reference</em>'.
	 * @see sml.SituationParameterReference
	 * @generated
	 */
	EClass getSituationParameterReference();

	/**
	 * Returns the meta object for the reference '{@link sml.SituationParameterReference#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see sml.SituationParameterReference#getParameter()
	 * @see #getSituationParameterReference()
	 * @generated
	 */
	EReference getSituationParameterReference_Parameter();

	/**
	 * Returns the meta object for the reference '{@link sml.SituationParameterReference#getSituation <em>Situation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Situation</em>'.
	 * @see sml.SituationParameterReference#getSituation()
	 * @see #getSituationParameterReference()
	 * @generated
	 */
	EReference getSituationParameterReference_Situation();

	/**
	 * Returns the meta object for class '{@link sml.TemporalOperatorExpression <em>Temporal Operator Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temporal Operator Expression</em>'.
	 * @see sml.TemporalOperatorExpression
	 * @generated
	 */
	EClass getTemporalOperatorExpression();

	/**
	 * Returns the meta object for the reference '{@link sml.TemporalOperatorExpression#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see sml.TemporalOperatorExpression#getSource()
	 * @see #getTemporalOperatorExpression()
	 * @generated
	 */
	EReference getTemporalOperatorExpression_Source();

	/**
	 * Returns the meta object for the reference '{@link sml.TemporalOperatorExpression#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see sml.TemporalOperatorExpression#getTarget()
	 * @see #getTemporalOperatorExpression()
	 * @generated
	 */
	EReference getTemporalOperatorExpression_Target();

	/**
	 * Returns the meta object for the attribute '{@link sml.TemporalOperatorExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see sml.TemporalOperatorExpression#getOperator()
	 * @see #getTemporalOperatorExpression()
	 * @generated
	 */
	EAttribute getTemporalOperatorExpression_Operator();

	/**
	 * Returns the meta object for class '{@link sml.SituationAttribute <em>Situation Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Situation Attribute</em>'.
	 * @see sml.SituationAttribute
	 * @generated
	 */
	EClass getSituationAttribute();

	/**
	 * Returns the meta object for the reference '{@link sml.SituationAttribute#getSituation <em>Situation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Situation</em>'.
	 * @see sml.SituationAttribute#getSituation()
	 * @see #getSituationAttribute()
	 * @generated
	 */
	EReference getSituationAttribute_Situation();

	/**
	 * Returns the meta object for the attribute '{@link sml.SituationAttribute#getIsOfType <em>Is Of Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Of Type</em>'.
	 * @see sml.SituationAttribute#getIsOfType()
	 * @see #getSituationAttribute()
	 * @generated
	 */
	EAttribute getSituationAttribute_IsOfType();

	/**
	 * Returns the meta object for the reference '{@link sml.SituationAttribute#getLiteral <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Literal</em>'.
	 * @see sml.SituationAttribute#getLiteral()
	 * @see #getSituationAttribute()
	 * @generated
	 */
	EReference getSituationAttribute_Literal();

	/**
	 * Returns the meta object for class '{@link sml.ExistsSituation <em>Exists Situation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exists Situation</em>'.
	 * @see sml.ExistsSituation
	 * @generated
	 */
	EClass getExistsSituation();

	/**
	 * Returns the meta object for the attribute '{@link sml.ExistsSituation#isIsNegated <em>Is Negated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Negated</em>'.
	 * @see sml.ExistsSituation#isIsNegated()
	 * @see #getExistsSituation()
	 * @generated
	 */
	EAttribute getExistsSituation_IsNegated();

	/**
	 * Returns the meta object for enum '{@link sml.TemporalOperatorType <em>Temporal Operator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Temporal Operator Type</em>'.
	 * @see sml.TemporalOperatorType
	 * @generated
	 */
	EEnum getTemporalOperatorType();

	/**
	 * Returns the meta object for enum '{@link sml.SituationAttributeType <em>Situation Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Situation Attribute Type</em>'.
	 * @see sml.SituationAttributeType
	 * @generated
	 */
	EEnum getSituationAttributeType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SmlFactory getSmlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link sml.impl.SMLModelImpl <em>SML Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sml.impl.SMLModelImpl
		 * @see sml.impl.SmlPackageImpl#getSMLModel()
		 * @generated
		 */
		EClass SML_MODEL = eINSTANCE.getSMLModel();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SML_MODEL__ELEMENTS = eINSTANCE.getSMLModel_Elements();

		/**
		 * The meta object literal for the '<em><b>Context Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SML_MODEL__CONTEXT_MODEL = eINSTANCE.getSMLModel_ContextModel();

		/**
		 * The meta object literal for the '{@link sml.impl.SMLModelElementImpl <em>SML Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sml.impl.SMLModelElementImpl
		 * @see sml.impl.SmlPackageImpl#getSMLModelElement()
		 * @generated
		 */
		EClass SML_MODEL_ELEMENT = eINSTANCE.getSMLModelElement();

		/**
		 * The meta object literal for the '{@link sml.impl.SituationTypeImpl <em>Situation Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sml.impl.SituationTypeImpl
		 * @see sml.impl.SmlPackageImpl#getSituationType()
		 * @generated
		 */
		EClass SITUATION_TYPE = eINSTANCE.getSituationType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SITUATION_TYPE__NAME = eINSTANCE.getSituationType_Name();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SITUATION_TYPE__PARAMETER = eINSTANCE.getSituationType_Parameter();

		/**
		 * The meta object literal for the '{@link sml.impl.SituationTypeBlockImpl <em>Situation Type Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sml.impl.SituationTypeBlockImpl
		 * @see sml.impl.SmlPackageImpl#getSituationTypeBlock()
		 * @generated
		 */
		EClass SITUATION_TYPE_BLOCK = eINSTANCE.getSituationTypeBlock();

		/**
		 * The meta object literal for the '<em><b>Disjoint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SITUATION_TYPE_BLOCK__DISJOINT = eINSTANCE.getSituationTypeBlock_Disjoint();

		/**
		 * The meta object literal for the '{@link sml.impl.SituationTypeElementImpl <em>Situation Type Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sml.impl.SituationTypeElementImpl
		 * @see sml.impl.SmlPackageImpl#getSituationTypeElement()
		 * @generated
		 */
		EClass SITUATION_TYPE_ELEMENT = eINSTANCE.getSituationTypeElement();

		/**
		 * The meta object literal for the '{@link sml.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sml.impl.NodeImpl
		 * @see sml.impl.SmlPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Node Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__NODE_PARAMETER = eINSTANCE.getNode_NodeParameter();

		/**
		 * The meta object literal for the '<em><b>Source Relation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__SOURCE_RELATION = eINSTANCE.getNode_SourceRelation();

		/**
		 * The meta object literal for the '<em><b>Target Relation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__TARGET_RELATION = eINSTANCE.getNode_TargetRelation();

		/**
		 * The meta object literal for the '{@link sml.impl.ExportableNodeImpl <em>Exportable Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sml.impl.ExportableNodeImpl
		 * @see sml.impl.SmlPackageImpl#getExportableNode()
		 * @generated
		 */
		EClass EXPORTABLE_NODE = eINSTANCE.getExportableNode();

		/**
		 * The meta object literal for the '{@link sml.impl.EntityParticipantImpl <em>Entity Participant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sml.impl.EntityParticipantImpl
		 * @see sml.impl.SmlPackageImpl#getEntityParticipant()
		 * @generated
		 */
		EClass ENTITY_PARTICIPANT = eINSTANCE.getEntityParticipant();

		/**
		 * The meta object literal for the '<em><b>Is Of Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_PARTICIPANT__IS_OF_TYPE = eINSTANCE.getEntityParticipant_IsOfType();

		/**
		 * The meta object literal for the '{@link sml.impl.RelatorParticipantImpl <em>Relator Participant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sml.impl.RelatorParticipantImpl
		 * @see sml.impl.SmlPackageImpl#getRelatorParticipant()
		 * @generated
		 */
		EClass RELATOR_PARTICIPANT = eINSTANCE.getRelatorParticipant();

		/**
		 * The meta object literal for the '<em><b>Is Of Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATOR_PARTICIPANT__IS_OF_TYPE = eINSTANCE.getRelatorParticipant_IsOfType();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATOR_PARTICIPANT__LINKS = eINSTANCE.getRelatorParticipant_Links();

		/**
		 * The meta object literal for the '{@link sml.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sml.impl.LinkImpl
		 * @see sml.impl.SmlPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Is Of Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__IS_OF_TYPE = eINSTANCE.getLink_IsOfType();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__ENTITY = eINSTANCE.getLink_Entity();

		/**
		 * The meta object literal for the '<em><b>Relator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__RELATOR = eINSTANCE.getLink_Relator();

		/**
		 * The meta object literal for the '{@link sml.impl.SituationTypeParameterImpl <em>Situation Type Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sml.impl.SituationTypeParameterImpl
		 * @see sml.impl.SmlPackageImpl#getSituationTypeParameter()
		 * @generated
		 */
		EClass SITUATION_TYPE_PARAMETER = eINSTANCE.getSituationTypeParameter();

		/**
		 * The meta object literal for the '<em><b>Node Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SITUATION_TYPE_PARAMETER__NODE_REFERENCE = eINSTANCE.getSituationTypeParameter_NodeReference();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SITUATION_TYPE_PARAMETER__NAME = eINSTANCE.getSituationTypeParameter_Name();

		/**
		 * The meta object literal for the '{@link sml.impl.AttributeReferenceImpl <em>Attribute Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sml.impl.AttributeReferenceImpl
		 * @see sml.impl.SmlPackageImpl#getAttributeReference()
		 * @generated
		 */
		EClass ATTRIBUTE_REFERENCE = eINSTANCE.getAttributeReference();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_REFERENCE__ENTITY = eINSTANCE.getAttributeReference_Entity();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_REFERENCE__ATTRIBUTE = eINSTANCE.getAttributeReference_Attribute();

		/**
		 * The meta object literal for the '{@link sml.impl.OperatorExpressionImpl <em>Operator Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sml.impl.OperatorExpressionImpl
		 * @see sml.impl.SmlPackageImpl#getOperatorExpression()
		 * @generated
		 */
		EClass OPERATOR_EXPRESSION = eINSTANCE.getOperatorExpression();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATOR_EXPRESSION__PARAMETER = eINSTANCE.getOperatorExpression_Parameter();

		/**
		 * The meta object literal for the '<em><b>Is Negated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATOR_EXPRESSION__IS_NEGATED = eINSTANCE.getOperatorExpression_IsNegated();

		/**
		 * The meta object literal for the '{@link sml.impl.ComparativeRelationImpl <em>Comparative Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sml.impl.ComparativeRelationImpl
		 * @see sml.impl.SmlPackageImpl#getComparativeRelation()
		 * @generated
		 */
		EClass COMPARATIVE_RELATION = eINSTANCE.getComparativeRelation();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARATIVE_RELATION__SOURCE = eINSTANCE.getComparativeRelation_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARATIVE_RELATION__TARGET = eINSTANCE.getComparativeRelation_Target();

		/**
		 * The meta object literal for the '<em><b>Relation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARATIVE_RELATION__RELATION = eINSTANCE.getComparativeRelation_Relation();

		/**
		 * The meta object literal for the '{@link sml.impl.SituationTypeElementContainerImpl <em>Situation Type Element Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sml.impl.SituationTypeElementContainerImpl
		 * @see sml.impl.SmlPackageImpl#getSituationTypeElementContainer()
		 * @generated
		 */
		EClass SITUATION_TYPE_ELEMENT_CONTAINER = eINSTANCE.getSituationTypeElementContainer();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SITUATION_TYPE_ELEMENT_CONTAINER__ELEMENTS = eINSTANCE.getSituationTypeElementContainer_Elements();

		/**
		 * The meta object literal for the '{@link sml.impl.LiteralImpl <em>Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sml.impl.LiteralImpl
		 * @see sml.impl.SmlPackageImpl#getLiteral()
		 * @generated
		 */
		EClass LITERAL = eINSTANCE.getLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL__VALUE = eINSTANCE.getLiteral_Value();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LITERAL__DATA_TYPE = eINSTANCE.getLiteral_DataType();

		/**
		 * The meta object literal for the '{@link sml.impl.ParticipantImpl <em>Participant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sml.impl.ParticipantImpl
		 * @see sml.impl.SmlPackageImpl#getParticipant()
		 * @generated
		 */
		EClass PARTICIPANT = eINSTANCE.getParticipant();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTICIPANT__REFERENCE = eINSTANCE.getParticipant_Reference();

		/**
		 * The meta object literal for the '{@link sml.impl.SituationParticipantImpl <em>Situation Participant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sml.impl.SituationParticipantImpl
		 * @see sml.impl.SmlPackageImpl#getSituationParticipant()
		 * @generated
		 */
		EClass SITUATION_PARTICIPANT = eINSTANCE.getSituationParticipant();

		/**
		 * The meta object literal for the '<em><b>Situation Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SITUATION_PARTICIPANT__SITUATION_TYPE = eINSTANCE.getSituationParticipant_SituationType();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SITUATION_PARTICIPANT__PARAMETER = eINSTANCE.getSituationParticipant_Parameter();

		/**
		 * The meta object literal for the '<em><b>Is Past</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SITUATION_PARTICIPANT__IS_PAST = eINSTANCE.getSituationParticipant_IsPast();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SITUATION_PARTICIPANT__ATTRIBUTE = eINSTANCE.getSituationParticipant_Attribute();

		/**
		 * The meta object literal for the '{@link sml.impl.SituationParameterReferenceImpl <em>Situation Parameter Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sml.impl.SituationParameterReferenceImpl
		 * @see sml.impl.SmlPackageImpl#getSituationParameterReference()
		 * @generated
		 */
		EClass SITUATION_PARAMETER_REFERENCE = eINSTANCE.getSituationParameterReference();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SITUATION_PARAMETER_REFERENCE__PARAMETER = eINSTANCE.getSituationParameterReference_Parameter();

		/**
		 * The meta object literal for the '<em><b>Situation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SITUATION_PARAMETER_REFERENCE__SITUATION = eINSTANCE.getSituationParameterReference_Situation();

		/**
		 * The meta object literal for the '{@link sml.impl.TemporalOperatorExpressionImpl <em>Temporal Operator Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sml.impl.TemporalOperatorExpressionImpl
		 * @see sml.impl.SmlPackageImpl#getTemporalOperatorExpression()
		 * @generated
		 */
		EClass TEMPORAL_OPERATOR_EXPRESSION = eINSTANCE.getTemporalOperatorExpression();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPORAL_OPERATOR_EXPRESSION__SOURCE = eINSTANCE.getTemporalOperatorExpression_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPORAL_OPERATOR_EXPRESSION__TARGET = eINSTANCE.getTemporalOperatorExpression_Target();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPORAL_OPERATOR_EXPRESSION__OPERATOR = eINSTANCE.getTemporalOperatorExpression_Operator();

		/**
		 * The meta object literal for the '{@link sml.impl.SituationAttributeImpl <em>Situation Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sml.impl.SituationAttributeImpl
		 * @see sml.impl.SmlPackageImpl#getSituationAttribute()
		 * @generated
		 */
		EClass SITUATION_ATTRIBUTE = eINSTANCE.getSituationAttribute();

		/**
		 * The meta object literal for the '<em><b>Situation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SITUATION_ATTRIBUTE__SITUATION = eINSTANCE.getSituationAttribute_Situation();

		/**
		 * The meta object literal for the '<em><b>Is Of Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SITUATION_ATTRIBUTE__IS_OF_TYPE = eINSTANCE.getSituationAttribute_IsOfType();

		/**
		 * The meta object literal for the '<em><b>Literal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SITUATION_ATTRIBUTE__LITERAL = eINSTANCE.getSituationAttribute_Literal();

		/**
		 * The meta object literal for the '{@link sml.impl.ExistsSituationImpl <em>Exists Situation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sml.impl.ExistsSituationImpl
		 * @see sml.impl.SmlPackageImpl#getExistsSituation()
		 * @generated
		 */
		EClass EXISTS_SITUATION = eINSTANCE.getExistsSituation();

		/**
		 * The meta object literal for the '<em><b>Is Negated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXISTS_SITUATION__IS_NEGATED = eINSTANCE.getExistsSituation_IsNegated();

		/**
		 * The meta object literal for the '{@link sml.TemporalOperatorType <em>Temporal Operator Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sml.TemporalOperatorType
		 * @see sml.impl.SmlPackageImpl#getTemporalOperatorType()
		 * @generated
		 */
		EEnum TEMPORAL_OPERATOR_TYPE = eINSTANCE.getTemporalOperatorType();

		/**
		 * The meta object literal for the '{@link sml.SituationAttributeType <em>Situation Attribute Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sml.SituationAttributeType
		 * @see sml.impl.SmlPackageImpl#getSituationAttributeType()
		 * @generated
		 */
		EEnum SITUATION_ATTRIBUTE_TYPE = eINSTANCE.getSituationAttributeType();

	}

} //SmlPackage
