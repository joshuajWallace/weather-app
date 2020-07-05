package net.jjwallace.weather.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties({"sys", "timezone", "coord", "id", "name", "cod"})
public class CurrentDataSet {
	
	private Main main;
	private int visablitiy;
	private Weather weather;
	private Wind wind;
	private Clouds clouds;
	private long dt;
}
