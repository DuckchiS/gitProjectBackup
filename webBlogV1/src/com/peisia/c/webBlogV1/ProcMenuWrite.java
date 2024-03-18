package com.peisia.c.webBlogV1;

import com.peisia.c.util.Ci;
import com.peisia.c.util.Cw;
import com.peisia.c.webBlog.data.Data;
import com.peisia.c.webBlog.data.Post;

public class ProcMenuWrite {
	static void run() {
		Cw.wn("게시글 쓰기 입니다.");
		
		String title;
		while(true) {
			title = Ci.rl("글제목");
			if(title.length() > 0) {
				break;
			} else {
				Cw.wn("제목이 없습니다. 다시 입력하세요.");
			}
		}
		
		String content;
		while(true) {
			content = Ci.rl("글내용");
			if(content.length() > 0) {
				break;
			} else {
				Cw.wn("내용이 없습니다. 다시 입력하세요.");
			}
		}
		String writer;
		while(true) {
			writer = Ci.rl("작성자");
			if(writer.length() > 0) {
				break;
			} else {
				Cw.wn("작성가가 없습니다. 다시 입력하세요.");
			}
		}

		//제목, 내용, 작성자, 조회수
		Post p = new Post(title, content, writer, 0);
		Data.post.add(p);
		Cw.wn("게시글이 작성되었습니다.");
	}
}
