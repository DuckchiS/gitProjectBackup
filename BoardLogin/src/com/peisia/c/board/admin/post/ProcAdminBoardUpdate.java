package com.peisia.c.board.admin.post;

import com.peisia.c.board.util.Ci;
import com.peisia.c.board.util.DB;

public class ProcAdminBoardUpdate {
	public static void run() {
		String editNo = Ci.r("수정할 글번호를 입력해주세요");
		String editTitle = Ci.rl("제목을 입력해 주세요");
		String editContent = Ci.rl("내용을 입력해주세요");
		try {
			DB.dbExecuteUpdate("update "+DB.Table_Board+" set b_title='"+editTitle+"',"
					+ "b_id='관리자',b_text='"+editContent+"',b_date=now()"
					+ " where no="+ editNo);
			System.out.println("수정 완료 했습니다.");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
