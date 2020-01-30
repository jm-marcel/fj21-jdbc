package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	// public static Class forName("com.mysql.jdbc.Driver");
	public Connection getConnection() {
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver()); // Essa linha foi a diferença
			return DriverManager.getConnection("jdbc:mysql://localhost/fj21?serverTimezone=UTC", "admin", "admin");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
