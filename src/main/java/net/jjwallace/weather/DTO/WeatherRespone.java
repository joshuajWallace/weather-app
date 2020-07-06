package net.jjwallace.weather.DTO;

import java.util.List;

import lombok.Data;

@Data
public class WeatherRespone {
	
	private AllInOneCurrentData current;
	
	private List<Daily> daily;
	

}
