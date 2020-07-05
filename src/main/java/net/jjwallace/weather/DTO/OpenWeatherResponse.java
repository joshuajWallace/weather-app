package net.jjwallace.weather.DTO;

import java.util.List;
import lombok.Data;

@Data
public class OpenWeatherResponse {
	private String cod;
	private int message;
	private int cnt;
	private List<DataSet> list;
	private City city;

}