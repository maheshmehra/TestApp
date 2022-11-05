package com.Objects;

public class Country {
	
	private int countryCode;
	private String countryName;
	
	// setting country id
	public void setCountryCode(int countryCode)
	{
		this.countryCode = countryCode;
	}
	
	// setting country name
	public void setCountryName(String countryName)
	{
		this.countryName = countryName;
	}
	
	// getting country id
	public int getCountryCode()
	{
		return countryCode;
	}
	
	// getting country name
	public String getCountryName()
	{
		return countryName;
	}
}
