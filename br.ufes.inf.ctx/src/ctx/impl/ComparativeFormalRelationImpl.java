/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ctx.impl;

import ctx.ComparableElements;
import ctx.ComparativeFormalRelation;
import ctx.CtxPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comparative Formal Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ctx.impl.ComparativeFormalRelationImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link ctx.impl.ComparativeFormalRelationImpl#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComparativeFormalRelationImpl extends ContextModelElementImpl implements ComparativeFormalRelation {
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<ComparableElements> target;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected EList<ComparableElements> source;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComparativeFormalRelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CtxPackage.Literals.COMPARATIVE_FORMAL_RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComparableElements> getTarget() {
		if (target == null) {
			target = new EObjectResolvingEList<ComparableElements>(ComparableElements.class, this, CtxPackage.COMPARATIVE_FORMAL_RELATION__TARGET);
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComparableElements> getSource() {
		if (source == null) {
			source = new EObjectResolvingEList<ComparableElements>(ComparableElements.class, this, CtxPackage.COMPARATIVE_FORMAL_RELATION__SOURCE);
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CtxPackage.COMPARATIVE_FORMAL_RELATION__TARGET:
				return getTarget();
			case CtxPackage.COMPARATIVE_FORMAL_RELATION__SOURCE:
				return getSource();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CtxPackage.COMPARATIVE_FORMAL_RELATION__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends ComparableElements>)newValue);
				return;
			case CtxPackage.COMPARATIVE_FORMAL_RELATION__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends ComparableElements>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CtxPackage.COMPARATIVE_FORMAL_RELATION__TARGET:
				getTarget().clear();
				return;
			case CtxPackage.COMPARATIVE_FORMAL_RELATION__SOURCE:
				getSource().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CtxPackage.COMPARATIVE_FORMAL_RELATION__TARGET:
				return target != null && !target.isEmpty();
			case CtxPackage.COMPARATIVE_FORMAL_RELATION__SOURCE:
				return source != null && !source.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComparativeFormalRelationImpl
