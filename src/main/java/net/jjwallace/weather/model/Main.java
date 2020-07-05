package net.jjwallace.weather.model;

import lombok.Data;

@Data
public class Main {
	
	private double temp;
	private double tempMin;
	private double tempMax;
	private double pressure;
	private double seaLevel;
	private double grndLevel;
	private int humidity;
}
