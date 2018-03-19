package com.jm2006.learn.jdbc.dml.stmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertExampleMultipleValues {

	public static void main(String[] args) {

		try {
			// 1. Connection
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			// 2. Create Statement / CMD
			Statement stmt = con.createStatement();

			for (int i = 0; i < 10; i++) {
				String un = "A" + i;
				String pass = i + "";
				int data = stmt.executeUpdate("INSERT INTO JM2006_LOGIN VALUES ('" + un + "', '" + pass + "')");

				if (data == 1) {
					System.out.println("Insertion successful");
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
