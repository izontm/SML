/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ctx;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ctx.CtxPackage
 * @generated
 */
public interface CtxFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CtxFactory eINSTANCE = ctx.impl.CtxFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Context Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Context Model</em>'.
	 * @generated
	 */
	ContextModel createContextModel();

	/**
	 * Returns a new object of class '<em>Entity Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity Class</em>'.
	 * @generated
	 */
	EntityClass createEntityClass();

	/**
	 * Returns a new object of class '<em>Relator Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relator Class</em>'.
	 * @generated
	 */
	RelatorClass createRelatorClass();

	/**
	 * Returns a new object of class '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute</em>'.
	 * @generated
	 */
	Attribute createAttribute();

	/**
	 * Returns a new object of class '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Type</em>'.
	 * @generated
	 */
	DataType createDataType();

	/**
	 * Returns a new object of class '<em>Comparative Formal Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comparative Formal Relation</em>'.
	 * @generated
	 */
	ComparativeFormalRelation createComparativeFormalRelation();

	/**
	 * Returns a new object of class '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Association</em>'.
	 * @generated
	 */
	Association createAssociation();

	/**
	 * Returns a new object of class '<em>Qualitative Formal Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Qualitative Formal Relation</em>'.
	 * @generated
	 */
	QualitativeFormalRelation createQualitativeFormalRelation();

	/**
	 * Returns a new object of class '<em>Qualitative Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Qualitative Parameter</em>'.
	 * @generated
	 */
	QualitativeParameter createQualitativeParameter();

	/**
	 * Returns a new object of class '<em>Primitive Formal Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Formal Relation</em>'.
	 * @generated
	 */
	PrimitiveFormalRelation createPrimitiveFormalRelation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CtxPackage getCtxPackage();

} //CtxFactory
