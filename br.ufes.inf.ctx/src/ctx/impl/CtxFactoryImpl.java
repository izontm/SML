/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ctx.impl;

import ctx.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CtxFactoryImpl extends EFactoryImpl implements CtxFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CtxFactory init() {
		try {
			CtxFactory theCtxFactory = (CtxFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.example.org/ctx"); 
			if (theCtxFactory != null) {
				return theCtxFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CtxFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtxFactoryImpl() {
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
			case CtxPackage.CONTEXT_MODEL: return createContextModel();
			case CtxPackage.ENTITY_CLASS: return createEntityClass();
			case CtxPackage.RELATOR_CLASS: return createRelatorClass();
			case CtxPackage.ATTRIBUTE: return createAttribute();
			case CtxPackage.DATA_TYPE: return createDataType();
			case CtxPackage.COMPARATIVE_FORMAL_RELATION: return createComparativeFormalRelation();
			case CtxPackage.ASSOCIATION: return createAssociation();
			case CtxPackage.QUALITATIVE_FORMAL_RELATION: return createQualitativeFormalRelation();
			case CtxPackage.QUALITATIVE_PARAMETER: return createQualitativeParameter();
			case CtxPackage.PRIMITIVE_FORMAL_RELATION: return createPrimitiveFormalRelation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextModel createContextModel() {
		ContextModelImpl contextModel = new ContextModelImpl();
		return contextModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityClass createEntityClass() {
		EntityClassImpl entityClass = new EntityClassImpl();
		return entityClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatorClass createRelatorClass() {
		RelatorClassImpl relatorClass = new RelatorClassImpl();
		return relatorClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType createDataType() {
		DataTypeImpl dataType = new DataTypeImpl();
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparativeFormalRelation createComparativeFormalRelation() {
		ComparativeFormalRelationImpl comparativeFormalRelation = new ComparativeFormalRelationImpl();
		return comparativeFormalRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association createAssociation() {
		AssociationImpl association = new AssociationImpl();
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualitativeFormalRelation createQualitativeFormalRelation() {
		QualitativeFormalRelationImpl qualitativeFormalRelation = new QualitativeFormalRelationImpl();
		return qualitativeFormalRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualitativeParameter createQualitativeParameter() {
		QualitativeParameterImpl qualitativeParameter = new QualitativeParameterImpl();
		return qualitativeParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveFormalRelation createPrimitiveFormalRelation() {
		PrimitiveFormalRelationImpl primitiveFormalRelation = new PrimitiveFormalRelationImpl();
		return primitiveFormalRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtxPackage getCtxPackage() {
		return (CtxPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CtxPackage getPackage() {
		return CtxPackage.eINSTANCE;
	}

} //CtxFactoryImpl
