/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sml.ComparativeRelation;
import sml.Node;
import sml.SituationTypeParameter;
import sml.SmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sml.impl.NodeImpl#getNodeParameter <em>Node Parameter</em>}</li>
 *   <li>{@link sml.impl.NodeImpl#getSourceRelation <em>Source Relation</em>}</li>
 *   <li>{@link sml.impl.NodeImpl#getTargetRelation <em>Target Relation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class NodeImpl extends SituationTypeElementImpl implements Node {
	/**
	 * The cached value of the '{@link #getNodeParameter() <em>Node Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeParameter()
	 * @generated
	 * @ordered
	 */
	protected SituationTypeParameter nodeParameter;

	/**
	 * The cached value of the '{@link #getSourceRelation() <em>Source Relation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceRelation()
	 * @generated
	 * @ordered
	 */
	protected EList<ComparativeRelation> sourceRelation;

	/**
	 * The cached value of the '{@link #getTargetRelation() <em>Target Relation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetRelation()
	 * @generated
	 * @ordered
	 */
	protected EList<ComparativeRelation> targetRelation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmlPackage.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SituationTypeParameter getNodeParameter() {
		if (nodeParameter != null && nodeParameter.eIsProxy()) {
			InternalEObject oldNodeParameter = (InternalEObject)nodeParameter;
			nodeParameter = (SituationTypeParameter)eResolveProxy(oldNodeParameter);
			if (nodeParameter != oldNodeParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmlPackage.NODE__NODE_PARAMETER, oldNodeParameter, nodeParameter));
			}
		}
		return nodeParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SituationTypeParameter basicGetNodeParameter() {
		return nodeParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNodeParameter(SituationTypeParameter newNodeParameter, NotificationChain msgs) {
		SituationTypeParameter oldNodeParameter = nodeParameter;
		nodeParameter = newNodeParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmlPackage.NODE__NODE_PARAMETER, oldNodeParameter, newNodeParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeParameter(SituationTypeParameter newNodeParameter) {
		if (newNodeParameter != nodeParameter) {
			NotificationChain msgs = null;
			if (nodeParameter != null)
				msgs = ((InternalEObject)nodeParameter).eInverseRemove(this, SmlPackage.SITUATION_TYPE_PARAMETER__NODE_REFERENCE, SituationTypeParameter.class, msgs);
			if (newNodeParameter != null)
				msgs = ((InternalEObject)newNodeParameter).eInverseAdd(this, SmlPackage.SITUATION_TYPE_PARAMETER__NODE_REFERENCE, SituationTypeParameter.class, msgs);
			msgs = basicSetNodeParameter(newNodeParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmlPackage.NODE__NODE_PARAMETER, newNodeParameter, newNodeParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComparativeRelation> getSourceRelation() {
		if (sourceRelation == null) {
			sourceRelation = new EObjectWithInverseResolvingEList<ComparativeRelation>(ComparativeRelation.class, this, SmlPackage.NODE__SOURCE_RELATION, SmlPackage.COMPARATIVE_RELATION__SOURCE);
		}
		return sourceRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComparativeRelation> getTargetRelation() {
		if (targetRelation == null) {
			targetRelation = new EObjectWithInverseResolvingEList<ComparativeRelation>(ComparativeRelation.class, this, SmlPackage.NODE__TARGET_RELATION, SmlPackage.COMPARATIVE_RELATION__TARGET);
		}
		return targetRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmlPackage.NODE__NODE_PARAMETER:
				if (nodeParameter != null)
					msgs = ((InternalEObject)nodeParameter).eInverseRemove(this, SmlPackage.SITUATION_TYPE_PARAMETER__NODE_REFERENCE, SituationTypeParameter.class, msgs);
				return basicSetNodeParameter((SituationTypeParameter)otherEnd, msgs);
			case SmlPackage.NODE__SOURCE_RELATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSourceRelation()).basicAdd(otherEnd, msgs);
			case SmlPackage.NODE__TARGET_RELATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTargetRelation()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmlPackage.NODE__NODE_PARAMETER:
				return basicSetNodeParameter(null, msgs);
			case SmlPackage.NODE__SOURCE_RELATION:
				return ((InternalEList<?>)getSourceRelation()).basicRemove(otherEnd, msgs);
			case SmlPackage.NODE__TARGET_RELATION:
				return ((InternalEList<?>)getTargetRelation()).basicRemove(otherEnd, msgs);
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
			case SmlPackage.NODE__NODE_PARAMETER:
				if (resolve) return getNodeParameter();
				return basicGetNodeParameter();
			case SmlPackage.NODE__SOURCE_RELATION:
				return getSourceRelation();
			case SmlPackage.NODE__TARGET_RELATION:
				return getTargetRelation();
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
			case SmlPackage.NODE__NODE_PARAMETER:
				setNodeParameter((SituationTypeParameter)newValue);
				return;
			case SmlPackage.NODE__SOURCE_RELATION:
				getSourceRelation().clear();
				getSourceRelation().addAll((Collection<? extends ComparativeRelation>)newValue);
				return;
			case SmlPackage.NODE__TARGET_RELATION:
				getTargetRelation().clear();
				getTargetRelation().addAll((Collection<? extends ComparativeRelation>)newValue);
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
			case SmlPackage.NODE__NODE_PARAMETER:
				setNodeParameter((SituationTypeParameter)null);
				return;
			case SmlPackage.NODE__SOURCE_RELATION:
				getSourceRelation().clear();
				return;
			case SmlPackage.NODE__TARGET_RELATION:
				getTargetRelation().clear();
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
			case SmlPackage.NODE__NODE_PARAMETER:
				return nodeParameter != null;
			case SmlPackage.NODE__SOURCE_RELATION:
				return sourceRelation != null && !sourceRelation.isEmpty();
			case SmlPackage.NODE__TARGET_RELATION:
				return targetRelation != null && !targetRelation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NodeImpl
