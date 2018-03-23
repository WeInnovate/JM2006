package com.jm2006.learn.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {

	public static Connection getCon() throws SQLException {
		return DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
	}

}
