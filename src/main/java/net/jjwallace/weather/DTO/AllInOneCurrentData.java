package net.jjwallace.weather.DTO;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/*
 * current weather data for All in one api call
 */

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AllInOneCurrentData {
	private double temp;
	@JsonProperty("feels_like")
	private double feelsLike;
	private double uvi;
	private int visibility;
	private int humidity;
	private List<Weather> weather;
	private long dt;
	@JsonProperty("wind_speed")
	private double windSpeed;

}


