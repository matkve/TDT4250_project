/**
 */
package tdt4250.wc.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tdt4250.wc.TeamMatchStatistics;
import tdt4250.wc.WcPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Team Match Statistics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.wc.impl.TeamMatchStatisticsImpl#getGoals <em>Goals</em>}</li>
 *   <li>{@link tdt4250.wc.impl.TeamMatchStatisticsImpl#getPenalties <em>Penalties</em>}</li>
 *   <li>{@link tdt4250.wc.impl.TeamMatchStatisticsImpl#getAttemptsOnGoal <em>Attempts On Goal</em>}</li>
 *   <li>{@link tdt4250.wc.impl.TeamMatchStatisticsImpl#getOnTarget <em>On Target</em>}</li>
 *   <li>{@link tdt4250.wc.impl.TeamMatchStatisticsImpl#getOffTarget <em>Off Target</em>}</li>
 *   <li>{@link tdt4250.wc.impl.TeamMatchStatisticsImpl#getBlocked <em>Blocked</em>}</li>
 *   <li>{@link tdt4250.wc.impl.TeamMatchStatisticsImpl#getWoodwork <em>Woodwork</em>}</li>
 *   <li>{@link tdt4250.wc.impl.TeamMatchStatisticsImpl#getCorners <em>Corners</em>}</li>
 *   <li>{@link tdt4250.wc.impl.TeamMatchStatisticsImpl#getOffsides <em>Offsides</em>}</li>
 *   <li>{@link tdt4250.wc.impl.TeamMatchStatisticsImpl#getBallPossession <em>Ball Possession</em>}</li>
 *   <li>{@link tdt4250.wc.impl.TeamMatchStatisticsImpl#getPassAccuracy <em>Pass Accuracy</em>}</li>
 *   <li>{@link tdt4250.wc.impl.TeamMatchStatisticsImpl#getNumPasses <em>Num Passes</em>}</li>
 *   <li>{@link tdt4250.wc.impl.TeamMatchStatisticsImpl#getPassesCompleted <em>Passes Completed</em>}</li>
 *   <li>{@link tdt4250.wc.impl.TeamMatchStatisticsImpl#getDistanceCovered <em>Distance Covered</em>}</li>
 *   <li>{@link tdt4250.wc.impl.TeamMatchStatisticsImpl#getBallsRecovered <em>Balls Recovered</em>}</li>
 *   <li>{@link tdt4250.wc.impl.TeamMatchStatisticsImpl#getTackles <em>Tackles</em>}</li>
 *   <li>{@link tdt4250.wc.impl.TeamMatchStatisticsImpl#getClearances <em>Clearances</em>}</li>
 *   <li>{@link tdt4250.wc.impl.TeamMatchStatisticsImpl#getYellowCards <em>Yellow Cards</em>}</li>
 *   <li>{@link tdt4250.wc.impl.TeamMatchStatisticsImpl#getRedCards <em>Red Cards</em>}</li>
 *   <li>{@link tdt4250.wc.impl.TeamMatchStatisticsImpl#getFoulsCommitted <em>Fouls Committed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TeamMatchStatisticsImpl extends MinimalEObjectImpl.Container implements TeamMatchStatistics {
	/**
	 * The default value of the '{@link #getGoals() <em>Goals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoals()
	 * @generated
	 * @ordered
	 */
	protected static final int GOALS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGoals() <em>Goals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoals()
	 * @generated
	 * @ordered
	 */
	protected int goals = GOALS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPenalties() <em>Penalties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPenalties()
	 * @generated
	 * @ordered
	 */
	protected static final int PENALTIES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPenalties() <em>Penalties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPenalties()
	 * @generated
	 * @ordered
	 */
	protected int penalties = PENALTIES_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttemptsOnGoal() <em>Attempts On Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttemptsOnGoal()
	 * @generated
	 * @ordered
	 */
	protected static final int ATTEMPTS_ON_GOAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAttemptsOnGoal() <em>Attempts On Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttemptsOnGoal()
	 * @generated
	 * @ordered
	 */
	protected int attemptsOnGoal = ATTEMPTS_ON_GOAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnTarget() <em>On Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnTarget()
	 * @generated
	 * @ordered
	 */
	protected static final int ON_TARGET_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOnTarget() <em>On Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnTarget()
	 * @generated
	 * @ordered
	 */
	protected int onTarget = ON_TARGET_EDEFAULT;

	/**
	 * The default value of the '{@link #getOffTarget() <em>Off Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffTarget()
	 * @generated
	 * @ordered
	 */
	protected static final int OFF_TARGET_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOffTarget() <em>Off Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffTarget()
	 * @generated
	 * @ordered
	 */
	protected int offTarget = OFF_TARGET_EDEFAULT;

	/**
	 * The default value of the '{@link #getBlocked() <em>Blocked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlocked()
	 * @generated
	 * @ordered
	 */
	protected static final int BLOCKED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBlocked() <em>Blocked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlocked()
	 * @generated
	 * @ordered
	 */
	protected int blocked = BLOCKED_EDEFAULT;

	/**
	 * The default value of the '{@link #getWoodwork() <em>Woodwork</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWoodwork()
	 * @generated
	 * @ordered
	 */
	protected static final int WOODWORK_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWoodwork() <em>Woodwork</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWoodwork()
	 * @generated
	 * @ordered
	 */
	protected int woodwork = WOODWORK_EDEFAULT;

	/**
	 * The default value of the '{@link #getCorners() <em>Corners</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorners()
	 * @generated
	 * @ordered
	 */
	protected static final int CORNERS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCorners() <em>Corners</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorners()
	 * @generated
	 * @ordered
	 */
	protected int corners = CORNERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getOffsides() <em>Offsides</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffsides()
	 * @generated
	 * @ordered
	 */
	protected static final int OFFSIDES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOffsides() <em>Offsides</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffsides()
	 * @generated
	 * @ordered
	 */
	protected int offsides = OFFSIDES_EDEFAULT;

	/**
	 * The default value of the '{@link #getBallPossession() <em>Ball Possession</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBallPossession()
	 * @generated
	 * @ordered
	 */
	protected static final int BALL_POSSESSION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBallPossession() <em>Ball Possession</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBallPossession()
	 * @generated
	 * @ordered
	 */
	protected int ballPossession = BALL_POSSESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassAccuracy() <em>Pass Accuracy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassAccuracy()
	 * @generated
	 * @ordered
	 */
	protected static final int PASS_ACCURACY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPassAccuracy() <em>Pass Accuracy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassAccuracy()
	 * @generated
	 * @ordered
	 */
	protected int passAccuracy = PASS_ACCURACY_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumPasses() <em>Num Passes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumPasses()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_PASSES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumPasses() <em>Num Passes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumPasses()
	 * @generated
	 * @ordered
	 */
	protected int numPasses = NUM_PASSES_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassesCompleted() <em>Passes Completed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassesCompleted()
	 * @generated
	 * @ordered
	 */
	protected static final int PASSES_COMPLETED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPassesCompleted() <em>Passes Completed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassesCompleted()
	 * @generated
	 * @ordered
	 */
	protected int passesCompleted = PASSES_COMPLETED_EDEFAULT;

	/**
	 * The default value of the '{@link #getDistanceCovered() <em>Distance Covered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistanceCovered()
	 * @generated
	 * @ordered
	 */
	protected static final int DISTANCE_COVERED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDistanceCovered() <em>Distance Covered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistanceCovered()
	 * @generated
	 * @ordered
	 */
	protected int distanceCovered = DISTANCE_COVERED_EDEFAULT;

	/**
	 * The default value of the '{@link #getBallsRecovered() <em>Balls Recovered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBallsRecovered()
	 * @generated
	 * @ordered
	 */
	protected static final int BALLS_RECOVERED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBallsRecovered() <em>Balls Recovered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBallsRecovered()
	 * @generated
	 * @ordered
	 */
	protected int ballsRecovered = BALLS_RECOVERED_EDEFAULT;

	/**
	 * The default value of the '{@link #getTackles() <em>Tackles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTackles()
	 * @generated
	 * @ordered
	 */
	protected static final int TACKLES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTackles() <em>Tackles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTackles()
	 * @generated
	 * @ordered
	 */
	protected int tackles = TACKLES_EDEFAULT;

	/**
	 * The default value of the '{@link #getClearances() <em>Clearances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClearances()
	 * @generated
	 * @ordered
	 */
	protected static final int CLEARANCES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getClearances() <em>Clearances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClearances()
	 * @generated
	 * @ordered
	 */
	protected int clearances = CLEARANCES_EDEFAULT;

	/**
	 * The default value of the '{@link #getYellowCards() <em>Yellow Cards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYellowCards()
	 * @generated
	 * @ordered
	 */
	protected static final int YELLOW_CARDS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getYellowCards() <em>Yellow Cards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYellowCards()
	 * @generated
	 * @ordered
	 */
	protected int yellowCards = YELLOW_CARDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRedCards() <em>Red Cards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedCards()
	 * @generated
	 * @ordered
	 */
	protected static final int RED_CARDS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRedCards() <em>Red Cards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedCards()
	 * @generated
	 * @ordered
	 */
	protected int redCards = RED_CARDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getFoulsCommitted() <em>Fouls Committed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFoulsCommitted()
	 * @generated
	 * @ordered
	 */
	protected static final int FOULS_COMMITTED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFoulsCommitted() <em>Fouls Committed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFoulsCommitted()
	 * @generated
	 * @ordered
	 */
	protected int foulsCommitted = FOULS_COMMITTED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TeamMatchStatisticsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WcPackage.Literals.TEAM_MATCH_STATISTICS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getGoals() {
		return goals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGoals(int newGoals) {
		int oldGoals = goals;
		goals = newGoals;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WcPackage.TEAM_MATCH_STATISTICS__GOALS, oldGoals, goals));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPenalties() {
		return penalties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPenalties(int newPenalties) {
		int oldPenalties = penalties;
		penalties = newPenalties;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WcPackage.TEAM_MATCH_STATISTICS__PENALTIES, oldPenalties, penalties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAttemptsOnGoal() {
		return attemptsOnGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttemptsOnGoal(int newAttemptsOnGoal) {
		int oldAttemptsOnGoal = attemptsOnGoal;
		attemptsOnGoal = newAttemptsOnGoal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WcPackage.TEAM_MATCH_STATISTICS__ATTEMPTS_ON_GOAL, oldAttemptsOnGoal, attemptsOnGoal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOnTarget() {
		return onTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnTarget(int newOnTarget) {
		int oldOnTarget = onTarget;
		onTarget = newOnTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WcPackage.TEAM_MATCH_STATISTICS__ON_TARGET, oldOnTarget, onTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOffTarget() {
		return offTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffTarget(int newOffTarget) {
		int oldOffTarget = offTarget;
		offTarget = newOffTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WcPackage.TEAM_MATCH_STATISTICS__OFF_TARGET, oldOffTarget, offTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBlocked() {
		return blocked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlocked(int newBlocked) {
		int oldBlocked = blocked;
		blocked = newBlocked;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WcPackage.TEAM_MATCH_STATISTICS__BLOCKED, oldBlocked, blocked));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWoodwork() {
		return woodwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWoodwork(int newWoodwork) {
		int oldWoodwork = woodwork;
		woodwork = newWoodwork;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WcPackage.TEAM_MATCH_STATISTICS__WOODWORK, oldWoodwork, woodwork));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCorners() {
		return corners;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorners(int newCorners) {
		int oldCorners = corners;
		corners = newCorners;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WcPackage.TEAM_MATCH_STATISTICS__CORNERS, oldCorners, corners));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOffsides() {
		return offsides;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffsides(int newOffsides) {
		int oldOffsides = offsides;
		offsides = newOffsides;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WcPackage.TEAM_MATCH_STATISTICS__OFFSIDES, oldOffsides, offsides));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBallPossession() {
		return ballPossession;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBallPossession(int newBallPossession) {
		int oldBallPossession = ballPossession;
		ballPossession = newBallPossession;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WcPackage.TEAM_MATCH_STATISTICS__BALL_POSSESSION, oldBallPossession, ballPossession));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPassAccuracy() {
		return passAccuracy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassAccuracy(int newPassAccuracy) {
		int oldPassAccuracy = passAccuracy;
		passAccuracy = newPassAccuracy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WcPackage.TEAM_MATCH_STATISTICS__PASS_ACCURACY, oldPassAccuracy, passAccuracy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumPasses() {
		return numPasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumPasses(int newNumPasses) {
		int oldNumPasses = numPasses;
		numPasses = newNumPasses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WcPackage.TEAM_MATCH_STATISTICS__NUM_PASSES, oldNumPasses, numPasses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPassesCompleted() {
		return passesCompleted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassesCompleted(int newPassesCompleted) {
		int oldPassesCompleted = passesCompleted;
		passesCompleted = newPassesCompleted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WcPackage.TEAM_MATCH_STATISTICS__PASSES_COMPLETED, oldPassesCompleted, passesCompleted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDistanceCovered() {
		return distanceCovered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistanceCovered(int newDistanceCovered) {
		int oldDistanceCovered = distanceCovered;
		distanceCovered = newDistanceCovered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WcPackage.TEAM_MATCH_STATISTICS__DISTANCE_COVERED, oldDistanceCovered, distanceCovered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBallsRecovered() {
		return ballsRecovered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBallsRecovered(int newBallsRecovered) {
		int oldBallsRecovered = ballsRecovered;
		ballsRecovered = newBallsRecovered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WcPackage.TEAM_MATCH_STATISTICS__BALLS_RECOVERED, oldBallsRecovered, ballsRecovered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTackles() {
		return tackles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTackles(int newTackles) {
		int oldTackles = tackles;
		tackles = newTackles;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WcPackage.TEAM_MATCH_STATISTICS__TACKLES, oldTackles, tackles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getClearances() {
		return clearances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClearances(int newClearances) {
		int oldClearances = clearances;
		clearances = newClearances;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WcPackage.TEAM_MATCH_STATISTICS__CLEARANCES, oldClearances, clearances));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getYellowCards() {
		return yellowCards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYellowCards(int newYellowCards) {
		int oldYellowCards = yellowCards;
		yellowCards = newYellowCards;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WcPackage.TEAM_MATCH_STATISTICS__YELLOW_CARDS, oldYellowCards, yellowCards));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRedCards() {
		return redCards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRedCards(int newRedCards) {
		int oldRedCards = redCards;
		redCards = newRedCards;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WcPackage.TEAM_MATCH_STATISTICS__RED_CARDS, oldRedCards, redCards));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFoulsCommitted() {
		return foulsCommitted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFoulsCommitted(int newFoulsCommitted) {
		int oldFoulsCommitted = foulsCommitted;
		foulsCommitted = newFoulsCommitted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WcPackage.TEAM_MATCH_STATISTICS__FOULS_COMMITTED, oldFoulsCommitted, foulsCommitted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WcPackage.TEAM_MATCH_STATISTICS__GOALS:
				return getGoals();
			case WcPackage.TEAM_MATCH_STATISTICS__PENALTIES:
				return getPenalties();
			case WcPackage.TEAM_MATCH_STATISTICS__ATTEMPTS_ON_GOAL:
				return getAttemptsOnGoal();
			case WcPackage.TEAM_MATCH_STATISTICS__ON_TARGET:
				return getOnTarget();
			case WcPackage.TEAM_MATCH_STATISTICS__OFF_TARGET:
				return getOffTarget();
			case WcPackage.TEAM_MATCH_STATISTICS__BLOCKED:
				return getBlocked();
			case WcPackage.TEAM_MATCH_STATISTICS__WOODWORK:
				return getWoodwork();
			case WcPackage.TEAM_MATCH_STATISTICS__CORNERS:
				return getCorners();
			case WcPackage.TEAM_MATCH_STATISTICS__OFFSIDES:
				return getOffsides();
			case WcPackage.TEAM_MATCH_STATISTICS__BALL_POSSESSION:
				return getBallPossession();
			case WcPackage.TEAM_MATCH_STATISTICS__PASS_ACCURACY:
				return getPassAccuracy();
			case WcPackage.TEAM_MATCH_STATISTICS__NUM_PASSES:
				return getNumPasses();
			case WcPackage.TEAM_MATCH_STATISTICS__PASSES_COMPLETED:
				return getPassesCompleted();
			case WcPackage.TEAM_MATCH_STATISTICS__DISTANCE_COVERED:
				return getDistanceCovered();
			case WcPackage.TEAM_MATCH_STATISTICS__BALLS_RECOVERED:
				return getBallsRecovered();
			case WcPackage.TEAM_MATCH_STATISTICS__TACKLES:
				return getTackles();
			case WcPackage.TEAM_MATCH_STATISTICS__CLEARANCES:
				return getClearances();
			case WcPackage.TEAM_MATCH_STATISTICS__YELLOW_CARDS:
				return getYellowCards();
			case WcPackage.TEAM_MATCH_STATISTICS__RED_CARDS:
				return getRedCards();
			case WcPackage.TEAM_MATCH_STATISTICS__FOULS_COMMITTED:
				return getFoulsCommitted();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WcPackage.TEAM_MATCH_STATISTICS__GOALS:
				setGoals((Integer)newValue);
				return;
			case WcPackage.TEAM_MATCH_STATISTICS__PENALTIES:
				setPenalties((Integer)newValue);
				return;
			case WcPackage.TEAM_MATCH_STATISTICS__ATTEMPTS_ON_GOAL:
				setAttemptsOnGoal((Integer)newValue);
				return;
			case WcPackage.TEAM_MATCH_STATISTICS__ON_TARGET:
				setOnTarget((Integer)newValue);
				return;
			case WcPackage.TEAM_MATCH_STATISTICS__OFF_TARGET:
				setOffTarget((Integer)newValue);
				return;
			case WcPackage.TEAM_MATCH_STATISTICS__BLOCKED:
				setBlocked((Integer)newValue);
				return;
			case WcPackage.TEAM_MATCH_STATISTICS__WOODWORK:
				setWoodwork((Integer)newValue);
				return;
			case WcPackage.TEAM_MATCH_STATISTICS__CORNERS:
				setCorners((Integer)newValue);
				return;
			case WcPackage.TEAM_MATCH_STATISTICS__OFFSIDES:
				setOffsides((Integer)newValue);
				return;
			case WcPackage.TEAM_MATCH_STATISTICS__BALL_POSSESSION:
				setBallPossession((Integer)newValue);
				return;
			case WcPackage.TEAM_MATCH_STATISTICS__PASS_ACCURACY:
				setPassAccuracy((Integer)newValue);
				return;
			case WcPackage.TEAM_MATCH_STATISTICS__NUM_PASSES:
				setNumPasses((Integer)newValue);
				return;
			case WcPackage.TEAM_MATCH_STATISTICS__PASSES_COMPLETED:
				setPassesCompleted((Integer)newValue);
				return;
			case WcPackage.TEAM_MATCH_STATISTICS__DISTANCE_COVERED:
				setDistanceCovered((Integer)newValue);
				return;
			case WcPackage.TEAM_MATCH_STATISTICS__BALLS_RECOVERED:
				setBallsRecovered((Integer)newValue);
				return;
			case WcPackage.TEAM_MATCH_STATISTICS__TACKLES:
				setTackles((Integer)newValue);
				return;
			case WcPackage.TEAM_MATCH_STATISTICS__CLEARANCES:
				setClearances((Integer)newValue);
				return;
			case WcPackage.TEAM_MATCH_STATISTICS__YELLOW_CARDS:
				setYellowCards((Integer)newValue);
				return;
			case WcPackage.TEAM_MATCH_STATISTICS__RED_CARDS:
				setRedCards((Integer)newValue);
				return;
			case WcPackage.TEAM_MATCH_STATISTICS__FOULS_COMMITTED:
				setFoulsCommitted((Integer)newValue);
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
			case WcPackage.TEAM_MATCH_STATISTICS__GOALS:
				setGoals(GOALS_EDEFAULT);
				return;
			case WcPackage.TEAM_MATCH_STATISTICS__PENALTIES:
				setPenalties(PENALTIES_EDEFAULT);
				return;
			case WcPackage.TEAM_MATCH_STATISTICS__ATTEMPTS_ON_GOAL:
				setAttemptsOnGoal(ATTEMPTS_ON_GOAL_EDEFAULT);
				return;
			case WcPackage.TEAM_MATCH_STATISTICS__ON_TARGET:
				setOnTarget(ON_TARGET_EDEFAULT);
				return;
			case WcPackage.TEAM_MATCH_STATISTICS__OFF_TARGET:
				setOffTarget(OFF_TARGET_EDEFAULT);
				return;
			case WcPackage.TEAM_MATCH_STATISTICS__BLOCKED:
				setBlocked(BLOCKED_EDEFAULT);
				return;
			case WcPackage.TEAM_MATCH_STATISTICS__WOODWORK:
				setWoodwork(WOODWORK_EDEFAULT);
				return;
			case WcPackage.TEAM_MATCH_STATISTICS__CORNERS:
				setCorners(CORNERS_EDEFAULT);
				return;
			case WcPackage.TEAM_MATCH_STATISTICS__OFFSIDES:
				setOffsides(OFFSIDES_EDEFAULT);
				return;
			case WcPackage.TEAM_MATCH_STATISTICS__BALL_POSSESSION:
				setBallPossession(BALL_POSSESSION_EDEFAULT);
				return;
			case WcPackage.TEAM_MATCH_STATISTICS__PASS_ACCURACY:
				setPassAccuracy(PASS_ACCURACY_EDEFAULT);
				return;
			case WcPackage.TEAM_MATCH_STATISTICS__NUM_PASSES:
				setNumPasses(NUM_PASSES_EDEFAULT);
				return;
			case WcPackage.TEAM_MATCH_STATISTICS__PASSES_COMPLETED:
				setPassesCompleted(PASSES_COMPLETED_EDEFAULT);
				return;
			case WcPackage.TEAM_MATCH_STATISTICS__DISTANCE_COVERED:
				setDistanceCovered(DISTANCE_COVERED_EDEFAULT);
				return;
			case WcPackage.TEAM_MATCH_STATISTICS__BALLS_RECOVERED:
				setBallsRecovered(BALLS_RECOVERED_EDEFAULT);
				return;
			case WcPackage.TEAM_MATCH_STATISTICS__TACKLES:
				setTackles(TACKLES_EDEFAULT);
				return;
			case WcPackage.TEAM_MATCH_STATISTICS__CLEARANCES:
				setClearances(CLEARANCES_EDEFAULT);
				return;
			case WcPackage.TEAM_MATCH_STATISTICS__YELLOW_CARDS:
				setYellowCards(YELLOW_CARDS_EDEFAULT);
				return;
			case WcPackage.TEAM_MATCH_STATISTICS__RED_CARDS:
				setRedCards(RED_CARDS_EDEFAULT);
				return;
			case WcPackage.TEAM_MATCH_STATISTICS__FOULS_COMMITTED:
				setFoulsCommitted(FOULS_COMMITTED_EDEFAULT);
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
			case WcPackage.TEAM_MATCH_STATISTICS__GOALS:
				return goals != GOALS_EDEFAULT;
			case WcPackage.TEAM_MATCH_STATISTICS__PENALTIES:
				return penalties != PENALTIES_EDEFAULT;
			case WcPackage.TEAM_MATCH_STATISTICS__ATTEMPTS_ON_GOAL:
				return attemptsOnGoal != ATTEMPTS_ON_GOAL_EDEFAULT;
			case WcPackage.TEAM_MATCH_STATISTICS__ON_TARGET:
				return onTarget != ON_TARGET_EDEFAULT;
			case WcPackage.TEAM_MATCH_STATISTICS__OFF_TARGET:
				return offTarget != OFF_TARGET_EDEFAULT;
			case WcPackage.TEAM_MATCH_STATISTICS__BLOCKED:
				return blocked != BLOCKED_EDEFAULT;
			case WcPackage.TEAM_MATCH_STATISTICS__WOODWORK:
				return woodwork != WOODWORK_EDEFAULT;
			case WcPackage.TEAM_MATCH_STATISTICS__CORNERS:
				return corners != CORNERS_EDEFAULT;
			case WcPackage.TEAM_MATCH_STATISTICS__OFFSIDES:
				return offsides != OFFSIDES_EDEFAULT;
			case WcPackage.TEAM_MATCH_STATISTICS__BALL_POSSESSION:
				return ballPossession != BALL_POSSESSION_EDEFAULT;
			case WcPackage.TEAM_MATCH_STATISTICS__PASS_ACCURACY:
				return passAccuracy != PASS_ACCURACY_EDEFAULT;
			case WcPackage.TEAM_MATCH_STATISTICS__NUM_PASSES:
				return numPasses != NUM_PASSES_EDEFAULT;
			case WcPackage.TEAM_MATCH_STATISTICS__PASSES_COMPLETED:
				return passesCompleted != PASSES_COMPLETED_EDEFAULT;
			case WcPackage.TEAM_MATCH_STATISTICS__DISTANCE_COVERED:
				return distanceCovered != DISTANCE_COVERED_EDEFAULT;
			case WcPackage.TEAM_MATCH_STATISTICS__BALLS_RECOVERED:
				return ballsRecovered != BALLS_RECOVERED_EDEFAULT;
			case WcPackage.TEAM_MATCH_STATISTICS__TACKLES:
				return tackles != TACKLES_EDEFAULT;
			case WcPackage.TEAM_MATCH_STATISTICS__CLEARANCES:
				return clearances != CLEARANCES_EDEFAULT;
			case WcPackage.TEAM_MATCH_STATISTICS__YELLOW_CARDS:
				return yellowCards != YELLOW_CARDS_EDEFAULT;
			case WcPackage.TEAM_MATCH_STATISTICS__RED_CARDS:
				return redCards != RED_CARDS_EDEFAULT;
			case WcPackage.TEAM_MATCH_STATISTICS__FOULS_COMMITTED:
				return foulsCommitted != FOULS_COMMITTED_EDEFAULT;
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
		result.append(" (goals: ");
		result.append(goals);
		result.append(", penalties: ");
		result.append(penalties);
		result.append(", attemptsOnGoal: ");
		result.append(attemptsOnGoal);
		result.append(", onTarget: ");
		result.append(onTarget);
		result.append(", offTarget: ");
		result.append(offTarget);
		result.append(", blocked: ");
		result.append(blocked);
		result.append(", woodwork: ");
		result.append(woodwork);
		result.append(", corners: ");
		result.append(corners);
		result.append(", offsides: ");
		result.append(offsides);
		result.append(", ballPossession: ");
		result.append(ballPossession);
		result.append(", passAccuracy: ");
		result.append(passAccuracy);
		result.append(", numPasses: ");
		result.append(numPasses);
		result.append(", passesCompleted: ");
		result.append(passesCompleted);
		result.append(", distanceCovered: ");
		result.append(distanceCovered);
		result.append(", ballsRecovered: ");
		result.append(ballsRecovered);
		result.append(", tackles: ");
		result.append(tackles);
		result.append(", clearances: ");
		result.append(clearances);
		result.append(", yellowCards: ");
		result.append(yellowCards);
		result.append(", redCards: ");
		result.append(redCards);
		result.append(", foulsCommitted: ");
		result.append(foulsCommitted);
		result.append(')');
		return result.toString();
	}

} //TeamMatchStatisticsImpl
