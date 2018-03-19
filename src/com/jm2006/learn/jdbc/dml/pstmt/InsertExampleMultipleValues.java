package com.jm2006.learn.jdbc.dml.pstmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertExampleMultipleValues {

	public static void main(String[] args) {

		try {
			// 1. Connection
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			// 2. Create PreparedStatement / CMD
			PreparedStatement pstmt = con.prepareStatement("INSERT INTO JM2006_LOGIN VALUES (?, ?)");

			for (int i = 0; i < 10; i++) {
				String un = "B" + i;
				String pass = i + "";
				
				pstmt.setString(1, un);
				pstmt.setString(2, pass);
				
				
				int data = pstmt.executeUpdate();

				if (data == 1) {
					System.out.println("Insertion successful");
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
