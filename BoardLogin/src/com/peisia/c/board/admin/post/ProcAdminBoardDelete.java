package com.peisia.c.board.admin.post;

import com.peisia.c.board.site.SiteMain;
import com.peisia.c.board.util.Ci;
import com.peisia.c.board.util.DB;

public class ProcAdminBoardDelete {
	public static void run(int delNo) {
		DB.dbExecuteUpdate("delete from "+DB.Table_Board+" where no='"+delNo+"'");
	}
}
