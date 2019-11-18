/**
 */
package eMProject;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Soigneur</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eMProject.Soigneur#getZoo <em>Zoo</em>}</li>
 *   <li>{@link eMProject.Soigneur#getEnclos <em>Enclos</em>}</li>
 * </ul>
 *
 * @see eMProject.EMProjectPackage#getSoigneur()
 * @model
 * @generated
 */
public interface Soigneur extends EObject {
	/**
	 * Returns the value of the '<em><b>Zoo</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link eMProject.Zoo#getSoigneur <em>Soigneur</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zoo</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zoo</em>' reference.
	 * @see #setZoo(Zoo)
	 * @see eMProject.EMProjectPackage#getSoigneur_Zoo()
	 * @see eMProject.Zoo#getSoigneur
	 * @model opposite="soigneur" required="true"
	 * @generated
	 */
	Zoo getZoo();

	/**
	 * Sets the value of the '{@link eMProject.Soigneur#getZoo <em>Zoo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zoo</em>' reference.
	 * @see #getZoo()
	 * @generated
	 */
	void setZoo(Zoo value);

	/**
	 * Returns the value of the '<em><b>Enclos</b></em>' reference list.
	 * The list contents are of type {@link eMProject.Enclos}.
	 * It is bidirectional and its opposite is '{@link eMProject.Enclos#getSoigneur <em>Soigneur</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enclos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enclos</em>' reference list.
	 * @see eMProject.EMProjectPackage#getSoigneur_Enclos()
	 * @see eMProject.Enclos#getSoigneur
	 * @model opposite="soigneur" required="true"
	 * @generated
	 */
	EList<Enclos> getEnclos();

} // Soigneur
