package com.naveen.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {

	public static Connection getMysqlConnection() {
		// load the driver 
		try {
			
			Properties prop = new Properties(); 
			prop.load(new FileInputStream("jdbc-works/db.properties"));
			
			Class.forName(prop.getProperty("driver"));
			return  DriverManager.getConnection
						(
						prop.getProperty("url"), 
						prop.getProperty("username", "root"), 
						prop.getProperty("password"));

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch(IOException ioe) {
			ioe.printStackTrace();
		}
		
		return null; 
	}
	
	public static Connection getOracleConnection() {
		return null; 
	}
	
	
}
