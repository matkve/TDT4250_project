/**
 */
package tdt4250.wc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Player</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.wc.Player#getName <em>Name</em>}</li>
 *   <li>{@link tdt4250.wc.Player#getShirtNumber <em>Shirt Number</em>}</li>
 * </ul>
 *
 * @see tdt4250.wc.WcPackage#getPlayer()
 * @model
 * @generated
 */
public interface Player extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tdt4250.wc.WcPackage#getPlayer_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tdt4250.wc.Player#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Shirt Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shirt Number</em>' attribute.
	 * @see #setShirtNumber(int)
	 * @see tdt4250.wc.WcPackage#getPlayer_ShirtNumber()
	 * @model
	 * @generated
	 */
	int getShirtNumber();

	/**
	 * Sets the value of the '{@link tdt4250.wc.Player#getShirtNumber <em>Shirt Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shirt Number</em>' attribute.
	 * @see #getShirtNumber()
	 * @generated
	 */
	void setShirtNumber(int value);

} // Player
