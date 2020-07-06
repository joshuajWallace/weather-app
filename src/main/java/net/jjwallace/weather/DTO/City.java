package net.jjwallace.weather.DTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties({"state"})
public class City implements Comparable<String>{
	
	private int id;
    private String name;
    private String country;
    private Coordinate coord;
	@Override
	public int compareTo(String str) {
		return str.compareTo(name);
	}
    }
