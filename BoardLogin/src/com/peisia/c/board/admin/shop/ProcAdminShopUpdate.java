package com.peisia.c.board.admin.shop;

import com.peisia.c.board.site.SiteMain;
import com.peisia.c.board.util.Ci;
import com.peisia.c.board.util.DB;

public class ProcAdminShopUpdate {
	public static void run() {
		String editNo = Ci.r("수정할 글번호를 입력해주세요");
		String editTitle = Ci.rl("상품이름을 입력해 주세요");
		String editContent = Ci.rl("내용을 입력해주세요");
		try {
			DB.dbExecuteUpdate("update "+DB.Table_Shop+" set shop_title='"+editTitle+"',"
					+ "shop_id='관리자',shop_text='"+editContent+"',shop_date=now()"
					+ " where no="+ editNo);
			System.out.println("상품 수정 완료 했습니다.");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
