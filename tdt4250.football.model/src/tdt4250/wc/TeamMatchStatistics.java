/**
 */
package tdt4250.wc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Team Match Statistics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.wc.TeamMatchStatistics#getGoals <em>Goals</em>}</li>
 *   <li>{@link tdt4250.wc.TeamMatchStatistics#getPenalties <em>Penalties</em>}</li>
 *   <li>{@link tdt4250.wc.TeamMatchStatistics#getAttemptsOnGoal <em>Attempts On Goal</em>}</li>
 *   <li>{@link tdt4250.wc.TeamMatchStatistics#getOnTarget <em>On Target</em>}</li>
 *   <li>{@link tdt4250.wc.TeamMatchStatistics#getOffTarget <em>Off Target</em>}</li>
 *   <li>{@link tdt4250.wc.TeamMatchStatistics#getBlocked <em>Blocked</em>}</li>
 *   <li>{@link tdt4250.wc.TeamMatchStatistics#getWoodwork <em>Woodwork</em>}</li>
 *   <li>{@link tdt4250.wc.TeamMatchStatistics#getCorners <em>Corners</em>}</li>
 *   <li>{@link tdt4250.wc.TeamMatchStatistics#getOffsides <em>Offsides</em>}</li>
 *   <li>{@link tdt4250.wc.TeamMatchStatistics#getBallPossession <em>Ball Possession</em>}</li>
 *   <li>{@link tdt4250.wc.TeamMatchStatistics#getPassAccuracy <em>Pass Accuracy</em>}</li>
 *   <li>{@link tdt4250.wc.TeamMatchStatistics#getNumPasses <em>Num Passes</em>}</li>
 *   <li>{@link tdt4250.wc.TeamMatchStatistics#getPassesCompleted <em>Passes Completed</em>}</li>
 *   <li>{@link tdt4250.wc.TeamMatchStatistics#getDistanceCovered <em>Distance Covered</em>}</li>
 *   <li>{@link tdt4250.wc.TeamMatchStatistics#getBallsRecovered <em>Balls Recovered</em>}</li>
 *   <li>{@link tdt4250.wc.TeamMatchStatistics#getTackles <em>Tackles</em>}</li>
 *   <li>{@link tdt4250.wc.TeamMatchStatistics#getClearances <em>Clearances</em>}</li>
 *   <li>{@link tdt4250.wc.TeamMatchStatistics#getYellowCards <em>Yellow Cards</em>}</li>
 *   <li>{@link tdt4250.wc.TeamMatchStatistics#getRedCards <em>Red Cards</em>}</li>
 *   <li>{@link tdt4250.wc.TeamMatchStatistics#getFoulsCommitted <em>Fouls Committed</em>}</li>
 * </ul>
 *
 * @see tdt4250.wc.WcPackage#getTeamMatchStatistics()
 * @model
 * @generated
 */
public interface TeamMatchStatistics extends EObject {
	/**
	 * Returns the value of the '<em><b>Goals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goals</em>' attribute.
	 * @see #setGoals(int)
	 * @see tdt4250.wc.WcPackage#getTeamMatchStatistics_Goals()
	 * @model
	 * @generated
	 */
	int getGoals();

	/**
	 * Sets the value of the '{@link tdt4250.wc.TeamMatchStatistics#getGoals <em>Goals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goals</em>' attribute.
	 * @see #getGoals()
	 * @generated
	 */
	void setGoals(int value);

	/**
	 * Returns the value of the '<em><b>Penalties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Penalties</em>' attribute.
	 * @see #setPenalties(int)
	 * @see tdt4250.wc.WcPackage#getTeamMatchStatistics_Penalties()
	 * @model
	 * @generated
	 */
	int getPenalties();

	/**
	 * Sets the value of the '{@link tdt4250.wc.TeamMatchStatistics#getPenalties <em>Penalties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Penalties</em>' attribute.
	 * @see #getPenalties()
	 * @generated
	 */
	void setPenalties(int value);

	/**
	 * Returns the value of the '<em><b>Attempts On Goal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attempts On Goal</em>' attribute.
	 * @see #setAttemptsOnGoal(int)
	 * @see tdt4250.wc.WcPackage#getTeamMatchStatistics_AttemptsOnGoal()
	 * @model
	 * @generated
	 */
	int getAttemptsOnGoal();

	/**
	 * Sets the value of the '{@link tdt4250.wc.TeamMatchStatistics#getAttemptsOnGoal <em>Attempts On Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attempts On Goal</em>' attribute.
	 * @see #getAttemptsOnGoal()
	 * @generated
	 */
	void setAttemptsOnGoal(int value);

	/**
	 * Returns the value of the '<em><b>On Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Target</em>' attribute.
	 * @see #setOnTarget(int)
	 * @see tdt4250.wc.WcPackage#getTeamMatchStatistics_OnTarget()
	 * @model
	 * @generated
	 */
	int getOnTarget();

	/**
	 * Sets the value of the '{@link tdt4250.wc.TeamMatchStatistics#getOnTarget <em>On Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Target</em>' attribute.
	 * @see #getOnTarget()
	 * @generated
	 */
	void setOnTarget(int value);

	/**
	 * Returns the value of the '<em><b>Off Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Off Target</em>' attribute.
	 * @see #setOffTarget(int)
	 * @see tdt4250.wc.WcPackage#getTeamMatchStatistics_OffTarget()
	 * @model
	 * @generated
	 */
	int getOffTarget();

	/**
	 * Sets the value of the '{@link tdt4250.wc.TeamMatchStatistics#getOffTarget <em>Off Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Off Target</em>' attribute.
	 * @see #getOffTarget()
	 * @generated
	 */
	void setOffTarget(int value);

	/**
	 * Returns the value of the '<em><b>Blocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blocked</em>' attribute.
	 * @see #setBlocked(int)
	 * @see tdt4250.wc.WcPackage#getTeamMatchStatistics_Blocked()
	 * @model
	 * @generated
	 */
	int getBlocked();

	/**
	 * Sets the value of the '{@link tdt4250.wc.TeamMatchStatistics#getBlocked <em>Blocked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blocked</em>' attribute.
	 * @see #getBlocked()
	 * @generated
	 */
	void setBlocked(int value);

	/**
	 * Returns the value of the '<em><b>Woodwork</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Woodwork</em>' attribute.
	 * @see #setWoodwork(int)
	 * @see tdt4250.wc.WcPackage#getTeamMatchStatistics_Woodwork()
	 * @model
	 * @generated
	 */
	int getWoodwork();

	/**
	 * Sets the value of the '{@link tdt4250.wc.TeamMatchStatistics#getWoodwork <em>Woodwork</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Woodwork</em>' attribute.
	 * @see #getWoodwork()
	 * @generated
	 */
	void setWoodwork(int value);

	/**
	 * Returns the value of the '<em><b>Corners</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Corners</em>' attribute.
	 * @see #setCorners(int)
	 * @see tdt4250.wc.WcPackage#getTeamMatchStatistics_Corners()
	 * @model
	 * @generated
	 */
	int getCorners();

	/**
	 * Sets the value of the '{@link tdt4250.wc.TeamMatchStatistics#getCorners <em>Corners</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Corners</em>' attribute.
	 * @see #getCorners()
	 * @generated
	 */
	void setCorners(int value);

	/**
	 * Returns the value of the '<em><b>Offsides</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offsides</em>' attribute.
	 * @see #setOffsides(int)
	 * @see tdt4250.wc.WcPackage#getTeamMatchStatistics_Offsides()
	 * @model
	 * @generated
	 */
	int getOffsides();

	/**
	 * Sets the value of the '{@link tdt4250.wc.TeamMatchStatistics#getOffsides <em>Offsides</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offsides</em>' attribute.
	 * @see #getOffsides()
	 * @generated
	 */
	void setOffsides(int value);

	/**
	 * Returns the value of the '<em><b>Ball Possession</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ball Possession</em>' attribute.
	 * @see #setBallPossession(int)
	 * @see tdt4250.wc.WcPackage#getTeamMatchStatistics_BallPossession()
	 * @model
	 * @generated
	 */
	int getBallPossession();

	/**
	 * Sets the value of the '{@link tdt4250.wc.TeamMatchStatistics#getBallPossession <em>Ball Possession</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ball Possession</em>' attribute.
	 * @see #getBallPossession()
	 * @generated
	 */
	void setBallPossession(int value);

	/**
	 * Returns the value of the '<em><b>Pass Accuracy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pass Accuracy</em>' attribute.
	 * @see #setPassAccuracy(int)
	 * @see tdt4250.wc.WcPackage#getTeamMatchStatistics_PassAccuracy()
	 * @model
	 * @generated
	 */
	int getPassAccuracy();

	/**
	 * Sets the value of the '{@link tdt4250.wc.TeamMatchStatistics#getPassAccuracy <em>Pass Accuracy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pass Accuracy</em>' attribute.
	 * @see #getPassAccuracy()
	 * @generated
	 */
	void setPassAccuracy(int value);

	/**
	 * Returns the value of the '<em><b>Num Passes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Passes</em>' attribute.
	 * @see #setNumPasses(int)
	 * @see tdt4250.wc.WcPackage#getTeamMatchStatistics_NumPasses()
	 * @model
	 * @generated
	 */
	int getNumPasses();

	/**
	 * Sets the value of the '{@link tdt4250.wc.TeamMatchStatistics#getNumPasses <em>Num Passes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Passes</em>' attribute.
	 * @see #getNumPasses()
	 * @generated
	 */
	void setNumPasses(int value);

	/**
	 * Returns the value of the '<em><b>Passes Completed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passes Completed</em>' attribute.
	 * @see #setPassesCompleted(int)
	 * @see tdt4250.wc.WcPackage#getTeamMatchStatistics_PassesCompleted()
	 * @model
	 * @generated
	 */
	int getPassesCompleted();

	/**
	 * Sets the value of the '{@link tdt4250.wc.TeamMatchStatistics#getPassesCompleted <em>Passes Completed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passes Completed</em>' attribute.
	 * @see #getPassesCompleted()
	 * @generated
	 */
	void setPassesCompleted(int value);

	/**
	 * Returns the value of the '<em><b>Distance Covered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance Covered</em>' attribute.
	 * @see #setDistanceCovered(int)
	 * @see tdt4250.wc.WcPackage#getTeamMatchStatistics_DistanceCovered()
	 * @model
	 * @generated
	 */
	int getDistanceCovered();

	/**
	 * Sets the value of the '{@link tdt4250.wc.TeamMatchStatistics#getDistanceCovered <em>Distance Covered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance Covered</em>' attribute.
	 * @see #getDistanceCovered()
	 * @generated
	 */
	void setDistanceCovered(int value);

	/**
	 * Returns the value of the '<em><b>Balls Recovered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Balls Recovered</em>' attribute.
	 * @see #setBallsRecovered(int)
	 * @see tdt4250.wc.WcPackage#getTeamMatchStatistics_BallsRecovered()
	 * @model
	 * @generated
	 */
	int getBallsRecovered();

	/**
	 * Sets the value of the '{@link tdt4250.wc.TeamMatchStatistics#getBallsRecovered <em>Balls Recovered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Balls Recovered</em>' attribute.
	 * @see #getBallsRecovered()
	 * @generated
	 */
	void setBallsRecovered(int value);

	/**
	 * Returns the value of the '<em><b>Tackles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tackles</em>' attribute.
	 * @see #setTackles(int)
	 * @see tdt4250.wc.WcPackage#getTeamMatchStatistics_Tackles()
	 * @model
	 * @generated
	 */
	int getTackles();

	/**
	 * Sets the value of the '{@link tdt4250.wc.TeamMatchStatistics#getTackles <em>Tackles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tackles</em>' attribute.
	 * @see #getTackles()
	 * @generated
	 */
	void setTackles(int value);

	/**
	 * Returns the value of the '<em><b>Clearances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clearances</em>' attribute.
	 * @see #setClearances(int)
	 * @see tdt4250.wc.WcPackage#getTeamMatchStatistics_Clearances()
	 * @model
	 * @generated
	 */
	int getClearances();

	/**
	 * Sets the value of the '{@link tdt4250.wc.TeamMatchStatistics#getClearances <em>Clearances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clearances</em>' attribute.
	 * @see #getClearances()
	 * @generated
	 */
	void setClearances(int value);

	/**
	 * Returns the value of the '<em><b>Yellow Cards</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Yellow Cards</em>' attribute.
	 * @see #setYellowCards(int)
	 * @see tdt4250.wc.WcPackage#getTeamMatchStatistics_YellowCards()
	 * @model
	 * @generated
	 */
	int getYellowCards();

	/**
	 * Sets the value of the '{@link tdt4250.wc.TeamMatchStatistics#getYellowCards <em>Yellow Cards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Yellow Cards</em>' attribute.
	 * @see #getYellowCards()
	 * @generated
	 */
	void setYellowCards(int value);

	/**
	 * Returns the value of the '<em><b>Red Cards</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Red Cards</em>' attribute.
	 * @see #setRedCards(int)
	 * @see tdt4250.wc.WcPackage#getTeamMatchStatistics_RedCards()
	 * @model
	 * @generated
	 */
	int getRedCards();

	/**
	 * Sets the value of the '{@link tdt4250.wc.TeamMatchStatistics#getRedCards <em>Red Cards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Red Cards</em>' attribute.
	 * @see #getRedCards()
	 * @generated
	 */
	void setRedCards(int value);

	/**
	 * Returns the value of the '<em><b>Fouls Committed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fouls Committed</em>' attribute.
	 * @see #setFoulsCommitted(int)
	 * @see tdt4250.wc.WcPackage#getTeamMatchStatistics_FoulsCommitted()
	 * @model
	 * @generated
	 */
	int getFoulsCommitted();

	/**
	 * Sets the value of the '{@link tdt4250.wc.TeamMatchStatistics#getFoulsCommitted <em>Fouls Committed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fouls Committed</em>' attribute.
	 * @see #getFoulsCommitted()
	 * @generated
	 */
	void setFoulsCommitted(int value);

} // TeamMatchStatistics
