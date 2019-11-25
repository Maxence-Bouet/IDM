/**
 */
package eMProject;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see eMProject.EMProjectFactory
 * @model kind="package"
 * @generated
 */
public interface EMProjectPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "eMProject";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/eMProject";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "eMProject";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EMProjectPackage eINSTANCE = eMProject.impl.EMProjectPackageImpl.init();

	/**
	 * The meta object id for the '{@link eMProject.impl.EnclosImpl <em>Enclos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eMProject.impl.EnclosImpl
	 * @see eMProject.impl.EMProjectPackageImpl#getEnclos()
	 * @generated
	 */
	int ENCLOS = 0;

	/**
	 * The feature id for the '<em><b>Animal</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCLOS__ANIMAL = 0;

	/**
	 * The feature id for the '<em><b>Zoo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCLOS__ZOO = 1;

	/**
	 * The feature id for the '<em><b>Soigneur</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCLOS__SOIGNEUR = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCLOS__ID = 3;

	/**
	 * The number of structural features of the '<em>Enclos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCLOS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Enclos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCLOS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eMProject.Animal <em>Animal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eMProject.Animal
	 * @see eMProject.impl.EMProjectPackageImpl#getAnimal()
	 * @generated
	 */
	int ANIMAL = 1;

	/**
	 * The feature id for the '<em><b>Enclos</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMAL__ENCLOS = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMAL__ID = 1;

	/**
	 * The number of structural features of the '<em>Animal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMAL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Animal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eMProject.impl.ChienImpl <em>Chien</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eMProject.impl.ChienImpl
	 * @see eMProject.impl.EMProjectPackageImpl#getChien()
	 * @generated
	 */
	int CHIEN = 2;

	/**
	 * The feature id for the '<em><b>Enclos</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHIEN__ENCLOS = ANIMAL__ENCLOS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHIEN__ID = ANIMAL__ID;

	/**
	 * The number of structural features of the '<em>Chien</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHIEN_FEATURE_COUNT = ANIMAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Chien</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHIEN_OPERATION_COUNT = ANIMAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eMProject.impl.ChatImpl <em>Chat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eMProject.impl.ChatImpl
	 * @see eMProject.impl.EMProjectPackageImpl#getChat()
	 * @generated
	 */
	int CHAT = 3;

	/**
	 * The feature id for the '<em><b>Enclos</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAT__ENCLOS = ANIMAL__ENCLOS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAT__ID = ANIMAL__ID;

	/**
	 * The number of structural features of the '<em>Chat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAT_FEATURE_COUNT = ANIMAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Chat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAT_OPERATION_COUNT = ANIMAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eMProject.impl.ZooImpl <em>Zoo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eMProject.impl.ZooImpl
	 * @see eMProject.impl.EMProjectPackageImpl#getZoo()
	 * @generated
	 */
	int ZOO = 4;

	/**
	 * The feature id for the '<em><b>Enclos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOO__ENCLOS = 0;

	/**
	 * The feature id for the '<em><b>Soigneur</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOO__SOIGNEUR = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOO__ID = 2;

	/**
	 * The number of structural features of the '<em>Zoo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOO_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Zoo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eMProject.impl.SoigneurImpl <em>Soigneur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eMProject.impl.SoigneurImpl
	 * @see eMProject.impl.EMProjectPackageImpl#getSoigneur()
	 * @generated
	 */
	int SOIGNEUR = 5;

	/**
	 * The feature id for the '<em><b>Zoo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOIGNEUR__ZOO = 0;

	/**
	 * The feature id for the '<em><b>Enclos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOIGNEUR__ENCLOS = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOIGNEUR__ID = 2;

	/**
	 * The number of structural features of the '<em>Soigneur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOIGNEUR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Soigneur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOIGNEUR_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link eMProject.Enclos <em>Enclos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enclos</em>'.
	 * @see eMProject.Enclos
	 * @generated
	 */
	EClass getEnclos();

	/**
	 * Returns the meta object for the reference list '{@link eMProject.Enclos#getAnimal <em>Animal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Animal</em>'.
	 * @see eMProject.Enclos#getAnimal()
	 * @see #getEnclos()
	 * @generated
	 */
	EReference getEnclos_Animal();

	/**
	 * Returns the meta object for the reference '{@link eMProject.Enclos#getZoo <em>Zoo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Zoo</em>'.
	 * @see eMProject.Enclos#getZoo()
	 * @see #getEnclos()
	 * @generated
	 */
	EReference getEnclos_Zoo();

	/**
	 * Returns the meta object for the reference list '{@link eMProject.Enclos#getSoigneur <em>Soigneur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Soigneur</em>'.
	 * @see eMProject.Enclos#getSoigneur()
	 * @see #getEnclos()
	 * @generated
	 */
	EReference getEnclos_Soigneur();

	/**
	 * Returns the meta object for the attribute list '{@link eMProject.Enclos#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Id</em>'.
	 * @see eMProject.Enclos#getId()
	 * @see #getEnclos()
	 * @generated
	 */
	EAttribute getEnclos_Id();

	/**
	 * Returns the meta object for class '{@link eMProject.Animal <em>Animal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Animal</em>'.
	 * @see eMProject.Animal
	 * @generated
	 */
	EClass getAnimal();

	/**
	 * Returns the meta object for the reference '{@link eMProject.Animal#getEnclos <em>Enclos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Enclos</em>'.
	 * @see eMProject.Animal#getEnclos()
	 * @see #getAnimal()
	 * @generated
	 */
	EReference getAnimal_Enclos();

	/**
	 * Returns the meta object for the attribute list '{@link eMProject.Animal#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Id</em>'.
	 * @see eMProject.Animal#getId()
	 * @see #getAnimal()
	 * @generated
	 */
	EAttribute getAnimal_Id();

	/**
	 * Returns the meta object for class '{@link eMProject.Chien <em>Chien</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chien</em>'.
	 * @see eMProject.Chien
	 * @generated
	 */
	EClass getChien();

	/**
	 * Returns the meta object for class '{@link eMProject.Chat <em>Chat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chat</em>'.
	 * @see eMProject.Chat
	 * @generated
	 */
	EClass getChat();

	/**
	 * Returns the meta object for class '{@link eMProject.Zoo <em>Zoo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zoo</em>'.
	 * @see eMProject.Zoo
	 * @generated
	 */
	EClass getZoo();

	/**
	 * Returns the meta object for the reference list '{@link eMProject.Zoo#getEnclos <em>Enclos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Enclos</em>'.
	 * @see eMProject.Zoo#getEnclos()
	 * @see #getZoo()
	 * @generated
	 */
	EReference getZoo_Enclos();

	/**
	 * Returns the meta object for the reference list '{@link eMProject.Zoo#getSoigneur <em>Soigneur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Soigneur</em>'.
	 * @see eMProject.Zoo#getSoigneur()
	 * @see #getZoo()
	 * @generated
	 */
	EReference getZoo_Soigneur();

	/**
	 * Returns the meta object for the attribute list '{@link eMProject.Zoo#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Id</em>'.
	 * @see eMProject.Zoo#getId()
	 * @see #getZoo()
	 * @generated
	 */
	EAttribute getZoo_Id();

	/**
	 * Returns the meta object for class '{@link eMProject.Soigneur <em>Soigneur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Soigneur</em>'.
	 * @see eMProject.Soigneur
	 * @generated
	 */
	EClass getSoigneur();

	/**
	 * Returns the meta object for the reference '{@link eMProject.Soigneur#getZoo <em>Zoo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Zoo</em>'.
	 * @see eMProject.Soigneur#getZoo()
	 * @see #getSoigneur()
	 * @generated
	 */
	EReference getSoigneur_Zoo();

	/**
	 * Returns the meta object for the reference list '{@link eMProject.Soigneur#getEnclos <em>Enclos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Enclos</em>'.
	 * @see eMProject.Soigneur#getEnclos()
	 * @see #getSoigneur()
	 * @generated
	 */
	EReference getSoigneur_Enclos();

	/**
	 * Returns the meta object for the attribute list '{@link eMProject.Soigneur#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Id</em>'.
	 * @see eMProject.Soigneur#getId()
	 * @see #getSoigneur()
	 * @generated
	 */
	EAttribute getSoigneur_Id();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EMProjectFactory getEMProjectFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link eMProject.impl.EnclosImpl <em>Enclos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eMProject.impl.EnclosImpl
		 * @see eMProject.impl.EMProjectPackageImpl#getEnclos()
		 * @generated
		 */
		EClass ENCLOS = eINSTANCE.getEnclos();

		/**
		 * The meta object literal for the '<em><b>Animal</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENCLOS__ANIMAL = eINSTANCE.getEnclos_Animal();

		/**
		 * The meta object literal for the '<em><b>Zoo</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENCLOS__ZOO = eINSTANCE.getEnclos_Zoo();

		/**
		 * The meta object literal for the '<em><b>Soigneur</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENCLOS__SOIGNEUR = eINSTANCE.getEnclos_Soigneur();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENCLOS__ID = eINSTANCE.getEnclos_Id();

		/**
		 * The meta object literal for the '{@link eMProject.Animal <em>Animal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eMProject.Animal
		 * @see eMProject.impl.EMProjectPackageImpl#getAnimal()
		 * @generated
		 */
		EClass ANIMAL = eINSTANCE.getAnimal();

		/**
		 * The meta object literal for the '<em><b>Enclos</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANIMAL__ENCLOS = eINSTANCE.getAnimal_Enclos();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMAL__ID = eINSTANCE.getAnimal_Id();

		/**
		 * The meta object literal for the '{@link eMProject.impl.ChienImpl <em>Chien</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eMProject.impl.ChienImpl
		 * @see eMProject.impl.EMProjectPackageImpl#getChien()
		 * @generated
		 */
		EClass CHIEN = eINSTANCE.getChien();

		/**
		 * The meta object literal for the '{@link eMProject.impl.ChatImpl <em>Chat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eMProject.impl.ChatImpl
		 * @see eMProject.impl.EMProjectPackageImpl#getChat()
		 * @generated
		 */
		EClass CHAT = eINSTANCE.getChat();

		/**
		 * The meta object literal for the '{@link eMProject.impl.ZooImpl <em>Zoo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eMProject.impl.ZooImpl
		 * @see eMProject.impl.EMProjectPackageImpl#getZoo()
		 * @generated
		 */
		EClass ZOO = eINSTANCE.getZoo();

		/**
		 * The meta object literal for the '<em><b>Enclos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZOO__ENCLOS = eINSTANCE.getZoo_Enclos();

		/**
		 * The meta object literal for the '<em><b>Soigneur</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZOO__SOIGNEUR = eINSTANCE.getZoo_Soigneur();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZOO__ID = eINSTANCE.getZoo_Id();

		/**
		 * The meta object literal for the '{@link eMProject.impl.SoigneurImpl <em>Soigneur</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eMProject.impl.SoigneurImpl
		 * @see eMProject.impl.EMProjectPackageImpl#getSoigneur()
		 * @generated
		 */
		EClass SOIGNEUR = eINSTANCE.getSoigneur();

		/**
		 * The meta object literal for the '<em><b>Zoo</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOIGNEUR__ZOO = eINSTANCE.getSoigneur_Zoo();

		/**
		 * The meta object literal for the '<em><b>Enclos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOIGNEUR__ENCLOS = eINSTANCE.getSoigneur_Enclos();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOIGNEUR__ID = eINSTANCE.getSoigneur_Id();

	}

} //EMProjectPackage
