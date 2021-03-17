package com.sql;

import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.*;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;

public class Sample {
	
	
	public static void main(String[] args) throws SQLException {
		
		
		java.sql.Connection con = DriverManager.getConnection("jdbc");
		
		
	}

}
