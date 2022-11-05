package com.Services;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.Objects.Country;
import com.sqlConnector.SQLConnector;

public class GetCountryList {
	
	private List<Country> countyList = new ArrayList<Country>();
	
	public List<Country> getCountryList() {
		
		// getting data from database
		try
		{
			// opening SQL connection
			Connection conn = SQLConnector.getConnection();
			
			// creating statement
			Statement st = conn.createStatement();
			
			// creating result set 
			ResultSet rs = st.executeQuery("SELECT * FROM Country");
			
			// getting data from result set
			while(rs.next())
			{
				// creating country object
				Country country = new Country();
				
				// setting country code
				country.setCountryCode(Integer.parseInt(rs.getString("CountryID")));
				
				// setting country name
				country.setCountryName(rs.getString("CountryName"));
				
				// adding country object in country list
				countyList.add(country);
			}
		}
		catch(Exception ex)
		{
			System.out.println("Error while reteriving data from database");
			ex.printStackTrace();
		}
		// returning result
		return countyList;
	}
}
