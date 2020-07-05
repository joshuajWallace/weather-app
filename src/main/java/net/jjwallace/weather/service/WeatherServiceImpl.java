package net.jjwallace.weather.service;

import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import net.jjwallace.weather.DTO.City;
import net.jjwallace.weather.DTO.CurrentDataSet;

@Service
public class WeatherServiceImpl implements WeatherService{
	
	private RestTemplate restTemplate = new RestTemplate();
	 
	private String apikey = "&appid=2cc21bf26f60257606e999d3f2d2308c&units=metric";
	private String url = "http://api.openweathermap.org/data/2.5/weather?id=";
	
	@Override
	public CurrentDataSet getCurrentData(int id) {
		return restTemplate.getForObject((url + Integer.toString(id) + apikey), CurrentDataSet.class);
		}
	@Override
	public List<City> getCities(){
		ObjectMapper map = new ObjectMapper();
		try {
			File src = ResourceUtils.getFile("classpath:current.city.list.json");
			return map.readValue(src, new TypeReference<List<City>>(){});
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public List<String> getCountries(){
		List<String> countries = new ArrayList<String>();
		for(City city : getCities())
			if(!countries.contains(city.getCountry()))
				countries.add(city.getCountry());
		return countries.stream().sorted().collect(Collectors.toList());
	}
	public List<City> getNames(String country){
		List<City> withCountry = new ArrayList<City>();
		for(City city : getCities())
			if(city.getCountry().equals(country))
				withCountry.add(city);
		withCountry.sort(Comparator.comparing(City::getName));
		return withCountry;
	}


}
