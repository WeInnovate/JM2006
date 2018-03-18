package com.jm2006.learn.jdbc.dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteExample {

	public static void main(String[] args) {

		try {
			// 1. Connection
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			// 2. Create Statement / CMD
			Statement stmt = con.createStatement();
			int i = stmt.executeUpdate("DELETE FROM JM2006_LOGIN WHERE USER_NAME = 'B'");
			if (i == 1) {
				System.out.println("Deletion successful");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
