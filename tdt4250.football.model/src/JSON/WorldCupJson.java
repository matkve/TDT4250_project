package JSON;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emfjson.jackson.resource.JsonResourceFactory;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import POJO.MatchEventPOJO;
import POJO.MatchPOJO;
import POJO.MatchTeamPOJO;
import POJO.PlayerPOJO;
import POJO.TeamPOJO;
import POJO.TeamStatsPOJO;
import POJO.WeatherPOJO;
import tdt4250.wc.WcPackage;
import tdt4250.wc.impl.WcPackageImpl;

public class WorldCupJson {
	private ObjectMapper objectMapper = getDefaultObjectMapper();
	private EList<EObject> worldCups = new BasicEList<EObject>();
	private WcPackage wcEPackage;
	private ResourceSet resourceSet;
	
	public enum WorldCupKind {
		WOMEN,
		MEN
	}
	
	public WorldCupJson() {
		// Set up a resourceSet with a resourceFactory for JSON
		resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("wc", new JsonResourceFactory());
		// Load the ecore metamodel
		wcEPackage = WcPackageImpl.init();
		resourceSet.getPackageRegistry().put(wcEPackage.getNsURI(), wcEPackage);
	}
	
	private ObjectMapper getDefaultObjectMapper() {
		ObjectMapper defaultObjectMapper = new ObjectMapper();
		defaultObjectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		return defaultObjectMapper;
	}
	
	public void CreateWorldCupModelInstance() throws IOException {
		EObject universe = EcoreUtil.create(wcEPackage.getUniverse());
		universe.eSet(wcEPackage.getUniverse_WorldCups(), worldCups);
		// Create wc instance
		Resource res = resourceSet.createResource(URI.createURI("model/worldCup.wc"));
		res.getContents().add(universe);
		// Save the model to its specified URI
		res.save(null);
	}
	
