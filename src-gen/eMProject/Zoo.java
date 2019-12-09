/**
 */
package eMProject;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Zoo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eMProject.Zoo#getEnclos <em>Enclos</em>}</li>
 *   <li>{@link eMProject.Zoo#getSoigneur <em>Soigneur</em>}</li>
 *   <li>{@link eMProject.Zoo#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see eMProject.EMProjectPackage#getZoo()
 * @model
 * @generated
 */
public interface Zoo extends EObject {
	/**
	 * Returns the value of the '<em><b>Enclos</b></em>' reference list.
	 * The list contents are of type {@link eMProject.Enclos}.
	 * It is bidirectional and its opposite is '{@link eMProject.Enclos#getZoo <em>Zoo</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enclos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enclos</em>' reference list.
	 * @see eMProject.EMProjectPackage#getZoo_Enclos()
	 * @see eMProject.Enclos#getZoo
	 * @model opposite="zoo"
	 * @generated
	 */
	EList<Enclos> getEnclos();

	/**
	 * Returns the value of the '<em><b>Soigneur</b></em>' reference list.
	 * The list contents are of type {@link eMProject.Soigneur}.
	 * It is bidirectional and its opposite is '{@link eMProject.Soigneur#getZoo <em>Zoo</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Soigneur</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Soigneur</em>' reference list.
	 * @see eMProject.EMProjectPackage#getZoo_Soigneur()
	 * @see eMProject.Soigneur#getZoo
	 * @model opposite="zoo"
	 * @generated
	 */
	EList<Soigneur> getSoigneur();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see eMProject.EMProjectPackage#getZoo_Id()
	 * @model id="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link eMProject.Zoo#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

} // Zoo
