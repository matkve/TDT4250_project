/**
 */
package tdt4250.wc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Match</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.wc.Match#getHomeTeam <em>Home Team</em>}</li>
 *   <li>{@link tdt4250.wc.Match#getAwayTeam <em>Away Team</em>}</li>
 *   <li>{@link tdt4250.wc.Match#getArena <em>Arena</em>}</li>
 *   <li>{@link tdt4250.wc.Match#getWeather <em>Weather</em>}</li>
 *   <li>{@link tdt4250.wc.Match#getDatetime <em>Datetime</em>}</li>
 * </ul>
 *
 * @see tdt4250.wc.WcPackage#getMatch()
 * @model
 * @generated
 */
public interface Match extends EObject {
	/**
	 * Returns the value of the '<em><b>Home Team</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Home Team</em>' containment reference.
	 * @see #setHomeTeam(TeamMatchDetails)
	 * @see tdt4250.wc.WcPackage#getMatch_HomeTeam()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TeamMatchDetails getHomeTeam();

	/**
	 * Sets the value of the '{@link tdt4250.wc.Match#getHomeTeam <em>Home Team</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Home Team</em>' containment reference.
	 * @see #getHomeTeam()
	 * @generated
	 */
	void setHomeTeam(TeamMatchDetails value);

	/**
	 * Returns the value of the '<em><b>Away Team</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Away Team</em>' containment reference.
	 * @see #setAwayTeam(TeamMatchDetails)
	 * @see tdt4250.wc.WcPackage#getMatch_AwayTeam()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TeamMatchDetails getAwayTeam();

	/**
	 * Sets the value of the '{@link tdt4250.wc.Match#getAwayTeam <em>Away Team</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Away Team</em>' containment reference.
	 * @see #getAwayTeam()
	 * @generated
	 */
	void setAwayTeam(TeamMatchDetails value);

	/**
	 * Returns the value of the '<em><b>Arena</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arena</em>' reference.
	 * @see #setArena(Arena)
	 * @see tdt4250.wc.WcPackage#getMatch_Arena()
	 * @model required="true"
	 * @generated
	 */
	Arena getArena();

	/**
	 * Sets the value of the '{@link tdt4250.wc.Match#getArena <em>Arena</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arena</em>' reference.
	 * @see #getArena()
	 * @generated
	 */
	void setArena(Arena value);

	/**
	 * Returns the value of the '<em><b>Weather</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weather</em>' reference.
	 * @see #setWeather(Weather)
	 * @see tdt4250.wc.WcPackage#getMatch_Weather()
	 * @model
	 * @generated
	 */
	Weather getWeather();

	/**
	 * Sets the value of the '{@link tdt4250.wc.Match#getWeather <em>Weather</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weather</em>' reference.
	 * @see #getWeather()
	 * @generated
	 */
	void setWeather(Weather value);

	/**
	 * Returns the value of the '<em><b>Datetime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datetime</em>' attribute.
	 * @see #setDatetime(String)
	 * @see tdt4250.wc.WcPackage#getMatch_Datetime()
	 * @model
	 * @generated
	 */
	String getDatetime();

	/**
	 * Sets the value of the '{@link tdt4250.wc.Match#getDatetime <em>Datetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datetime</em>' attribute.
	 * @see #getDatetime()
	 * @generated
	 */
	void setDatetime(String value);

} // Match