	public void AddWorldCup(WorldCupKind kind, String year) {
		// Perform the M2M transformation
		// Load new world cup dataset
		List<TeamPOJO> teams = new ArrayList<TeamPOJO>();
		List<MatchPOJO> matches = new ArrayList<MatchPOJO>();
		loadDataSet(kind, teams, matches);
		// Create world cup
		EObject worldCup = EcoreUtil.create(wcEPackage.getWorldCup());
		worldCup.eSet(wcEPackage.getWorldCup_Year(), year);
		// Create teams
		Hashtable<String, EObject> teamDict = new Hashtable<String, EObject>();										// FIFA code as key and the corresponding team as value
		// FIFA code as the first key, and the name of a player in the team as the second key, with the corresponding player object as value:
		Hashtable<String, Hashtable<String, EObject>> teamPlayersDict = new Hashtable<String, Hashtable<String, EObject>>();
		Hashtable<String, Character> teamGroupLetterDict = new Hashtable<String, Character>();						// FIFA code as key and the corresponding team's group letter as value
		Hashtable<Character, EList<EObject>> stageOneGroupMatchesDict = new Hashtable<Character, EList<EObject>>();	// Group letter as key and the corresponding stage one group matches as value
		EList<EObject> teamList = new BasicEList<EObject>();
		for(TeamPOJO t : teams) {
			EObject team = EcoreUtil.create(wcEPackage.getTeam());
			String fifaCode = t.getFifa_code();
			Character groupLetter = t.getGroup_letter();
			team.eSet(wcEPackage.getTeam_Code(), fifaCode);
			team.eSet(wcEPackage.getTeam_Country(), t.getCountry());
			teamList.add(team);
			teamDict.put(fifaCode, team);
			teamGroupLetterDict.put(fifaCode, groupLetter);
			// Associate the current team's group letter with a collection of matches within that stage one group if it isn't already
			if(!stageOneGroupMatchesDict.containsKey(groupLetter)) {
				stageOneGroupMatchesDict.put(groupLetter, new BasicEList<EObject>());
			}
		}
		// Create matches
		EList<EObject> roundOf16Matches = new BasicEList<EObject>();
		EList<EObject> quarterFinals = new BasicEList<EObject>();
		EList<EObject> semiFinals = new BasicEList<EObject>();
		// Also need to add the arenas where each match was played
		EList<EObject> arenas = new BasicEList<EObject>();
		Hashtable<String, Integer> arenaDict = new Hashtable<String, Integer>();	// Arena name as key, index as value pointing to the corresponding arena object in the arenas list
		Hashtable<String, EList<EObject>> arenaWeatherHistoryDict = new Hashtable<String, EList<EObject>>();	// Arena name as key and the arena's weather history (list) as value
		for(MatchPOJO m : matches) {
			EObject match = EcoreUtil.create(wcEPackage.getMatch());
			// Create arenas
			String arenaName = m.getLocation();
			if(!arenaDict.containsKey(arenaName)) {
				// The arena where the match was played does not exist yet; create it
				EObject arena = EcoreUtil.create(wcEPackage.getArena());
				arena.eSet(wcEPackage.getArena_City(), m.getVenue());
				arena.eSet(wcEPackage.getArena_Name(), arenaName);
				arenaDict.put(arenaName, arenas.size());
				arenas.add(arena);
				match.eSet(wcEPackage.getMatch_Arena(), arena);
				// The weather history of the arena where the match was played does not exist yet; create it
				arenaWeatherHistoryDict.put(arenaName, new BasicEList<EObject>());
			}
			else {
				// Reuse the already existing arena
				match.eSet(wcEPackage.getMatch_Arena(), arenas.get(arenaDict.get(arenaName)));
			}
			// Create weather
			EObject weather = EcoreUtil.create(wcEPackage.getWeather());
			WeatherPOJO weatherPOJO = m.getWeather();
			weather.eSet(wcEPackage.getWeather_Description(), weatherPOJO.getDescription());
			weather.eSet(wcEPackage.getWeather_Humidity(), weatherPOJO.getHumidity());
			weather.eSet(wcEPackage.getWeather_TempCelcius(), weatherPOJO.getTemp_celsius());
			weather.eSet(wcEPackage.getWeather_TempFarenheit(), weatherPOJO.getTemp_farenheit());
			weather.eSet(wcEPackage.getWeather_WindSpeed(), weatherPOJO.getWind_speed());
			arenaWeatherHistoryDict.get(arenaName).add(weather);
			match.eSet(wcEPackage.getMatch_Weather(), weather);
			// Create players
			String homeTeam = m.getHome_team().getCode();
			String awayTeam = m.getAway_team().getCode();
			TeamStatsPOJO homeTeamStats = m.getHome_team_statistics();
			TeamStatsPOJO awayTeamStats = m.getAway_team_statistics();
			registerPlayersToTeam(homeTeamStats.getStarting_eleven(), homeTeam, teamPlayersDict);
			registerPlayersToTeam(homeTeamStats.getSubstitutes(), homeTeam, teamPlayersDict);
			registerPlayersToTeam(awayTeamStats.getStarting_eleven(), awayTeam, teamPlayersDict);
			registerPlayersToTeam(awayTeamStats.getSubstitutes(), awayTeam, teamPlayersDict);
			// Create home/away team match details
			EObject homeTeamMatchDetails = EcoreUtil.create(wcEPackage.getTeamMatchDetails());
			EObject awayTeamMatchDetails = EcoreUtil.create(wcEPackage.getTeamMatchDetails());
			// Set team references
			homeTeamMatchDetails.eSet(wcEPackage.getTeamMatchDetails_Team(), teamDict.get(homeTeam));
			awayTeamMatchDetails.eSet(wcEPackage.getTeamMatchDetails_Team(), teamDict.get(awayTeam));
			// Create team rosters
			homeTeamMatchDetails.eSet(wcEPackage.getTeamMatchDetails_TeamComposition(), getTeamRosterForMatch(homeTeam, homeTeamStats.getStarting_eleven(), homeTeamStats.getSubstitutes(), teamPlayersDict));
			awayTeamMatchDetails.eSet(wcEPackage.getTeamMatchDetails_TeamComposition(), getTeamRosterForMatch(awayTeam, awayTeamStats.getStarting_eleven(), awayTeamStats.getSubstitutes(), teamPlayersDict));
			// Create match events
			homeTeamMatchDetails.eSet(wcEPackage.getTeamMatchDetails_Events(), registerMatchEventsForTeam(m.getHome_team_events(), homeTeam, teamPlayersDict));
			awayTeamMatchDetails.eSet(wcEPackage.getTeamMatchDetails_Events(), registerMatchEventsForTeam(m.getAway_team_events(), awayTeam, teamPlayersDict));
			// Set winner
			String winnerTeam = m.getWinner_code();
			if(winnerTeam.equals(homeTeam)) {
				homeTeamMatchDetails.eSet(wcEPackage.getTeamMatchDetails_Winner(), true);
			}
			else if(winnerTeam.equals(awayTeam)) {
				awayTeamMatchDetails.eSet(wcEPackage.getTeamMatchDetails_Winner(), true);
			}
			// Set date time for match
			match.eSet(wcEPackage.getMatch_Datetime(), m.getDatetime());
			// Create team statistics for the match
			EObject homeTeamMatchStats = createTeamMatchStats(homeTeamStats, m.getHome_team());
			EObject awayTeamMatchStats = createTeamMatchStats(awayTeamStats, m.getAway_team());
			homeTeamMatchDetails.eSet(wcEPackage.getTeamMatchDetails_Statistics(), homeTeamMatchStats);
			awayTeamMatchDetails.eSet(wcEPackage.getTeamMatchDetails_Statistics(), awayTeamMatchStats);
			// Set the team details for the match
			match.eSet(wcEPackage.getMatch_HomeTeam(), homeTeamMatchDetails);
			match.eSet(wcEPackage.getMatch_AwayTeam(), awayTeamMatchDetails);
			// Add the different types of matches
			String stageName = m.getStage_name().toLowerCase();	// Inconsistency in lower case use in dataset between different world cup json files
			switch(stageName) {
			case "first stage":
				Character groupLetter = teamGroupLetterDict.get(m.getHome_team().getCode());
				stageOneGroupMatchesDict.get(groupLetter).add(match);	// Add the match to the corresponding first stage group.
				break;
			case "round of 16":
				roundOf16Matches.add(match);
				break;
			case "quarter-finals":
				quarterFinals.add(match);
				break;
			case "quarter-final":	// Inconsistency in dataset between different world cup json files
				quarterFinals.add(match);
				break;
			case "semi-finals":
				semiFinals.add(match);
				break;
			case "semi-final":	// Inconsistency in dataset between different world cup json files
				semiFinals.add(match);
				break;
			case "play-off for third place":
				worldCup.eSet(wcEPackage.getWorldCup_ThirdPlacePlayoff(), match);
				break;
			case "match for third place":	// Inconsistency in dataset between different world cup json files
				worldCup.eSet(wcEPackage.getWorldCup_ThirdPlacePlayoff(), match);
				break;
			case "final":
				worldCup.eSet(wcEPackage.getWorldCup_Final(), match);
				break;
			}
		}
		worldCup.eSet(wcEPackage.getWorldCup_RoundOf16(), roundOf16Matches);
		worldCup.eSet(wcEPackage.getWorldCup_QuarterFinals(), quarterFinals);
		worldCup.eSet(wcEPackage.getWorldCup_SemiFinals(), semiFinals);
		// Create players
		teamPlayersDict.forEach((teamCode, players) -> {
			EList<EObject> playerList = new BasicEList<EObject>();
			players.forEach((name, player) -> {
				playerList.add(player);
			});
			teamDict.get(teamCode).eSet(wcEPackage.getTeam_Players(), playerList);
		});
		worldCup.eSet(wcEPackage.getWorldCup_Teams(), teamList);
		// Create stage one groups
		EList<EObject> stageOneGroupList = new BasicEList<EObject>();
		stageOneGroupMatchesDict.forEach((group, grpMatches) -> {
			EObject stageOneGroup = EcoreUtil.create(wcEPackage.getStageOneGroup());
			stageOneGroup.eSet(wcEPackage.getStageOneGroup_GroupLetter(), group);
			stageOneGroup.eSet(wcEPackage.getStageOneGroup_Match(), grpMatches);
			stageOneGroupList.add(stageOneGroup);
		});
		worldCup.eSet(wcEPackage.getWorldCup_StageOneGroups(), stageOneGroupList);
		// Add weather histories to the arenas
		arenaWeatherHistoryDict.forEach((arenaName, weatherHistory) -> {
			arenas.get(arenaDict.get(arenaName)).eSet(wcEPackage.getArena_WeatherHistory(), weatherHistory);
		});	
		// Add the arenas
		worldCup.eSet(wcEPackage.getWorldCup_Arenas(), arenas);
		worldCups.add(worldCup);
	}
	
