package com.peisia.c.webBlogV1;

import com.peisia.c.webBlog.data.Data;
import com.peisia.c.webBlog.display.Display;

public class Board {
	public static final String Version = "v0.0.1"; 
	public static final String Title = "DC 게시판 ( " + Version + ") feat. DC";
	public void run() {
		Data.loadData();
		Display.title();
		ProcMenu.run();
	}
}
