/**
 */
package eMProject.impl;

import eMProject.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EMProjectFactoryImpl extends EFactoryImpl implements EMProjectFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EMProjectFactory init() {
		try {
			EMProjectFactory theEMProjectFactory = (EMProjectFactory) EPackage.Registry.INSTANCE
					.getEFactory(EMProjectPackage.eNS_URI);
			if (theEMProjectFactory != null) {
				return theEMProjectFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EMProjectFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMProjectFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case EMProjectPackage.ENCLOS:
			return createEnclos();
		case EMProjectPackage.CHIEN:
			return createChien();
		case EMProjectPackage.CHAT:
			return createChat();
		case EMProjectPackage.ZOO:
			return createZoo();
		case EMProjectPackage.SOIGNEUR:
			return createSoigneur();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enclos createEnclos() {
		EnclosImpl enclos = new EnclosImpl();
		return enclos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Chien createChien() {
		ChienImpl chien = new ChienImpl();
		return chien;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Chat createChat() {
		ChatImpl chat = new ChatImpl();
		return chat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Zoo createZoo() {
		ZooImpl zoo = new ZooImpl();
		return zoo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Soigneur createSoigneur() {
		SoigneurImpl soigneur = new SoigneurImpl();
		return soigneur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMProjectPackage getEMProjectPackage() {
		return (EMProjectPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EMProjectPackage getPackage() {
		return EMProjectPackage.eINSTANCE;
	}

} //EMProjectFactoryImpl
