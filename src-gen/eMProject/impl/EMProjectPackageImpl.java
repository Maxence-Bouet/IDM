/**
 */
package eMProject.impl;

import eMProject.Animal;
import eMProject.Chat;
import eMProject.Chien;
import eMProject.EMProjectFactory;
import eMProject.EMProjectPackage;
import eMProject.Enclos;
import eMProject.Soigneur;
import eMProject.Zoo;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EMProjectPackageImpl extends EPackageImpl implements EMProjectPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enclosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass animalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chienEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zooEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass soigneurEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see eMProject.EMProjectPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EMProjectPackageImpl() {
		super(eNS_URI, EMProjectFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link EMProjectPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EMProjectPackage init() {
		if (isInited)
			return (EMProjectPackage) EPackage.Registry.INSTANCE.getEPackage(EMProjectPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredEMProjectPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		EMProjectPackageImpl theEMProjectPackage = registeredEMProjectPackage instanceof EMProjectPackageImpl
				? (EMProjectPackageImpl) registeredEMProjectPackage
				: new EMProjectPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theEMProjectPackage.createPackageContents();

		// Initialize created meta-data
		theEMProjectPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEMProjectPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EMProjectPackage.eNS_URI, theEMProjectPackage);
		return theEMProjectPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnclos() {
		return enclosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnclos_Animal() {
		return (EReference) enclosEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnclos_Zoo() {
		return (EReference) enclosEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnclos_Soigneur() {
		return (EReference) enclosEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnclos_Id() {
		return (EAttribute) enclosEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnimal() {
		return animalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnimal_Enclos() {
		return (EReference) animalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnimal_Id() {
		return (EAttribute) animalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChien() {
		return chienEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChat() {
		return chatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZoo() {
		return zooEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZoo_Enclos() {
		return (EReference) zooEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZoo_Soigneur() {
		return (EReference) zooEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getZoo_Id() {
		return (EAttribute) zooEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSoigneur() {
		return soigneurEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSoigneur_Zoo() {
		return (EReference) soigneurEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSoigneur_Enclos() {
		return (EReference) soigneurEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSoigneur_Id() {
		return (EAttribute) soigneurEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMProjectFactory getEMProjectFactory() {
		return (EMProjectFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		enclosEClass = createEClass(ENCLOS);
		createEReference(enclosEClass, ENCLOS__ANIMAL);
		createEReference(enclosEClass, ENCLOS__ZOO);
		createEReference(enclosEClass, ENCLOS__SOIGNEUR);
		createEAttribute(enclosEClass, ENCLOS__ID);

		animalEClass = createEClass(ANIMAL);
		createEReference(animalEClass, ANIMAL__ENCLOS);
		createEAttribute(animalEClass, ANIMAL__ID);

		chienEClass = createEClass(CHIEN);

		chatEClass = createEClass(CHAT);

		zooEClass = createEClass(ZOO);
		createEReference(zooEClass, ZOO__ENCLOS);
		createEReference(zooEClass, ZOO__SOIGNEUR);
		createEAttribute(zooEClass, ZOO__ID);

		soigneurEClass = createEClass(SOIGNEUR);
		createEReference(soigneurEClass, SOIGNEUR__ZOO);
		createEReference(soigneurEClass, SOIGNEUR__ENCLOS);
		createEAttribute(soigneurEClass, SOIGNEUR__ID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		chienEClass.getESuperTypes().add(this.getAnimal());
		chatEClass.getESuperTypes().add(this.getAnimal());

		// Initialize classes, features, and operations; add parameters
		initEClass(enclosEClass, Enclos.class, "Enclos", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnclos_Animal(), this.getAnimal(), this.getAnimal_Enclos(), "animal", null, 0, -1,
				Enclos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnclos_Zoo(), this.getZoo(), this.getZoo_Enclos(), "zoo", null, 1, 1, Enclos.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnclos_Soigneur(), this.getSoigneur(), this.getSoigneur_Enclos(), "soigneur", null, 1, -1,
				Enclos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnclos_Id(), ecorePackage.getEInt(), "id", null, 0, -1, Enclos.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(animalEClass, Animal.class, "Animal", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnimal_Enclos(), this.getEnclos(), this.getEnclos_Animal(), "enclos", null, 1, 1,
				Animal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimal_Id(), ecorePackage.getEInt(), "id", null, 0, -1, Animal.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(chienEClass, Chien.class, "Chien", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(chatEClass, Chat.class, "Chat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(zooEClass, Zoo.class, "Zoo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getZoo_Enclos(), this.getEnclos(), this.getEnclos_Zoo(), "enclos", null, 0, -1, Zoo.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZoo_Soigneur(), this.getSoigneur(), this.getSoigneur_Zoo(), "soigneur", null, 0, -1,
				Zoo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZoo_Id(), ecorePackage.getEInt(), "id", null, 0, -1, Zoo.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(soigneurEClass, Soigneur.class, "Soigneur", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSoigneur_Zoo(), this.getZoo(), this.getZoo_Soigneur(), "zoo", null, 1, 1, Soigneur.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoigneur_Enclos(), this.getEnclos(), this.getEnclos_Soigneur(), "enclos", null, 1, -1,
				Soigneur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSoigneur_Id(), ecorePackage.getEInt(), "id", null, 0, -1, Soigneur.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //EMProjectPackageImpl
