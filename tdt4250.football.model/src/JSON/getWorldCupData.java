package JSON;

import java.io.IOException;

public class getWorldCupData {
	public static void main(String[] args) {
		WorldCupJson worldCups = new WorldCupJson();
		try {
			worldCups.AddWorldCup(WorldCupJson.WorldCupKind.MEN, "2018");
			worldCups.AddWorldCup(WorldCupJson.WorldCupKind.WOMEN, "2019");
			worldCups.CreateWorldCupModelInstance();	// This will create a file "worldCup.wc" in the model folder.
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
