/**
 */
package tdt4250.wc;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see tdt4250.wc.WcFactory
 * @model kind="package"
 * @generated
 */
public interface WcPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "wc";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/tdt4250.football.model/model/footballWorldCups.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "wc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WcPackage eINSTANCE = tdt4250.wc.impl.WcPackageImpl.init();

	/**
	 * The meta object id for the '{@link tdt4250.wc.impl.UniverseImpl <em>Universe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.wc.impl.UniverseImpl
	 * @see tdt4250.wc.impl.WcPackageImpl#getUniverse()
	 * @generated
	 */
	int UNIVERSE = 0;

	/**
	 * The feature id for the '<em><b>World Cups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSE__WORLD_CUPS = 0;

	/**
	 * The number of structural features of the '<em>Universe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Universe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.wc.impl.WorldCupImpl <em>World Cup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.wc.impl.WorldCupImpl
	 * @see tdt4250.wc.impl.WcPackageImpl#getWorldCup()
	 * @generated
	 */
	int WORLD_CUP = 1;

	/**
	 * The feature id for the '<em><b>Stage One Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_CUP__STAGE_ONE_GROUPS = 0;

	/**
	 * The feature id for the '<em><b>Round Of16</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_CUP__ROUND_OF16 = 1;

	/**
	 * The feature id for the '<em><b>Quarter Finals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_CUP__QUARTER_FINALS = 2;

	/**
	 * The feature id for the '<em><b>Semi Finals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_CUP__SEMI_FINALS = 3;

	/**
	 * The feature id for the '<em><b>Third Place Playoff</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_CUP__THIRD_PLACE_PLAYOFF = 4;

	/**
	 * The feature id for the '<em><b>Final</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_CUP__FINAL = 5;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_CUP__YEAR = 6;

	/**
	 * The feature id for the '<em><b>Teams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_CUP__TEAMS = 7;

	/**
	 * The feature id for the '<em><b>Arenas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_CUP__ARENAS = 8;

	/**
	 * The number of structural features of the '<em>World Cup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_CUP_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>World Cup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_CUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.wc.impl.MatchImpl <em>Match</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.wc.impl.MatchImpl
	 * @see tdt4250.wc.impl.WcPackageImpl#getMatch()
	 * @generated
	 */
	int MATCH = 2;

	/**
	 * The feature id for the '<em><b>Home Team</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__HOME_TEAM = 0;

	/**
	 * The feature id for the '<em><b>Away Team</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__AWAY_TEAM = 1;

	/**
	 * The feature id for the '<em><b>Arena</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__ARENA = 2;

	/**
	 * The feature id for the '<em><b>Weather</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__WEATHER = 3;

	/**
	 * The feature id for the '<em><b>Datetime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__DATETIME = 4;

	/**
	 * The number of structural features of the '<em>Match</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Match</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.wc.impl.TeamImpl <em>Team</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.wc.impl.TeamImpl
	 * @see tdt4250.wc.impl.WcPackageImpl#getTeam()
	 * @generated
	 */
	int TEAM = 3;

	/**
	 * The feature id for the '<em><b>Players</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__PLAYERS = 0;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__COUNTRY = 1;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__CODE = 2;

	/**
	 * The number of structural features of the '<em>Team</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Team</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.wc.impl.PlayerImpl <em>Player</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.wc.impl.PlayerImpl
	 * @see tdt4250.wc.impl.WcPackageImpl#getPlayer()
	 * @generated
	 */
	int PLAYER = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Shirt Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__SHIRT_NUMBER = 1;

	/**
	 * The number of structural features of the '<em>Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.wc.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.wc.impl.EventImpl
	 * @see tdt4250.wc.impl.WcPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 5;

	/**
	 * The feature id for the '<em><b>Player</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__PLAYER = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__TIME = 2;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.wc.impl.ArenaImpl <em>Arena</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.wc.impl.ArenaImpl
	 * @see tdt4250.wc.impl.WcPackageImpl#getArena()
	 * @generated
	 */
	int ARENA = 6;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARENA__CITY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARENA__NAME = 1;

	/**
	 * The feature id for the '<em><b>Weather History</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARENA__WEATHER_HISTORY = 2;

	/**
	 * The number of structural features of the '<em>Arena</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARENA_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Arena</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARENA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.wc.impl.StartStrategyImpl <em>Start Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.wc.impl.StartStrategyImpl
	 * @see tdt4250.wc.impl.WcPackageImpl#getStartStrategy()
	 * @generated
	 */
	int START_STRATEGY = 7;

	/**
	 * The feature id for the '<em><b>Goalie</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_STRATEGY__GOALIE = 0;

	/**
	 * The feature id for the '<em><b>Defender</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_STRATEGY__DEFENDER = 1;

	/**
	 * The feature id for the '<em><b>Midfield</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_STRATEGY__MIDFIELD = 2;

	/**
	 * The feature id for the '<em><b>Forward</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_STRATEGY__FORWARD = 3;

	/**
	 * The feature id for the '<em><b>Captain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_STRATEGY__CAPTAIN = 4;

	/**
	 * The feature id for the '<em><b>Substitutes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_STRATEGY__SUBSTITUTES = 5;

	/**
	 * The number of structural features of the '<em>Start Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_STRATEGY_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Start Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_STRATEGY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.wc.impl.WeatherImpl <em>Weather</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.wc.impl.WeatherImpl
	 * @see tdt4250.wc.impl.WcPackageImpl#getWeather()
	 * @generated
	 */
	int WEATHER = 8;

	/**
	 * The feature id for the '<em><b>Humidity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER__HUMIDITY = 0;

	/**
	 * The feature id for the '<em><b>Temp Celcius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER__TEMP_CELCIUS = 1;

	/**
	 * The feature id for the '<em><b>Temp Farenheit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER__TEMP_FARENHEIT = 2;

	/**
	 * The feature id for the '<em><b>Wind Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER__WIND_SPEED = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER__DESCRIPTION = 4;

	/**
	 * The number of structural features of the '<em>Weather</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Weather</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.wc.impl.StageOneGroupImpl <em>Stage One Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.wc.impl.StageOneGroupImpl
	 * @see tdt4250.wc.impl.WcPackageImpl#getStageOneGroup()
	 * @generated
	 */
	int STAGE_ONE_GROUP = 9;

	/**
	 * The feature id for the '<em><b>Match</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE_ONE_GROUP__MATCH = 0;

	/**
	 * The feature id for the '<em><b>Group Letter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE_ONE_GROUP__GROUP_LETTER = 1;

	/**
	 * The number of structural features of the '<em>Stage One Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE_ONE_GROUP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Stage One Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE_ONE_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.wc.impl.TeamMatchDetailsImpl <em>Team Match Details</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.wc.impl.TeamMatchDetailsImpl
	 * @see tdt4250.wc.impl.WcPackageImpl#getTeamMatchDetails()
	 * @generated
	 */
	int TEAM_MATCH_DETAILS = 10;

	/**
	 * The feature id for the '<em><b>Team</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_MATCH_DETAILS__TEAM = 0;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_MATCH_DETAILS__EVENTS = 1;

	/**
	 * The feature id for the '<em><b>Team Composition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_MATCH_DETAILS__TEAM_COMPOSITION = 2;

	/**
	 * The feature id for the '<em><b>Winner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_MATCH_DETAILS__WINNER = 3;

	/**
	 * The feature id for the '<em><b>Statistics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_MATCH_DETAILS__STATISTICS = 4;

	/**
	 * The number of structural features of the '<em>Team Match Details</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_MATCH_DETAILS_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Team Match Details</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_MATCH_DETAILS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.wc.impl.TeamMatchStatisticsImpl <em>Team Match Statistics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.wc.impl.TeamMatchStatisticsImpl
	 * @see tdt4250.wc.impl.WcPackageImpl#getTeamMatchStatistics()
	 * @generated
	 */
	int TEAM_MATCH_STATISTICS = 11;

	/**
	 * The feature id for the '<em><b>Goals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_MATCH_STATISTICS__GOALS = 0;

	/**
	 * The feature id for the '<em><b>Penalties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_MATCH_STATISTICS__PENALTIES = 1;

	/**
	 * The feature id for the '<em><b>Attempts On Goal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_MATCH_STATISTICS__ATTEMPTS_ON_GOAL = 2;

	/**
	 * The feature id for the '<em><b>On Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_MATCH_STATISTICS__ON_TARGET = 3;

	/**
	 * The feature id for the '<em><b>Off Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_MATCH_STATISTICS__OFF_TARGET = 4;

	/**
	 * The feature id for the '<em><b>Blocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_MATCH_STATISTICS__BLOCKED = 5;

	/**
	 * The feature id for the '<em><b>Woodwork</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_MATCH_STATISTICS__WOODWORK = 6;

	/**
	 * The feature id for the '<em><b>Corners</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_MATCH_STATISTICS__CORNERS = 7;

	/**
	 * The feature id for the '<em><b>Offsides</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_MATCH_STATISTICS__OFFSIDES = 8;

	/**
	 * The feature id for the '<em><b>Ball Possession</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_MATCH_STATISTICS__BALL_POSSESSION = 9;

	/**
	 * The feature id for the '<em><b>Pass Accuracy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_MATCH_STATISTICS__PASS_ACCURACY = 10;

	/**
	 * The feature id for the '<em><b>Num Passes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_MATCH_STATISTICS__NUM_PASSES = 11;

	/**
	 * The feature id for the '<em><b>Passes Completed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_MATCH_STATISTICS__PASSES_COMPLETED = 12;

	/**
	 * The feature id for the '<em><b>Distance Covered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_MATCH_STATISTICS__DISTANCE_COVERED = 13;

	/**
	 * The feature id for the '<em><b>Balls Recovered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_MATCH_STATISTICS__BALLS_RECOVERED = 14;

	/**
	 * The feature id for the '<em><b>Tackles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_MATCH_STATISTICS__TACKLES = 15;

	/**
	 * The feature id for the '<em><b>Clearances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_MATCH_STATISTICS__CLEARANCES = 16;

	/**
	 * The feature id for the '<em><b>Yellow Cards</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_MATCH_STATISTICS__YELLOW_CARDS = 17;

	/**
	 * The feature id for the '<em><b>Red Cards</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_MATCH_STATISTICS__RED_CARDS = 18;

	/**
	 * The feature id for the '<em><b>Fouls Committed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_MATCH_STATISTICS__FOULS_COMMITTED = 19;

	/**
	 * The number of structural features of the '<em>Team Match Statistics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_MATCH_STATISTICS_FEATURE_COUNT = 20;

	/**
	 * The number of operations of the '<em>Team Match Statistics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_MATCH_STATISTICS_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link tdt4250.wc.Universe <em>Universe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Universe</em>'.
	 * @see tdt4250.wc.Universe
	 * @generated
	 */
	EClass getUniverse();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250.wc.Universe#getWorldCups <em>World Cups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>World Cups</em>'.
	 * @see tdt4250.wc.Universe#getWorldCups()
	 * @see #getUniverse()
	 * @generated
	 */
	EReference getUniverse_WorldCups();

	/**
	 * Returns the meta object for class '{@link tdt4250.wc.WorldCup <em>World Cup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>World Cup</em>'.
	 * @see tdt4250.wc.WorldCup
	 * @generated
	 */
	EClass getWorldCup();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250.wc.WorldCup#getStageOneGroups <em>Stage One Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stage One Groups</em>'.
	 * @see tdt4250.wc.WorldCup#getStageOneGroups()
	 * @see #getWorldCup()
	 * @generated
	 */
	EReference getWorldCup_StageOneGroups();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250.wc.WorldCup#getRoundOf16 <em>Round Of16</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Round Of16</em>'.
	 * @see tdt4250.wc.WorldCup#getRoundOf16()
	 * @see #getWorldCup()
	 * @generated
	 */
	EReference getWorldCup_RoundOf16();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250.wc.WorldCup#getQuarterFinals <em>Quarter Finals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Quarter Finals</em>'.
	 * @see tdt4250.wc.WorldCup#getQuarterFinals()
	 * @see #getWorldCup()
	 * @generated
	 */
	EReference getWorldCup_QuarterFinals();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250.wc.WorldCup#getSemiFinals <em>Semi Finals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Semi Finals</em>'.
	 * @see tdt4250.wc.WorldCup#getSemiFinals()
	 * @see #getWorldCup()
	 * @generated
	 */
	EReference getWorldCup_SemiFinals();

	/**
	 * Returns the meta object for the containment reference '{@link tdt4250.wc.WorldCup#getThirdPlacePlayoff <em>Third Place Playoff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Third Place Playoff</em>'.
	 * @see tdt4250.wc.WorldCup#getThirdPlacePlayoff()
	 * @see #getWorldCup()
	 * @generated
	 */
	EReference getWorldCup_ThirdPlacePlayoff();

	/**
	 * Returns the meta object for the containment reference '{@link tdt4250.wc.WorldCup#getFinal <em>Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Final</em>'.
	 * @see tdt4250.wc.WorldCup#getFinal()
	 * @see #getWorldCup()
	 * @generated
	 */
	EReference getWorldCup_Final();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.wc.WorldCup#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see tdt4250.wc.WorldCup#getYear()
	 * @see #getWorldCup()
	 * @generated
	 */
	EAttribute getWorldCup_Year();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250.wc.WorldCup#getTeams <em>Teams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Teams</em>'.
	 * @see tdt4250.wc.WorldCup#getTeams()
	 * @see #getWorldCup()
	 * @generated
	 */
	EReference getWorldCup_Teams();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250.wc.WorldCup#getArenas <em>Arenas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arenas</em>'.
	 * @see tdt4250.wc.WorldCup#getArenas()
	 * @see #getWorldCup()
	 * @generated
	 */
	EReference getWorldCup_Arenas();

	/**
	 * Returns the meta object for class '{@link tdt4250.wc.Match <em>Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Match</em>'.
	 * @see tdt4250.wc.Match
	 * @generated
	 */
	EClass getMatch();

	/**
	 * Returns the meta object for the containment reference '{@link tdt4250.wc.Match#getHomeTeam <em>Home Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Home Team</em>'.
	 * @see tdt4250.wc.Match#getHomeTeam()
	 * @see #getMatch()
	 * @generated
	 */
	EReference getMatch_HomeTeam();

	/**
	 * Returns the meta object for the containment reference '{@link tdt4250.wc.Match#getAwayTeam <em>Away Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Away Team</em>'.
	 * @see tdt4250.wc.Match#getAwayTeam()
	 * @see #getMatch()
	 * @generated
	 */
	EReference getMatch_AwayTeam();

	/**
	 * Returns the meta object for the reference '{@link tdt4250.wc.Match#getArena <em>Arena</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Arena</em>'.
	 * @see tdt4250.wc.Match#getArena()
	 * @see #getMatch()
	 * @generated
	 */
	EReference getMatch_Arena();

	/**
	 * Returns the meta object for the reference '{@link tdt4250.wc.Match#getWeather <em>Weather</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Weather</em>'.
	 * @see tdt4250.wc.Match#getWeather()
	 * @see #getMatch()
	 * @generated
	 */
	EReference getMatch_Weather();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.wc.Match#getDatetime <em>Datetime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datetime</em>'.
	 * @see tdt4250.wc.Match#getDatetime()
	 * @see #getMatch()
	 * @generated
	 */
	EAttribute getMatch_Datetime();

	/**
	 * Returns the meta object for class '{@link tdt4250.wc.Team <em>Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Team</em>'.
	 * @see tdt4250.wc.Team
	 * @generated
	 */
	EClass getTeam();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250.wc.Team#getPlayers <em>Players</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Players</em>'.
	 * @see tdt4250.wc.Team#getPlayers()
	 * @see #getTeam()
	 * @generated
	 */
	EReference getTeam_Players();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.wc.Team#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see tdt4250.wc.Team#getCountry()
	 * @see #getTeam()
	 * @generated
	 */
	EAttribute getTeam_Country();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.wc.Team#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see tdt4250.wc.Team#getCode()
	 * @see #getTeam()
	 * @generated
	 */
	EAttribute getTeam_Code();

	/**
	 * Returns the meta object for class '{@link tdt4250.wc.Player <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Player</em>'.
	 * @see tdt4250.wc.Player
	 * @generated
	 */
	EClass getPlayer();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.wc.Player#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tdt4250.wc.Player#getName()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Name();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.wc.Player#getShirtNumber <em>Shirt Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shirt Number</em>'.
	 * @see tdt4250.wc.Player#getShirtNumber()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_ShirtNumber();

	/**
	 * Returns the meta object for class '{@link tdt4250.wc.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see tdt4250.wc.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the reference '{@link tdt4250.wc.Event#getPlayer <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Player</em>'.
	 * @see tdt4250.wc.Event#getPlayer()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_Player();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.wc.Event#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see tdt4250.wc.Event#getDescription()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Description();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.wc.Event#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see tdt4250.wc.Event#getTime()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Time();

	/**
	 * Returns the meta object for class '{@link tdt4250.wc.Arena <em>Arena</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arena</em>'.
	 * @see tdt4250.wc.Arena
	 * @generated
	 */
	EClass getArena();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.wc.Arena#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see tdt4250.wc.Arena#getCity()
	 * @see #getArena()
	 * @generated
	 */
	EAttribute getArena_City();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.wc.Arena#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tdt4250.wc.Arena#getName()
	 * @see #getArena()
	 * @generated
	 */
	EAttribute getArena_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250.wc.Arena#getWeatherHistory <em>Weather History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Weather History</em>'.
	 * @see tdt4250.wc.Arena#getWeatherHistory()
	 * @see #getArena()
	 * @generated
	 */
	EReference getArena_WeatherHistory();

	/**
	 * Returns the meta object for class '{@link tdt4250.wc.StartStrategy <em>Start Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Strategy</em>'.
	 * @see tdt4250.wc.StartStrategy
	 * @generated
	 */
	EClass getStartStrategy();

	/**
	 * Returns the meta object for the reference '{@link tdt4250.wc.StartStrategy#getGoalie <em>Goalie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Goalie</em>'.
	 * @see tdt4250.wc.StartStrategy#getGoalie()
	 * @see #getStartStrategy()
	 * @generated
	 */
	EReference getStartStrategy_Goalie();

	/**
	 * Returns the meta object for the reference list '{@link tdt4250.wc.StartStrategy#getDefender <em>Defender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Defender</em>'.
	 * @see tdt4250.wc.StartStrategy#getDefender()
	 * @see #getStartStrategy()
	 * @generated
	 */
	EReference getStartStrategy_Defender();

	/**
	 * Returns the meta object for the reference list '{@link tdt4250.wc.StartStrategy#getMidfield <em>Midfield</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Midfield</em>'.
	 * @see tdt4250.wc.StartStrategy#getMidfield()
	 * @see #getStartStrategy()
	 * @generated
	 */
	EReference getStartStrategy_Midfield();

	/**
	 * Returns the meta object for the reference list '{@link tdt4250.wc.StartStrategy#getForward <em>Forward</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Forward</em>'.
	 * @see tdt4250.wc.StartStrategy#getForward()
	 * @see #getStartStrategy()
	 * @generated
	 */
	EReference getStartStrategy_Forward();

	/**
	 * Returns the meta object for the reference '{@link tdt4250.wc.StartStrategy#getCaptain <em>Captain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Captain</em>'.
	 * @see tdt4250.wc.StartStrategy#getCaptain()
	 * @see #getStartStrategy()
	 * @generated
	 */
	EReference getStartStrategy_Captain();

	/**
	 * Returns the meta object for the reference list '{@link tdt4250.wc.StartStrategy#getSubstitutes <em>Substitutes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Substitutes</em>'.
	 * @see tdt4250.wc.StartStrategy#getSubstitutes()
	 * @see #getStartStrategy()
	 * @generated
	 */
	EReference getStartStrategy_Substitutes();

	/**
	 * Returns the meta object for class '{@link tdt4250.wc.Weather <em>Weather</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Weather</em>'.
	 * @see tdt4250.wc.Weather
	 * @generated
	 */
	EClass getWeather();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.wc.Weather#getHumidity <em>Humidity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Humidity</em>'.
	 * @see tdt4250.wc.Weather#getHumidity()
	 * @see #getWeather()
	 * @generated
	 */
	EAttribute getWeather_Humidity();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.wc.Weather#getTempCelcius <em>Temp Celcius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temp Celcius</em>'.
	 * @see tdt4250.wc.Weather#getTempCelcius()
	 * @see #getWeather()
	 * @generated
	 */
	EAttribute getWeather_TempCelcius();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.wc.Weather#getTempFarenheit <em>Temp Farenheit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temp Farenheit</em>'.
	 * @see tdt4250.wc.Weather#getTempFarenheit()
	 * @see #getWeather()
	 * @generated
	 */
	EAttribute getWeather_TempFarenheit();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.wc.Weather#getWindSpeed <em>Wind Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wind Speed</em>'.
	 * @see tdt4250.wc.Weather#getWindSpeed()
	 * @see #getWeather()
	 * @generated
	 */
	EAttribute getWeather_WindSpeed();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.wc.Weather#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see tdt4250.wc.Weather#getDescription()
	 * @see #getWeather()
	 * @generated
	 */
	EAttribute getWeather_Description();

	/**
	 * Returns the meta object for class '{@link tdt4250.wc.StageOneGroup <em>Stage One Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stage One Group</em>'.
	 * @see tdt4250.wc.StageOneGroup
	 * @generated
	 */
	EClass getStageOneGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250.wc.StageOneGroup#getMatch <em>Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Match</em>'.
	 * @see tdt4250.wc.StageOneGroup#getMatch()
	 * @see #getStageOneGroup()
	 * @generated
	 */
	EReference getStageOneGroup_Match();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.wc.StageOneGroup#getGroupLetter <em>Group Letter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Letter</em>'.
	 * @see tdt4250.wc.StageOneGroup#getGroupLetter()
	 * @see #getStageOneGroup()
	 * @generated
	 */
	EAttribute getStageOneGroup_GroupLetter();

	/**
	 * Returns the meta object for class '{@link tdt4250.wc.TeamMatchDetails <em>Team Match Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Team Match Details</em>'.
	 * @see tdt4250.wc.TeamMatchDetails
	 * @generated
	 */
	EClass getTeamMatchDetails();

	/**
	 * Returns the meta object for the reference '{@link tdt4250.wc.TeamMatchDetails#getTeam <em>Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Team</em>'.
	 * @see tdt4250.wc.TeamMatchDetails#getTeam()
	 * @see #getTeamMatchDetails()
	 * @generated
	 */
	EReference getTeamMatchDetails_Team();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250.wc.TeamMatchDetails#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see tdt4250.wc.TeamMatchDetails#getEvents()
	 * @see #getTeamMatchDetails()
	 * @generated
	 */
	EReference getTeamMatchDetails_Events();

	/**
	 * Returns the meta object for the containment reference '{@link tdt4250.wc.TeamMatchDetails#getTeamComposition <em>Team Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Team Composition</em>'.
	 * @see tdt4250.wc.TeamMatchDetails#getTeamComposition()
	 * @see #getTeamMatchDetails()
	 * @generated
	 */
	EReference getTeamMatchDetails_TeamComposition();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.wc.TeamMatchDetails#isWinner <em>Winner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Winner</em>'.
	 * @see tdt4250.wc.TeamMatchDetails#isWinner()
	 * @see #getTeamMatchDetails()
	 * @generated
	 */
	EAttribute getTeamMatchDetails_Winner();

	/**
	 * Returns the meta object for the containment reference '{@link tdt4250.wc.TeamMatchDetails#getStatistics <em>Statistics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Statistics</em>'.
	 * @see tdt4250.wc.TeamMatchDetails#getStatistics()
	 * @see #getTeamMatchDetails()
	 * @generated
	 */
	EReference getTeamMatchDetails_Statistics();

	/**
	 * Returns the meta object for class '{@link tdt4250.wc.TeamMatchStatistics <em>Team Match Statistics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Team Match Statistics</em>'.
	 * @see tdt4250.wc.TeamMatchStatistics
	 * @generated
	 */
	EClass getTeamMatchStatistics();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.wc.TeamMatchStatistics#getGoals <em>Goals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Goals</em>'.
	 * @see tdt4250.wc.TeamMatchStatistics#getGoals()
	 * @see #getTeamMatchStatistics()
	 * @generated
	 */
	EAttribute getTeamMatchStatistics_Goals();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.wc.TeamMatchStatistics#getPenalties <em>Penalties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Penalties</em>'.
	 * @see tdt4250.wc.TeamMatchStatistics#getPenalties()
	 * @see #getTeamMatchStatistics()
	 * @generated
	 */
	EAttribute getTeamMatchStatistics_Penalties();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.wc.TeamMatchStatistics#getAttemptsOnGoal <em>Attempts On Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attempts On Goal</em>'.
	 * @see tdt4250.wc.TeamMatchStatistics#getAttemptsOnGoal()
	 * @see #getTeamMatchStatistics()
	 * @generated
	 */
	EAttribute getTeamMatchStatistics_AttemptsOnGoal();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.wc.TeamMatchStatistics#getOnTarget <em>On Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Target</em>'.
	 * @see tdt4250.wc.TeamMatchStatistics#getOnTarget()
	 * @see #getTeamMatchStatistics()
	 * @generated
	 */
	EAttribute getTeamMatchStatistics_OnTarget();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.wc.TeamMatchStatistics#getOffTarget <em>Off Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Off Target</em>'.
	 * @see tdt4250.wc.TeamMatchStatistics#getOffTarget()
	 * @see #getTeamMatchStatistics()
	 * @generated
	 */
	EAttribute getTeamMatchStatistics_OffTarget();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.wc.TeamMatchStatistics#getBlocked <em>Blocked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blocked</em>'.
	 * @see tdt4250.wc.TeamMatchStatistics#getBlocked()
	 * @see #getTeamMatchStatistics()
	 * @generated
	 */
	EAttribute getTeamMatchStatistics_Blocked();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.wc.TeamMatchStatistics#getWoodwork <em>Woodwork</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Woodwork</em>'.
	 * @see tdt4250.wc.TeamMatchStatistics#getWoodwork()
	 * @see #getTeamMatchStatistics()
	 * @generated
	 */
	EAttribute getTeamMatchStatistics_Woodwork();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.wc.TeamMatchStatistics#getCorners <em>Corners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Corners</em>'.
	 * @see tdt4250.wc.TeamMatchStatistics#getCorners()
	 * @see #getTeamMatchStatistics()
	 * @generated
	 */
	EAttribute getTeamMatchStatistics_Corners();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.wc.TeamMatchStatistics#getOffsides <em>Offsides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offsides</em>'.
	 * @see tdt4250.wc.TeamMatchStatistics#getOffsides()
	 * @see #getTeamMatchStatistics()
	 * @generated
	 */
	EAttribute getTeamMatchStatistics_Offsides();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.wc.TeamMatchStatistics#getBallPossession <em>Ball Possession</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ball Possession</em>'.
	 * @see tdt4250.wc.TeamMatchStatistics#getBallPossession()
	 * @see #getTeamMatchStatistics()
	 * @generated
	 */
	EAttribute getTeamMatchStatistics_BallPossession();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.wc.TeamMatchStatistics#getPassAccuracy <em>Pass Accuracy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pass Accuracy</em>'.
	 * @see tdt4250.wc.TeamMatchStatistics#getPassAccuracy()
	 * @see #getTeamMatchStatistics()
	 * @generated
	 */
	EAttribute getTeamMatchStatistics_PassAccuracy();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.wc.TeamMatchStatistics#getNumPasses <em>Num Passes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Passes</em>'.
	 * @see tdt4250.wc.TeamMatchStatistics#getNumPasses()
	 * @see #getTeamMatchStatistics()
	 * @generated
	 */
	EAttribute getTeamMatchStatistics_NumPasses();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.wc.TeamMatchStatistics#getPassesCompleted <em>Passes Completed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passes Completed</em>'.
	 * @see tdt4250.wc.TeamMatchStatistics#getPassesCompleted()
	 * @see #getTeamMatchStatistics()
	 * @generated
	 */
	EAttribute getTeamMatchStatistics_PassesCompleted();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.wc.TeamMatchStatistics#getDistanceCovered <em>Distance Covered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance Covered</em>'.
	 * @see tdt4250.wc.TeamMatchStatistics#getDistanceCovered()
	 * @see #getTeamMatchStatistics()
	 * @generated
	 */
	EAttribute getTeamMatchStatistics_DistanceCovered();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.wc.TeamMatchStatistics#getBallsRecovered <em>Balls Recovered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Balls Recovered</em>'.
	 * @see tdt4250.wc.TeamMatchStatistics#getBallsRecovered()
	 * @see #getTeamMatchStatistics()
	 * @generated
	 */
	EAttribute getTeamMatchStatistics_BallsRecovered();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.wc.TeamMatchStatistics#getTackles <em>Tackles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tackles</em>'.
	 * @see tdt4250.wc.TeamMatchStatistics#getTackles()
	 * @see #getTeamMatchStatistics()
	 * @generated
	 */
	EAttribute getTeamMatchStatistics_Tackles();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.wc.TeamMatchStatistics#getClearances <em>Clearances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clearances</em>'.
	 * @see tdt4250.wc.TeamMatchStatistics#getClearances()
	 * @see #getTeamMatchStatistics()
	 * @generated
	 */
	EAttribute getTeamMatchStatistics_Clearances();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.wc.TeamMatchStatistics#getYellowCards <em>Yellow Cards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Yellow Cards</em>'.
	 * @see tdt4250.wc.TeamMatchStatistics#getYellowCards()
	 * @see #getTeamMatchStatistics()
	 * @generated
	 */
	EAttribute getTeamMatchStatistics_YellowCards();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.wc.TeamMatchStatistics#getRedCards <em>Red Cards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Red Cards</em>'.
	 * @see tdt4250.wc.TeamMatchStatistics#getRedCards()
	 * @see #getTeamMatchStatistics()
	 * @generated
	 */
	EAttribute getTeamMatchStatistics_RedCards();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.wc.TeamMatchStatistics#getFoulsCommitted <em>Fouls Committed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fouls Committed</em>'.
	 * @see tdt4250.wc.TeamMatchStatistics#getFoulsCommitted()
	 * @see #getTeamMatchStatistics()
	 * @generated
	 */
	EAttribute getTeamMatchStatistics_FoulsCommitted();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WcFactory getWcFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link tdt4250.wc.impl.UniverseImpl <em>Universe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.wc.impl.UniverseImpl
		 * @see tdt4250.wc.impl.WcPackageImpl#getUniverse()
		 * @generated
		 */
		EClass UNIVERSE = eINSTANCE.getUniverse();

		/**
		 * The meta object literal for the '<em><b>World Cups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERSE__WORLD_CUPS = eINSTANCE.getUniverse_WorldCups();

		/**
		 * The meta object literal for the '{@link tdt4250.wc.impl.WorldCupImpl <em>World Cup</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.wc.impl.WorldCupImpl
		 * @see tdt4250.wc.impl.WcPackageImpl#getWorldCup()
		 * @generated
		 */
		EClass WORLD_CUP = eINSTANCE.getWorldCup();

		/**
		 * The meta object literal for the '<em><b>Stage One Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORLD_CUP__STAGE_ONE_GROUPS = eINSTANCE.getWorldCup_StageOneGroups();

		/**
		 * The meta object literal for the '<em><b>Round Of16</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORLD_CUP__ROUND_OF16 = eINSTANCE.getWorldCup_RoundOf16();

		/**
		 * The meta object literal for the '<em><b>Quarter Finals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORLD_CUP__QUARTER_FINALS = eINSTANCE.getWorldCup_QuarterFinals();

		/**
		 * The meta object literal for the '<em><b>Semi Finals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORLD_CUP__SEMI_FINALS = eINSTANCE.getWorldCup_SemiFinals();

		/**
		 * The meta object literal for the '<em><b>Third Place Playoff</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORLD_CUP__THIRD_PLACE_PLAYOFF = eINSTANCE.getWorldCup_ThirdPlacePlayoff();

		/**
		 * The meta object literal for the '<em><b>Final</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORLD_CUP__FINAL = eINSTANCE.getWorldCup_Final();

		/**
		 * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORLD_CUP__YEAR = eINSTANCE.getWorldCup_Year();

		/**
		 * The meta object literal for the '<em><b>Teams</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORLD_CUP__TEAMS = eINSTANCE.getWorldCup_Teams();

		/**
		 * The meta object literal for the '<em><b>Arenas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORLD_CUP__ARENAS = eINSTANCE.getWorldCup_Arenas();

		/**
		 * The meta object literal for the '{@link tdt4250.wc.impl.MatchImpl <em>Match</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.wc.impl.MatchImpl
		 * @see tdt4250.wc.impl.WcPackageImpl#getMatch()
		 * @generated
		 */
		EClass MATCH = eINSTANCE.getMatch();

		/**
		 * The meta object literal for the '<em><b>Home Team</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH__HOME_TEAM = eINSTANCE.getMatch_HomeTeam();

		/**
		 * The meta object literal for the '<em><b>Away Team</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH__AWAY_TEAM = eINSTANCE.getMatch_AwayTeam();

		/**
		 * The meta object literal for the '<em><b>Arena</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH__ARENA = eINSTANCE.getMatch_Arena();

		/**
		 * The meta object literal for the '<em><b>Weather</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH__WEATHER = eINSTANCE.getMatch_Weather();

		/**
		 * The meta object literal for the '<em><b>Datetime</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH__DATETIME = eINSTANCE.getMatch_Datetime();

		/**
		 * The meta object literal for the '{@link tdt4250.wc.impl.TeamImpl <em>Team</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.wc.impl.TeamImpl
		 * @see tdt4250.wc.impl.WcPackageImpl#getTeam()
		 * @generated
		 */
		EClass TEAM = eINSTANCE.getTeam();

		/**
		 * The meta object literal for the '<em><b>Players</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM__PLAYERS = eINSTANCE.getTeam_Players();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM__COUNTRY = eINSTANCE.getTeam_Country();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM__CODE = eINSTANCE.getTeam_Code();

		/**
		 * The meta object literal for the '{@link tdt4250.wc.impl.PlayerImpl <em>Player</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.wc.impl.PlayerImpl
		 * @see tdt4250.wc.impl.WcPackageImpl#getPlayer()
		 * @generated
		 */
		EClass PLAYER = eINSTANCE.getPlayer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__NAME = eINSTANCE.getPlayer_Name();

		/**
		 * The meta object literal for the '<em><b>Shirt Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__SHIRT_NUMBER = eINSTANCE.getPlayer_ShirtNumber();

		/**
		 * The meta object literal for the '{@link tdt4250.wc.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.wc.impl.EventImpl
		 * @see tdt4250.wc.impl.WcPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Player</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__PLAYER = eINSTANCE.getEvent_Player();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__DESCRIPTION = eINSTANCE.getEvent_Description();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__TIME = eINSTANCE.getEvent_Time();

		/**
		 * The meta object literal for the '{@link tdt4250.wc.impl.ArenaImpl <em>Arena</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.wc.impl.ArenaImpl
		 * @see tdt4250.wc.impl.WcPackageImpl#getArena()
		 * @generated
		 */
		EClass ARENA = eINSTANCE.getArena();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARENA__CITY = eINSTANCE.getArena_City();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARENA__NAME = eINSTANCE.getArena_Name();

		/**
		 * The meta object literal for the '<em><b>Weather History</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARENA__WEATHER_HISTORY = eINSTANCE.getArena_WeatherHistory();

		/**
		 * The meta object literal for the '{@link tdt4250.wc.impl.StartStrategyImpl <em>Start Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.wc.impl.StartStrategyImpl
		 * @see tdt4250.wc.impl.WcPackageImpl#getStartStrategy()
		 * @generated
		 */
		EClass START_STRATEGY = eINSTANCE.getStartStrategy();

		/**
		 * The meta object literal for the '<em><b>Goalie</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference START_STRATEGY__GOALIE = eINSTANCE.getStartStrategy_Goalie();

		/**
		 * The meta object literal for the '<em><b>Defender</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference START_STRATEGY__DEFENDER = eINSTANCE.getStartStrategy_Defender();

		/**
		 * The meta object literal for the '<em><b>Midfield</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference START_STRATEGY__MIDFIELD = eINSTANCE.getStartStrategy_Midfield();

		/**
		 * The meta object literal for the '<em><b>Forward</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference START_STRATEGY__FORWARD = eINSTANCE.getStartStrategy_Forward();

		/**
		 * The meta object literal for the '<em><b>Captain</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference START_STRATEGY__CAPTAIN = eINSTANCE.getStartStrategy_Captain();

		/**
		 * The meta object literal for the '<em><b>Substitutes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference START_STRATEGY__SUBSTITUTES = eINSTANCE.getStartStrategy_Substitutes();

		/**
		 * The meta object literal for the '{@link tdt4250.wc.impl.WeatherImpl <em>Weather</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.wc.impl.WeatherImpl
		 * @see tdt4250.wc.impl.WcPackageImpl#getWeather()
		 * @generated
		 */
		EClass WEATHER = eINSTANCE.getWeather();

		/**
		 * The meta object literal for the '<em><b>Humidity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEATHER__HUMIDITY = eINSTANCE.getWeather_Humidity();

		/**
		 * The meta object literal for the '<em><b>Temp Celcius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEATHER__TEMP_CELCIUS = eINSTANCE.getWeather_TempCelcius();

		/**
		 * The meta object literal for the '<em><b>Temp Farenheit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEATHER__TEMP_FARENHEIT = eINSTANCE.getWeather_TempFarenheit();

		/**
		 * The meta object literal for the '<em><b>Wind Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEATHER__WIND_SPEED = eINSTANCE.getWeather_WindSpeed();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEATHER__DESCRIPTION = eINSTANCE.getWeather_Description();

		/**
		 * The meta object literal for the '{@link tdt4250.wc.impl.StageOneGroupImpl <em>Stage One Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.wc.impl.StageOneGroupImpl
		 * @see tdt4250.wc.impl.WcPackageImpl#getStageOneGroup()
		 * @generated
		 */
		EClass STAGE_ONE_GROUP = eINSTANCE.getStageOneGroup();

		/**
		 * The meta object literal for the '<em><b>Match</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAGE_ONE_GROUP__MATCH = eINSTANCE.getStageOneGroup_Match();

		/**
		 * The meta object literal for the '<em><b>Group Letter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAGE_ONE_GROUP__GROUP_LETTER = eINSTANCE.getStageOneGroup_GroupLetter();

		/**
		 * The meta object literal for the '{@link tdt4250.wc.impl.TeamMatchDetailsImpl <em>Team Match Details</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.wc.impl.TeamMatchDetailsImpl
		 * @see tdt4250.wc.impl.WcPackageImpl#getTeamMatchDetails()
		 * @generated
		 */
		EClass TEAM_MATCH_DETAILS = eINSTANCE.getTeamMatchDetails();

		/**
		 * The meta object literal for the '<em><b>Team</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM_MATCH_DETAILS__TEAM = eINSTANCE.getTeamMatchDetails_Team();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM_MATCH_DETAILS__EVENTS = eINSTANCE.getTeamMatchDetails_Events();

		/**
		 * The meta object literal for the '<em><b>Team Composition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM_MATCH_DETAILS__TEAM_COMPOSITION = eINSTANCE.getTeamMatchDetails_TeamComposition();

		/**
		 * The meta object literal for the '<em><b>Winner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM_MATCH_DETAILS__WINNER = eINSTANCE.getTeamMatchDetails_Winner();

		/**
		 * The meta object literal for the '<em><b>Statistics</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM_MATCH_DETAILS__STATISTICS = eINSTANCE.getTeamMatchDetails_Statistics();

		/**
		 * The meta object literal for the '{@link tdt4250.wc.impl.TeamMatchStatisticsImpl <em>Team Match Statistics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.wc.impl.TeamMatchStatisticsImpl
		 * @see tdt4250.wc.impl.WcPackageImpl#getTeamMatchStatistics()
		 * @generated
		 */
		EClass TEAM_MATCH_STATISTICS = eINSTANCE.getTeamMatchStatistics();

		/**
		 * The meta object literal for the '<em><b>Goals</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM_MATCH_STATISTICS__GOALS = eINSTANCE.getTeamMatchStatistics_Goals();

		/**
		 * The meta object literal for the '<em><b>Penalties</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM_MATCH_STATISTICS__PENALTIES = eINSTANCE.getTeamMatchStatistics_Penalties();

		/**
		 * The meta object literal for the '<em><b>Attempts On Goal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM_MATCH_STATISTICS__ATTEMPTS_ON_GOAL = eINSTANCE.getTeamMatchStatistics_AttemptsOnGoal();

		/**
		 * The meta object literal for the '<em><b>On Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM_MATCH_STATISTICS__ON_TARGET = eINSTANCE.getTeamMatchStatistics_OnTarget();

		/**
		 * The meta object literal for the '<em><b>Off Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM_MATCH_STATISTICS__OFF_TARGET = eINSTANCE.getTeamMatchStatistics_OffTarget();

		/**
		 * The meta object literal for the '<em><b>Blocked</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM_MATCH_STATISTICS__BLOCKED = eINSTANCE.getTeamMatchStatistics_Blocked();

		/**
		 * The meta object literal for the '<em><b>Woodwork</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM_MATCH_STATISTICS__WOODWORK = eINSTANCE.getTeamMatchStatistics_Woodwork();

		/**
		 * The meta object literal for the '<em><b>Corners</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM_MATCH_STATISTICS__CORNERS = eINSTANCE.getTeamMatchStatistics_Corners();

		/**
		 * The meta object literal for the '<em><b>Offsides</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM_MATCH_STATISTICS__OFFSIDES = eINSTANCE.getTeamMatchStatistics_Offsides();

		/**
		 * The meta object literal for the '<em><b>Ball Possession</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM_MATCH_STATISTICS__BALL_POSSESSION = eINSTANCE.getTeamMatchStatistics_BallPossession();

		/**
		 * The meta object literal for the '<em><b>Pass Accuracy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM_MATCH_STATISTICS__PASS_ACCURACY = eINSTANCE.getTeamMatchStatistics_PassAccuracy();

		/**
		 * The meta object literal for the '<em><b>Num Passes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM_MATCH_STATISTICS__NUM_PASSES = eINSTANCE.getTeamMatchStatistics_NumPasses();

		/**
		 * The meta object literal for the '<em><b>Passes Completed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM_MATCH_STATISTICS__PASSES_COMPLETED = eINSTANCE.getTeamMatchStatistics_PassesCompleted();

		/**
		 * The meta object literal for the '<em><b>Distance Covered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM_MATCH_STATISTICS__DISTANCE_COVERED = eINSTANCE.getTeamMatchStatistics_DistanceCovered();

		/**
		 * The meta object literal for the '<em><b>Balls Recovered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM_MATCH_STATISTICS__BALLS_RECOVERED = eINSTANCE.getTeamMatchStatistics_BallsRecovered();

		/**
		 * The meta object literal for the '<em><b>Tackles</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM_MATCH_STATISTICS__TACKLES = eINSTANCE.getTeamMatchStatistics_Tackles();

		/**
		 * The meta object literal for the '<em><b>Clearances</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM_MATCH_STATISTICS__CLEARANCES = eINSTANCE.getTeamMatchStatistics_Clearances();

		/**
		 * The meta object literal for the '<em><b>Yellow Cards</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM_MATCH_STATISTICS__YELLOW_CARDS = eINSTANCE.getTeamMatchStatistics_YellowCards();

		/**
		 * The meta object literal for the '<em><b>Red Cards</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM_MATCH_STATISTICS__RED_CARDS = eINSTANCE.getTeamMatchStatistics_RedCards();

		/**
		 * The meta object literal for the '<em><b>Fouls Committed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM_MATCH_STATISTICS__FOULS_COMMITTED = eINSTANCE.getTeamMatchStatistics_FoulsCommitted();

	}

} //WcPackage
