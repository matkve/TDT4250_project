/**
 */
package tdt4250.wc;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arena</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.wc.Arena#getCity <em>City</em>}</li>
 *   <li>{@link tdt4250.wc.Arena#getName <em>Name</em>}</li>
 *   <li>{@link tdt4250.wc.Arena#getWeatherHistory <em>Weather History</em>}</li>
 * </ul>
 *
 * @see tdt4250.wc.WcPackage#getArena()
 * @model
 * @generated
 */
public interface Arena extends EObject {
	/**
	 * Returns the value of the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City</em>' attribute.
	 * @see #setCity(String)
	 * @see tdt4250.wc.WcPackage#getArena_City()
	 * @model
	 * @generated
	 */
	String getCity();

	/**
	 * Sets the value of the '{@link tdt4250.wc.Arena#getCity <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City</em>' attribute.
	 * @see #getCity()
	 * @generated
	 */
	void setCity(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tdt4250.wc.WcPackage#getArena_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tdt4250.wc.Arena#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Weather History</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.wc.Weather}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weather History</em>' containment reference list.
	 * @see tdt4250.wc.WcPackage#getArena_WeatherHistory()
	 * @model containment="true"
	 * @generated
	 */
	EList<Weather> getWeatherHistory();

} // Arena
