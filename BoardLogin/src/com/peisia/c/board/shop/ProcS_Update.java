package com.peisia.c.board.shop;

import com.peisia.c.board.site.SiteMain;
import com.peisia.c.board.util.Ci;
import com.peisia.c.board.util.DB;

public class ProcS_Update {
	public static void run() {
		String editNo = Ci.r("수정할 글번호를 입력해주세요");
		String editTitle = Ci.rl("상품이름을 입력해 주세요");
		String editContent = Ci.rl("내용을 입력해주세요");
		try {
			DB.dbExecuteUpdate("update "+DB.Table_Shop+" set shop_title='"+editTitle+"',"
					+ "shop_id='"+SiteMain.loginedId+"',shop_text='"+editContent+"',shop_date=now()"
							+ " where no='"+editNo+"' and shop_id='"+SiteMain.loginedId+"'");
			System.out.println("상품 수정 완료했습니다.");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
