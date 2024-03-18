package com.peisia.c.webBlogV1;

import com.peisia.c.util.Ci;
import com.peisia.c.util.Cw;
import com.peisia.c.webBlog.data.Data;
import com.peisia.c.webBlog.data.Post;

public class ProcMenuRead {
	public static void run() {
		Cw.wn("게시글 읽기 입니다.");
		String cmd = Ci.r("게시글 읽기");
		for(Post p : Data.post) {
			if(cmd.equals(p.instanceNo+"")) {
				p.infoForRead();
			}
		}
	}
}
