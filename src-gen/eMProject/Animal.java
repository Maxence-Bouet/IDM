/**
 */
package eMProject;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Animal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eMProject.Animal#getEnclos <em>Enclos</em>}</li>
 *   <li>{@link eMProject.Animal#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see eMProject.EMProjectPackage#getAnimal()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Animal extends EObject {
	/**
	 * Returns the value of the '<em><b>Enclos</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link eMProject.Enclos#getAnimal <em>Animal</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enclos</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enclos</em>' reference.
	 * @see #setEnclos(Enclos)
	 * @see eMProject.EMProjectPackage#getAnimal_Enclos()
	 * @see eMProject.Enclos#getAnimal
	 * @model opposite="animal" required="true"
	 * @generated
	 */
	Enclos getEnclos();

	/**
	 * Sets the value of the '{@link eMProject.Animal#getEnclos <em>Enclos</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enclos</em>' reference.
	 * @see #getEnclos()
	 * @generated
	 */
	void setEnclos(Enclos value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute list.
	 * @see eMProject.EMProjectPackage#getAnimal_Id()
	 * @model id="true"
	 * @generated
	 */
	EList<Integer> getId();

} // Animal
