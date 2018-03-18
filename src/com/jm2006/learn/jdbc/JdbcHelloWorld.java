package com.jm2006.learn.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcHelloWorld {

	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM JM2006_LOGIN");
			while (rs.next()) {
				String un = rs.getString(1);
				String p = rs.getString(2);
				System.out.println(un + " " + p);
			}
			if (con != null) {
				System.out.println("Success!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
