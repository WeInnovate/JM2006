package com.jm2006.learn.jdbc.img;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.jm2006.learn.jdbc.util.DbUtil;

public class Profile {
	// create table jm2006_profile (name varchar, pic blob);
	public static void main(String[] args) {
		try {
			Connection con = DbUtil.getCon();

			PreparedStatement pstmt = con.prepareStatement("INSERT INTO JM2006_PROFILE VALUES(?, ?)");
			FileInputStream fis = new FileInputStream("images//myfile.png");
			pstmt.setString(1, "Profile pic");
			pstmt.setBinaryStream(2, fis, fis.available());
			pstmt.executeUpdate();

			PreparedStatement pstmt2 = con.prepareStatement("SELECT * FROM JM2006_PROFILE");
			ResultSet rs = pstmt2.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString(1));
				Blob b = rs.getBlob(2);
				byte[] bArr = b.getBytes(1, (int) b.length());
				FileOutputStream fos = new FileOutputStream("images//output.png");
				fos.write(bArr);
				fos.close();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
