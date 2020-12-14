/**
 */
package tdt4250.wc.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import tdt4250.wc.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see tdt4250.wc.WcPackage
 * @generated
 */
public class WcAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WcPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WcAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = WcPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WcSwitch<Adapter> modelSwitch =
		new WcSwitch<Adapter>() {
			@Override
			public Adapter caseUniverse(Universe object) {
				return createUniverseAdapter();
			}
			@Override
			public Adapter caseWorldCup(WorldCup object) {
				return createWorldCupAdapter();
			}
			@Override
			public Adapter caseMatch(Match object) {
				return createMatchAdapter();
			}
			@Override
			public Adapter caseTeam(Team object) {
				return createTeamAdapter();
			}
			@Override
			public Adapter casePlayer(Player object) {
				return createPlayerAdapter();
			}
			@Override
			public Adapter caseEvent(Event object) {
				return createEventAdapter();
			}
			@Override
			public Adapter caseArena(Arena object) {
				return createArenaAdapter();
			}
			@Override
			public Adapter caseStartStrategy(StartStrategy object) {
				return createStartStrategyAdapter();
			}
			@Override
			public Adapter caseWeather(Weather object) {
				return createWeatherAdapter();
			}
			@Override
			public Adapter caseStageOneGroup(StageOneGroup object) {
				return createStageOneGroupAdapter();
			}
			@Override
			public Adapter caseTeamMatchDetails(TeamMatchDetails object) {
				return createTeamMatchDetailsAdapter();
			}
			@Override
			public Adapter caseTeamMatchStatistics(TeamMatchStatistics object) {
				return createTeamMatchStatisticsAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link tdt4250.wc.Universe <em>Universe</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tdt4250.wc.Universe
	 * @generated
	 */
	public Adapter createUniverseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tdt4250.wc.WorldCup <em>World Cup</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tdt4250.wc.WorldCup
	 * @generated
	 */
	public Adapter createWorldCupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tdt4250.wc.Match <em>Match</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tdt4250.wc.Match
	 * @generated
	 */
	public Adapter createMatchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tdt4250.wc.Team <em>Team</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tdt4250.wc.Team
	 * @generated
	 */
	public Adapter createTeamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tdt4250.wc.Player <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tdt4250.wc.Player
	 * @generated
	 */
	public Adapter createPlayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tdt4250.wc.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tdt4250.wc.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tdt4250.wc.Arena <em>Arena</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tdt4250.wc.Arena
	 * @generated
	 */
	public Adapter createArenaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tdt4250.wc.StartStrategy <em>Start Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tdt4250.wc.StartStrategy
	 * @generated
	 */
	public Adapter createStartStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tdt4250.wc.Weather <em>Weather</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tdt4250.wc.Weather
	 * @generated
	 */
	public Adapter createWeatherAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tdt4250.wc.StageOneGroup <em>Stage One Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tdt4250.wc.StageOneGroup
	 * @generated
	 */
	public Adapter createStageOneGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tdt4250.wc.TeamMatchDetails <em>Team Match Details</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tdt4250.wc.TeamMatchDetails
	 * @generated
	 */
	public Adapter createTeamMatchDetailsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tdt4250.wc.TeamMatchStatistics <em>Team Match Statistics</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tdt4250.wc.TeamMatchStatistics
	 * @generated
	 */
	public Adapter createTeamMatchStatisticsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //WcAdapterFactory
