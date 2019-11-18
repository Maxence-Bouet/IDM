/**
 */
package eMProject;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enclos</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eMProject.Enclos#getAnimal <em>Animal</em>}</li>
 *   <li>{@link eMProject.Enclos#getZoo <em>Zoo</em>}</li>
 *   <li>{@link eMProject.Enclos#getSoigneur <em>Soigneur</em>}</li>
 * </ul>
 *
 * @see eMProject.EMProjectPackage#getEnclos()
 * @model
 * @generated
 */
public interface Enclos extends EObject {
	/**
	 * Returns the value of the '<em><b>Animal</b></em>' reference list.
	 * The list contents are of type {@link eMProject.Animal}.
	 * It is bidirectional and its opposite is '{@link eMProject.Animal#getEnclos <em>Enclos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Animal</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Animal</em>' reference list.
	 * @see eMProject.EMProjectPackage#getEnclos_Animal()
	 * @see eMProject.Animal#getEnclos
	 * @model opposite="enclos"
	 * @generated
	 */
	EList<Animal> getAnimal();

	/**
	 * Returns the value of the '<em><b>Zoo</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link eMProject.Zoo#getEnclos <em>Enclos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zoo</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zoo</em>' reference.
	 * @see #setZoo(Zoo)
	 * @see eMProject.EMProjectPackage#getEnclos_Zoo()
	 * @see eMProject.Zoo#getEnclos
	 * @model opposite="enclos" required="true"
	 * @generated
	 */
	Zoo getZoo();

	/**
	 * Sets the value of the '{@link eMProject.Enclos#getZoo <em>Zoo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zoo</em>' reference.
	 * @see #getZoo()
	 * @generated
	 */
	void setZoo(Zoo value);

	/**
	 * Returns the value of the '<em><b>Soigneur</b></em>' reference list.
	 * The list contents are of type {@link eMProject.Soigneur}.
	 * It is bidirectional and its opposite is '{@link eMProject.Soigneur#getEnclos <em>Enclos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Soigneur</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Soigneur</em>' reference list.
	 * @see eMProject.EMProjectPackage#getEnclos_Soigneur()
	 * @see eMProject.Soigneur#getEnclos
	 * @model opposite="enclos" required="true"
	 * @generated
	 */
	EList<Soigneur> getSoigneur();

} // Enclos
