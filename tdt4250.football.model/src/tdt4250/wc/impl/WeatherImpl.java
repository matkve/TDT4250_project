/**
 */
package tdt4250.wc.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tdt4250.wc.WcPackage;
import tdt4250.wc.Weather;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Weather</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.wc.impl.WeatherImpl#getHumidity <em>Humidity</em>}</li>
 *   <li>{@link tdt4250.wc.impl.WeatherImpl#getTempCelcius <em>Temp Celcius</em>}</li>
 *   <li>{@link tdt4250.wc.impl.WeatherImpl#getTempFarenheit <em>Temp Farenheit</em>}</li>
 *   <li>{@link tdt4250.wc.impl.WeatherImpl#getWindSpeed <em>Wind Speed</em>}</li>
 *   <li>{@link tdt4250.wc.impl.WeatherImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WeatherImpl extends MinimalEObjectImpl.Container implements Weather {
	/**
	 * The default value of the '{@link #getHumidity() <em>Humidity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHumidity()
	 * @generated
	 * @ordered
	 */
	protected static final int HUMIDITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHumidity() <em>Humidity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHumidity()
	 * @generated
	 * @ordered
	 */
	protected int humidity = HUMIDITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTempCelcius() <em>Temp Celcius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTempCelcius()
	 * @generated
	 * @ordered
	 */
	protected static final int TEMP_CELCIUS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTempCelcius() <em>Temp Celcius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTempCelcius()
	 * @generated
	 * @ordered
	 */
	protected int tempCelcius = TEMP_CELCIUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTempFarenheit() <em>Temp Farenheit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTempFarenheit()
	 * @generated
	 * @ordered
	 */
	protected static final int TEMP_FARENHEIT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTempFarenheit() <em>Temp Farenheit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTempFarenheit()
	 * @generated
	 * @ordered
	 */
	protected int tempFarenheit = TEMP_FARENHEIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getWindSpeed() <em>Wind Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final int WIND_SPEED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWindSpeed() <em>Wind Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindSpeed()
	 * @generated
	 * @ordered
	 */
	protected int windSpeed = WIND_SPEED_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WeatherImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WcPackage.Literals.WEATHER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHumidity() {
		return humidity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHumidity(int newHumidity) {
		int oldHumidity = humidity;
		humidity = newHumidity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WcPackage.WEATHER__HUMIDITY, oldHumidity, humidity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTempCelcius() {
		return tempCelcius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTempCelcius(int newTempCelcius) {
		int oldTempCelcius = tempCelcius;
		tempCelcius = newTempCelcius;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WcPackage.WEATHER__TEMP_CELCIUS, oldTempCelcius, tempCelcius));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTempFarenheit() {
		return tempFarenheit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTempFarenheit(int newTempFarenheit) {
		int oldTempFarenheit = tempFarenheit;
		tempFarenheit = newTempFarenheit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WcPackage.WEATHER__TEMP_FARENHEIT, oldTempFarenheit, tempFarenheit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWindSpeed() {
		return windSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWindSpeed(int newWindSpeed) {
		int oldWindSpeed = windSpeed;
		windSpeed = newWindSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WcPackage.WEATHER__WIND_SPEED, oldWindSpeed, windSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WcPackage.WEATHER__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WcPackage.WEATHER__HUMIDITY:
				return getHumidity();
			case WcPackage.WEATHER__TEMP_CELCIUS:
				return getTempCelcius();
			case WcPackage.WEATHER__TEMP_FARENHEIT:
				return getTempFarenheit();
			case WcPackage.WEATHER__WIND_SPEED:
				return getWindSpeed();
			case WcPackage.WEATHER__DESCRIPTION:
				return getDescription();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WcPackage.WEATHER__HUMIDITY:
				setHumidity((Integer)newValue);
				return;
			case WcPackage.WEATHER__TEMP_CELCIUS:
				setTempCelcius((Integer)newValue);
				return;
			case WcPackage.WEATHER__TEMP_FARENHEIT:
				setTempFarenheit((Integer)newValue);
				return;
			case WcPackage.WEATHER__WIND_SPEED:
				setWindSpeed((Integer)newValue);
				return;
			case WcPackage.WEATHER__DESCRIPTION:
				setDescription((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case WcPackage.WEATHER__HUMIDITY:
				setHumidity(HUMIDITY_EDEFAULT);
				return;
			case WcPackage.WEATHER__TEMP_CELCIUS:
				setTempCelcius(TEMP_CELCIUS_EDEFAULT);
				return;
			case WcPackage.WEATHER__TEMP_FARENHEIT:
				setTempFarenheit(TEMP_FARENHEIT_EDEFAULT);
				return;
			case WcPackage.WEATHER__WIND_SPEED:
				setWindSpeed(WIND_SPEED_EDEFAULT);
				return;
			case WcPackage.WEATHER__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case WcPackage.WEATHER__HUMIDITY:
				return humidity != HUMIDITY_EDEFAULT;
			case WcPackage.WEATHER__TEMP_CELCIUS:
				return tempCelcius != TEMP_CELCIUS_EDEFAULT;
			case WcPackage.WEATHER__TEMP_FARENHEIT:
				return tempFarenheit != TEMP_FARENHEIT_EDEFAULT;
			case WcPackage.WEATHER__WIND_SPEED:
				return windSpeed != WIND_SPEED_EDEFAULT;
			case WcPackage.WEATHER__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (humidity: ");
		result.append(humidity);
		result.append(", tempCelcius: ");
		result.append(tempCelcius);
		result.append(", tempFarenheit: ");
		result.append(tempFarenheit);
		result.append(", windSpeed: ");
		result.append(windSpeed);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //WeatherImpl
