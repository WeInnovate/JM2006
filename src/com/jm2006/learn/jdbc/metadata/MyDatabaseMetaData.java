package com.jm2006.learn.jdbc.metadata;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MyDatabaseMetaData {

	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			DatabaseMetaData dbmd = con.getMetaData();

			System.out.println(dbmd.getDatabaseProductName());
			System.out.println(dbmd.getDatabaseProductVersion());
			System.out.println(dbmd.getDriverName());
			System.out.println(dbmd.getDriverVersion());
			System.out.println(dbmd.getDriverMajorVersion());
			System.out.println(dbmd.getDriverMinorVersion());
			System.out.println(dbmd.getUserName());
			
			ResultSet rs = dbmd.getTables(null, null, "%", null);
			while(rs.next()) {
				System.out.println(rs.getString(3));
			}
			
			

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
