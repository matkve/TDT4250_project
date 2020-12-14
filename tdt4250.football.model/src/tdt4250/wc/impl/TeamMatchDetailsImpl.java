/**
 */
package tdt4250.wc.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tdt4250.wc.Event;
import tdt4250.wc.StartStrategy;
import tdt4250.wc.Team;
import tdt4250.wc.TeamMatchDetails;
import tdt4250.wc.TeamMatchStatistics;
import tdt4250.wc.WcPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Team Match Details</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.wc.impl.TeamMatchDetailsImpl#getTeam <em>Team</em>}</li>
 *   <li>{@link tdt4250.wc.impl.TeamMatchDetailsImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link tdt4250.wc.impl.TeamMatchDetailsImpl#getTeamComposition <em>Team Composition</em>}</li>
 *   <li>{@link tdt4250.wc.impl.TeamMatchDetailsImpl#isWinner <em>Winner</em>}</li>
 *   <li>{@link tdt4250.wc.impl.TeamMatchDetailsImpl#getStatistics <em>Statistics</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TeamMatchDetailsImpl extends MinimalEObjectImpl.Container implements TeamMatchDetails {
	/**
	 * The cached value of the '{@link #getTeam() <em>Team</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeam()
	 * @generated
	 * @ordered
	 */
	protected Team team;

	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> events;

	/**
	 * The cached value of the '{@link #getTeamComposition() <em>Team Composition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeamComposition()
	 * @generated
	 * @ordered
	 */
	protected StartStrategy teamComposition;

	/**
	 * The default value of the '{@link #isWinner() <em>Winner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWinner()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WINNER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isWinner() <em>Winner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWinner()
	 * @generated
	 * @ordered
	 */
	protected boolean winner = WINNER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStatistics() <em>Statistics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatistics()
	 * @generated
	 * @ordered
	 */
	protected TeamMatchStatistics statistics;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TeamMatchDetailsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WcPackage.Literals.TEAM_MATCH_DETAILS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Team getTeam() {
		if (team != null && team.eIsProxy()) {
			InternalEObject oldTeam = (InternalEObject)team;
			team = (Team)eResolveProxy(oldTeam);
			if (team != oldTeam) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WcPackage.TEAM_MATCH_DETAILS__TEAM, oldTeam, team));
			}
		}
		return team;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Team basicGetTeam() {
		return team;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTeam(Team newTeam) {
		Team oldTeam = team;
		team = newTeam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WcPackage.TEAM_MATCH_DETAILS__TEAM, oldTeam, team));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getEvents() {
		if (events == null) {
			events = new EObjectContainmentEList<Event>(Event.class, this, WcPackage.TEAM_MATCH_DETAILS__EVENTS);
		}
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartStrategy getTeamComposition() {
		return teamComposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTeamComposition(StartStrategy newTeamComposition, NotificationChain msgs) {
		StartStrategy oldTeamComposition = teamComposition;
		teamComposition = newTeamComposition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WcPackage.TEAM_MATCH_DETAILS__TEAM_COMPOSITION, oldTeamComposition, newTeamComposition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTeamComposition(StartStrategy newTeamComposition) {
		if (newTeamComposition != teamComposition) {
			NotificationChain msgs = null;
			if (teamComposition != null)
				msgs = ((InternalEObject)teamComposition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WcPackage.TEAM_MATCH_DETAILS__TEAM_COMPOSITION, null, msgs);
			if (newTeamComposition != null)
				msgs = ((InternalEObject)newTeamComposition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WcPackage.TEAM_MATCH_DETAILS__TEAM_COMPOSITION, null, msgs);
			msgs = basicSetTeamComposition(newTeamComposition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WcPackage.TEAM_MATCH_DETAILS__TEAM_COMPOSITION, newTeamComposition, newTeamComposition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isWinner() {
		return winner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWinner(boolean newWinner) {
		boolean oldWinner = winner;
		winner = newWinner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WcPackage.TEAM_MATCH_DETAILS__WINNER, oldWinner, winner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TeamMatchStatistics getStatistics() {
		return statistics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatistics(TeamMatchStatistics newStatistics, NotificationChain msgs) {
		TeamMatchStatistics oldStatistics = statistics;
		statistics = newStatistics;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WcPackage.TEAM_MATCH_DETAILS__STATISTICS, oldStatistics, newStatistics);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatistics(TeamMatchStatistics newStatistics) {
		if (newStatistics != statistics) {
			NotificationChain msgs = null;
			if (statistics != null)
				msgs = ((InternalEObject)statistics).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WcPackage.TEAM_MATCH_DETAILS__STATISTICS, null, msgs);
			if (newStatistics != null)
				msgs = ((InternalEObject)newStatistics).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WcPackage.TEAM_MATCH_DETAILS__STATISTICS, null, msgs);
			msgs = basicSetStatistics(newStatistics, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WcPackage.TEAM_MATCH_DETAILS__STATISTICS, newStatistics, newStatistics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WcPackage.TEAM_MATCH_DETAILS__EVENTS:
				return ((InternalEList<?>)getEvents()).basicRemove(otherEnd, msgs);
			case WcPackage.TEAM_MATCH_DETAILS__TEAM_COMPOSITION:
				return basicSetTeamComposition(null, msgs);
			case WcPackage.TEAM_MATCH_DETAILS__STATISTICS:
				return basicSetStatistics(null, msgs);
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
			case WcPackage.TEAM_MATCH_DETAILS__TEAM:
				if (resolve) return getTeam();
				return basicGetTeam();
			case WcPackage.TEAM_MATCH_DETAILS__EVENTS:
				return getEvents();
			case WcPackage.TEAM_MATCH_DETAILS__TEAM_COMPOSITION:
				return getTeamComposition();
			case WcPackage.TEAM_MATCH_DETAILS__WINNER:
				return isWinner();
			case WcPackage.TEAM_MATCH_DETAILS__STATISTICS:
				return getStatistics();
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
			case WcPackage.TEAM_MATCH_DETAILS__TEAM:
				setTeam((Team)newValue);
				return;
			case WcPackage.TEAM_MATCH_DETAILS__EVENTS:
				getEvents().clear();
				getEvents().addAll((Collection<? extends Event>)newValue);
				return;
			case WcPackage.TEAM_MATCH_DETAILS__TEAM_COMPOSITION:
				setTeamComposition((StartStrategy)newValue);
				return;
			case WcPackage.TEAM_MATCH_DETAILS__WINNER:
				setWinner((Boolean)newValue);
				return;
			case WcPackage.TEAM_MATCH_DETAILS__STATISTICS:
				setStatistics((TeamMatchStatistics)newValue);
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
			case WcPackage.TEAM_MATCH_DETAILS__TEAM:
				setTeam((Team)null);
				return;
			case WcPackage.TEAM_MATCH_DETAILS__EVENTS:
				getEvents().clear();
				return;
			case WcPackage.TEAM_MATCH_DETAILS__TEAM_COMPOSITION:
				setTeamComposition((StartStrategy)null);
				return;
			case WcPackage.TEAM_MATCH_DETAILS__WINNER:
				setWinner(WINNER_EDEFAULT);
				return;
			case WcPackage.TEAM_MATCH_DETAILS__STATISTICS:
				setStatistics((TeamMatchStatistics)null);
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
			case WcPackage.TEAM_MATCH_DETAILS__TEAM:
				return team != null;
			case WcPackage.TEAM_MATCH_DETAILS__EVENTS:
				return events != null && !events.isEmpty();
			case WcPackage.TEAM_MATCH_DETAILS__TEAM_COMPOSITION:
				return teamComposition != null;
			case WcPackage.TEAM_MATCH_DETAILS__WINNER:
				return winner != WINNER_EDEFAULT;
			case WcPackage.TEAM_MATCH_DETAILS__STATISTICS:
				return statistics != null;
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
		result.append(" (winner: ");
		result.append(winner);
		result.append(')');
		return result.toString();
	}

} //TeamMatchDetailsImpl
