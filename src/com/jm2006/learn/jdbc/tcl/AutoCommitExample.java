package com.jm2006.learn.jdbc.tcl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jm2006.learn.jdbc.util.DbUtil;

public class AutoCommitExample {

	public static void main(String[] args) {
		try {
			Connection con = DbUtil.getConFromPropertyFile();
			con.setAutoCommit(false);

			Statement stmt = con.createStatement();
			int i = stmt.executeUpdate("INSERT INTO JM2006_LOGIN VALUES('C', '1')");

			if (i > 0) {
				System.out.println("Record Inserted successfully.");
			}
			
			ResultSet rs = stmt.executeQuery("SELECT * FROM JM2006_LOGIN");
			
			while(rs.next()) {
				System.out.println(rs.getString(1)+" "+rs.getString(2));
			}
			
//			con.commit();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
