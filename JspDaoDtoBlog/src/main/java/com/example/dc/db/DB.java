package com.example.dc.db;

public class DB {
	public static String DB_JDBC_DRIVER_PACKAGE_PATH = "com.mysql.cj.jdbc.Driver";
	private static String DB_Name = "board";
	private static String DB_URL_MYSQL = "jdbc:mysql://localhost:3306/"+DB_Name;	
	public static String DB_URL = DB_URL_MYSQL;
	public static String DB_ID = "root";
	public static String DB_PW = "root";
	public static final String Cat_Board3 = "cat_board3";
	public static final String PS_Member = "ps_member";
}
