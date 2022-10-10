package com.training.web;

import java.sql.*;

public class DatabaseConnection {
	
	protected static Connection initializeDatabase()
	        throws SQLException, ClassNotFoundException
	    {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			
			String url = "jdbc:oracle:thin:@localhost:1748/xe";
			String userName = "sys as sysdba";
			String password = "123"; //not real password
			
			Connection con = DriverManager.getConnection(url, userName, password);
	        return con;
	    }
	}


