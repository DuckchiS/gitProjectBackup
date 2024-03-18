package com.peisia.c.board;

import com.peisia.c.board.display.Display;
import com.peisia.c.board.util.Ci;
import com.peisia.c.board.util.DB;

public class ProcReply {
	public static void list(int oriNo) {
		Display.replyBar();
		String sql = "select * from javaboard where b_reply_ori="+oriNo;
		try {
			System.out.println("전달한 sql문"+sql);
			DB.result = DB.st.executeQuery(sql);
			while(DB.result.next()) {
				String replyText = DB.result.getString("b_reply_text");
				System.out.println(replyText);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void write(int b_reply_ori) {
		String b_reply_text = Ci.rl("댓글입력");
		DB.dbExecuteUpdate("insert into javaboard (b_id,b_date,b_reply_ori,b_reply_text) "
				+ "values('댓글러',now(),"+b_reply_ori+",'"+b_reply_text+"')");
	}
}
