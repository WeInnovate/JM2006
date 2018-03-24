package com.jm2006.learn.jdbc.batch;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.jm2006.learn.jdbc.util.DbUtil;

public class BatchProcessingForStatement {

	public static void main(String[] args) {
		long beforeStart = System.currentTimeMillis();
		try {
			Connection con = DbUtil.getCon();
			Statement stmt = con.createStatement();

			for (int i = 0; i < 10; i++) {
				String userName = "A" + i;
				String password = "P" + i;

				// without batch processing
				/*
				 * int isUpdated = stmt.executeUpdate("INSERT INTO JM2006_LOGIN VALUES('" +
				 * userName + "', '" + password + "')"); if (isUpdated == 1) {
				 * System.out.println("Inserted."); }
				 */

				// with batch processing
				stmt.addBatch("INSERT INTO JM2006_LOGIN VALUES('" + userName + "', '" + password + "')");
			}

			// with batch processing
			int[] isUpdated = stmt.executeBatch();
			for (int i = 0; i < isUpdated.length; i++) {
				System.out.println("Inserted.");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		long afterStart = System.currentTimeMillis();
		System.out.println("Total time taken: " + (afterStart - beforeStart));
	}

}
