package net.jjwallace.weather.DTO;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AllInOneCurrentData {
	private double temp;
	private double feelsLike;
	private double uvi;
	private int visibility;
	private int humidity;
	private List<Weather> weather;
	private double windSpeed;
	private long dt;
}


