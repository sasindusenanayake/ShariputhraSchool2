package com.shariputhra.batabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Database class
public class connectionManager {

	private Connection con = null;
	private final String CONNECTIONSTRING = "jdbc:mysql://localhost:3309/school_management_system";
	private final String USERNAME = "root";
	private final String PASSWORD = "";
	
	public Connection getCon() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			try {

				con = DriverManager.getConnection(CONNECTIONSTRING,USERNAME,PASSWORD);

			} catch (SQLException e) {
				e.printStackTrace();
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return con;
	}
}
