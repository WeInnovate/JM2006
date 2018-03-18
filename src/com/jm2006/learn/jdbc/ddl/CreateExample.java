package com.jm2006.learn.jdbc.ddl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateExample {

	public static void main(String[] args) {

		try {
			// 1. Connection
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			// 2. Create Statement / CMD
			Statement stmt = con.createStatement();
			boolean b = stmt.execute("CREATE TABLE JM2006_USER (NAME VARCHAR, AGE NUMBER)");
			System.out.println(b);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
