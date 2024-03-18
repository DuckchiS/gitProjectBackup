package com.peisia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.peisia.service.GuestServiceV2;
import com.peisia.spring.dto.GuestDtoV2;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@RequestMapping("/guestv2/*")	//프로젝트 루트 경로 이하 /guest 상위폴더로 진입 시 여기로 진입하게 됨.  
@AllArgsConstructor	//필드 값을 매개변수로 하는 생성자를 스프링이 알아서 만들어 줌. 그리고 그런 형태의 생성자를 추가하면 스프링이 알아서 객체관리 해줌(@Auto.. 처럼)
@Controller
public class GuestControllerV2 {
	private GuestServiceV2 service;
	
	@GetMapping("/getList")
	public void getList(Model model) {
		model.addAttribute("list",service.getList());
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
		return "redirect:/guestv2/getList";
	}
	
	@GetMapping("/write")
	public void write() {
		
	}
	
	@PostMapping("/write")
	public String write(GuestDtoV2 dto) {
		service.write(dto);
		return "redirect:/guestv2/getList";
	}
	
	@PostMapping("/modify")
	public String modify(GuestDtoV2 dto) {
		service.modify(dto);
		return "redirect:/guestv2/getList";
	}
}
