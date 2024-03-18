package com.peisia.c.board.admin.shop;

import com.peisia.c.board.site.SiteMain;
import com.peisia.c.board.util.Ci;
import com.peisia.c.board.util.DB;

public class ProcAdminShopWrite {
	public static void run() {
		String title = Ci.r("상품이름을 입력하세요.");
		String content = Ci.r("상품내용을 입력하세요.");
		try {
			DB.dbExecuteUpdate("insert into "+DB.Table_Shop+"(shop_title,shop_id,shop_text,shop_date)"
					+ " values('"+title+"','관리자','"+content+"',now())");
			System.out.println("상품 등록 완료");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}