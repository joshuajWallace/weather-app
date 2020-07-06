package net.jjwallace.weather.DTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class DailyTemp {
	
	private int min;
	
	private int max;

}
