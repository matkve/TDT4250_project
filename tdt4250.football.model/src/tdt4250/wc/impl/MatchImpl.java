/**
 */
package tdt4250.wc.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import tdt4250.wc.Arena;
import tdt4250.wc.Match;
import tdt4250.wc.TeamMatchDetails;
import tdt4250.wc.WcPackage;
import tdt4250.wc.Weather;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Match</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.wc.impl.MatchImpl#getHomeTeam <em>Home Team</em>}</li>
 *   <li>{@link tdt4250.wc.impl.MatchImpl#getAwayTeam <em>Away Team</em>}</li>
 *   <li>{@link tdt4250.wc.impl.MatchImpl#getArena <em>Arena</em>}</li>
 *   <li>{@link tdt4250.wc.impl.MatchImpl#getWeather <em>Weather</em>}</li>
 *   <li>{@link tdt4250.wc.impl.MatchImpl#getDatetime <em>Datetime</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MatchImpl extends MinimalEObjectImpl.Container implements Match {
	/**
	 * The cached value of the '{@link #getHomeTeam() <em>Home Team</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHomeTeam()
	 * @generated
	 * @ordered
	 */
	protected TeamMatchDetails homeTeam;

	/**
	 * The cached value of the '{@link #getAwayTeam() <em>Away Team</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAwayTeam()
	 * @generated
	 * @ordered
	 */
	protected TeamMatchDetails awayTeam;

	/**
	 * The cached value of the '{@link #getArena() <em>Arena</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArena()
	 * @generated
	 * @ordered
	 */
	protected Arena arena;

	/**
	 * The cached value of the '{@link #getWeather() <em>Weather</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeather()
	 * @generated
	 * @ordered
	 */
	protected Weather weather;

	/**
	 * The default value of the '{@link #getDatetime() <em>Datetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatetime()
	 * @generated
	 * @ordered
	 */
	protected static final String DATETIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatetime() <em>Datetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatetime()
	 * @generated
	 * @ordered
	 */
	protected String datetime = DATETIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WcPackage.Literals.MATCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TeamMatchDetails getHomeTeam() {
		return homeTeam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHomeTeam(TeamMatchDetails newHomeTeam, NotificationChain msgs) {
		TeamMatchDetails oldHomeTeam = homeTeam;
		homeTeam = newHomeTeam;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WcPackage.MATCH__HOME_TEAM, oldHomeTeam, newHomeTeam);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHomeTeam(TeamMatchDetails newHomeTeam) {
		if (newHomeTeam != homeTeam) {
			NotificationChain msgs = null;
			if (homeTeam != null)
				msgs = ((InternalEObject)homeTeam).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WcPackage.MATCH__HOME_TEAM, null, msgs);
			if (newHomeTeam != null)
				msgs = ((InternalEObject)newHomeTeam).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WcPackage.MATCH__HOME_TEAM, null, msgs);
			msgs = basicSetHomeTeam(newHomeTeam, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WcPackage.MATCH__HOME_TEAM, newHomeTeam, newHomeTeam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TeamMatchDetails getAwayTeam() {
		return awayTeam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAwayTeam(TeamMatchDetails newAwayTeam, NotificationChain msgs) {
		TeamMatchDetails oldAwayTeam = awayTeam;
		awayTeam = newAwayTeam;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WcPackage.MATCH__AWAY_TEAM, oldAwayTeam, newAwayTeam);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAwayTeam(TeamMatchDetails newAwayTeam) {
		if (newAwayTeam != awayTeam) {
			NotificationChain msgs = null;
			if (awayTeam != null)
				msgs = ((InternalEObject)awayTeam).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WcPackage.MATCH__AWAY_TEAM, null, msgs);
			if (newAwayTeam != null)
				msgs = ((InternalEObject)newAwayTeam).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WcPackage.MATCH__AWAY_TEAM, null, msgs);
			msgs = basicSetAwayTeam(newAwayTeam, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WcPackage.MATCH__AWAY_TEAM, newAwayTeam, newAwayTeam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arena getArena() {
		if (arena != null && arena.eIsProxy()) {
			InternalEObject oldArena = (InternalEObject)arena;
			arena = (Arena)eResolveProxy(oldArena);
			if (arena != oldArena) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WcPackage.MATCH__ARENA, oldArena, arena));
			}
		}
		return arena;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arena basicGetArena() {
		return arena;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArena(Arena newArena) {
		Arena oldArena = arena;
		arena = newArena;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WcPackage.MATCH__ARENA, oldArena, arena));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Weather getWeather() {
		if (weather != null && weather.eIsProxy()) {
			InternalEObject oldWeather = (InternalEObject)weather;
			weather = (Weather)eResolveProxy(oldWeather);
			if (weather != oldWeather) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WcPackage.MATCH__WEATHER, oldWeather, weather));
			}
		}
		return weather;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Weather basicGetWeather() {
		return weather;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeather(Weather newWeather) {
		Weather oldWeather = weather;
		weather = newWeather;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WcPackage.MATCH__WEATHER, oldWeather, weather));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDatetime() {
		return datetime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatetime(String newDatetime) {
		String oldDatetime = datetime;
		datetime = newDatetime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WcPackage.MATCH__DATETIME, oldDatetime, datetime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WcPackage.MATCH__HOME_TEAM:
				return basicSetHomeTeam(null, msgs);
			case WcPackage.MATCH__AWAY_TEAM:
				return basicSetAwayTeam(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WcPackage.MATCH__HOME_TEAM:
				return getHomeTeam();
			case WcPackage.MATCH__AWAY_TEAM:
				return getAwayTeam();
			case WcPackage.MATCH__ARENA:
				if (resolve) return getArena();
				return basicGetArena();
			case WcPackage.MATCH__WEATHER:
				if (resolve) return getWeather();
				return basicGetWeather();
			case WcPackage.MATCH__DATETIME:
				return getDatetime();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WcPackage.MATCH__HOME_TEAM:
				setHomeTeam((TeamMatchDetails)newValue);
				return;
			case WcPackage.MATCH__AWAY_TEAM:
				setAwayTeam((TeamMatchDetails)newValue);
				return;
			case WcPackage.MATCH__ARENA:
				setArena((Arena)newValue);
				return;
			case WcPackage.MATCH__WEATHER:
				setWeather((Weather)newValue);
				return;
			case WcPackage.MATCH__DATETIME:
				setDatetime((String)newValue);
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
			case WcPackage.MATCH__HOME_TEAM:
				setHomeTeam((TeamMatchDetails)null);
				return;
			case WcPackage.MATCH__AWAY_TEAM:
				setAwayTeam((TeamMatchDetails)null);
				return;
			case WcPackage.MATCH__ARENA:
				setArena((Arena)null);
				return;
			case WcPackage.MATCH__WEATHER:
				setWeather((Weather)null);
				return;
			case WcPackage.MATCH__DATETIME:
				setDatetime(DATETIME_EDEFAULT);
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
			case WcPackage.MATCH__HOME_TEAM:
				return homeTeam != null;
			case WcPackage.MATCH__AWAY_TEAM:
				return awayTeam != null;
			case WcPackage.MATCH__ARENA:
				return arena != null;
			case WcPackage.MATCH__WEATHER:
				return weather != null;
			case WcPackage.MATCH__DATETIME:
				return DATETIME_EDEFAULT == null ? datetime != null : !DATETIME_EDEFAULT.equals(datetime);
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
		result.append(" (datetime: ");
		result.append(datetime);
		result.append(')');
		return result.toString();
	}

} //MatchImpl
