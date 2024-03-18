package com.peisia.dc;

import java.sql.ResultSet;
import java.util.ArrayList;

public class Dao extends Da{
	public void del(String no) {
		super.connect();
		String sql = String.format("delete from %s where no=%s", DB.Cat_Board3, no);
		super.update(sql);
		super.close();
	}
	
	public void write(Dto d) {
		super.connect();
		String sql = String.format("insert into %s (title,content,id) values ('%s','%s','%s')",
				DB.Cat_Board3,d.title,d.content,d.id);
		super.update(sql);
		super.close();
	}
	
	public Dto read(String no) {
		Dto post = null;
		super.connect();
		try {
			String sql = String.format("select * from %s where no=%s", DB.Cat_Board3,no);
			ResultSet rs = st.executeQuery(sql);
			rs.next();
			post = new Dto(
					rs.getString("no"),
					rs.getString("title"),
					rs.getString("content"),
					rs.getString("id"),
					rs.getString("date_time"),
					rs.getString("hit"),
					rs.getString("reply_ori"),
					rs.getString("reply_count")				
					);
		} catch (Exception e) {
			e.printStackTrace();
		}
		super.close();
		return post;
	}
	
	public int getCount() {
		int count = 0;
		super.connect();
		try {
			String sql = String.format("select count(*) from %s", DB.Cat_Board3);
			ResultSet rs = st.executeQuery(sql);
			rs.next();
			count = rs.getInt("count(*)");
		} catch (Exception e) {
			e.printStackTrace();
		}
		super.close();
		return count;
	}
	
	public ArrayList<Dto> list(String page){
		ArrayList<Dto> posts = new ArrayList<>();
		super.connect();
		try {
			int startIndex = ((Integer.parseInt(page)-1))*Board.List_Amount;
			String sql = String.format("select * from %s limit %s,%s", 
					DB.Cat_Board3,startIndex,Board.List_Amount);
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				posts.add(new Dto(
						rs.getString("no"),
						rs.getString("title"),
						rs.getString("content"),
						rs.getString("id"),
						rs.getString("date_time"),
						rs.getString("hit"),
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
	
	public int getSearchCount(String word) {
		int count = 0;
		super.connect();
		try {
			String sql = String.format("select count(*) from %s where title like %%%s%%", 
					DB.Cat_Board3,word);
			ResultSet rs = st.executeQuery(sql);
			rs.next();
			count = rs.getInt("count(*)");
		} catch (Exception e) {
			e.printStackTrace();
		}
		super.close();
		return count;
	}
	
	public ArrayList<Dto> listSearch(String page, String word){
		ArrayList<Dto> posts = new ArrayList<>();
		super.connect();
		try {
			int startIndex = ((Integer.parseInt(page)-1))*Board.List_Amount;
			String sql = String.format("select * from %s where title like %%%s%% limit %s,%s",
					DB.Cat_Board3,word,startIndex,Board.List_Amount);
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				posts.add(new Dto(
						rs.getString("no"),
						rs.getString("title"),
						rs.getString("content"),
						rs.getString("id"),
						rs.getString("date_time"),
						rs.getString("hit"),
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
	
	public void edit(Dto d, String no) {
		super.connect();
		String sql = String.format("update %s set title='%s',content='%s' where no=%s", 
				DB.Cat_Board3,d.title,d.content,no);
		super.update(sql);
		super.close();
	}
	
	public int getTotalCountPage() {
		int totalPage = 0;
		int count = getCount();
		if(count % Board.List_Amount == 0) {
			totalPage = count / Board.List_Amount;
		} else {
			totalPage = count / Board.List_Amount + 1;
		}
		return totalPage;
	}
	
	public int getTotalSearchCountPage(String word) {
		int totalPage = 0;
		int count = getSearchCount(word);
		if(count % Board.List_Amount == 0) {
			totalPage = count / Board.List_Amount;
		} else {
			totalPage = count / Board.List_Amount + 1;
		}
		return totalPage;
	}
}
