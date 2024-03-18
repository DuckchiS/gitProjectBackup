package com.example.dc.jsp.board.dao;

import java.sql.ResultSet;
import java.util.ArrayList;

import com.example.dc.db.DB;
import com.example.dc.db.Dao;
import com.example.dc.jsp.board.Board;
import com.example.dc.jsp.board.dto.BoardDto;

public class BoardDao extends Dao{
	
	public void del(String category, String no) {
		super.connect();
		String sql = String.format("delete from %s where no=%s and b_category like '%s'",
				DB.Cat_Board3, no, category);
		super.update(sql);
		super.close();
	}
	
	public void write(BoardDto d) {
		super.connect();	
		String sql = String.format("insert into %s (b_category,title,id,content) values ('%s','%s','%s','%s')",
				DB.Cat_Board3,d.b_category,d.title,d.id,d.content);
		super.update(sql);
		super.close();
	}
	
	public BoardDto read(String category, String no) {
		BoardDto post = null;
		super.connect();
		try {
			String sql = String.format("select * from %s where no=%s and b_category like '%s'", 
					DB.Cat_Board3,no,category);
			System.out.println("================="+sql);
			ResultSet rs = st.executeQuery(sql);
			rs.next();
			post = new BoardDto(
					rs.getString("b_category"),
					rs.getString("no"),
					rs.getString("title"),
					rs.getString("content"),
					rs.getString("id"),
					rs.getString("date_time"),
					rs.getString("hit"),
					rs.getString("reply_ori"),
					rs.getString("reply_count")
					);
		} catch(Exception e) {
			e.printStackTrace();
		}
		super.close();
		return post;
	}
	
	public int getCount(String category) {
		int count = 0;
		super.connect();
		try {
			String sql = String.format("select count(*) from %s where b_category like '%s'",
					DB.Cat_Board3,category);
			System.out.println("====================="+sql);
			ResultSet rs = st.executeQuery(sql);
			rs.next();
			count = rs.getInt("count(*)");
		} catch (Exception e) {
			e.printStackTrace();
		}
		super.close();
		return count;
	}
	
	public ArrayList<BoardDto> list(String category, int startIndex){
		ArrayList<BoardDto> posts = new ArrayList<>();
		super.connect();
		try {
			String sql = String.format("select * from %s where b_category like '%s' limit %s,%s", 
					DB.Cat_Board3,category,startIndex,Board.List_Amount);
			System.out.println("=================="+sql);
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				posts.add(new BoardDto(
						rs.getString("b_category"),
						rs.getString("no"),
						rs.getString("title"),
						rs.getString("content"),
						rs.getString("id"),
						rs.getString("hit"),
						rs.getString("date_time"),
						rs.getString("reply_ori"),
						rs.getString("reply_count")
						));
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		super.close();
		return posts;
	}
	
	public void edit(BoardDto d,String no) {
		super.connect();
		String sql = String.format("update %s set title='%s',content='%s' where no=%s",
				DB.Cat_Board3,d.title,d.content,no);
		super.update(sql);
		super.close();
	}
	
	public int getSerachCount(String category,String word) {
		int count = 0;
		super.connect();
		try {
			String sql = String.format("select count(*) from %s where title like '%%%s%%' and b_category like '%s'",
					DB.Cat_Board3,word,category);
			System.out.println("======================"+sql);
			ResultSet rs = st.executeQuery(sql);
			rs.next();
			count = rs.getInt("count(*)");
		} catch (Exception e) {
			e.printStackTrace();
		}
		super.close();
		return count;
	}
	
	public ArrayList<BoardDto> listSerach(String category,String word, int startIndex){
		ArrayList<BoardDto> posts = new ArrayList<>();
		super.connect();
		try {
			String sql = String.format("select * from %s where title like '%%%s%%' and b_category like '%s' limit %s,%s"
					, DB.Cat_Board3,word,startIndex,Board.List_Amount);
			System.out.println("=========================="+sql);
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				posts.add(new BoardDto(
						rs.getString("b_category"),
						rs.getString("no"),
						rs.getString("title"),
						rs.getString("content"),
						rs.getString("id"),
						rs.getString("hit"),
						rs.getString("date_time"),
						rs.getString("reply_ori"),
						rs.getString("reply_count")
						));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		super.close();
		return posts;
	}
}
