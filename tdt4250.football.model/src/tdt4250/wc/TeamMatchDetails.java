/**
 */
package tdt4250.wc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Team Match Details</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.wc.TeamMatchDetails#getTeam <em>Team</em>}</li>
 *   <li>{@link tdt4250.wc.TeamMatchDetails#getEvents <em>Events</em>}</li>
 *   <li>{@link tdt4250.wc.TeamMatchDetails#getTeamComposition <em>Team Composition</em>}</li>
 *   <li>{@link tdt4250.wc.TeamMatchDetails#isWinner <em>Winner</em>}</li>
 *   <li>{@link tdt4250.wc.TeamMatchDetails#getStatistics <em>Statistics</em>}</li>
 * </ul>
 *
 * @see tdt4250.wc.WcPackage#getTeamMatchDetails()
 * @model
 * @generated
 */
public interface TeamMatchDetails extends EObject {
	/**
	 * Returns the value of the '<em><b>Team</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Team</em>' reference.
	 * @see #setTeam(Team)
	 * @see tdt4250.wc.WcPackage#getTeamMatchDetails_Team()
	 * @model required="true"
	 * @generated
	 */
	Team getTeam();

	/**
	 * Sets the value of the '{@link tdt4250.wc.TeamMatchDetails#getTeam <em>Team</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Team</em>' reference.
	 * @see #getTeam()
	 * @generated
	 */
	void setTeam(Team value);

	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.wc.Event}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' containment reference list.
	 * @see tdt4250.wc.WcPackage#getTeamMatchDetails_Events()
	 * @model containment="true"
	 * @generated
	 */
	EList<Event> getEvents();

	/**
	 * Returns the value of the '<em><b>Team Composition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Team Composition</em>' containment reference.
	 * @see #setTeamComposition(StartStrategy)
	 * @see tdt4250.wc.WcPackage#getTeamMatchDetails_TeamComposition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	StartStrategy getTeamComposition();

	/**
	 * Sets the value of the '{@link tdt4250.wc.TeamMatchDetails#getTeamComposition <em>Team Composition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Team Composition</em>' containment reference.
	 * @see #getTeamComposition()
	 * @generated
	 */
	void setTeamComposition(StartStrategy value);

	/**
	 * Returns the value of the '<em><b>Winner</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Winner</em>' attribute.
	 * @see #setWinner(boolean)
	 * @see tdt4250.wc.WcPackage#getTeamMatchDetails_Winner()
	 * @model default="false"
	 * @generated
	 */
	boolean isWinner();

	/**
	 * Sets the value of the '{@link tdt4250.wc.TeamMatchDetails#isWinner <em>Winner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Winner</em>' attribute.
	 * @see #isWinner()
	 * @generated
	 */
	void setWinner(boolean value);

	/**
	 * Returns the value of the '<em><b>Statistics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statistics</em>' containment reference.
	 * @see #setStatistics(TeamMatchStatistics)
	 * @see tdt4250.wc.WcPackage#getTeamMatchDetails_Statistics()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TeamMatchStatistics getStatistics();

	/**
	 * Sets the value of the '{@link tdt4250.wc.TeamMatchDetails#getStatistics <em>Statistics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statistics</em>' containment reference.
	 * @see #getStatistics()
	 * @generated
	 */
	void setStatistics(TeamMatchStatistics value);

} // TeamMatchDetails
