package net.jjwallace.weather.DTO;



import lombok.Data;

@Data
public class Weather {
	private int id;
	private String main;
	private String desciption;
	private String icon;
}
