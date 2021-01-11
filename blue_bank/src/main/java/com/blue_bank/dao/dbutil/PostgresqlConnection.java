package com.blue_bank.dao.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgresqlConnection {

	private static Connection connection;
	
	private PostgresqlConnection() {
		
	}
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		//Step 1, load driver
		Class.forName("org.postgresql.Driver"); //class name of driver in dbeaver
		//Step 2, open connection (url, username, password)
		String url="jdbc:postgresql://localhost:5432/postgres"; //url template in dbeaver
		String username="postgres";
		String password="postgres";
		connection=DriverManager.getConnection(url, username, password);
		return connection;
	}
}
