package com.peisia.c.board.post;

import com.peisia.c.board.site.SiteMain;
import com.peisia.c.board.util.Ci;
import com.peisia.c.board.util.DB;

public class ProcB_Update {
	public static void run() {
		String editNo = Ci.r("수정할 글번호를 입력해주세요");
		String editTitle = Ci.rl("제목을 입력해 주세요");
		String editContent = Ci.rl("내용을 입력해주세요");
		try {
			DB.dbExecuteUpdate("update "+DB.Table_Board+" set b_title='"+editTitle+"',"
					+ "b_id='"+SiteMain.loginedId+"',b_text='"+editContent+"',b_date=now()"
					+ " where no="+ editNo +
					" AND b_id = '" + SiteMain.loginedId + "'");
			System.out.println("수정 완료 했습니다.");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
