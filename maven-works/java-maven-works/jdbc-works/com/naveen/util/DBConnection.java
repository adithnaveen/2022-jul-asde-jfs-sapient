package com.naveen.util;

import java.sql.Connection;

public class DBConnection {

	public static Connection getMysqlConnection() {
		Class.forName("com.mysql.cj.jdbc.Driver");
//			           com.mysql.cj.jdbc.Driver
	}
}
