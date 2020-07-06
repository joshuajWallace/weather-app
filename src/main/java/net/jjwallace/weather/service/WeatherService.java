package net.jjwallace.weather.service;

import java.util.List;

import org.springframework.stereotype.Service;

import net.jjwallace.weather.DTO.City;
import net.jjwallace.weather.DTO.Coordinate;
import net.jjwallace.weather.DTO.CurrentDataSet;
import net.jjwallace.weather.DTO.WeatherRespone;

@Service
public interface WeatherService {
	
	public List<City> getCities();

	public List<String> getCountries();

	public List<City> getNames(String country);

	public CurrentDataSet getCurrentData(int id);
	
	public WeatherRespone getWeatherRespone(Coordinate coord);

}
