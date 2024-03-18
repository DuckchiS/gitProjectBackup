package com.peisia.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.peisia.mapper.GuestMapperV2;
import com.peisia.spring.dto.GuestDtoV2;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
//@AllArgsConstructor
public class GuestServiceImplV2 implements GuestServiceV2{
	@Setter(onMethod_ = @Autowired)
	private GuestMapperV2 mapper;
	
	@Override
	public ArrayList<GuestDtoV2> getList() {
		log.info("비지니스 계층===========");
		return mapper.getList();
	}
	
	@Override
	public GuestDtoV2 read(long bno) {
		return mapper.read(bno);
	}	
	
	@Override
	public void del(long bno) {
		mapper.del(bno);
	}
	
	@Override
	public void write(GuestDtoV2 dto) {
		mapper.write(dto);
	}
	
	@Override
	public void modify(GuestDtoV2 dto) {
		mapper.modify(dto);
	}
}
