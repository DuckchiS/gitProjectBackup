package com.peisia.c.webBlog.display;

import com.peisia.c.util.Cw;
import com.peisia.c.webBlogV1.Board;

public class Display {
	public static void title() {
		Cw.line();
		Cw.dot();
		Cw.space(15);
		Cw.w(Board.Title);
		Cw.space(15);
		Cw.dot();
		Cw.wn();
		Cw.line();
	}
	public static void menuMain() {
		Cw.dot();
		Cw.w("[1.글 리스트/2.글읽기/3.글쓰기/4.글삭제/5.글수정/x.종료]");
		Cw.dot();
		Cw.wn();
	}
}
