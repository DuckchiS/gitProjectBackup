package com.peisia.c.board.post;

import java.sql.SQLException;

import com.peisia.c.board.util.Ci;
import com.peisia.c.board.util.DB;

public class ProcB_Read {
	public static void run() {
		String readNo = Ci.r("읽을 글 번호를 입력하세요:");
		try {
			DB.st.executeUpdate("update "+DB.Table_Board+" set b_hit = b_hit+1 where no ="+readNo);
			DB.result = DB.st.executeQuery("select * from "+DB.Table_Board+" where no="+readNo);
			if(DB.result.next()) {
				String title = DB.result.getString("b_title");
				String content = DB.result.getString("b_text");
				int hit = DB.result.getInt("b_hit");
				int recommend = DB.result.getInt("recommend");
				System.out.println("제목: "+title);
				System.out.println("내용: "+content);
				System.out.println("조회수: "+hit);
				System.out.println("추천: "+recommend);
			} else {
		        System.out.println("해당 글 번호에 대한 데이터가 없습니다.");
		    }
			if (DB.result != null) {
				DB.result.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		ProcB_Reply.list(Integer.parseInt(readNo));
		loop:
		while(true) {
			String cmd = Ci.r("명령[x:나가기,r:댓글쓰기,p:추천하기,s:신고하기]");
			switch (cmd) {
			case "x":
				break loop;
			case "r":
				ProcB_Reply.write(Integer.parseInt(readNo));
				break;
			case "p":
				recommend(Integer.parseInt(readNo));
				break;
			case "s":
				report(Integer.parseInt(readNo));
				break;
			default:
				System.out.println("옵션에 없습니다.");
				break;
			}
		}
	}
	
	private static void report(int readNo) {
		try {
			DB.st.executeUpdate("update "+DB.Table_Board+" set report = report+1 where no ="+readNo);
			System.out.println("신고가 완료되었습니다");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void recommend(int readNo) {
		try {
			DB.st.executeUpdate("update "+DB.Table_Board+" set recommend = recommend+1 where no ="+readNo);
			System.out.println("완료되었습니다");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
