package net.jjwallace.weather.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import net.jjwallace.weather.DTO.AllInOneCurrentData;
import net.jjwallace.weather.DTO.City;
import net.jjwallace.weather.DTO.Daily;
import net.jjwallace.weather.DTO.WeatherRespone;
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
		WeatherRespone weatherData = weatherService.getWeatherRespone(newCity.getCoord());
		AllInOneCurrentData currentWeatherData = weatherData.getCurrent();
		List<Daily> daily = weatherData.getDaily();
		model.addAttribute("currentWeatherData", currentWeatherData);
		model.addAttribute("daily", daily);
		model.addAttribute("city", newCity);
		model.addAttribute("countries", weatherService.getCountries());
		return "weather-data";
	}

}
