package com.peisia.c.board.post;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.peisia.c.board.admin.ProcAdmin;
import com.peisia.c.board.post.display.Display;
import com.peisia.c.board.util.DB;

public class ProcBoard {
	public static void run() {
		Display.showTitle();
		DB.dbInit();
		DB.dbPostCount();
//		System.out.println("================================================================");
//		dbExecuteQuery("select * from tottenham_squad where p_number=7");

		Scanner sc = new Scanner(System.in);
		
		loop:
		while(true) {
			String sql = "SELECT * FROM " + DB.Table_Board +
					" WHERE b_reply_ori IS NULL " +
					" ORDER BY recommend desc " +
					" LIMIT 0,3";
			try {
				System.out.println("번호 제품명 아이디 추천수");
				DB.result = DB.st.executeQuery(sql);
				while(DB.result.next()) {
					String no = DB.result.getString("no");
					String title = DB.result.getString("b_title");
					String id = DB.result.getString("b_id");
					int recommend = DB.result.getInt("recommend");
					System.out.println(no+" "+title+" "+id+" "+recommend);
				}
			} catch(Exception e) {
				e.printStackTrace();
				System.out.println("상품이 없습니다.");
			} 
			Display.showMainMenu();
			System.out.println("옵션을 선택하세요: ");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String cmd = sc.next();
			switch (cmd) {
			case "1":
				ProcB_List.run();
				break;
			case "2":
				ProcB_Read.run();	
				break;
			case "3":
				ProcB_Write.run();
				break;
			case "4":
				ProcB_Delete.run();
				break;
			case "5":
				ProcB_Update.run();
				break;
			case "6":
				ProcB_List.search();
				break;
			case "0":
				ProcAdmin.run();
				break;
			case "x":
				System.out.println("이전 화면으로 돌아갑니다.");
				break loop;
			default:
				System.out.println("옵션에 없습니다. 다시 입력하세요.");
				break;
			}
		}
	}
}
