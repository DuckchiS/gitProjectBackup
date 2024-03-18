package com.peisia.dc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Da {
	Connection con = null;
	Statement st = null;
	
	void connect() {
		try {
			Class.forName(DB.DB_JDBC_DRIVER_PACKAGE_PATH);
			con = DriverManager.getConnection(DB.DB_URL, DB.DB_ID, DB.DB_PW);
			st = con.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	void update(String sql) {
		try {
			st.executeQuery(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	void close() {
		try {
			st.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
