/**
 */
package tdt4250.wc.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import tdt4250.wc.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WcFactoryImpl extends EFactoryImpl implements WcFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WcFactory init() {
		try {
			WcFactory theWcFactory = (WcFactory)EPackage.Registry.INSTANCE.getEFactory(WcPackage.eNS_URI);
			if (theWcFactory != null) {
				return theWcFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WcFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WcFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case WcPackage.UNIVERSE: return createUniverse();
			case WcPackage.WORLD_CUP: return createWorldCup();
			case WcPackage.MATCH: return createMatch();
			case WcPackage.TEAM: return createTeam();
			case WcPackage.PLAYER: return createPlayer();
			case WcPackage.EVENT: return createEvent();
			case WcPackage.ARENA: return createArena();
			case WcPackage.START_STRATEGY: return createStartStrategy();
			case WcPackage.WEATHER: return createWeather();
			case WcPackage.STAGE_ONE_GROUP: return createStageOneGroup();
			case WcPackage.TEAM_MATCH_DETAILS: return createTeamMatchDetails();
			case WcPackage.TEAM_MATCH_STATISTICS: return createTeamMatchStatistics();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Universe createUniverse() {
		UniverseImpl universe = new UniverseImpl();
		return universe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorldCup createWorldCup() {
		WorldCupImpl worldCup = new WorldCupImpl();
		return worldCup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Match createMatch() {
		MatchImpl match = new MatchImpl();
		return match;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Team createTeam() {
		TeamImpl team = new TeamImpl();
		return team;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Player createPlayer() {
		PlayerImpl player = new PlayerImpl();
		return player;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arena createArena() {
		ArenaImpl arena = new ArenaImpl();
		return arena;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartStrategy createStartStrategy() {
		StartStrategyImpl startStrategy = new StartStrategyImpl();
		return startStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Weather createWeather() {
		WeatherImpl weather = new WeatherImpl();
		return weather;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StageOneGroup createStageOneGroup() {
		StageOneGroupImpl stageOneGroup = new StageOneGroupImpl();
		return stageOneGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TeamMatchDetails createTeamMatchDetails() {
		TeamMatchDetailsImpl teamMatchDetails = new TeamMatchDetailsImpl();
		return teamMatchDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TeamMatchStatistics createTeamMatchStatistics() {
		TeamMatchStatisticsImpl teamMatchStatistics = new TeamMatchStatisticsImpl();
		return teamMatchStatistics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WcPackage getWcPackage() {
		return (WcPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WcPackage getPackage() {
		return WcPackage.eINSTANCE;
	}

} //WcFactoryImpl
