/**
 */
package eMProject.impl;

import eMProject.EMProjectPackage;
import eMProject.Enclos;
import eMProject.Soigneur;
import eMProject.Zoo;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Soigneur</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eMProject.impl.SoigneurImpl#getZoo <em>Zoo</em>}</li>
 *   <li>{@link eMProject.impl.SoigneurImpl#getEnclos <em>Enclos</em>}</li>
 *   <li>{@link eMProject.impl.SoigneurImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SoigneurImpl extends MinimalEObjectImpl.Container implements Soigneur {
	/**
	 * The cached value of the '{@link #getZoo() <em>Zoo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZoo()
	 * @generated
	 * @ordered
	 */
	protected Zoo zoo;

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
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> id;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoigneurImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EMProjectPackage.Literals.SOIGNEUR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Zoo getZoo() {
		if (zoo != null && zoo.eIsProxy()) {
			InternalEObject oldZoo = (InternalEObject) zoo;
			zoo = (Zoo) eResolveProxy(oldZoo);
			if (zoo != oldZoo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EMProjectPackage.SOIGNEUR__ZOO, oldZoo,
							zoo));
			}
		}
		return zoo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Zoo basicGetZoo() {
		return zoo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZoo(Zoo newZoo, NotificationChain msgs) {
		Zoo oldZoo = zoo;
		zoo = newZoo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					EMProjectPackage.SOIGNEUR__ZOO, oldZoo, newZoo);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZoo(Zoo newZoo) {
		if (newZoo != zoo) {
			NotificationChain msgs = null;
			if (zoo != null)
				msgs = ((InternalEObject) zoo).eInverseRemove(this, EMProjectPackage.ZOO__SOIGNEUR, Zoo.class, msgs);
			if (newZoo != null)
				msgs = ((InternalEObject) newZoo).eInverseAdd(this, EMProjectPackage.ZOO__SOIGNEUR, Zoo.class, msgs);
			msgs = basicSetZoo(newZoo, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMProjectPackage.SOIGNEUR__ZOO, newZoo, newZoo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Enclos> getEnclos() {
		if (enclos == null) {
			enclos = new EObjectWithInverseResolvingEList.ManyInverse<Enclos>(Enclos.class, this,
					EMProjectPackage.SOIGNEUR__ENCLOS, EMProjectPackage.ENCLOS__SOIGNEUR);
		}
		return enclos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getId() {
		if (id == null) {
			id = new EDataTypeUniqueEList<Integer>(Integer.class, this, EMProjectPackage.SOIGNEUR__ID);
		}
		return id;
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
		case EMProjectPackage.SOIGNEUR__ZOO:
			if (zoo != null)
				msgs = ((InternalEObject) zoo).eInverseRemove(this, EMProjectPackage.ZOO__SOIGNEUR, Zoo.class, msgs);
			return basicSetZoo((Zoo) otherEnd, msgs);
		case EMProjectPackage.SOIGNEUR__ENCLOS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getEnclos()).basicAdd(otherEnd, msgs);
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
		case EMProjectPackage.SOIGNEUR__ZOO:
			return basicSetZoo(null, msgs);
		case EMProjectPackage.SOIGNEUR__ENCLOS:
			return ((InternalEList<?>) getEnclos()).basicRemove(otherEnd, msgs);
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
		case EMProjectPackage.SOIGNEUR__ZOO:
			if (resolve)
				return getZoo();
			return basicGetZoo();
		case EMProjectPackage.SOIGNEUR__ENCLOS:
			return getEnclos();
		case EMProjectPackage.SOIGNEUR__ID:
			return getId();
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
		case EMProjectPackage.SOIGNEUR__ZOO:
			setZoo((Zoo) newValue);
			return;
		case EMProjectPackage.SOIGNEUR__ENCLOS:
			getEnclos().clear();
			getEnclos().addAll((Collection<? extends Enclos>) newValue);
			return;
		case EMProjectPackage.SOIGNEUR__ID:
			getId().clear();
			getId().addAll((Collection<? extends Integer>) newValue);
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
		case EMProjectPackage.SOIGNEUR__ZOO:
			setZoo((Zoo) null);
			return;
		case EMProjectPackage.SOIGNEUR__ENCLOS:
			getEnclos().clear();
			return;
		case EMProjectPackage.SOIGNEUR__ID:
			getId().clear();
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
		case EMProjectPackage.SOIGNEUR__ZOO:
			return zoo != null;
		case EMProjectPackage.SOIGNEUR__ENCLOS:
			return enclos != null && !enclos.isEmpty();
		case EMProjectPackage.SOIGNEUR__ID:
			return id != null && !id.isEmpty();
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //SoigneurImpl
