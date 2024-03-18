package com.peisia.c.board;

import com.peisia.c.board.util.Ci;
import com.peisia.c.board.util.DB;

public class ProcWrite {
	public static void run() {
		String title = Ci.rl("제목을 입력하세요");
		String content = Ci.rl("내용을 입력하세요");
		String id = Ci.rl("아이디를 입력하세요");
		try {
			DB.dbExecuteUpdate("insert into javaboard(b_title,b_text,b_id,b_date,b_hit)"
					+ " values('"+title+"','"+content+"','"+id+"',now(),0)");
			System.out.println("글 등록 완료");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