	private EObject createTeamMatchStats(TeamStatsPOJO teamStats, MatchTeamPOJO matchTeam) {
		EObject teamMatchStats = EcoreUtil.create(wcEPackage.getTeamMatchStatistics());
		teamMatchStats.eSet(wcEPackage.getTeamMatchStatistics_Goals(), matchTeam.getGoals());
		teamMatchStats.eSet(wcEPackage.getTeamMatchStatistics_Penalties(), matchTeam.getPenalties());
		teamMatchStats.eSet(wcEPackage.getTeamMatchStatistics_AttemptsOnGoal(), teamStats.getAttempts_on_goal());
		teamMatchStats.eSet(wcEPackage.getTeamMatchStatistics_OnTarget(), teamStats.getOn_target());
		teamMatchStats.eSet(wcEPackage.getTeamMatchStatistics_OffTarget(), teamStats.getOff_target());
		teamMatchStats.eSet(wcEPackage.getTeamMatchStatistics_Blocked(), teamStats.getBlocked());
		teamMatchStats.eSet(wcEPackage.getTeamMatchStatistics_Woodwork(), teamStats.getWoodwork());
		teamMatchStats.eSet(wcEPackage.getTeamMatchStatistics_Corners(), teamStats.getCorners());
		teamMatchStats.eSet(wcEPackage.getTeamMatchStatistics_Offsides(), teamStats.getOffsides());
		teamMatchStats.eSet(wcEPackage.getTeamMatchStatistics_BallPossession(), teamStats.getBall_possession());
		teamMatchStats.eSet(wcEPackage.getTeamMatchStatistics_PassAccuracy(), teamStats.getPass_accuracy());
		teamMatchStats.eSet(wcEPackage.getTeamMatchStatistics_NumPasses(), teamStats.getNum_passes());
		teamMatchStats.eSet(wcEPackage.getTeamMatchStatistics_PassesCompleted(), teamStats.getPasses_completed());
		teamMatchStats.eSet(wcEPackage.getTeamMatchStatistics_DistanceCovered(), teamStats.getDistance_covered());
		teamMatchStats.eSet(wcEPackage.getTeamMatchStatistics_BallsRecovered(), teamStats.getBalls_recovered());
		teamMatchStats.eSet(wcEPackage.getTeamMatchStatistics_Tackles(), teamStats.getTackles());
		teamMatchStats.eSet(wcEPackage.getTeamMatchStatistics_Clearances(), teamStats.getClearances());
		teamMatchStats.eSet(wcEPackage.getTeamMatchStatistics_YellowCards(), teamStats.getYellow_cards());
		teamMatchStats.eSet(wcEPackage.getTeamMatchStatistics_RedCards(), teamStats.getRed_cards());
		teamMatchStats.eSet(wcEPackage.getTeamMatchStatistics_FoulsCommitted(), teamStats.getFouls_committed());
		return teamMatchStats;
	}
	
