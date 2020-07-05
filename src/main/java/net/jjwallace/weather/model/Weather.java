package net.jjwallace.weather.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties("base")
public class Weather {
	private int id;
	private String main;
	private String desciption;
	private String icon;
}
