/**
 */
package eMProject.impl;

import eMProject.Chat;
import eMProject.EMProjectPackage;
import eMProject.Enclos;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chat</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eMProject.impl.ChatImpl#getEnclos <em>Enclos</em>}</li>
 *   <li>{@link eMProject.impl.ChatImpl#getId <em>Id</em>}</li>
 *   <li>{@link eMProject.impl.ChatImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChatImpl extends MinimalEObjectImpl.Container implements Chat {
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
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EMProjectPackage.Literals.CHAT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EMProjectPackage.CHAT__ENCLOS, oldEnclos,
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
					EMProjectPackage.CHAT__ENCLOS, oldEnclos, newEnclos);
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
			eNotify(new ENotificationImpl(this, Notification.SET, EMProjectPackage.CHAT__ENCLOS, newEnclos, newEnclos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMProjectPackage.CHAT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMProjectPackage.CHAT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EMProjectPackage.CHAT__ENCLOS:
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
		case EMProjectPackage.CHAT__ENCLOS:
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
		case EMProjectPackage.CHAT__ENCLOS:
			if (resolve)
				return getEnclos();
			return basicGetEnclos();
		case EMProjectPackage.CHAT__ID:
			return getId();
		case EMProjectPackage.CHAT__NAME:
			return getName();
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
		case EMProjectPackage.CHAT__ENCLOS:
			setEnclos((Enclos) newValue);
			return;
		case EMProjectPackage.CHAT__ID:
			setId((Integer) newValue);
			return;
		case EMProjectPackage.CHAT__NAME:
			setName((String) newValue);
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
		case EMProjectPackage.CHAT__ENCLOS:
			setEnclos((Enclos) null);
			return;
		case EMProjectPackage.CHAT__ID:
			setId(ID_EDEFAULT);
			return;
		case EMProjectPackage.CHAT__NAME:
			setName(NAME_EDEFAULT);
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
		case EMProjectPackage.CHAT__ENCLOS:
			return enclos != null;
		case EMProjectPackage.CHAT__ID:
			return id != ID_EDEFAULT;
		case EMProjectPackage.CHAT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ChatImpl
