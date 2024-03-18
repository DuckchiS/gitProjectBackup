package com.peisia.c.board.admin.shop;

import com.peisia.c.board.admin.shop.display.Display;
import com.peisia.c.board.site.SiteMain;
import com.peisia.c.board.util.Ci;
import com.peisia.c.board.util.DB;

public class ProcAdminShopReply {
	public static void list(int oriNo) {
		Display.replyBar();
		String sql = "select * from "+DB.Table_Shop+" where shop_reply_ori="+oriNo;
		try {
			System.out.println("전달한 sql문: "+sql);
			DB.result = DB.st.executeQuery(sql);
			while(DB.result.next()) {
				String reply_Text = DB.result.getString("shop_reply_text");
				String reply_ID = DB.result.getString("shop_id");
				System.out.print("content: "+reply_Text+" ");
				System.out.println("ID: "+reply_ID);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void write(int shop_reply_ori) {
		String shop_reply_text = Ci.rl("리뷰를 입력하세요");
		DB.dbExecuteUpdate("insert into "+DB.Table_Shop+" (shop_id,shop_date,shop_reply_ori,shop_reply_text) "
				+ "values('관리자',now(),"+shop_reply_ori+",'"+shop_reply_text+"')");
	}
}
