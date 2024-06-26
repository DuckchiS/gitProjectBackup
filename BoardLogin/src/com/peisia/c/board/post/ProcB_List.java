package com.peisia.c.board.post;

import com.peisia.c.board.post.display.Display;
import com.peisia.c.board.util.Ci;
import com.peisia.c.board.util.DB;

public class ProcB_List {
	static int PER_PAGE = 3;
	static int startIndex = 0;
	static int currentPage = 1;
	static int totalPage = 0;
	static int count = 0;
	static String cmd = "";
	static boolean isSearchMode = false;	
	
	public static void run() {
		count = DB.dbPostCount();
		if(count % PER_PAGE > 0) {
			totalPage = count / PER_PAGE + 1;
		} else {
			totalPage = count / PER_PAGE;
		}
		
		System.out.println("총 페이지수:" + totalPage);
		while(true) {
			cmd = Ci.r("페이지번호입력[이전 메뉴로:x]");
			if(cmd.equals("x")) {
				break;
			}
			try {
				currentPage = Integer.parseInt(cmd);
				if(currentPage > totalPage || currentPage < 1) {
					System.out.println("페이지 범위에 맞는 값을 넣어주세요");
				}
				startIndex = (currentPage - 1) * PER_PAGE;
				Display.titleList();
				String sql = "SELECT * FROM " + DB.Table_Board +
			              " WHERE b_reply_ori IS NULL " +
			              " ORDER BY b_hit desc " +
			              " LIMIT " + startIndex + "," + PER_PAGE;
				try {
					System.out.println("명령한 sql문" + sql);
					DB.result = DB.st.executeQuery(sql);
					while(DB.result.next()) {
						String no = DB.result.getString("no");
						String title = DB.result.getString("b_title");
						String id = DB.result.getString("b_id");
						String date = DB.result.getString("b_date");
						int hit = DB.result.getInt("b_hit");
						int recommend = DB.result.getInt("recommend");
						System.out.println(no+" "+title+" "+id+" "+date+" "+hit+" "+recommend);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			} catch(NumberFormatException e) {
				System.out.println("숫자만 입력하세요.");
			}
		}
	}
	
	public static void search() {
		cmd = Ci.r("검색어[x:나가기]");
		if(cmd.equals("x")) {
			return;
		} else {
			searchList(cmd);
		}
	}
	
	public static void searchList(String searchWord) {
		
		count = DB.getPostSearch(searchWord);
		if(count % PER_PAGE>0) {
			totalPage = count / PER_PAGE + 1;
		} else {
			totalPage = count / PER_PAGE;
		}
		System.out.println("총 페이지 수<검색모드>:"+totalPage);
		while(true) {
			cmd = Ci.r("페이지번호입력<검색모드>[이전 메뉴로:x]");
			if(cmd.equals("x")) {
				break;
			} 
			try {
				currentPage = Integer.parseInt(cmd);
				if(currentPage > totalPage || currentPage < 1) {
					System.out.println("페이지 범위에 맞는 값을 넣어주세요");
					continue;
				}
				startIndex = (currentPage - 1) * PER_PAGE;
				Display.titleList();
				String sql = "select * from "+DB.Table_Board+" where b_reply_ori is null"
						+ " and b_title like '%" + searchWord + "%'"
						+ " ORDER BY b_hit desc "
						+ " limit "+startIndex + "," + PER_PAGE;
				try {
					System.out.println("명령한 sql문" + sql);
					DB.result = DB.st.executeQuery(sql);
					while(DB.result.next()) {
						String no = DB.result.getString("no");
						String title = DB.result.getString("b_title");
						String id = DB.result.getString("b_id");
						String date = DB.result.getString("b_date");
						int hit = DB.result.getInt("b_hit");
						int recommend = DB.result.getInt("recommend");
						System.out.println(no+" "+title+" "+id+" "+date+" "+hit+" "+recommend);
					}
				} catch(Exception e) {
					e.printStackTrace();
				}
			} catch(NumberFormatException e) {
				System.out.println("숫자만 입력하세요.");
			}
		}
	}
	
}
