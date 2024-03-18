package com.peisia.service;

import java.util.ArrayList;

import com.peisia.spring.dto.GuestDtoV2;

public interface GuestServiceV2 {
	public ArrayList<GuestDtoV2> getList();
	public GuestDtoV2 read(long bno);
	public void del(long bno);
	public void write(GuestDtoV2 dto);
	public void modify(GuestDtoV2 dto);
}
