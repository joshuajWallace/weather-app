package net.jjwallace.weather.service;

import java.util.List;

import org.springframework.stereotype.Service;

import net.jjwallace.weather.model.City;
import net.jjwallace.weather.model.DataSet;

@Service
public interface WeatherService {
	
	public List<City> getCities();

	public List<String> getCountries();

	public List<City> getNames(String country);

	public DataSet getCurrentData(int id);

}
