package com.jm2006.learn.jdbc.metadata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import com.jm2006.learn.jdbc.util.DbUtil;

public class MyResultSetMetaData {

	public static void main(String[] args) {
		try {
			Connection con = DbUtil.getCon();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM JM2006_LOGIN");
			ResultSetMetaData rsmd = rs.getMetaData();

			System.out.println(rsmd.getColumnCount());
			System.out.println(rsmd.getTableName(1));
			System.out.println(rsmd.getColumnName(1)+" "+rsmd.getColumnTypeName(1));
			System.out.println(rsmd.getColumnName(2)+" "+rsmd.getColumnTypeName(2));

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
