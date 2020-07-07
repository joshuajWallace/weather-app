package net.jjwallace.weather.DTO;

import lombok.Data;
/*
 * needed if calling forecast weather api's only.
 */
@Data
public class Main {
	private double feelsLike;
	private double temp;
	private double tempMin;
	private double tempMax;
	private double pressure;
	private double seaLevel;
	private double grndLevel;
	private int humidity;
}