	private void registerPlayersToTeam(List<PlayerPOJO> players, String teamCode, Hashtable<String, Hashtable<String, EObject>> teamPlayersDict) {
		if(!teamPlayersDict.containsKey(teamCode)) {
			teamPlayersDict.put(teamCode, new Hashtable<String, EObject>());
		}
		Hashtable<String, EObject> teamPlayers = teamPlayersDict.get(teamCode);
		for(PlayerPOJO p : players) {
			String playerName = p.getName();
			if(!teamPlayers.containsKey(playerName)) {
				EObject player = EcoreUtil.create(wcEPackage.getPlayer());
				player.eSet(wcEPackage.getPlayer_Name(), playerName);
				player.eSet(wcEPackage.getPlayer_ShirtNumber(), p.getShirt_number());
				teamPlayers.put(playerName, player);
			}
		}
	}
	
	private EObject getTeamRosterForMatch(String teamCode, List<PlayerPOJO> starting11, List<PlayerPOJO> substitutes, Hashtable<String, Hashtable<String, EObject>> teamPlayersDict) {
		EObject roster = EcoreUtil.create(wcEPackage.getStartStrategy());
		Hashtable<String, EObject> teamPlayers = teamPlayersDict.get(teamCode);
		EList<EObject> defenders = new BasicEList<EObject>();
		EList<EObject> midfields = new BasicEList<EObject>();
		EList<EObject> attackers = new BasicEList<EObject>();
		for(PlayerPOJO p : starting11) {
			EObject player = teamPlayers.get(p.getName());
			if(p.isCaptain()) {
				roster.eSet(wcEPackage.getStartStrategy_Captain(), player);
			}
			String playerPosition = p.getPosition();
			switch(playerPosition) {
			case "Goalie":
				roster.eSet(wcEPackage.getStartStrategy_Goalie(), player);
				break;
			case "Defender":
				defenders.add(player);
				break;
			case "Midfield":
				midfields.add(player);
				break;
			case "Forward":
				attackers.add(player);
				break;
			}
		}
		roster.eSet(wcEPackage.getStartStrategy_Defender(), defenders);
		roster.eSet(wcEPackage.getStartStrategy_Midfield(), midfields);
		roster.eSet(wcEPackage.getStartStrategy_Forward(), attackers);
		EList<EObject> eSubstitutes = new BasicEList<EObject>();
		for(PlayerPOJO p : substitutes) {
			EObject player = teamPlayers.get(p.getName());
			eSubstitutes.add(player);
		}
		roster.eSet(wcEPackage.getStartStrategy_Substitutes(), eSubstitutes);
		return roster;
	}
	
