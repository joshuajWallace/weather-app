package net.jjwallace.weather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import net.jjwallace.weather.DTO.City;
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
	public String forCity(@ModelAttribute("newCity") City newCity, Model model) {
		model.addAttribute("currentWeatherData", weatherService.getCurrentData(newCity.getId()));
		model.addAttribute("city", newCity);
		model.addAttribute("countries", weatherService.getCountries());
		return "weather-data";
	}

}
