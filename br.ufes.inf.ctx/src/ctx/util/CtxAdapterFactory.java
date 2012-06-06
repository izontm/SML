/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ctx.util;

import ctx.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ctx.CtxPackage
 * @generated
 */
public class CtxAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CtxPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtxAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CtxPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtxSwitch<Adapter> modelSwitch =
		new CtxSwitch<Adapter>() {
			@Override
			public Adapter caseContextModel(ContextModel object) {
				return createContextModelAdapter();
			}
			@Override
			public Adapter caseModelClass(ModelClass object) {
				return createModelClassAdapter();
			}
			@Override
			public Adapter caseEntityClass(EntityClass object) {
				return createEntityClassAdapter();
			}
			@Override
			public Adapter caseRelatorClass(RelatorClass object) {
				return createRelatorClassAdapter();
			}
			@Override
			public Adapter caseAttribute(Attribute object) {
				return createAttributeAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseDataType(DataType object) {
				return createDataTypeAdapter();
			}
			@Override
			public Adapter caseComparativeFormalRelation(ComparativeFormalRelation object) {
				return createComparativeFormalRelationAdapter();
			}
			@Override
			public Adapter caseAssociation(Association object) {
				return createAssociationAdapter();
			}
			@Override
			public Adapter caseContextModelElement(ContextModelElement object) {
				return createContextModelElementAdapter();
			}
			@Override
			public Adapter caseQualitativeFormalRelation(QualitativeFormalRelation object) {
				return createQualitativeFormalRelationAdapter();
			}
			@Override
			public Adapter caseQualitativeParameter(QualitativeParameter object) {
				return createQualitativeParameterAdapter();
			}
			@Override
			public Adapter caseTypedElement(TypedElement object) {
				return createTypedElementAdapter();
			}
			@Override
			public Adapter caseComparableElements(ComparableElements object) {
				return createComparableElementsAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link ctx.ContextModel <em>Context Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ctx.ContextModel
	 * @generated
	 */
	public Adapter createContextModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ctx.ModelClass <em>Model Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ctx.ModelClass
	 * @generated
	 */
	public Adapter createModelClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ctx.EntityClass <em>Entity Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ctx.EntityClass
	 * @generated
	 */
	public Adapter createEntityClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ctx.RelatorClass <em>Relator Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ctx.RelatorClass
	 * @generated
	 */
	public Adapter createRelatorClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ctx.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ctx.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ctx.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ctx.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ctx.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ctx.DataType
	 * @generated
	 */
	public Adapter createDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ctx.ComparativeFormalRelation <em>Comparative Formal Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ctx.ComparativeFormalRelation
	 * @generated
	 */
	public Adapter createComparativeFormalRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ctx.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ctx.Association
	 * @generated
	 */
	public Adapter createAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ctx.ContextModelElement <em>Context Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ctx.ContextModelElement
	 * @generated
	 */
	public Adapter createContextModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ctx.QualitativeFormalRelation <em>Qualitative Formal Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ctx.QualitativeFormalRelation
	 * @generated
	 */
	public Adapter createQualitativeFormalRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ctx.QualitativeParameter <em>Qualitative Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ctx.QualitativeParameter
	 * @generated
	 */
	public Adapter createQualitativeParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ctx.TypedElement <em>Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ctx.TypedElement
	 * @generated
	 */
	public Adapter createTypedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ctx.ComparableElements <em>Comparable Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ctx.ComparableElements
	 * @generated
	 */
	public Adapter createComparableElementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CtxAdapterFactory
