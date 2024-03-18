package com.peisia.c.board.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB {
	private static String DB_Name = "board";
	private static String DB_ID = "root";
	private static String DB_PW = "root";
	public static String Table_Board = "javaboard";
	public static String Table_Member = "member";
	public static String Table_Shop = "shop";
	public static Connection con = null;
	public static Statement st = null;
	public static ResultSet result = null;
	public static void dbInit() {
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+DB_Name, DB_ID, DB_PW);
			st = con.createStatement();	// Statement는 정적 SQL문을 실행하고 결과를 반환받기 위한 객체다. Statement하나당 한개의 ResultSet 객체만을 열 수있다.
		} catch (SQLException e) {
			System.out.println("SQLException: " + e.getMessage());
			System.out.println("SQLState: " + e.getSQLState());
		}
	}
	
	private void dbExecuteQuery(String query) {
		try {
			result = st.executeQuery(query);
			while (result.next()) {	// 결과를 하나씩 빼기. 더 이상 없으면(행 수가 끝나면) false 리턴됨.
				String name = result.getString("p_name");	// p_name 필드(열) 의 데이터 꺼내기(1개 꺼낸거에서)
				System.out.println(name);
			}
		} catch (SQLException e) {
			System.out.println("SQLException: " + e.getMessage());
			System.out.println("SQLState: " + e.getSQLState());
		}
	}	
	public static void dbExecuteUpdate(String query) {
		try {
			int resultCount = st.executeUpdate(query);
			System.out.println("처리된 행 수:"+resultCount);
		} catch (SQLException e) {
			e.printStackTrace();
//			System.out.println("SQLException: " + e.getMessage());
//			System.out.println("SQLState: " + e.getSQLState());
		}
	}	
	public static int dbPostCount() {
		String count = "";
		try {
			result = st.executeQuery("select count(*) from "+Table_Board);
			result.next();
			count = result.getString("count(*)");
			System.out.println("글 수: " + count);
		} catch(SQLException e) {
			e.printStackTrace();
		}
		int intCount = Integer.parseInt(count);
		return intCount;
	}
		
	public static int dbReplyCount(String searchWord) {
		String count = "";
		try {
			DB.result = DB.st.executeQuery("select count(*) from "+Table_Board
					+ " where b_reply_ori is null and b_title like '%"+searchWord+"%'");
			DB.result.next();
			count = DB.result.getString("count(*)");
			System.out.println("글 수: " + count);
		} catch(Exception e) {
			e.printStackTrace();
		}
		int intCount = Integer.parseInt(count);
		return intCount;
	}
	
	public static int getPostSearch(String searchWord) {
		String count = "";
		try {
			DB.result = DB.st.executeQuery("select count(*) from "+Table_Board+" where b_reply_ori is null"
					+ " and b_title like '%"+searchWord+"%'");
			DB.result.next();
			count = DB.result.getString("count(*)");
			System.out.println("글 수" + count);
		} catch (Exception e) {
			e.printStackTrace();
		}
		int intCount = Integer.parseInt(count);
		return intCount;
	}
	
	public static int shopDBPostCount() {
		String count = "";
		try {
			result = st.executeQuery("select count(*) from "+Table_Shop);
			result.next();
			count = result.getString("count(*)");
			System.out.println("상품 수: " + count);
		} catch(SQLException e) {
			e.printStackTrace();
		}
		int intCount = Integer.parseInt(count);
		return intCount;
	}
	
	public static int shopDBReplyCount(String searchWord) {
		String count = "";
		try {
			DB.result = DB.st.executeQuery("select count(*) from "+Table_Shop
					+ " where shop_reply_ori is null and shop_title like '%"+searchWord+"%'");
			DB.result.next();
			count = DB.result.getString("count(*)");
			System.out.println("상품 수: " + count);
		} catch(Exception e) {
			e.printStackTrace();
		}
		int intCount = Integer.parseInt(count);
		return intCount;
	}
	
	public static int getShopPostSearch(String searchWord) {
		String count = "";
		try {
			DB.result = DB.st.executeQuery("select count(*) from "+Table_Shop+" where shop_reply_ori is null"
					+ " and shop_title like '%"+searchWord+"%'");
			DB.result.next();
			count = DB.result.getString("count(*)");
			System.out.println("상품 수" + count);
		} catch (Exception e) {
			e.printStackTrace();
		}
		int intCount = Integer.parseInt(count);
		return intCount;
	}
	
	public static boolean isProcLogin(String id, String pw) {
		String count = "";
		try {
			DB.result = DB.st.executeQuery("select count(*) from "+Table_Member+" where s_id = '"+id+"' "
					+ "and s_pw = '"+pw+"'");
			DB.result.next();
			count = DB.result.getString("count(*)");
			System.out.println("찾은 회원 수: "+ count);
		} catch(Exception e) {
			e.printStackTrace();
		}
		if(count.equals("1")) {
			System.out.println("로그인 성공");
			return true;
		} else {
			System.out.println("로그인 실패");
			return false;
		}
	}
	
}