/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ctx.util;

import ctx.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ctx.CtxPackage
 * @generated
 */
public class CtxSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CtxPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtxSwitch() {
		if (modelPackage == null) {
			modelPackage = CtxPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CtxPackage.CONTEXT_MODEL: {
				ContextModel contextModel = (ContextModel)theEObject;
				T result = caseContextModel(contextModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CtxPackage.MODEL_CLASS: {
				ModelClass modelClass = (ModelClass)theEObject;
				T result = caseModelClass(modelClass);
				if (result == null) result = caseContextModelElement(modelClass);
				if (result == null) result = caseNamedElement(modelClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CtxPackage.ENTITY_CLASS: {
				EntityClass entityClass = (EntityClass)theEObject;
				T result = caseEntityClass(entityClass);
				if (result == null) result = caseModelClass(entityClass);
				if (result == null) result = caseComparableElements(entityClass);
				if (result == null) result = caseContextModelElement(entityClass);
				if (result == null) result = caseNamedElement(entityClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CtxPackage.RELATOR_CLASS: {
				RelatorClass relatorClass = (RelatorClass)theEObject;
				T result = caseRelatorClass(relatorClass);
				if (result == null) result = caseModelClass(relatorClass);
				if (result == null) result = caseContextModelElement(relatorClass);
				if (result == null) result = caseNamedElement(relatorClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CtxPackage.ATTRIBUTE: {
				Attribute attribute = (Attribute)theEObject;
				T result = caseAttribute(attribute);
				if (result == null) result = caseNamedElement(attribute);
				if (result == null) result = caseTypedElement(attribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CtxPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CtxPackage.DATA_TYPE: {
				DataType dataType = (DataType)theEObject;
				T result = caseDataType(dataType);
				if (result == null) result = caseContextModelElement(dataType);
				if (result == null) result = caseComparableElements(dataType);
				if (result == null) result = caseNamedElement(dataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CtxPackage.COMPARATIVE_FORMAL_RELATION: {
				ComparativeFormalRelation comparativeFormalRelation = (ComparativeFormalRelation)theEObject;
				T result = caseComparativeFormalRelation(comparativeFormalRelation);
				if (result == null) result = caseContextModelElement(comparativeFormalRelation);
				if (result == null) result = caseNamedElement(comparativeFormalRelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CtxPackage.ASSOCIATION: {
				Association association = (Association)theEObject;
				T result = caseAssociation(association);
				if (result == null) result = caseContextModelElement(association);
				if (result == null) result = caseNamedElement(association);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CtxPackage.CONTEXT_MODEL_ELEMENT: {
				ContextModelElement contextModelElement = (ContextModelElement)theEObject;
				T result = caseContextModelElement(contextModelElement);
				if (result == null) result = caseNamedElement(contextModelElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CtxPackage.QUALITATIVE_FORMAL_RELATION: {
				QualitativeFormalRelation qualitativeFormalRelation = (QualitativeFormalRelation)theEObject;
				T result = caseQualitativeFormalRelation(qualitativeFormalRelation);
				if (result == null) result = caseContextModelElement(qualitativeFormalRelation);
				if (result == null) result = caseTypedElement(qualitativeFormalRelation);
				if (result == null) result = caseNamedElement(qualitativeFormalRelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CtxPackage.QUALITATIVE_PARAMETER: {
				QualitativeParameter qualitativeParameter = (QualitativeParameter)theEObject;
				T result = caseQualitativeParameter(qualitativeParameter);
				if (result == null) result = caseNamedElement(qualitativeParameter);
				if (result == null) result = caseTypedElement(qualitativeParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CtxPackage.TYPED_ELEMENT: {
				TypedElement typedElement = (TypedElement)theEObject;
				T result = caseTypedElement(typedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CtxPackage.COMPARABLE_ELEMENTS: {
				ComparableElements comparableElements = (ComparableElements)theEObject;
				T result = caseComparableElements(comparableElements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContextModel(ContextModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelClass(ModelClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityClass(EntityClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relator Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relator Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelatorClass(RelatorClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute(Attribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataType(DataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comparative Formal Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comparative Formal Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComparativeFormalRelation(ComparativeFormalRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociation(Association object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContextModelElement(ContextModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qualitative Formal Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qualitative Formal Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQualitativeFormalRelation(QualitativeFormalRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qualitative Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qualitative Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQualitativeParameter(QualitativeParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedElement(TypedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comparable Elements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comparable Elements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComparableElements(ComparableElements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CtxSwitch
