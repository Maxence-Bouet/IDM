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
 *   <li>{@link eMProject.Soigneur#getId <em>Id</em>}</li>
 *   <li>{@link eMProject.Soigneur#getName <em>Name</em>}</li>
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
	 * @see eMProject.EMProjectPackage#getSoigneur_Id()
	 * @model id="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link eMProject.Soigneur#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see eMProject.EMProjectPackage#getSoigneur_Name()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eMProject.Soigneur#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Soigneur
