/**
 */
package eMProject.impl;

import eMProject.Chien;
import eMProject.EMProjectPackage;
import eMProject.Enclos;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chien</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eMProject.impl.ChienImpl#getEnclos <em>Enclos</em>}</li>
 *   <li>{@link eMProject.impl.ChienImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChienImpl extends MinimalEObjectImpl.Container implements Chien {
	/**
	 * The cached value of the '{@link #getEnclos() <em>Enclos</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnclos()
	 * @generated
	 * @ordered
	 */
	protected Enclos enclos;

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
	protected ChienImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EMProjectPackage.Literals.CHIEN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enclos getEnclos() {
		if (enclos != null && enclos.eIsProxy()) {
			InternalEObject oldEnclos = (InternalEObject) enclos;
			enclos = (Enclos) eResolveProxy(oldEnclos);
			if (enclos != oldEnclos) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EMProjectPackage.CHIEN__ENCLOS, oldEnclos,
							enclos));
			}
		}
		return enclos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enclos basicGetEnclos() {
		return enclos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnclos(Enclos newEnclos, NotificationChain msgs) {
		Enclos oldEnclos = enclos;
		enclos = newEnclos;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					EMProjectPackage.CHIEN__ENCLOS, oldEnclos, newEnclos);
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
	public void setEnclos(Enclos newEnclos) {
		if (newEnclos != enclos) {
			NotificationChain msgs = null;
			if (enclos != null)
				msgs = ((InternalEObject) enclos).eInverseRemove(this, EMProjectPackage.ENCLOS__ANIMAL, Enclos.class,
						msgs);
			if (newEnclos != null)
				msgs = ((InternalEObject) newEnclos).eInverseAdd(this, EMProjectPackage.ENCLOS__ANIMAL, Enclos.class,
						msgs);
			msgs = basicSetEnclos(newEnclos, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMProjectPackage.CHIEN__ENCLOS, newEnclos,
					newEnclos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getId() {
		if (id == null) {
			id = new EDataTypeUniqueEList<Integer>(Integer.class, this, EMProjectPackage.CHIEN__ID);
		}
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EMProjectPackage.CHIEN__ENCLOS:
			if (enclos != null)
				msgs = ((InternalEObject) enclos).eInverseRemove(this, EMProjectPackage.ENCLOS__ANIMAL, Enclos.class,
						msgs);
			return basicSetEnclos((Enclos) otherEnd, msgs);
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
		case EMProjectPackage.CHIEN__ENCLOS:
			return basicSetEnclos(null, msgs);
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
		case EMProjectPackage.CHIEN__ENCLOS:
			if (resolve)
				return getEnclos();
			return basicGetEnclos();
		case EMProjectPackage.CHIEN__ID:
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
		case EMProjectPackage.CHIEN__ENCLOS:
			setEnclos((Enclos) newValue);
			return;
		case EMProjectPackage.CHIEN__ID:
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
		case EMProjectPackage.CHIEN__ENCLOS:
			setEnclos((Enclos) null);
			return;
		case EMProjectPackage.CHIEN__ID:
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
		case EMProjectPackage.CHIEN__ENCLOS:
			return enclos != null;
		case EMProjectPackage.CHIEN__ID:
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

} //ChienImpl
