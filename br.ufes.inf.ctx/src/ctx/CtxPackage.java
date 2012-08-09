/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ctx;

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
 * @see ctx.CtxFactory
 * @model kind="package"
 * @generated
 */
public interface CtxPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ctx";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/ctx";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ctx";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CtxPackage eINSTANCE = ctx.impl.CtxPackageImpl.init();

	/**
	 * The meta object id for the '{@link ctx.impl.ContextModelImpl <em>Context Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ctx.impl.ContextModelImpl
	 * @see ctx.impl.CtxPackageImpl#getContextModel()
	 * @generated
	 */
	int CONTEXT_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MODEL__ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Context Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MODEL_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ctx.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ctx.impl.NamedElementImpl
	 * @see ctx.impl.CtxPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ctx.impl.ContextModelElementImpl <em>Context Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ctx.impl.ContextModelElementImpl
	 * @see ctx.impl.CtxPackageImpl#getContextModelElement()
	 * @generated
	 */
	int CONTEXT_MODEL_ELEMENT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MODEL_ELEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Context Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MODEL_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ctx.impl.ModelClassImpl <em>Model Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ctx.impl.ModelClassImpl
	 * @see ctx.impl.CtxPackageImpl#getModelClass()
	 * @generated
	 */
	int MODEL_CLASS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_CLASS__NAME = CONTEXT_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_CLASS__ATTRIBUTE = CONTEXT_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Model Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_CLASS_FEATURE_COUNT = CONTEXT_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ctx.impl.EntityClassImpl <em>Entity Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ctx.impl.EntityClassImpl
	 * @see ctx.impl.CtxPackageImpl#getEntityClass()
	 * @generated
	 */
	int ENTITY_CLASS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_CLASS__NAME = MODEL_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_CLASS__ATTRIBUTE = MODEL_CLASS__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Superclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_CLASS__SUPERCLASS = MODEL_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_CLASS__IS_ABSTRACT = MODEL_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Entity Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_CLASS_FEATURE_COUNT = MODEL_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ctx.impl.RelatorClassImpl <em>Relator Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ctx.impl.RelatorClassImpl
	 * @see ctx.impl.CtxPackageImpl#getRelatorClass()
	 * @generated
	 */
	int RELATOR_CLASS = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATOR_CLASS__NAME = MODEL_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATOR_CLASS__ATTRIBUTE = MODEL_CLASS__ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>Relator Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATOR_CLASS_FEATURE_COUNT = MODEL_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ctx.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ctx.impl.AttributeImpl
	 * @see ctx.impl.CtxPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Aclass</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ACLASS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DATATYPE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ctx.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ctx.impl.DataTypeImpl
	 * @see ctx.impl.CtxPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__NAME = CONTEXT_MODEL_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = CONTEXT_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ctx.impl.ComparativeFormalRelationImpl <em>Comparative Formal Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ctx.impl.ComparativeFormalRelationImpl
	 * @see ctx.impl.CtxPackageImpl#getComparativeFormalRelation()
	 * @generated
	 */
	int COMPARATIVE_FORMAL_RELATION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARATIVE_FORMAL_RELATION__NAME = CONTEXT_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARATIVE_FORMAL_RELATION__TARGET = CONTEXT_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARATIVE_FORMAL_RELATION__SOURCE = CONTEXT_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Comparative Formal Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARATIVE_FORMAL_RELATION_FEATURE_COUNT = CONTEXT_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ctx.impl.AssociationImpl <em>Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ctx.impl.AssociationImpl
	 * @see ctx.impl.CtxPackageImpl#getAssociation()
	 * @generated
	 */
	int ASSOCIATION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__NAME = CONTEXT_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__SOURCE = CONTEXT_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__TARGET = CONTEXT_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_FEATURE_COUNT = CONTEXT_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ctx.impl.QualitativeFormalRelationImpl <em>Qualitative Formal Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ctx.impl.QualitativeFormalRelationImpl
	 * @see ctx.impl.CtxPackageImpl#getQualitativeFormalRelation()
	 * @generated
	 */
	int QUALITATIVE_FORMAL_RELATION = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITATIVE_FORMAL_RELATION__NAME = CONTEXT_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITATIVE_FORMAL_RELATION__PARAMETER = CONTEXT_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITATIVE_FORMAL_RELATION__DATATYPE = CONTEXT_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Qualitative Formal Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITATIVE_FORMAL_RELATION_FEATURE_COUNT = CONTEXT_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ctx.impl.QualitativeParameterImpl <em>Qualitative Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ctx.impl.QualitativeParameterImpl
	 * @see ctx.impl.CtxPackageImpl#getQualitativeParameter()
	 * @generated
	 */
	int QUALITATIVE_PARAMETER = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITATIVE_PARAMETER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITATIVE_PARAMETER__ELEMENT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Qualitative Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITATIVE_PARAMETER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ctx.impl.ComparableElementsImpl <em>Comparable Elements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ctx.impl.ComparableElementsImpl
	 * @see ctx.impl.CtxPackageImpl#getComparableElements()
	 * @generated
	 */
	int COMPARABLE_ELEMENTS = 12;

	/**
	 * The number of structural features of the '<em>Comparable Elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE_ELEMENTS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link ctx.impl.PrimitiveFormalRelationImpl <em>Primitive Formal Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ctx.impl.PrimitiveFormalRelationImpl
	 * @see ctx.impl.CtxPackageImpl#getPrimitiveFormalRelation()
	 * @generated
	 */
	int PRIMITIVE_FORMAL_RELATION = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_FORMAL_RELATION__NAME = COMPARATIVE_FORMAL_RELATION__NAME;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_FORMAL_RELATION__TARGET = COMPARATIVE_FORMAL_RELATION__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_FORMAL_RELATION__SOURCE = COMPARATIVE_FORMAL_RELATION__SOURCE;

	/**
	 * The number of structural features of the '<em>Primitive Formal Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_FORMAL_RELATION_FEATURE_COUNT = COMPARATIVE_FORMAL_RELATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ctx.impl.PrimitiveDataTypeImpl <em>Primitive Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ctx.impl.PrimitiveDataTypeImpl
	 * @see ctx.impl.CtxPackageImpl#getPrimitiveDataType()
	 * @generated
	 */
	int PRIMITIVE_DATA_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATA_TYPE__NAME = DATA_TYPE__NAME;

	/**
	 * The number of structural features of the '<em>Primitive Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATA_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link ctx.ContextModel <em>Context Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Model</em>'.
	 * @see ctx.ContextModel
	 * @generated
	 */
	EClass getContextModel();

	/**
	 * Returns the meta object for the containment reference list '{@link ctx.ContextModel#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see ctx.ContextModel#getElements()
	 * @see #getContextModel()
	 * @generated
	 */
	EReference getContextModel_Elements();

	/**
	 * Returns the meta object for class '{@link ctx.ModelClass <em>Model Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Class</em>'.
	 * @see ctx.ModelClass
	 * @generated
	 */
	EClass getModelClass();

	/**
	 * Returns the meta object for the containment reference list '{@link ctx.ModelClass#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see ctx.ModelClass#getAttribute()
	 * @see #getModelClass()
	 * @generated
	 */
	EReference getModelClass_Attribute();

	/**
	 * Returns the meta object for class '{@link ctx.EntityClass <em>Entity Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Class</em>'.
	 * @see ctx.EntityClass
	 * @generated
	 */
	EClass getEntityClass();

	/**
	 * Returns the meta object for the reference '{@link ctx.EntityClass#getSuperclass <em>Superclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Superclass</em>'.
	 * @see ctx.EntityClass#getSuperclass()
	 * @see #getEntityClass()
	 * @generated
	 */
	EReference getEntityClass_Superclass();

	/**
	 * Returns the meta object for the attribute '{@link ctx.EntityClass#isIsAbstract <em>Is Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Abstract</em>'.
	 * @see ctx.EntityClass#isIsAbstract()
	 * @see #getEntityClass()
	 * @generated
	 */
	EAttribute getEntityClass_IsAbstract();

	/**
	 * Returns the meta object for class '{@link ctx.RelatorClass <em>Relator Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relator Class</em>'.
	 * @see ctx.RelatorClass
	 * @generated
	 */
	EClass getRelatorClass();

	/**
	 * Returns the meta object for class '{@link ctx.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see ctx.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the container reference '{@link ctx.Attribute#getAclass <em>Aclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Aclass</em>'.
	 * @see ctx.Attribute#getAclass()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Aclass();

	/**
	 * Returns the meta object for the reference '{@link ctx.Attribute#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datatype</em>'.
	 * @see ctx.Attribute#getDatatype()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Datatype();

	/**
	 * Returns the meta object for class '{@link ctx.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see ctx.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link ctx.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ctx.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link ctx.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see ctx.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for class '{@link ctx.ComparativeFormalRelation <em>Comparative Formal Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparative Formal Relation</em>'.
	 * @see ctx.ComparativeFormalRelation
	 * @generated
	 */
	EClass getComparativeFormalRelation();

	/**
	 * Returns the meta object for the reference list '{@link ctx.ComparativeFormalRelation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target</em>'.
	 * @see ctx.ComparativeFormalRelation#getTarget()
	 * @see #getComparativeFormalRelation()
	 * @generated
	 */
	EReference getComparativeFormalRelation_Target();

	/**
	 * Returns the meta object for the reference list '{@link ctx.ComparativeFormalRelation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source</em>'.
	 * @see ctx.ComparativeFormalRelation#getSource()
	 * @see #getComparativeFormalRelation()
	 * @generated
	 */
	EReference getComparativeFormalRelation_Source();

	/**
	 * Returns the meta object for class '{@link ctx.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association</em>'.
	 * @see ctx.Association
	 * @generated
	 */
	EClass getAssociation();

	/**
	 * Returns the meta object for the reference '{@link ctx.Association#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ctx.Association#getSource()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_Source();

	/**
	 * Returns the meta object for the reference '{@link ctx.Association#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ctx.Association#getTarget()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_Target();

	/**
	 * Returns the meta object for class '{@link ctx.ContextModelElement <em>Context Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Model Element</em>'.
	 * @see ctx.ContextModelElement
	 * @generated
	 */
	EClass getContextModelElement();

	/**
	 * Returns the meta object for class '{@link ctx.QualitativeFormalRelation <em>Qualitative Formal Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qualitative Formal Relation</em>'.
	 * @see ctx.QualitativeFormalRelation
	 * @generated
	 */
	EClass getQualitativeFormalRelation();

	/**
	 * Returns the meta object for the containment reference list '{@link ctx.QualitativeFormalRelation#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see ctx.QualitativeFormalRelation#getParameter()
	 * @see #getQualitativeFormalRelation()
	 * @generated
	 */
	EReference getQualitativeFormalRelation_Parameter();

	/**
	 * Returns the meta object for the reference '{@link ctx.QualitativeFormalRelation#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datatype</em>'.
	 * @see ctx.QualitativeFormalRelation#getDatatype()
	 * @see #getQualitativeFormalRelation()
	 * @generated
	 */
	EReference getQualitativeFormalRelation_Datatype();

	/**
	 * Returns the meta object for class '{@link ctx.QualitativeParameter <em>Qualitative Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qualitative Parameter</em>'.
	 * @see ctx.QualitativeParameter
	 * @generated
	 */
	EClass getQualitativeParameter();

	/**
	 * Returns the meta object for the reference '{@link ctx.QualitativeParameter#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see ctx.QualitativeParameter#getElement()
	 * @see #getQualitativeParameter()
	 * @generated
	 */
	EReference getQualitativeParameter_Element();

	/**
	 * Returns the meta object for class '{@link ctx.ComparableElements <em>Comparable Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparable Elements</em>'.
	 * @see ctx.ComparableElements
	 * @generated
	 */
	EClass getComparableElements();

	/**
	 * Returns the meta object for class '{@link ctx.PrimitiveFormalRelation <em>Primitive Formal Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Formal Relation</em>'.
	 * @see ctx.PrimitiveFormalRelation
	 * @generated
	 */
	EClass getPrimitiveFormalRelation();

	/**
	 * Returns the meta object for class '{@link ctx.PrimitiveDataType <em>Primitive Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Data Type</em>'.
	 * @see ctx.PrimitiveDataType
	 * @generated
	 */
	EClass getPrimitiveDataType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CtxFactory getCtxFactory();

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
		 * The meta object literal for the '{@link ctx.impl.ContextModelImpl <em>Context Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ctx.impl.ContextModelImpl
		 * @see ctx.impl.CtxPackageImpl#getContextModel()
		 * @generated
		 */
		EClass CONTEXT_MODEL = eINSTANCE.getContextModel();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_MODEL__ELEMENTS = eINSTANCE.getContextModel_Elements();

		/**
		 * The meta object literal for the '{@link ctx.impl.ModelClassImpl <em>Model Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ctx.impl.ModelClassImpl
		 * @see ctx.impl.CtxPackageImpl#getModelClass()
		 * @generated
		 */
		EClass MODEL_CLASS = eINSTANCE.getModelClass();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_CLASS__ATTRIBUTE = eINSTANCE.getModelClass_Attribute();

		/**
		 * The meta object literal for the '{@link ctx.impl.EntityClassImpl <em>Entity Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ctx.impl.EntityClassImpl
		 * @see ctx.impl.CtxPackageImpl#getEntityClass()
		 * @generated
		 */
		EClass ENTITY_CLASS = eINSTANCE.getEntityClass();

		/**
		 * The meta object literal for the '<em><b>Superclass</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_CLASS__SUPERCLASS = eINSTANCE.getEntityClass_Superclass();

		/**
		 * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_CLASS__IS_ABSTRACT = eINSTANCE.getEntityClass_IsAbstract();

		/**
		 * The meta object literal for the '{@link ctx.impl.RelatorClassImpl <em>Relator Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ctx.impl.RelatorClassImpl
		 * @see ctx.impl.CtxPackageImpl#getRelatorClass()
		 * @generated
		 */
		EClass RELATOR_CLASS = eINSTANCE.getRelatorClass();

		/**
		 * The meta object literal for the '{@link ctx.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ctx.impl.AttributeImpl
		 * @see ctx.impl.CtxPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Aclass</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__ACLASS = eINSTANCE.getAttribute_Aclass();

		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__DATATYPE = eINSTANCE.getAttribute_Datatype();

		/**
		 * The meta object literal for the '{@link ctx.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ctx.impl.NamedElementImpl
		 * @see ctx.impl.CtxPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link ctx.impl.DataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ctx.impl.DataTypeImpl
		 * @see ctx.impl.CtxPackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '{@link ctx.impl.ComparativeFormalRelationImpl <em>Comparative Formal Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ctx.impl.ComparativeFormalRelationImpl
		 * @see ctx.impl.CtxPackageImpl#getComparativeFormalRelation()
		 * @generated
		 */
		EClass COMPARATIVE_FORMAL_RELATION = eINSTANCE.getComparativeFormalRelation();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARATIVE_FORMAL_RELATION__TARGET = eINSTANCE.getComparativeFormalRelation_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARATIVE_FORMAL_RELATION__SOURCE = eINSTANCE.getComparativeFormalRelation_Source();

		/**
		 * The meta object literal for the '{@link ctx.impl.AssociationImpl <em>Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ctx.impl.AssociationImpl
		 * @see ctx.impl.CtxPackageImpl#getAssociation()
		 * @generated
		 */
		EClass ASSOCIATION = eINSTANCE.getAssociation();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__SOURCE = eINSTANCE.getAssociation_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__TARGET = eINSTANCE.getAssociation_Target();

		/**
		 * The meta object literal for the '{@link ctx.impl.ContextModelElementImpl <em>Context Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ctx.impl.ContextModelElementImpl
		 * @see ctx.impl.CtxPackageImpl#getContextModelElement()
		 * @generated
		 */
		EClass CONTEXT_MODEL_ELEMENT = eINSTANCE.getContextModelElement();

		/**
		 * The meta object literal for the '{@link ctx.impl.QualitativeFormalRelationImpl <em>Qualitative Formal Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ctx.impl.QualitativeFormalRelationImpl
		 * @see ctx.impl.CtxPackageImpl#getQualitativeFormalRelation()
		 * @generated
		 */
		EClass QUALITATIVE_FORMAL_RELATION = eINSTANCE.getQualitativeFormalRelation();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALITATIVE_FORMAL_RELATION__PARAMETER = eINSTANCE.getQualitativeFormalRelation_Parameter();

		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALITATIVE_FORMAL_RELATION__DATATYPE = eINSTANCE.getQualitativeFormalRelation_Datatype();

		/**
		 * The meta object literal for the '{@link ctx.impl.QualitativeParameterImpl <em>Qualitative Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ctx.impl.QualitativeParameterImpl
		 * @see ctx.impl.CtxPackageImpl#getQualitativeParameter()
		 * @generated
		 */
		EClass QUALITATIVE_PARAMETER = eINSTANCE.getQualitativeParameter();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALITATIVE_PARAMETER__ELEMENT = eINSTANCE.getQualitativeParameter_Element();

		/**
		 * The meta object literal for the '{@link ctx.impl.ComparableElementsImpl <em>Comparable Elements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ctx.impl.ComparableElementsImpl
		 * @see ctx.impl.CtxPackageImpl#getComparableElements()
		 * @generated
		 */
		EClass COMPARABLE_ELEMENTS = eINSTANCE.getComparableElements();

		/**
		 * The meta object literal for the '{@link ctx.impl.PrimitiveFormalRelationImpl <em>Primitive Formal Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ctx.impl.PrimitiveFormalRelationImpl
		 * @see ctx.impl.CtxPackageImpl#getPrimitiveFormalRelation()
		 * @generated
		 */
		EClass PRIMITIVE_FORMAL_RELATION = eINSTANCE.getPrimitiveFormalRelation();

		/**
		 * The meta object literal for the '{@link ctx.impl.PrimitiveDataTypeImpl <em>Primitive Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ctx.impl.PrimitiveDataTypeImpl
		 * @see ctx.impl.CtxPackageImpl#getPrimitiveDataType()
		 * @generated
		 */
		EClass PRIMITIVE_DATA_TYPE = eINSTANCE.getPrimitiveDataType();

	}

} //CtxPackage
