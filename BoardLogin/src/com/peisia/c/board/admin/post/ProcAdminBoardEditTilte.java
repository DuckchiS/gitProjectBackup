package com.peisia.c.board.admin.post;

import com.peisia.c.board.post.display.Display;
import com.peisia.c.board.util.Ci;

public class ProcAdminBoardEditTilte {
	public static void run() {
		String cmd = "";
		System.out.println("현재 게시글 제목: "+Display.TITLE);
		cmd = Ci.r("변경하실 제목을 적으세요.");
		Display.TITLE = cmd;
		System.out.println("변경되었습니다.");
	}
}
