/**
 */
package eMProject.impl;

import eMProject.Animal;
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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enclos</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eMProject.impl.EnclosImpl#getAnimal <em>Animal</em>}</li>
 *   <li>{@link eMProject.impl.EnclosImpl#getZoo <em>Zoo</em>}</li>
 *   <li>{@link eMProject.impl.EnclosImpl#getSoigneur <em>Soigneur</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnclosImpl extends MinimalEObjectImpl.Container implements Enclos {
	/**
	 * The cached value of the '{@link #getAnimal() <em>Animal</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnimal()
	 * @generated
	 * @ordered
	 */
	protected EList<Animal> animal;

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
	protected EnclosImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EMProjectPackage.Literals.ENCLOS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Animal> getAnimal() {
		if (animal == null) {
			animal = new EObjectWithInverseResolvingEList<Animal>(Animal.class, this, EMProjectPackage.ENCLOS__ANIMAL,
					EMProjectPackage.ANIMAL__ENCLOS);
		}
		return animal;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EMProjectPackage.ENCLOS__ZOO, oldZoo,
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EMProjectPackage.ENCLOS__ZOO,
					oldZoo, newZoo);
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
				msgs = ((InternalEObject) zoo).eInverseRemove(this, EMProjectPackage.ZOO__ENCLOS, Zoo.class, msgs);
			if (newZoo != null)
				msgs = ((InternalEObject) newZoo).eInverseAdd(this, EMProjectPackage.ZOO__ENCLOS, Zoo.class, msgs);
			msgs = basicSetZoo(newZoo, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMProjectPackage.ENCLOS__ZOO, newZoo, newZoo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Soigneur> getSoigneur() {
		if (soigneur == null) {
			soigneur = new EObjectWithInverseResolvingEList.ManyInverse<Soigneur>(Soigneur.class, this,
					EMProjectPackage.ENCLOS__SOIGNEUR, EMProjectPackage.SOIGNEUR__ENCLOS);
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
		case EMProjectPackage.ENCLOS__ANIMAL:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getAnimal()).basicAdd(otherEnd, msgs);
		case EMProjectPackage.ENCLOS__ZOO:
			if (zoo != null)
				msgs = ((InternalEObject) zoo).eInverseRemove(this, EMProjectPackage.ZOO__ENCLOS, Zoo.class, msgs);
			return basicSetZoo((Zoo) otherEnd, msgs);
		case EMProjectPackage.ENCLOS__SOIGNEUR:
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
		case EMProjectPackage.ENCLOS__ANIMAL:
			return ((InternalEList<?>) getAnimal()).basicRemove(otherEnd, msgs);
		case EMProjectPackage.ENCLOS__ZOO:
			return basicSetZoo(null, msgs);
		case EMProjectPackage.ENCLOS__SOIGNEUR:
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
		case EMProjectPackage.ENCLOS__ANIMAL:
			return getAnimal();
		case EMProjectPackage.ENCLOS__ZOO:
			if (resolve)
				return getZoo();
			return basicGetZoo();
		case EMProjectPackage.ENCLOS__SOIGNEUR:
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
		case EMProjectPackage.ENCLOS__ANIMAL:
			getAnimal().clear();
			getAnimal().addAll((Collection<? extends Animal>) newValue);
			return;
		case EMProjectPackage.ENCLOS__ZOO:
			setZoo((Zoo) newValue);
			return;
		case EMProjectPackage.ENCLOS__SOIGNEUR:
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
		case EMProjectPackage.ENCLOS__ANIMAL:
			getAnimal().clear();
			return;
		case EMProjectPackage.ENCLOS__ZOO:
			setZoo((Zoo) null);
			return;
		case EMProjectPackage.ENCLOS__SOIGNEUR:
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
		case EMProjectPackage.ENCLOS__ANIMAL:
			return animal != null && !animal.isEmpty();
		case EMProjectPackage.ENCLOS__ZOO:
			return zoo != null;
		case EMProjectPackage.ENCLOS__SOIGNEUR:
			return soigneur != null && !soigneur.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EnclosImpl
