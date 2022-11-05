package com.sqlConnector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLConnector {
	// SQL URL
	private static String url = "jdbc:mysql://localhost:3306/Test";
	private static String userName = "root";
	private static String password = "roottoor";
	private static Connection connection;
	
	public static Connection getConnection() {
		
		// Creating database connection
		try 
		{
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			connection = DriverManager.getConnection(url, userName, password);
			
			System.out.println("Connected Established With SQL Server");
		} 
		catch(SQLException e)
		{
			System.out.println("Faild to make connection with sql server");
			e.printStackTrace();
		}
		
		// returning SQL connection
		return connection;
	}
}