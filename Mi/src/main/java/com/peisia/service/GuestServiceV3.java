package com.peisia.service;


import org.springframework.ui.Model;

import com.peisia.spring.dto.GuestDtoV3;

public interface GuestServiceV3 {
	public Model getList(Model m,int currentPage);
	public Model getSearchList(Model m,int currentPage, String word);
	public GuestDtoV3 read(long no);
	public void del(long no);
	public void write(GuestDtoV3 dto);
	public void modify(GuestDtoV3 dto);
}
