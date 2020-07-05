package net.jjwallace.weather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import net.jjwallace.weather.model.City;
import net.jjwallace.weather.service.WeatherService;

@Controller
public class WeatherAppController {
	
	@Autowired
	private WeatherService weatherService;
	
	
	@GetMapping("/")
	public String weatherPage(Model model) {
		model.addAttribute("newCity", new City());
		model.addAttribute("countries", weatherService.getCountries());
		return "weather";
	}
	
	
	@PostMapping("/city")
	public String forCity(@RequestParam("newCity") City newCity, Model model) {
		model.addAttribute("city", newCity);
		model.addAttribute("newCity", new City());
		model.addAttribute("countries", weatherService.getCountries());
		model.addAttribute("currrentWeatherData", weatherService.getCurrentData(newCity.getId()));
		return "weather-data";
	}

}
