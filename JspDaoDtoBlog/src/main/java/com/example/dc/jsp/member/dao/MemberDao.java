package com.example.dc.jsp.member.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.example.dc.db.DB;
import com.example.dc.db.Dao;
import com.example.dc.jsp.member.dto.MemberDto;

public class MemberDao extends Dao{
	public void memberSignUp(MemberDto d) {
		super.connect();
		String sql = String.format("insert into %s (ps_id,ps_pw,ps_name) values ('%s','%s','%s')"
				, DB.PS_Member,d.id,d.pw,d.name);
		super.update(sql);
		super.close();
	}
	
	public boolean memberLogin(String id, String pw) {
		super.connect();
		try {
			String sql = String.format("select * from %s where ps_id=? and ps_pw=?",
					DB.PS_Member);
	        PreparedStatement pstmt = con.prepareStatement(sql);
	        pstmt.setString(1, id);
	        pstmt.setString(2, pw);
	        ResultSet rs = pstmt.executeQuery();
	        boolean success = rs.next();
	        // 조회 결과가 있는 경우 사용자가 존재하고 로그인이 성공한 것으로 처리합니다.
	        if (success) {
	            System.out.println("로그인 성공");
	            // 로그인 성공 후 필요한 작업을 수행할 수 있습니다.
	        } else {
	            System.out.println("아이디 또는 비밀번호가 잘못되었습니다.");
	            // 사용자가 존재하지 않거나 비밀번호가 일치하지 않는 경우 실패 메시지를 출력합니다.
	        }

	        rs.close();
	        pstmt.close();
	        return success;
		} catch(Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			super.close();
		}
	}
}
