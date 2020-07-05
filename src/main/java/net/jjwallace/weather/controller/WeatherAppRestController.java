package net.jjwallace.weather.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.jjwallace.weather.model.City;
import net.jjwallace.weather.service.WeatherService;

@RestController
public class WeatherAppRestController {
	
	@Autowired
	private WeatherService weatherService;
	
	@PostMapping("/cities")
	public List<City> name(@RequestParam(value = "country", required=true) String country) {
		return weatherService.getNames(country);
	}

}
