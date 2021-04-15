package com.example.transport;

import java.sql.Connection;
import java.sql.DriverManager;

public class PostgreDbConn {

	Connection connection;

	public Connection DbConn() {
		Connection c = null;
		try {
			Class.forName("org.postgresql.Driver");
			c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/persons", "postgres", "root");

		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		System.out.println("Opened database successfully");
		return c;
	}
}
