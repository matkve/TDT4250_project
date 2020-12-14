/**
 */
package tdt4250.wc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Weather</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.wc.Weather#getHumidity <em>Humidity</em>}</li>
 *   <li>{@link tdt4250.wc.Weather#getTempCelcius <em>Temp Celcius</em>}</li>
 *   <li>{@link tdt4250.wc.Weather#getTempFarenheit <em>Temp Farenheit</em>}</li>
 *   <li>{@link tdt4250.wc.Weather#getWindSpeed <em>Wind Speed</em>}</li>
 *   <li>{@link tdt4250.wc.Weather#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see tdt4250.wc.WcPackage#getWeather()
 * @model
 * @generated
 */
public interface Weather extends EObject {
	/**
	 * Returns the value of the '<em><b>Humidity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Humidity</em>' attribute.
	 * @see #setHumidity(int)
	 * @see tdt4250.wc.WcPackage#getWeather_Humidity()
	 * @model
	 * @generated
	 */
	int getHumidity();

	/**
	 * Sets the value of the '{@link tdt4250.wc.Weather#getHumidity <em>Humidity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Humidity</em>' attribute.
	 * @see #getHumidity()
	 * @generated
	 */
	void setHumidity(int value);

	/**
	 * Returns the value of the '<em><b>Temp Celcius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temp Celcius</em>' attribute.
	 * @see #setTempCelcius(int)
	 * @see tdt4250.wc.WcPackage#getWeather_TempCelcius()
	 * @model
	 * @generated
	 */
	int getTempCelcius();

	/**
	 * Sets the value of the '{@link tdt4250.wc.Weather#getTempCelcius <em>Temp Celcius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temp Celcius</em>' attribute.
	 * @see #getTempCelcius()
	 * @generated
	 */
	void setTempCelcius(int value);

	/**
	 * Returns the value of the '<em><b>Temp Farenheit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temp Farenheit</em>' attribute.
	 * @see #setTempFarenheit(int)
	 * @see tdt4250.wc.WcPackage#getWeather_TempFarenheit()
	 * @model
	 * @generated
	 */
	int getTempFarenheit();

	/**
	 * Sets the value of the '{@link tdt4250.wc.Weather#getTempFarenheit <em>Temp Farenheit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temp Farenheit</em>' attribute.
	 * @see #getTempFarenheit()
	 * @generated
	 */
	void setTempFarenheit(int value);

	/**
	 * Returns the value of the '<em><b>Wind Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wind Speed</em>' attribute.
	 * @see #setWindSpeed(int)
	 * @see tdt4250.wc.WcPackage#getWeather_WindSpeed()
	 * @model
	 * @generated
	 */
	int getWindSpeed();

	/**
	 * Sets the value of the '{@link tdt4250.wc.Weather#getWindSpeed <em>Wind Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wind Speed</em>' attribute.
	 * @see #getWindSpeed()
	 * @generated
	 */
	void setWindSpeed(int value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see tdt4250.wc.WcPackage#getWeather_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link tdt4250.wc.Weather#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Weather
