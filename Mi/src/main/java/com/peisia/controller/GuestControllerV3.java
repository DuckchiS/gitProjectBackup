package com.peisia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.peisia.service.GuestServiceV3;
import com.peisia.spring.dto.GuestDtoV3;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/guestv3/*")
@AllArgsConstructor
public class GuestControllerV3 {
	private GuestServiceV3 service;
	
	@GetMapping("/getList")
	public void getList(@RequestParam(value="currentPage", defaultValue = "1") int currentPage, Model model) {
		model = service.getList(model, currentPage);
	}	
	
	@GetMapping({"/read","/modify"})
	public void read(@RequestParam("bno") Long bno, Model model) {
		log.info("컨트롤러 ==== 글번호 ==============="+bno);
		model.addAttribute("read",service.read(bno));
	}
	
	@GetMapping("/del")
	public String del(@RequestParam("bno") Long bno) {
		log.info("컨트롤러 ==== 글번호 ==============="+bno);
		service.del(bno);
		return "redirect:/guestv3/getList";
	}
	
	@GetMapping("/write")
	public void write() {
		
	}
	
	@PostMapping("/write")
	public String write(GuestDtoV3 dto) {
		service.write(dto);
		return "redirect:/guestv3/getList";
	}
	
	@PostMapping("/modify")
	public String modify(GuestDtoV3 dto) {
		service.modify(dto);
		return "redirect:/guestv3/getList";
	}
}
