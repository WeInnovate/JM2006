package com.jm2006.learn.jdbc.batch;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jm2006.learn.jdbc.util.DbUtil;

public class BatchProcessingForPreparedStatement {

	public static void main(String[] args) {
		long beforeStart = System.currentTimeMillis();
		try {
			Connection con = DbUtil.getCon();
			PreparedStatement pstmt = con.prepareStatement("INSERT INTO JM2006_LOGIN VALUES(?, ?)");
			for (int i = 0; i < 100; i++) {
				String userName = "A" + i;
				String password = "P" + i;

				pstmt.setString(1, userName);
				pstmt.setString(2, password);

				// without batch processing
				/*int isUpdated = pstmt.executeUpdate();
				if (isUpdated == 1) {
					System.out.println("Inserted.");
				}*/
				
				// with batch processing
				pstmt.addBatch();

			}
			
			//with batch processing
			int[] isUpdated = pstmt.executeBatch();
			for (int i = 0; i < isUpdated.length; i++) {
				System.out.println("Inserted");
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		long afterStart = System.currentTimeMillis();
		System.out.println("Total time taken: " + (afterStart - beforeStart));
	}

}
