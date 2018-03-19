package com.jm2006.learn.jdbc.dml.pstmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertExampleMultipleValuesFromConsole {

	public static void main(String[] args) {

		try {
			// 1. Connection
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			// 2. Create PreparedStatement / CMD
			PreparedStatement pstmt = con.prepareStatement("INSERT INTO JM2006_LOGIN VALUES (?, ?)");

			String userChoice = "y";
			Scanner scan = new Scanner(System.in);
			
			while(userChoice.equalsIgnoreCase("Y")) {
				System.out.print("Enter the user name: ");
				String un = scan.nextLine();
				
				System.out.print("Enter the password: ");
				String p = scan.nextLine();
				
				
				pstmt.setString(1, un);
				pstmt.setString(2, p);
				
				int data = pstmt.executeUpdate();
				if (data == 1) {
					System.out.println("Insertion successful");
				}
				
				
				System.out.print("Do you wish to continue... (Y/N): ");
				userChoice = scan.nextLine();
				
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
