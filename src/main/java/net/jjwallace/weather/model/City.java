package net.jjwallace.weather.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties({"coord", "state"})
public class City implements Comparable<String>{
    private int id;
    private String name;
    private String country;
	@Override
	public int compareTo(String str) {
		return str.compareTo(name);
	}
    }
