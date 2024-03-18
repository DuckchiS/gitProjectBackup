package com.peisia.c.webBlogV1;

import com.peisia.c.util.Ci;
import com.peisia.c.util.Cw;
import com.peisia.c.webBlog.data.Data;
import com.peisia.c.webBlog.data.Post;

public class ProcMenuUpdate {
	static void run() {
		Cw.wn("게시글 수정입니다.");
		String cmd = Ci.r("게시글수정");
		
		for(Post p : Data.post) {
			if(cmd.equals(p.instanceNo+"")) {
				String content = Ci.rl("수정할 내용");
				p.content = content;
				Cw.wn("게시글이 수정 되었습니다.");
			}
		}
		
	}
}
