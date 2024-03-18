package com.peisia.spring.dto;

import java.sql.Date;

import lombok.Data;

@Data
public class GuestDtoV3 {
	private long bno;
	private String b_id;
	private String b_title;
	private String btext;
	private int b_hit;
	private Date b_date;
	private Date b_update;
}
