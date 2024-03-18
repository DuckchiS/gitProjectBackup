package com.peisia.c.webBlogV0;

import com.peisia.c.webBlog.display.Display;

public class Board {
	public static final String Version = "v0.0.0"; 
	public static final String Title = "DC 게시판 ( " + Version + ") feat. DC";
	public void run() {
		Display.title();
		ProcMenu.run();
	}
}
