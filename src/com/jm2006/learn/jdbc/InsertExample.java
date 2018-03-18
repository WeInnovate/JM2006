package com.jm2006.learn.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertExample {

	public static void main(String[] args) {

		try {
			// 1. Connection
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			// 2. Create Statement / CMD
			Statement stmt = con.createStatement();
			int i = stmt.executeUpdate("INSERT INTO JM2006_dsgsLOGIN VALUES ('B', '2')");
			if (i == 1) {
				System.out.println("Insertion successful");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
