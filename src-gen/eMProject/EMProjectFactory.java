/**
 */
package eMProject;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see eMProject.EMProjectPackage
 * @generated
 */
public interface EMProjectFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EMProjectFactory eINSTANCE = eMProject.impl.EMProjectFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Enclos</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enclos</em>'.
	 * @generated
	 */
	Enclos createEnclos();

	/**
	 * Returns a new object of class '<em>Chien</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chien</em>'.
	 * @generated
	 */
	Chien createChien();

	/**
	 * Returns a new object of class '<em>Chat</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chat</em>'.
	 * @generated
	 */
	Chat createChat();

	/**
	 * Returns a new object of class '<em>Zoo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Zoo</em>'.
	 * @generated
	 */
	Zoo createZoo();

	/**
	 * Returns a new object of class '<em>Soigneur</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Soigneur</em>'.
	 * @generated
	 */
	Soigneur createSoigneur();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EMProjectPackage getEMProjectPackage();

} //EMProjectFactory
