/**
 */
package tdt4250.wc;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see tdt4250.wc.WcPackage
 * @generated
 */
public interface WcFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WcFactory eINSTANCE = tdt4250.wc.impl.WcFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Universe</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Universe</em>'.
	 * @generated
	 */
	Universe createUniverse();

	/**
	 * Returns a new object of class '<em>World Cup</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>World Cup</em>'.
	 * @generated
	 */
	WorldCup createWorldCup();

	/**
	 * Returns a new object of class '<em>Match</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Match</em>'.
	 * @generated
	 */
	Match createMatch();

	/**
	 * Returns a new object of class '<em>Team</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Team</em>'.
	 * @generated
	 */
	Team createTeam();

	/**
	 * Returns a new object of class '<em>Player</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Player</em>'.
	 * @generated
	 */
	Player createPlayer();

	/**
	 * Returns a new object of class '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event</em>'.
	 * @generated
	 */
	Event createEvent();

	/**
	 * Returns a new object of class '<em>Arena</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arena</em>'.
	 * @generated
	 */
	Arena createArena();

	/**
	 * Returns a new object of class '<em>Start Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Start Strategy</em>'.
	 * @generated
	 */
	StartStrategy createStartStrategy();

	/**
	 * Returns a new object of class '<em>Weather</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Weather</em>'.
	 * @generated
	 */
	Weather createWeather();

	/**
	 * Returns a new object of class '<em>Stage One Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stage One Group</em>'.
	 * @generated
	 */
	StageOneGroup createStageOneGroup();

	/**
	 * Returns a new object of class '<em>Team Match Details</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Team Match Details</em>'.
	 * @generated
	 */
	TeamMatchDetails createTeamMatchDetails();

	/**
	 * Returns a new object of class '<em>Team Match Statistics</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Team Match Statistics</em>'.
	 * @generated
	 */
	TeamMatchStatistics createTeamMatchStatistics();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	WcPackage getWcPackage();

} //WcFactory
