/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sml.impl;

import ctx.ContextModel;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sml.SMLModel;
import sml.SMLModelElement;
import sml.SmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SML Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sml.impl.SMLModelImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link sml.impl.SMLModelImpl#getContextModel <em>Context Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SMLModelImpl extends EObjectImpl implements SMLModel {
	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<SMLModelElement> elements;

	/**
	 * The cached value of the '{@link #getContextModel() <em>Context Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextModel()
	 * @generated
	 * @ordered
	 */
	protected ContextModel contextModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SMLModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmlPackage.Literals.SML_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SMLModelElement> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<SMLModelElement>(SMLModelElement.class, this, SmlPackage.SML_MODEL__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextModel getContextModel() {
		if (contextModel != null && contextModel.eIsProxy()) {
			InternalEObject oldContextModel = (InternalEObject)contextModel;
			contextModel = (ContextModel)eResolveProxy(oldContextModel);
			if (contextModel != oldContextModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmlPackage.SML_MODEL__CONTEXT_MODEL, oldContextModel, contextModel));
			}
		}
		return contextModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextModel basicGetContextModel() {
		return contextModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextModel(ContextModel newContextModel) {
		ContextModel oldContextModel = contextModel;
		contextModel = newContextModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmlPackage.SML_MODEL__CONTEXT_MODEL, oldContextModel, contextModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmlPackage.SML_MODEL__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SmlPackage.SML_MODEL__ELEMENTS:
				return getElements();
			case SmlPackage.SML_MODEL__CONTEXT_MODEL:
				if (resolve) return getContextModel();
				return basicGetContextModel();
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
			case SmlPackage.SML_MODEL__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends SMLModelElement>)newValue);
				return;
			case SmlPackage.SML_MODEL__CONTEXT_MODEL:
				setContextModel((ContextModel)newValue);
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
			case SmlPackage.SML_MODEL__ELEMENTS:
				getElements().clear();
				return;
			case SmlPackage.SML_MODEL__CONTEXT_MODEL:
				setContextModel((ContextModel)null);
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
			case SmlPackage.SML_MODEL__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case SmlPackage.SML_MODEL__CONTEXT_MODEL:
				return contextModel != null;
		}
		return super.eIsSet(featureID);
	}

} //SMLModelImpl
