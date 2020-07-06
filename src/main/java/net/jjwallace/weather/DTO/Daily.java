package net.jjwallace.weather.DTO;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Daily {
	
	private List<DailyTemp> temp;
	
	private int humidity;
	
	private Weather weather;
	

}
