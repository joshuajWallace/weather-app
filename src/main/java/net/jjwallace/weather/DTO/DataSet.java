package net.jjwallace.weather.DTO;

import java.util.Date;

import lombok.Data;

@Data
public class DataSet {
	private Main main;
	private Weather weather;
	private int clouds;
	private Wind wind;
	private Date dxTxt;

}
