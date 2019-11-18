/**
 */
package eMProject.impl;

import eMProject.EMProjectPackage;
import eMProject.Enclos;
import eMProject.Soigneur;
import eMProject.Zoo;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Zoo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eMProject.impl.ZooImpl#getEnclos <em>Enclos</em>}</li>
 *   <li>{@link eMProject.impl.ZooImpl#getSoigneur <em>Soigneur</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZooImpl extends MinimalEObjectImpl.Container implements Zoo {
	/**
	 * The cached value of the '{@link #getEnclos() <em>Enclos</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnclos()
	 * @generated
	 * @ordered
	 */
	protected EList<Enclos> enclos;

	/**
	 * The cached value of the '{@link #getSoigneur() <em>Soigneur</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoigneur()
	 * @generated
	 * @ordered
	 */
	protected EList<Soigneur> soigneur;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZooImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EMProjectPackage.Literals.ZOO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Enclos> getEnclos() {
		if (enclos == null) {
			enclos = new EObjectWithInverseResolvingEList<Enclos>(Enclos.class, this, EMProjectPackage.ZOO__ENCLOS,
					EMProjectPackage.ENCLOS__ZOO);
		}
		return enclos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Soigneur> getSoigneur() {
		if (soigneur == null) {
			soigneur = new EObjectWithInverseResolvingEList<Soigneur>(Soigneur.class, this,
					EMProjectPackage.ZOO__SOIGNEUR, EMProjectPackage.SOIGNEUR__ZOO);
		}
		return soigneur;
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
		case EMProjectPackage.ZOO__ENCLOS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getEnclos()).basicAdd(otherEnd, msgs);
		case EMProjectPackage.ZOO__SOIGNEUR:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSoigneur()).basicAdd(otherEnd, msgs);
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
		case EMProjectPackage.ZOO__ENCLOS:
			return ((InternalEList<?>) getEnclos()).basicRemove(otherEnd, msgs);
		case EMProjectPackage.ZOO__SOIGNEUR:
			return ((InternalEList<?>) getSoigneur()).basicRemove(otherEnd, msgs);
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
		case EMProjectPackage.ZOO__ENCLOS:
			return getEnclos();
		case EMProjectPackage.ZOO__SOIGNEUR:
			return getSoigneur();
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
		case EMProjectPackage.ZOO__ENCLOS:
			getEnclos().clear();
			getEnclos().addAll((Collection<? extends Enclos>) newValue);
			return;
		case EMProjectPackage.ZOO__SOIGNEUR:
			getSoigneur().clear();
			getSoigneur().addAll((Collection<? extends Soigneur>) newValue);
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
		case EMProjectPackage.ZOO__ENCLOS:
			getEnclos().clear();
			return;
		case EMProjectPackage.ZOO__SOIGNEUR:
			getSoigneur().clear();
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
		case EMProjectPackage.ZOO__ENCLOS:
			return enclos != null && !enclos.isEmpty();
		case EMProjectPackage.ZOO__SOIGNEUR:
			return soigneur != null && !soigneur.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ZooImpl
