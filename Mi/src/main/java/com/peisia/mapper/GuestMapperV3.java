package com.peisia.mapper;

import java.util.ArrayList;

import com.peisia.spring.dto.GuestDtoV3;

public interface GuestMapperV3 {
	public int getCount();
	public int getSearchCount(String word);
	public ArrayList<GuestDtoV3> getList(int limitIndex);
	public ArrayList<GuestDtoV3> getSearchList(int limitIndex,String word);
	public GuestDtoV3 read(long no);
	public void del(long no);
	public void write(GuestDtoV3 dto);
	public void modify(GuestDtoV3 dto);
}
