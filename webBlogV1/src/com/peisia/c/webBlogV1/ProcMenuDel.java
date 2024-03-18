package com.peisia.c.webBlogV1;

import com.peisia.c.util.Ci;
import com.peisia.c.util.Cw;
import com.peisia.c.webBlog.data.Data;

public class ProcMenuDel {
	public static void run() {
		Cw.wn("게시글 삭제 입니다.");
		String cmd = Ci.r("삭제 할 글번호를 입력하세요:");
		
		int tempSearchIndex = 0;
		for(int i = 0; i < Data.post.size(); i++) {
			if(cmd.equals(Data.post.get(i).instanceNo+"")) {
				tempSearchIndex = i;
			}
		}
		
//		if(tempSearchIndex >= 0 && tempSearchIndex < Data.post.size()) {
//			Data.post.remove(tempSearchIndex);
//			for(int j = tempSearchIndex; j < Data.post.size(); j++) {
//				Data.post.set(j, Data.post.get(j + 1));
//			}
//			Data.post.remove(Data.post.size() - 1);
//		} else {
//			System.out.println("유효하지 않는 인덱스입니다.");
//		}
		
		Data.post.remove(tempSearchIndex);
		Cw.wn("글 수" + Data.post.size());

	}
}
