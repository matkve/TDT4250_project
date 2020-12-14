package POJO;

public class WeatherPOJO {
	private String humidity;
	private String temp_celsius;
	private String temp_farenheit;
	private String wind_speed;
	private String description;
	
	public Integer getHumidity() {
		return Integer.parseInt(humidity);
	}
	public void setHumidity(String humidity) {
		this.humidity = humidity;
	}
	public Integer getTemp_celsius() {
		return Integer.parseInt(temp_celsius);
	}
	public void setTemp_celsius(String temp_celsius) {
		this.temp_celsius = temp_celsius;
	}
	public Integer getTemp_farenheit() {
		return Integer.parseInt(temp_farenheit);
	}
	public void setTemp_farenheit(String temp_farenheit) {
		this.temp_farenheit = temp_farenheit;
	}
	public Integer getWind_speed() {
		return Integer.parseInt(wind_speed);
	}
	public void setWind_speed(String wind_speed) {
		this.wind_speed = wind_speed;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
