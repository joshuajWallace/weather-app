package net.jjwallace.weather.DTO;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
/*
 * using current.city.list file and current weather api call
 */
@Data
@JsonIgnoreProperties({"sys", "timezone", "coord", "id", "name", "cod", "base"})
public class CurrentDataSet {
	private Main main;
	private int visibility;
	private List<Weather> weather;
	private Wind wind;
	private Clouds clouds;
	private long dt;
}
