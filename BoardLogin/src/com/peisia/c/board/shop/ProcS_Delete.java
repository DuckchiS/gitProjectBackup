package com.peisia.c.board.shop;

import com.peisia.c.board.site.SiteMain;
import com.peisia.c.board.util.Ci;
import com.peisia.c.board.util.DB;

public class ProcS_Delete {
	public static void run() {
		String delNo = Ci.r("삭제할 상품번호를 입력하세요");
		DB.dbExecuteUpdate("delete from "+DB.Table_Shop+" where no='"+delNo+"'"
				+ " and shop_id='"+SiteMain.loginedId+"'");
	}
}
