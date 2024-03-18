package com.dc.db;

import java.sql.ResultSet;
import java.util.ArrayList;

public class Dao extends Da{
	public void del(String no) {
		super.connect();
		String sql = String.format("delete from %s where no=%s", Db.TABLE_PS_BOARD_FREE, no);
		super.update(sql);
		super.close();
	}
	
	public void write(Dto d) {
		super.connect();
		String sql = String.format("insert into %s (title, id, content)"
				+ " values ('%s','%s','%s')", Db.TABLE_PS_BOARD_FREE, d.title, d.id, d.content);
		super.update(sql);
		super.close();
	}
	
	public Dto read(String no) {
		Dto post = null;
		super.connect();
		try {
			String sql = String.format("select * from %s where no=%s",Db.TABLE_PS_BOARD_FREE,no);
			System.out.println("sql: "+sql);
			ResultSet rs = st.executeQuery(sql);
			rs.next();
			post = new Dto(
					rs.getString("no"),
					rs.getString("title"),
					rs.getString("content"),
					rs.getString("date_time"),
					rs.getString("hit"),
					rs.getString("id"),
					rs.getString("reply_count"),
					rs.getString("reply_ori")
					);
		} catch(Exception e) {
			e.printStackTrace();
		}
		super.close();
		return post;
	}
	
	public ArrayList<Dto> list(){
		ArrayList<Dto> posts = new ArrayList<Dto>();
		super.connect();
		try {
			String sql = String.format("select * from %s", Db.TABLE_PS_BOARD_FREE);
			System.out.println("sql: "+sql);
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				posts.add(new Dto(
						rs.getString("no"),
						rs.getString("title"),
						rs.getString("content"),
						rs.getString("date_time"),
						rs.getString("hit"),
						rs.getString("id"),
						rs.getString("reply_count"),
						rs.getString("reply_ori")
						));
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		super.close();
		return posts;
	}
	
	public void edit(Dto d, String no) {
		super.connect();
		String sql = String.format("update %s set title='%s', content='%s' where no=%s", 
				Db.TABLE_PS_BOARD_FREE, d.title, d.content, no);
		super.update(sql);
		super.close();
	}
}
