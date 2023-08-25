package com.ciq.connection;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class ConnectionUtill {
	private static Properties properties = null;
	static {
		properties = new Properties();
		try {
			properties.load(ConnectionUtill.class.getClassLoader().getResourceAsStream("db.properties"));
			Class.forName(properties.getProperty("driver"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static Connection getConncetion() {
		Connection connection = null;
      try {
		connection=DriverManager.getConnection(properties.getProperty("url"),properties.getProperty("uname"),
				properties.getProperty("pw"));
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return connection;
	}
	 public static void close(Connection connection) {
		 if(connection!=null) {
			 try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
	 }
	 public static void close(Statement statement,Connection connection) {
		 if(statement!=null) {
			 try {
				statement.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
		 }
		 close(connection);
	 }
	 
	 public static void close(ResultSet resultset,Statement statement,Connection connection) {
		 if(resultset!=null) {
			 try {
				resultset.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
		 }
		 close(statement, connection);
		 
			
		 
	 }
	 public static void main(String[] args) {
		System.out.println(getConncetion());
	}


}
