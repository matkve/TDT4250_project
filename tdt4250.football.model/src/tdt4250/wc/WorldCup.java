/**
 */
package tdt4250.wc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>World Cup</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.wc.WorldCup#getStageOneGroups <em>Stage One Groups</em>}</li>
 *   <li>{@link tdt4250.wc.WorldCup#getRoundOf16 <em>Round Of16</em>}</li>
 *   <li>{@link tdt4250.wc.WorldCup#getQuarterFinals <em>Quarter Finals</em>}</li>
 *   <li>{@link tdt4250.wc.WorldCup#getSemiFinals <em>Semi Finals</em>}</li>
 *   <li>{@link tdt4250.wc.WorldCup#getThirdPlacePlayoff <em>Third Place Playoff</em>}</li>
 *   <li>{@link tdt4250.wc.WorldCup#getFinal <em>Final</em>}</li>
 *   <li>{@link tdt4250.wc.WorldCup#getYear <em>Year</em>}</li>
 *   <li>{@link tdt4250.wc.WorldCup#getTeams <em>Teams</em>}</li>
 *   <li>{@link tdt4250.wc.WorldCup#getArenas <em>Arenas</em>}</li>
 * </ul>
 *
 * @see tdt4250.wc.WcPackage#getWorldCup()
 * @model
 * @generated
 */
public interface WorldCup extends EObject {
	/**
	 * Returns the value of the '<em><b>Stage One Groups</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.wc.StageOneGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stage One Groups</em>' containment reference list.
	 * @see tdt4250.wc.WcPackage#getWorldCup_StageOneGroups()
	 * @model containment="true"
	 * @generated
	 */
	EList<StageOneGroup> getStageOneGroups();

	/**
	 * Returns the value of the '<em><b>Round Of16</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.wc.Match}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Round Of16</em>' containment reference list.
	 * @see tdt4250.wc.WcPackage#getWorldCup_RoundOf16()
	 * @model containment="true" lower="8" upper="8"
	 * @generated
	 */
	EList<Match> getRoundOf16();

	/**
	 * Returns the value of the '<em><b>Quarter Finals</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.wc.Match}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quarter Finals</em>' containment reference list.
	 * @see tdt4250.wc.WcPackage#getWorldCup_QuarterFinals()
	 * @model containment="true" lower="4" upper="4"
	 * @generated
	 */
	EList<Match> getQuarterFinals();

	/**
	 * Returns the value of the '<em><b>Semi Finals</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.wc.Match}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semi Finals</em>' containment reference list.
	 * @see tdt4250.wc.WcPackage#getWorldCup_SemiFinals()
	 * @model containment="true" lower="2" upper="2"
	 * @generated
	 */
	EList<Match> getSemiFinals();

	/**
	 * Returns the value of the '<em><b>Third Place Playoff</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Third Place Playoff</em>' containment reference.
	 * @see #setThirdPlacePlayoff(Match)
	 * @see tdt4250.wc.WcPackage#getWorldCup_ThirdPlacePlayoff()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Match getThirdPlacePlayoff();

	/**
	 * Sets the value of the '{@link tdt4250.wc.WorldCup#getThirdPlacePlayoff <em>Third Place Playoff</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Third Place Playoff</em>' containment reference.
	 * @see #getThirdPlacePlayoff()
	 * @generated
	 */
	void setThirdPlacePlayoff(Match value);

	/**
	 * Returns the value of the '<em><b>Final</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final</em>' containment reference.
	 * @see #setFinal(Match)
	 * @see tdt4250.wc.WcPackage#getWorldCup_Final()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Match getFinal();

	/**
	 * Sets the value of the '{@link tdt4250.wc.WorldCup#getFinal <em>Final</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final</em>' containment reference.
	 * @see #getFinal()
	 * @generated
	 */
	void setFinal(Match value);

	/**
	 * Returns the value of the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' attribute.
	 * @see #setYear(String)
	 * @see tdt4250.wc.WcPackage#getWorldCup_Year()
	 * @model
	 * @generated
	 */
	String getYear();

	/**
	 * Sets the value of the '{@link tdt4250.wc.WorldCup#getYear <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' attribute.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(String value);

	/**
	 * Returns the value of the '<em><b>Teams</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.wc.Team}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Teams</em>' containment reference list.
	 * @see tdt4250.wc.WcPackage#getWorldCup_Teams()
	 * @model containment="true"
	 * @generated
	 */
	EList<Team> getTeams();

	/**
	 * Returns the value of the '<em><b>Arenas</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.wc.Arena}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arenas</em>' containment reference list.
	 * @see tdt4250.wc.WcPackage#getWorldCup_Arenas()
	 * @model containment="true"
	 * @generated
	 */
	EList<Arena> getArenas();

} // WorldCup
