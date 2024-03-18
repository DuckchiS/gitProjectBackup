package com.example.dc.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Dao {
	public static Connection con = null;
	public static Statement st = null;

	public static void connect() {
		try {
			Class.forName(DB.DB_JDBC_DRIVER_PACKAGE_PATH);
			con = DriverManager.getConnection(DB.DB_URL,DB.DB_ID,DB.DB_PW);
			st = con.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void update(String sql) {
		try {
			st.executeUpdate(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void close() {
		try {
			st.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
