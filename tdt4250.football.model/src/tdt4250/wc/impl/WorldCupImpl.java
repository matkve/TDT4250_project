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

import tdt4250.wc.Arena;
import tdt4250.wc.Match;
import tdt4250.wc.StageOneGroup;
import tdt4250.wc.Team;
import tdt4250.wc.WcPackage;
import tdt4250.wc.WorldCup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>World Cup</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.wc.impl.WorldCupImpl#getStageOneGroups <em>Stage One Groups</em>}</li>
 *   <li>{@link tdt4250.wc.impl.WorldCupImpl#getRoundOf16 <em>Round Of16</em>}</li>
 *   <li>{@link tdt4250.wc.impl.WorldCupImpl#getQuarterFinals <em>Quarter Finals</em>}</li>
 *   <li>{@link tdt4250.wc.impl.WorldCupImpl#getSemiFinals <em>Semi Finals</em>}</li>
 *   <li>{@link tdt4250.wc.impl.WorldCupImpl#getThirdPlacePlayoff <em>Third Place Playoff</em>}</li>
 *   <li>{@link tdt4250.wc.impl.WorldCupImpl#getFinal <em>Final</em>}</li>
 *   <li>{@link tdt4250.wc.impl.WorldCupImpl#getYear <em>Year</em>}</li>
 *   <li>{@link tdt4250.wc.impl.WorldCupImpl#getTeams <em>Teams</em>}</li>
 *   <li>{@link tdt4250.wc.impl.WorldCupImpl#getArenas <em>Arenas</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorldCupImpl extends MinimalEObjectImpl.Container implements WorldCup {
	/**
	 * The cached value of the '{@link #getStageOneGroups() <em>Stage One Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStageOneGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<StageOneGroup> stageOneGroups;

	/**
	 * The cached value of the '{@link #getRoundOf16() <em>Round Of16</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoundOf16()
	 * @generated
	 * @ordered
	 */
	protected EList<Match> roundOf16;

	/**
	 * The cached value of the '{@link #getQuarterFinals() <em>Quarter Finals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuarterFinals()
	 * @generated
	 * @ordered
	 */
	protected EList<Match> quarterFinals;

	/**
	 * The cached value of the '{@link #getSemiFinals() <em>Semi Finals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemiFinals()
	 * @generated
	 * @ordered
	 */
	protected EList<Match> semiFinals;

	/**
	 * The cached value of the '{@link #getThirdPlacePlayoff() <em>Third Place Playoff</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThirdPlacePlayoff()
	 * @generated
	 * @ordered
	 */
	protected Match thirdPlacePlayoff;

	/**
	 * The cached value of the '{@link #getFinal() <em>Final</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinal()
	 * @generated
	 * @ordered
	 */
	protected Match final_;

	/**
	 * The default value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected static final String YEAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected String year = YEAR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTeams() <em>Teams</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeams()
	 * @generated
	 * @ordered
	 */
	protected EList<Team> teams;

	/**
	 * The cached value of the '{@link #getArenas() <em>Arenas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArenas()
	 * @generated
	 * @ordered
	 */
	protected EList<Arena> arenas;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorldCupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WcPackage.Literals.WORLD_CUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StageOneGroup> getStageOneGroups() {
		if (stageOneGroups == null) {
			stageOneGroups = new EObjectContainmentEList<StageOneGroup>(StageOneGroup.class, this, WcPackage.WORLD_CUP__STAGE_ONE_GROUPS);
		}
		return stageOneGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Match> getRoundOf16() {
		if (roundOf16 == null) {
			roundOf16 = new EObjectContainmentEList<Match>(Match.class, this, WcPackage.WORLD_CUP__ROUND_OF16);
		}
		return roundOf16;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Match> getQuarterFinals() {
		if (quarterFinals == null) {
			quarterFinals = new EObjectContainmentEList<Match>(Match.class, this, WcPackage.WORLD_CUP__QUARTER_FINALS);
		}
		return quarterFinals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Match> getSemiFinals() {
		if (semiFinals == null) {
			semiFinals = new EObjectContainmentEList<Match>(Match.class, this, WcPackage.WORLD_CUP__SEMI_FINALS);
		}
		return semiFinals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Match getThirdPlacePlayoff() {
		return thirdPlacePlayoff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThirdPlacePlayoff(Match newThirdPlacePlayoff, NotificationChain msgs) {
		Match oldThirdPlacePlayoff = thirdPlacePlayoff;
		thirdPlacePlayoff = newThirdPlacePlayoff;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WcPackage.WORLD_CUP__THIRD_PLACE_PLAYOFF, oldThirdPlacePlayoff, newThirdPlacePlayoff);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThirdPlacePlayoff(Match newThirdPlacePlayoff) {
		if (newThirdPlacePlayoff != thirdPlacePlayoff) {
			NotificationChain msgs = null;
			if (thirdPlacePlayoff != null)
				msgs = ((InternalEObject)thirdPlacePlayoff).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WcPackage.WORLD_CUP__THIRD_PLACE_PLAYOFF, null, msgs);
			if (newThirdPlacePlayoff != null)
				msgs = ((InternalEObject)newThirdPlacePlayoff).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WcPackage.WORLD_CUP__THIRD_PLACE_PLAYOFF, null, msgs);
			msgs = basicSetThirdPlacePlayoff(newThirdPlacePlayoff, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WcPackage.WORLD_CUP__THIRD_PLACE_PLAYOFF, newThirdPlacePlayoff, newThirdPlacePlayoff));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Match getFinal() {
		return final_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFinal(Match newFinal, NotificationChain msgs) {
		Match oldFinal = final_;
		final_ = newFinal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WcPackage.WORLD_CUP__FINAL, oldFinal, newFinal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinal(Match newFinal) {
		if (newFinal != final_) {
			NotificationChain msgs = null;
			if (final_ != null)
				msgs = ((InternalEObject)final_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WcPackage.WORLD_CUP__FINAL, null, msgs);
			if (newFinal != null)
				msgs = ((InternalEObject)newFinal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WcPackage.WORLD_CUP__FINAL, null, msgs);
			msgs = basicSetFinal(newFinal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WcPackage.WORLD_CUP__FINAL, newFinal, newFinal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getYear() {
		return year;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYear(String newYear) {
		String oldYear = year;
		year = newYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WcPackage.WORLD_CUP__YEAR, oldYear, year));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Team> getTeams() {
		if (teams == null) {
			teams = new EObjectContainmentEList<Team>(Team.class, this, WcPackage.WORLD_CUP__TEAMS);
		}
		return teams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arena> getArenas() {
		if (arenas == null) {
			arenas = new EObjectContainmentEList<Arena>(Arena.class, this, WcPackage.WORLD_CUP__ARENAS);
		}
		return arenas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WcPackage.WORLD_CUP__STAGE_ONE_GROUPS:
				return ((InternalEList<?>)getStageOneGroups()).basicRemove(otherEnd, msgs);
			case WcPackage.WORLD_CUP__ROUND_OF16:
				return ((InternalEList<?>)getRoundOf16()).basicRemove(otherEnd, msgs);
			case WcPackage.WORLD_CUP__QUARTER_FINALS:
				return ((InternalEList<?>)getQuarterFinals()).basicRemove(otherEnd, msgs);
			case WcPackage.WORLD_CUP__SEMI_FINALS:
				return ((InternalEList<?>)getSemiFinals()).basicRemove(otherEnd, msgs);
			case WcPackage.WORLD_CUP__THIRD_PLACE_PLAYOFF:
				return basicSetThirdPlacePlayoff(null, msgs);
			case WcPackage.WORLD_CUP__FINAL:
				return basicSetFinal(null, msgs);
			case WcPackage.WORLD_CUP__TEAMS:
				return ((InternalEList<?>)getTeams()).basicRemove(otherEnd, msgs);
			case WcPackage.WORLD_CUP__ARENAS:
				return ((InternalEList<?>)getArenas()).basicRemove(otherEnd, msgs);
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
			case WcPackage.WORLD_CUP__STAGE_ONE_GROUPS:
				return getStageOneGroups();
			case WcPackage.WORLD_CUP__ROUND_OF16:
				return getRoundOf16();
			case WcPackage.WORLD_CUP__QUARTER_FINALS:
				return getQuarterFinals();
			case WcPackage.WORLD_CUP__SEMI_FINALS:
				return getSemiFinals();
			case WcPackage.WORLD_CUP__THIRD_PLACE_PLAYOFF:
				return getThirdPlacePlayoff();
			case WcPackage.WORLD_CUP__FINAL:
				return getFinal();
			case WcPackage.WORLD_CUP__YEAR:
				return getYear();
			case WcPackage.WORLD_CUP__TEAMS:
				return getTeams();
			case WcPackage.WORLD_CUP__ARENAS:
				return getArenas();
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
			case WcPackage.WORLD_CUP__STAGE_ONE_GROUPS:
				getStageOneGroups().clear();
				getStageOneGroups().addAll((Collection<? extends StageOneGroup>)newValue);
				return;
			case WcPackage.WORLD_CUP__ROUND_OF16:
				getRoundOf16().clear();
				getRoundOf16().addAll((Collection<? extends Match>)newValue);
				return;
			case WcPackage.WORLD_CUP__QUARTER_FINALS:
				getQuarterFinals().clear();
				getQuarterFinals().addAll((Collection<? extends Match>)newValue);
				return;
			case WcPackage.WORLD_CUP__SEMI_FINALS:
				getSemiFinals().clear();
				getSemiFinals().addAll((Collection<? extends Match>)newValue);
				return;
			case WcPackage.WORLD_CUP__THIRD_PLACE_PLAYOFF:
				setThirdPlacePlayoff((Match)newValue);
				return;
			case WcPackage.WORLD_CUP__FINAL:
				setFinal((Match)newValue);
				return;
			case WcPackage.WORLD_CUP__YEAR:
				setYear((String)newValue);
				return;
			case WcPackage.WORLD_CUP__TEAMS:
				getTeams().clear();
				getTeams().addAll((Collection<? extends Team>)newValue);
				return;
			case WcPackage.WORLD_CUP__ARENAS:
				getArenas().clear();
				getArenas().addAll((Collection<? extends Arena>)newValue);
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
			case WcPackage.WORLD_CUP__STAGE_ONE_GROUPS:
				getStageOneGroups().clear();
				return;
			case WcPackage.WORLD_CUP__ROUND_OF16:
				getRoundOf16().clear();
				return;
			case WcPackage.WORLD_CUP__QUARTER_FINALS:
				getQuarterFinals().clear();
				return;
			case WcPackage.WORLD_CUP__SEMI_FINALS:
				getSemiFinals().clear();
				return;
			case WcPackage.WORLD_CUP__THIRD_PLACE_PLAYOFF:
				setThirdPlacePlayoff((Match)null);
				return;
			case WcPackage.WORLD_CUP__FINAL:
				setFinal((Match)null);
				return;
			case WcPackage.WORLD_CUP__YEAR:
				setYear(YEAR_EDEFAULT);
				return;
			case WcPackage.WORLD_CUP__TEAMS:
				getTeams().clear();
				return;
			case WcPackage.WORLD_CUP__ARENAS:
				getArenas().clear();
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
			case WcPackage.WORLD_CUP__STAGE_ONE_GROUPS:
				return stageOneGroups != null && !stageOneGroups.isEmpty();
			case WcPackage.WORLD_CUP__ROUND_OF16:
				return roundOf16 != null && !roundOf16.isEmpty();
			case WcPackage.WORLD_CUP__QUARTER_FINALS:
				return quarterFinals != null && !quarterFinals.isEmpty();
			case WcPackage.WORLD_CUP__SEMI_FINALS:
				return semiFinals != null && !semiFinals.isEmpty();
			case WcPackage.WORLD_CUP__THIRD_PLACE_PLAYOFF:
				return thirdPlacePlayoff != null;
			case WcPackage.WORLD_CUP__FINAL:
				return final_ != null;
			case WcPackage.WORLD_CUP__YEAR:
				return YEAR_EDEFAULT == null ? year != null : !YEAR_EDEFAULT.equals(year);
			case WcPackage.WORLD_CUP__TEAMS:
				return teams != null && !teams.isEmpty();
			case WcPackage.WORLD_CUP__ARENAS:
				return arenas != null && !arenas.isEmpty();
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
		result.append(" (year: ");
		result.append(year);
		result.append(')');
		return result.toString();
	}

} //WorldCupImpl
