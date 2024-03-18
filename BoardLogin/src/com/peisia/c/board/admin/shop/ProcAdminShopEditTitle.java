package com.peisia.c.board.admin.shop;

import com.peisia.c.board.shop.display.Display;
import com.peisia.c.board.util.Ci;

public class ProcAdminShopEditTitle {
	public static void run() {
		String cmd = "";
		System.out.println("현재 게시글 제목: "+Display.TITLE);
		cmd = Ci.r("변경하실 제목을 적으세요.");
		Display.TITLE = cmd;
		System.out.println("변경되었습니다.");
	}
}