	private EList<EObject> registerMatchEventsForTeam(List<MatchEventPOJO> matchEvents, String teamCode, Hashtable<String, Hashtable<String, EObject>> teamPlayersDict) {
		Hashtable<String, EObject> teamPlayers = teamPlayersDict.get(teamCode);
		EList<EObject> events = new BasicEList<EObject>();
		for(MatchEventPOJO e : matchEvents) {
			EObject event = EcoreUtil.create(wcEPackage.getEvent());
			event.eSet(wcEPackage.getEvent_Player(), teamPlayers.get(e.getPlayer()));
			event.eSet(wcEPackage.getEvent_Description(), e.getType_of_event());
			event.eSet(wcEPackage.getEvent_Time(), e.getTime());
			events.add(event);
		}
		return events;
	}
	
	private void loadDataSet(WorldCupKind kind, List<TeamPOJO> teams, List<MatchPOJO> matches) {
		try {
			String site;
			switch(kind) {
				case WOMEN:
					site = "http://worldcup.sfg.io";
					break;
				default:
					site = "https://world-cup-json-2018.herokuapp.com";
			}
			String teamsUrl = site + "/teams";
			String matchesUrl = site + "/matches";
			// Fetch JSON dataset for men/women world cup teams and deserialize them with jackson into an array of teams
			HttpURLConnection httpcon = (HttpURLConnection) new URL(teamsUrl).openConnection();
			InputStream inputStream = httpcon.getInputStream();
			teams.addAll(Arrays.asList(objectMapper.readValue(inputStream, TeamPOJO[].class)));
			inputStream.close();
			// Fetch JSON dataset for men/women world cup matches and deserialize them with jackson into an array of matches
			httpcon = (HttpURLConnection) new URL(matchesUrl).openConnection();
			inputStream = httpcon.getInputStream();
			matches.addAll(Arrays.asList(objectMapper.readValue(inputStream, MatchPOJO[].class)));
			inputStream.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	/*public void loadDataSetFile(WorldCupKind kind, String endPoint, String fileName) {
		// Public data set for football world cup in JSON format: https://github.com/estiens/world_cup_json
		// Extracts the data from a valid endpoint as explained on the github page, and stores it as a json file
		// with name "fileName" in the dataset folder. Beware that eclipse doesn't show the file in the folder immediately,
		// but it will be there if you look in the system file explorer.
		try {
			String worldCupApiJSON;
			switch(kind) {
				case WOMEN:
					worldCupApiJSON = "http://worldcup.sfg.io" + endPoint;
					break;
				default:
					worldCupApiJSON = "https://world-cup-json-2018.herokuapp.com" + endPoint;
			}
			HttpURLConnection httpcon = (HttpURLConnection) new URL(worldCupApiJSON).openConnection();
			// Open input stream from the HTTP connection
			InputStream inputStream = httpcon.getInputStream();
			String saveFilePath = "dataset/" + fileName + ".json";
			// Open output stream to save into file
			FileOutputStream outputStream = new FileOutputStream(saveFilePath);
			int bytesRead = -1;
			byte[] buffer = new byte[4096];
			while ((bytesRead = inputStream.read(buffer)) != -1) {
				outputStream.write(buffer, 0, bytesRead);
			}
			outputStream.close();
			inputStream.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}*/
}
