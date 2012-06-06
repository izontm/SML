/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ctx.impl;

import ctx.CtxPackage;
import ctx.EntityClass;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ctx.impl.EntityClassImpl#getSuperclass <em>Superclass</em>}</li>
 *   <li>{@link ctx.impl.EntityClassImpl#isIsAbstract <em>Is Abstract</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityClassImpl extends ModelClassImpl implements EntityClass {
	/**
	 * The cached value of the '{@link #getSuperclass() <em>Superclass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperclass()
	 * @generated
	 * @ordered
	 */
	protected EntityClass superclass;

	/**
	 * The default value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean isAbstract = IS_ABSTRACT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CtxPackage.Literals.ENTITY_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityClass getSuperclass() {
		if (superclass != null && superclass.eIsProxy()) {
			InternalEObject oldSuperclass = (InternalEObject)superclass;
			superclass = (EntityClass)eResolveProxy(oldSuperclass);
			if (superclass != oldSuperclass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CtxPackage.ENTITY_CLASS__SUPERCLASS, oldSuperclass, superclass));
			}
		}
		return superclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityClass basicGetSuperclass() {
		return superclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperclass(EntityClass newSuperclass) {
		EntityClass oldSuperclass = superclass;
		superclass = newSuperclass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CtxPackage.ENTITY_CLASS__SUPERCLASS, oldSuperclass, superclass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAbstract() {
		return isAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAbstract(boolean newIsAbstract) {
		boolean oldIsAbstract = isAbstract;
		isAbstract = newIsAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CtxPackage.ENTITY_CLASS__IS_ABSTRACT, oldIsAbstract, isAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CtxPackage.ENTITY_CLASS__SUPERCLASS:
				if (resolve) return getSuperclass();
				return basicGetSuperclass();
			case CtxPackage.ENTITY_CLASS__IS_ABSTRACT:
				return isIsAbstract();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CtxPackage.ENTITY_CLASS__SUPERCLASS:
				setSuperclass((EntityClass)newValue);
				return;
			case CtxPackage.ENTITY_CLASS__IS_ABSTRACT:
				setIsAbstract((Boolean)newValue);
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
			case CtxPackage.ENTITY_CLASS__SUPERCLASS:
				setSuperclass((EntityClass)null);
				return;
			case CtxPackage.ENTITY_CLASS__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
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
			case CtxPackage.ENTITY_CLASS__SUPERCLASS:
				return superclass != null;
			case CtxPackage.ENTITY_CLASS__IS_ABSTRACT:
				return isAbstract != IS_ABSTRACT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isAbstract: ");
		result.append(isAbstract);
		result.append(')');
		return result.toString();
	}

} //EntityClassImpl
