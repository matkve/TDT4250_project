/**
 */
package tdt4250.wc.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import tdt4250.wc.Arena;
import tdt4250.wc.Event;
import tdt4250.wc.Match;
import tdt4250.wc.Player;
import tdt4250.wc.StageOneGroup;
import tdt4250.wc.StartStrategy;
import tdt4250.wc.Team;
import tdt4250.wc.TeamMatchDetails;
import tdt4250.wc.TeamMatchStatistics;
import tdt4250.wc.Universe;
import tdt4250.wc.WcFactory;
import tdt4250.wc.WcPackage;
import tdt4250.wc.Weather;
import tdt4250.wc.WorldCup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WcPackageImpl extends EPackageImpl implements WcPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass universeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass worldCupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass matchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass teamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass playerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arenaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startStrategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass weatherEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stageOneGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass teamMatchDetailsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass teamMatchStatisticsEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see tdt4250.wc.WcPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private WcPackageImpl() {
		super(eNS_URI, WcFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link WcPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static WcPackage init() {
		if (isInited) return (WcPackage)EPackage.Registry.INSTANCE.getEPackage(WcPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredWcPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		WcPackageImpl theWcPackage = registeredWcPackage instanceof WcPackageImpl ? (WcPackageImpl)registeredWcPackage : new WcPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theWcPackage.createPackageContents();

		// Initialize created meta-data
		theWcPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theWcPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(WcPackage.eNS_URI, theWcPackage);
		return theWcPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUniverse() {
		return universeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUniverse_WorldCups() {
		return (EReference)universeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorldCup() {
		return worldCupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorldCup_StageOneGroups() {
		return (EReference)worldCupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorldCup_RoundOf16() {
		return (EReference)worldCupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorldCup_QuarterFinals() {
		return (EReference)worldCupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorldCup_SemiFinals() {
		return (EReference)worldCupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorldCup_ThirdPlacePlayoff() {
		return (EReference)worldCupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorldCup_Final() {
		return (EReference)worldCupEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorldCup_Year() {
		return (EAttribute)worldCupEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorldCup_Teams() {
		return (EReference)worldCupEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorldCup_Arenas() {
		return (EReference)worldCupEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMatch() {
		return matchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMatch_HomeTeam() {
		return (EReference)matchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMatch_AwayTeam() {
		return (EReference)matchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMatch_Arena() {
		return (EReference)matchEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMatch_Weather() {
		return (EReference)matchEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatch_Datetime() {
		return (EAttribute)matchEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTeam() {
		return teamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTeam_Players() {
		return (EReference)teamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTeam_Country() {
		return (EAttribute)teamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTeam_Code() {
		return (EAttribute)teamEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlayer() {
		return playerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlayer_Name() {
		return (EAttribute)playerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlayer_ShirtNumber() {
		return (EAttribute)playerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvent_Player() {
		return (EReference)eventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_Description() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_Time() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArena() {
		return arenaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArena_City() {
		return (EAttribute)arenaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArena_Name() {
		return (EAttribute)arenaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArena_WeatherHistory() {
		return (EReference)arenaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStartStrategy() {
		return startStrategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStartStrategy_Goalie() {
		return (EReference)startStrategyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStartStrategy_Defender() {
		return (EReference)startStrategyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStartStrategy_Midfield() {
		return (EReference)startStrategyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStartStrategy_Forward() {
		return (EReference)startStrategyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStartStrategy_Captain() {
		return (EReference)startStrategyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStartStrategy_Substitutes() {
		return (EReference)startStrategyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWeather() {
		return weatherEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWeather_Humidity() {
		return (EAttribute)weatherEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWeather_TempCelcius() {
		return (EAttribute)weatherEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWeather_TempFarenheit() {
		return (EAttribute)weatherEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWeather_WindSpeed() {
		return (EAttribute)weatherEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWeather_Description() {
		return (EAttribute)weatherEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStageOneGroup() {
		return stageOneGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStageOneGroup_Match() {
		return (EReference)stageOneGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStageOneGroup_GroupLetter() {
		return (EAttribute)stageOneGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTeamMatchDetails() {
		return teamMatchDetailsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTeamMatchDetails_Team() {
		return (EReference)teamMatchDetailsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTeamMatchDetails_Events() {
		return (EReference)teamMatchDetailsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTeamMatchDetails_TeamComposition() {
		return (EReference)teamMatchDetailsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTeamMatchDetails_Winner() {
		return (EAttribute)teamMatchDetailsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTeamMatchDetails_Statistics() {
		return (EReference)teamMatchDetailsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTeamMatchStatistics() {
		return teamMatchStatisticsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTeamMatchStatistics_Goals() {
		return (EAttribute)teamMatchStatisticsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTeamMatchStatistics_Penalties() {
		return (EAttribute)teamMatchStatisticsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTeamMatchStatistics_AttemptsOnGoal() {
		return (EAttribute)teamMatchStatisticsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTeamMatchStatistics_OnTarget() {
		return (EAttribute)teamMatchStatisticsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTeamMatchStatistics_OffTarget() {
		return (EAttribute)teamMatchStatisticsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTeamMatchStatistics_Blocked() {
		return (EAttribute)teamMatchStatisticsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTeamMatchStatistics_Woodwork() {
		return (EAttribute)teamMatchStatisticsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTeamMatchStatistics_Corners() {
		return (EAttribute)teamMatchStatisticsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTeamMatchStatistics_Offsides() {
		return (EAttribute)teamMatchStatisticsEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTeamMatchStatistics_BallPossession() {
		return (EAttribute)teamMatchStatisticsEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTeamMatchStatistics_PassAccuracy() {
		return (EAttribute)teamMatchStatisticsEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTeamMatchStatistics_NumPasses() {
		return (EAttribute)teamMatchStatisticsEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTeamMatchStatistics_PassesCompleted() {
		return (EAttribute)teamMatchStatisticsEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTeamMatchStatistics_DistanceCovered() {
		return (EAttribute)teamMatchStatisticsEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTeamMatchStatistics_BallsRecovered() {
		return (EAttribute)teamMatchStatisticsEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTeamMatchStatistics_Tackles() {
		return (EAttribute)teamMatchStatisticsEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTeamMatchStatistics_Clearances() {
		return (EAttribute)teamMatchStatisticsEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTeamMatchStatistics_YellowCards() {
		return (EAttribute)teamMatchStatisticsEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTeamMatchStatistics_RedCards() {
		return (EAttribute)teamMatchStatisticsEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTeamMatchStatistics_FoulsCommitted() {
		return (EAttribute)teamMatchStatisticsEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WcFactory getWcFactory() {
		return (WcFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		universeEClass = createEClass(UNIVERSE);
		createEReference(universeEClass, UNIVERSE__WORLD_CUPS);

		worldCupEClass = createEClass(WORLD_CUP);
		createEReference(worldCupEClass, WORLD_CUP__STAGE_ONE_GROUPS);
		createEReference(worldCupEClass, WORLD_CUP__ROUND_OF16);
		createEReference(worldCupEClass, WORLD_CUP__QUARTER_FINALS);
		createEReference(worldCupEClass, WORLD_CUP__SEMI_FINALS);
		createEReference(worldCupEClass, WORLD_CUP__THIRD_PLACE_PLAYOFF);
		createEReference(worldCupEClass, WORLD_CUP__FINAL);
		createEAttribute(worldCupEClass, WORLD_CUP__YEAR);
		createEReference(worldCupEClass, WORLD_CUP__TEAMS);
		createEReference(worldCupEClass, WORLD_CUP__ARENAS);

		matchEClass = createEClass(MATCH);
		createEReference(matchEClass, MATCH__HOME_TEAM);
		createEReference(matchEClass, MATCH__AWAY_TEAM);
		createEReference(matchEClass, MATCH__ARENA);
		createEReference(matchEClass, MATCH__WEATHER);
		createEAttribute(matchEClass, MATCH__DATETIME);

		teamEClass = createEClass(TEAM);
		createEReference(teamEClass, TEAM__PLAYERS);
		createEAttribute(teamEClass, TEAM__COUNTRY);
		createEAttribute(teamEClass, TEAM__CODE);

		playerEClass = createEClass(PLAYER);
		createEAttribute(playerEClass, PLAYER__NAME);
		createEAttribute(playerEClass, PLAYER__SHIRT_NUMBER);

		eventEClass = createEClass(EVENT);
		createEReference(eventEClass, EVENT__PLAYER);
		createEAttribute(eventEClass, EVENT__DESCRIPTION);
		createEAttribute(eventEClass, EVENT__TIME);

		arenaEClass = createEClass(ARENA);
		createEAttribute(arenaEClass, ARENA__CITY);
		createEAttribute(arenaEClass, ARENA__NAME);
		createEReference(arenaEClass, ARENA__WEATHER_HISTORY);

		startStrategyEClass = createEClass(START_STRATEGY);
		createEReference(startStrategyEClass, START_STRATEGY__GOALIE);
		createEReference(startStrategyEClass, START_STRATEGY__DEFENDER);
		createEReference(startStrategyEClass, START_STRATEGY__MIDFIELD);
		createEReference(startStrategyEClass, START_STRATEGY__FORWARD);
		createEReference(startStrategyEClass, START_STRATEGY__CAPTAIN);
		createEReference(startStrategyEClass, START_STRATEGY__SUBSTITUTES);

		weatherEClass = createEClass(WEATHER);
		createEAttribute(weatherEClass, WEATHER__HUMIDITY);
		createEAttribute(weatherEClass, WEATHER__TEMP_CELCIUS);
		createEAttribute(weatherEClass, WEATHER__TEMP_FARENHEIT);
		createEAttribute(weatherEClass, WEATHER__WIND_SPEED);
		createEAttribute(weatherEClass, WEATHER__DESCRIPTION);

		stageOneGroupEClass = createEClass(STAGE_ONE_GROUP);
		createEReference(stageOneGroupEClass, STAGE_ONE_GROUP__MATCH);
		createEAttribute(stageOneGroupEClass, STAGE_ONE_GROUP__GROUP_LETTER);

		teamMatchDetailsEClass = createEClass(TEAM_MATCH_DETAILS);
		createEReference(teamMatchDetailsEClass, TEAM_MATCH_DETAILS__TEAM);
		createEReference(teamMatchDetailsEClass, TEAM_MATCH_DETAILS__EVENTS);
		createEReference(teamMatchDetailsEClass, TEAM_MATCH_DETAILS__TEAM_COMPOSITION);
		createEAttribute(teamMatchDetailsEClass, TEAM_MATCH_DETAILS__WINNER);
		createEReference(teamMatchDetailsEClass, TEAM_MATCH_DETAILS__STATISTICS);

		teamMatchStatisticsEClass = createEClass(TEAM_MATCH_STATISTICS);
		createEAttribute(teamMatchStatisticsEClass, TEAM_MATCH_STATISTICS__GOALS);
		createEAttribute(teamMatchStatisticsEClass, TEAM_MATCH_STATISTICS__PENALTIES);
		createEAttribute(teamMatchStatisticsEClass, TEAM_MATCH_STATISTICS__ATTEMPTS_ON_GOAL);
		createEAttribute(teamMatchStatisticsEClass, TEAM_MATCH_STATISTICS__ON_TARGET);
		createEAttribute(teamMatchStatisticsEClass, TEAM_MATCH_STATISTICS__OFF_TARGET);
		createEAttribute(teamMatchStatisticsEClass, TEAM_MATCH_STATISTICS__BLOCKED);
		createEAttribute(teamMatchStatisticsEClass, TEAM_MATCH_STATISTICS__WOODWORK);
		createEAttribute(teamMatchStatisticsEClass, TEAM_MATCH_STATISTICS__CORNERS);
		createEAttribute(teamMatchStatisticsEClass, TEAM_MATCH_STATISTICS__OFFSIDES);
		createEAttribute(teamMatchStatisticsEClass, TEAM_MATCH_STATISTICS__BALL_POSSESSION);
		createEAttribute(teamMatchStatisticsEClass, TEAM_MATCH_STATISTICS__PASS_ACCURACY);
		createEAttribute(teamMatchStatisticsEClass, TEAM_MATCH_STATISTICS__NUM_PASSES);
		createEAttribute(teamMatchStatisticsEClass, TEAM_MATCH_STATISTICS__PASSES_COMPLETED);
		createEAttribute(teamMatchStatisticsEClass, TEAM_MATCH_STATISTICS__DISTANCE_COVERED);
		createEAttribute(teamMatchStatisticsEClass, TEAM_MATCH_STATISTICS__BALLS_RECOVERED);
		createEAttribute(teamMatchStatisticsEClass, TEAM_MATCH_STATISTICS__TACKLES);
		createEAttribute(teamMatchStatisticsEClass, TEAM_MATCH_STATISTICS__CLEARANCES);
		createEAttribute(teamMatchStatisticsEClass, TEAM_MATCH_STATISTICS__YELLOW_CARDS);
		createEAttribute(teamMatchStatisticsEClass, TEAM_MATCH_STATISTICS__RED_CARDS);
		createEAttribute(teamMatchStatisticsEClass, TEAM_MATCH_STATISTICS__FOULS_COMMITTED);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(universeEClass, Universe.class, "Universe", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUniverse_WorldCups(), this.getWorldCup(), null, "worldCups", null, 0, -1, Universe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(worldCupEClass, WorldCup.class, "WorldCup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorldCup_StageOneGroups(), this.getStageOneGroup(), null, "stageOneGroups", null, 0, -1, WorldCup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorldCup_RoundOf16(), this.getMatch(), null, "roundOf16", null, 8, 8, WorldCup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorldCup_QuarterFinals(), this.getMatch(), null, "quarterFinals", null, 4, 4, WorldCup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorldCup_SemiFinals(), this.getMatch(), null, "semiFinals", null, 2, 2, WorldCup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorldCup_ThirdPlacePlayoff(), this.getMatch(), null, "thirdPlacePlayoff", null, 1, 1, WorldCup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorldCup_Final(), this.getMatch(), null, "final", null, 1, 1, WorldCup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorldCup_Year(), ecorePackage.getEString(), "year", null, 0, 1, WorldCup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorldCup_Teams(), this.getTeam(), null, "teams", null, 0, -1, WorldCup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorldCup_Arenas(), this.getArena(), null, "arenas", null, 0, -1, WorldCup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(matchEClass, Match.class, "Match", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMatch_HomeTeam(), this.getTeamMatchDetails(), null, "homeTeam", null, 1, 1, Match.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMatch_AwayTeam(), this.getTeamMatchDetails(), null, "awayTeam", null, 1, 1, Match.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMatch_Arena(), this.getArena(), null, "arena", null, 1, 1, Match.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMatch_Weather(), this.getWeather(), null, "weather", null, 0, 1, Match.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMatch_Datetime(), ecorePackage.getEString(), "datetime", null, 0, 1, Match.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(teamEClass, Team.class, "Team", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTeam_Players(), this.getPlayer(), null, "players", null, 0, -1, Team.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTeam_Country(), ecorePackage.getEString(), "country", null, 0, 1, Team.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTeam_Code(), ecorePackage.getEString(), "code", null, 0, 1, Team.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(playerEClass, Player.class, "Player", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlayer_Name(), ecorePackage.getEString(), "name", null, 0, 1, Player.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlayer_ShirtNumber(), ecorePackage.getEInt(), "shirtNumber", null, 0, 1, Player.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEvent_Player(), this.getPlayer(), null, "player", null, 1, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvent_Description(), ecorePackage.getEString(), "description", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvent_Time(), ecorePackage.getEString(), "time", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arenaEClass, Arena.class, "Arena", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArena_City(), ecorePackage.getEString(), "city", null, 0, 1, Arena.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArena_Name(), ecorePackage.getEString(), "name", null, 0, 1, Arena.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArena_WeatherHistory(), this.getWeather(), null, "weatherHistory", null, 0, -1, Arena.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(startStrategyEClass, StartStrategy.class, "StartStrategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStartStrategy_Goalie(), this.getPlayer(), null, "goalie", null, 1, 1, StartStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStartStrategy_Defender(), this.getPlayer(), null, "defender", null, 0, -1, StartStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStartStrategy_Midfield(), this.getPlayer(), null, "midfield", null, 0, -1, StartStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStartStrategy_Forward(), this.getPlayer(), null, "forward", null, 0, -1, StartStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStartStrategy_Captain(), this.getPlayer(), null, "captain", null, 1, 1, StartStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStartStrategy_Substitutes(), this.getPlayer(), null, "substitutes", null, 0, -1, StartStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(weatherEClass, Weather.class, "Weather", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWeather_Humidity(), ecorePackage.getEInt(), "humidity", null, 0, 1, Weather.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWeather_TempCelcius(), ecorePackage.getEInt(), "tempCelcius", null, 0, 1, Weather.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWeather_TempFarenheit(), ecorePackage.getEInt(), "tempFarenheit", null, 0, 1, Weather.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWeather_WindSpeed(), ecorePackage.getEInt(), "windSpeed", null, 0, 1, Weather.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWeather_Description(), ecorePackage.getEString(), "description", null, 0, 1, Weather.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stageOneGroupEClass, StageOneGroup.class, "StageOneGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStageOneGroup_Match(), this.getMatch(), null, "match", null, 0, -1, StageOneGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStageOneGroup_GroupLetter(), ecorePackage.getEChar(), "groupLetter", null, 0, 1, StageOneGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(teamMatchDetailsEClass, TeamMatchDetails.class, "TeamMatchDetails", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTeamMatchDetails_Team(), this.getTeam(), null, "team", null, 1, 1, TeamMatchDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTeamMatchDetails_Events(), this.getEvent(), null, "events", null, 0, -1, TeamMatchDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTeamMatchDetails_TeamComposition(), this.getStartStrategy(), null, "teamComposition", null, 1, 1, TeamMatchDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTeamMatchDetails_Winner(), ecorePackage.getEBoolean(), "winner", "false", 0, 1, TeamMatchDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTeamMatchDetails_Statistics(), this.getTeamMatchStatistics(), null, "statistics", null, 1, 1, TeamMatchDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(teamMatchStatisticsEClass, TeamMatchStatistics.class, "TeamMatchStatistics", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTeamMatchStatistics_Goals(), ecorePackage.getEInt(), "goals", null, 0, 1, TeamMatchStatistics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTeamMatchStatistics_Penalties(), ecorePackage.getEInt(), "penalties", null, 0, 1, TeamMatchStatistics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTeamMatchStatistics_AttemptsOnGoal(), ecorePackage.getEInt(), "attemptsOnGoal", null, 0, 1, TeamMatchStatistics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTeamMatchStatistics_OnTarget(), ecorePackage.getEInt(), "onTarget", null, 0, 1, TeamMatchStatistics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTeamMatchStatistics_OffTarget(), ecorePackage.getEInt(), "offTarget", null, 0, 1, TeamMatchStatistics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTeamMatchStatistics_Blocked(), ecorePackage.getEInt(), "blocked", null, 0, 1, TeamMatchStatistics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTeamMatchStatistics_Woodwork(), ecorePackage.getEInt(), "woodwork", null, 0, 1, TeamMatchStatistics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTeamMatchStatistics_Corners(), ecorePackage.getEInt(), "corners", null, 0, 1, TeamMatchStatistics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTeamMatchStatistics_Offsides(), ecorePackage.getEInt(), "offsides", null, 0, 1, TeamMatchStatistics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTeamMatchStatistics_BallPossession(), ecorePackage.getEInt(), "ballPossession", null, 0, 1, TeamMatchStatistics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTeamMatchStatistics_PassAccuracy(), ecorePackage.getEInt(), "passAccuracy", null, 0, 1, TeamMatchStatistics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTeamMatchStatistics_NumPasses(), ecorePackage.getEInt(), "numPasses", null, 0, 1, TeamMatchStatistics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTeamMatchStatistics_PassesCompleted(), ecorePackage.getEInt(), "passesCompleted", null, 0, 1, TeamMatchStatistics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTeamMatchStatistics_DistanceCovered(), ecorePackage.getEInt(), "distanceCovered", null, 0, 1, TeamMatchStatistics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTeamMatchStatistics_BallsRecovered(), ecorePackage.getEInt(), "ballsRecovered", null, 0, 1, TeamMatchStatistics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTeamMatchStatistics_Tackles(), ecorePackage.getEInt(), "tackles", null, 0, 1, TeamMatchStatistics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTeamMatchStatistics_Clearances(), ecorePackage.getEInt(), "clearances", null, 0, 1, TeamMatchStatistics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTeamMatchStatistics_YellowCards(), ecorePackage.getEInt(), "yellowCards", null, 0, 1, TeamMatchStatistics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTeamMatchStatistics_RedCards(), ecorePackage.getEInt(), "redCards", null, 0, 1, TeamMatchStatistics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTeamMatchStatistics_FoulsCommitted(), ecorePackage.getEInt(), "foulsCommitted", null, 0, 1, TeamMatchStatistics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //WcPackageImpl
