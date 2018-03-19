package com.jm2006.learn.jdbc.dml.pstmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateExampleMultipleValues {

	public static void main(String[] args) {

		try {
			// 1. Connection
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			// 2. Create PreparedStatement / CMD
			PreparedStatement pstmt = 
					con.prepareStatement("UPDATE JM2006_LOGIN SET PASSWORD = ? WHERE USER_NAME = ?");

			for (int i = 0; i < 10; i++) {
				String un = "B" + i;
				String p = i+"b";
				
				pstmt.setString(1, p);
				pstmt.setString(2, un);
				
				
				
				
				int data = pstmt.executeUpdate();

				if (data == 1) {
					System.out.println("Updation successful");
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
