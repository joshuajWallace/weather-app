package net.jjwallace.weather;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import net.jjwallace.weather.DTO.Coordinate;
import net.jjwallace.weather.DTO.WeatherRespone;
import net.jjwallace.weather.service.WeatherService;

@SpringBootTest
public class WeatherResponeTest {
	
	@Autowired
	private WeatherService weatherService;
	
	private Coordinate testCoord = new Coordinate(47.159401, 34.330502);
	
	@Test
	public void testWeatherRespone() {
		WeatherRespone respone = weatherService.getWeatherRespone(testCoord);
		System.out.println(respone.getDaily().toString());
		assertTrue(respone.getDaily() != null);
		assertTrue(respone.getCurrent() != null);
	}
}
