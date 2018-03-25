package com.jm2006.learn.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Locale;
import java.util.ResourceBundle;

public class DbUtil {

	@Deprecated
	public static Connection getCon() throws SQLException {
		return DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
	}

	public static Connection getConFromPropertyFile() throws SQLException {

		ResourceBundle rb = ResourceBundle.getBundle("com//jm2006//learn//jdbc//util//db", Locale.US);
		String url = rb.getString("jdbcUrl");
		String un = rb.getString("userName");
		String pass = rb.getString("password");

		return DriverManager.getConnection(url, un, pass);
	}
}
