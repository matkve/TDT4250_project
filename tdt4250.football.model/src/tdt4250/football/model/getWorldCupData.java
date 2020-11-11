package tdt4250.football.model;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class getWorldCupData {
	public static void main(String[] args) {
		loadDataSetJSON("/teams", "teams");
	}
	
	public static void loadDataSetJSON(String endPoint, String fileName) {
		// Public data set for football world cup in JSON format: https://github.com/estiens/world_cup_json
		// Extracts the data from a valid endpoint as explained on the github page, and stores it as a json file
		// with name "fileName" in the dataset folder. Beware that eclipse doesn't show the file in the folder immediately,
		// but it will be there if you look in the system file explorer.
		try {
			String worldCupApiJSON = "http://worldcup.sfg.io" + endPoint;
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
	}
}
