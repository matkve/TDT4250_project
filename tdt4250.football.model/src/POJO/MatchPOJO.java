package POJO;

import java.util.List;

public class MatchPOJO {
	private String venue;
	private String location;
	private WeatherPOJO weather;
	private String stage_name;
	private String datetime;
	private String winner_code;
	private MatchTeamPOJO home_team;
	private MatchTeamPOJO away_team;
	private List<MatchEventPOJO> home_team_events;
	private List<MatchEventPOJO> away_team_events;
	private TeamStatsPOJO home_team_statistics;
	private TeamStatsPOJO away_team_statistics;
	
	public String getDatetime() {
		return datetime;
	}
	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public WeatherPOJO getWeather() {
		return weather;
	}
	public void setWeather(WeatherPOJO weather) {
		this.weather = weather;
	}
	public String getStage_name() {
		return stage_name;
	}
	public void setStage_name(String stage_name) {
		this.stage_name = stage_name;
	}
	public String getWinner_code() {
		return winner_code;
	}
	public void setWinner_code(String winner_code) {
		this.winner_code = winner_code;
	}
	public MatchTeamPOJO getHome_team() {
		return home_team;
	}
	public void setHome_team(MatchTeamPOJO home_team) {
		this.home_team = home_team;
	}
	public MatchTeamPOJO getAway_team() {
		return away_team;
	}
	public void setAway_team(MatchTeamPOJO away_team) {
		this.away_team = away_team;
	}
	public List<MatchEventPOJO> getHome_team_events() {
		return home_team_events;
	}
	public void setHome_team_events(List<MatchEventPOJO> home_team_events) {
		this.home_team_events = home_team_events;
	}
	public List<MatchEventPOJO> getAway_team_events() {
		return away_team_events;
	}
	public void setAway_team_events(List<MatchEventPOJO> away_team_events) {
		this.away_team_events = away_team_events;
	}
	public TeamStatsPOJO getHome_team_statistics() {
		return home_team_statistics;
	}
	public void setHome_team_statistics(TeamStatsPOJO home_team_statistics) {
		this.home_team_statistics = home_team_statistics;
	}
	public TeamStatsPOJO getAway_team_statistics() {
		return away_team_statistics;
	}
	public void setAway_team_statistics(TeamStatsPOJO away_team_statistics) {
		this.away_team_statistics = away_team_statistics;
	}
}
