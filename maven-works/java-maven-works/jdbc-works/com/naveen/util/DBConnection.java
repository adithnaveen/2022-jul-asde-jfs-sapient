package com.naveen.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {

	/**
	 * 
	 * @return Connection 
	 * @author naveen kumar 
	 * @see to return connection object for mysql
	 */
	public static Connection getMysqlConnection() {
		// load the driver 
		try {
		
			Class.forName("com.mysql.cj.jdbc.Driver");
			return  DriverManager.getConnection
						(
						"jdbc:mysql://localhost/sapient_aug_2022", 
						"root", 
						"kanchan@1");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return null; 
	}
	
	public static Connection getOracleConnection() {
		return null; 
	}
	
	
}
