package com.peisia.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@RequestMapping("/ajax/*")
@Controller
@AllArgsConstructor
public class AjaxController {
	@RequestMapping("/test")
	public void test(HttpServletRequest request,Model m) {
		setCp(m,request.getContextPath());
		m.addAttribute("a","개");
		m.addAttribute("b","삵");
	}
	
	public void setCp(Model m, String cp) {
		m.addAttribute("cp",cp);
		log.info("==== 컨텍스트 패스임:"+cp);
	}
	
	@RequestMapping("/test2")
	public void test2() {
		
	}
	@RequestMapping("/testapi")
	public void testapi() {
		
	}
}
