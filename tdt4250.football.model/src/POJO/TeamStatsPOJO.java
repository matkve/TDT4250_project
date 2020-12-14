package POJO;

import java.util.List;

public class TeamStatsPOJO {
	private int attempts_on_goal;
	private int on_target;
	private int off_target;
	private int blocked;
	private int woodwork;
	private int corners;
	private int offsides;
	private int ball_possession;
	private int pass_accuracy;
	private int num_passes;
	private int passes_completed;
	private int distance_covered;
	private int balls_recovered;
	private int tackles;
	private int clearances;
	private int yellow_cards;
	private int red_cards;
	private int fouls_committed;
	private List<PlayerPOJO> starting_eleven;
	private List<PlayerPOJO> substitutes;
	
	public int getAttempts_on_goal() {
		return attempts_on_goal;
	}
	public void setAttempts_on_goal(int attempts_on_goal) {
		this.attempts_on_goal = attempts_on_goal;
	}
	public int getOn_target() {
		return on_target;
	}
	public void setOn_target(int on_target) {
		this.on_target = on_target;
	}
	public int getOff_target() {
		return off_target;
	}
	public void setOff_target(int off_target) {
		this.off_target = off_target;
	}
	public int getBlocked() {
		return blocked;
	}
	public void setBlocked(int blocked) {
		this.blocked = blocked;
	}
	public int getWoodwork() {
		return woodwork;
	}
	public void setWoodwork(int woodwork) {
		this.woodwork = woodwork;
	}
	public int getCorners() {
		return corners;
	}
	public void setCorners(int corners) {
		this.corners = corners;
	}
	public int getOffsides() {
		return offsides;
	}
	public void setOffsides(int offsides) {
		this.offsides = offsides;
	}
	public int getBall_possession() {
		return ball_possession;
	}
	public void setBall_possession(int ball_possession) {
		this.ball_possession = ball_possession;
	}
	public int getPass_accuracy() {
		return pass_accuracy;
	}
	public void setPass_accuracy(int pass_accuracy) {
		this.pass_accuracy = pass_accuracy;
	}
	public int getNum_passes() {
		return num_passes;
	}
	public void setNum_passes(int num_passes) {
		this.num_passes = num_passes;
	}
	public int getPasses_completed() {
		return passes_completed;
	}
	public void setPasses_completed(int passes_completed) {
		this.passes_completed = passes_completed;
	}
	public int getDistance_covered() {
		return distance_covered;
	}
	public void setDistance_covered(int distance_covered) {
		this.distance_covered = distance_covered;
	}
	public int getBalls_recovered() {
		return balls_recovered;
	}
	public void setBalls_recovered(int balls_recovered) {
		this.balls_recovered = balls_recovered;
	}
	public int getTackles() {
		return tackles;
	}
	public void setTackles(int tackles) {
		this.tackles = tackles;
	}
	public int getClearances() {
		return clearances;
	}
	public void setClearances(int clearances) {
		this.clearances = clearances;
	}
	public int getYellow_cards() {
		return yellow_cards;
	}
	public void setYellow_cards(int yellow_cards) {
		this.yellow_cards = yellow_cards;
	}
	public int getRed_cards() {
		return red_cards;
	}
	public void setRed_cards(int red_cards) {
		this.red_cards = red_cards;
	}
	public int getFouls_committed() {
		return fouls_committed;
	}
	public void setFouls_committed(int fouls_committed) {
		this.fouls_committed = fouls_committed;
	}
	public List<PlayerPOJO> getStarting_eleven() {
		return starting_eleven;
	}
	public void setStarting_eleven(List<PlayerPOJO> starting_eleven) {
		this.starting_eleven = starting_eleven;
	}
	public List<PlayerPOJO> getSubstitutes() {
		return substitutes;
	}
	public void setSubstitutes(List<PlayerPOJO> substitutes) {
		this.substitutes = substitutes;
	}
}
