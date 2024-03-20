package com.peisia.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.peisia.service.FcService;

import lombok.AllArgsConstructor;

@Controller
@RequestMapping("/fconline/*")
@AllArgsConstructor
public class FcController{
	
	private final FcService fcService;
	
	@GetMapping("/fc")
	public void fcOnline() {

	}
	
	@PostMapping("/fc")
	public void fcOnline(Model model, String word) {
		try {
			fcService.user(model, word);
		} catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@RequestMapping(value="/match", method=RequestMethod.GET)
	public String match(Model model, String word,
			HttpServletRequest request) {
		try {	        
			fcService.match(model, word, request);
		} catch (Exception exception) {
		    System.out.println(exception);
		    exception.printStackTrace();
		}
		return "/fconline/match";
	}
	
//	@RequestMapping(value="/match", method=RequestMethod.POST)
//	public String match(Model model, String word,
//			HttpServletRequest request) {
//		try {	        
//			fcService.match(model, word, request);
//		} catch (Exception exception) {
//		    System.out.println(exception);
//		}
//		return "/fconline/match";
//	}
	
	@RequestMapping(value="/matchDetail", method=RequestMethod.GET)
	public String matchDetail(@RequestParam("jsonData") String jsonData,
			@RequestParam("word")String word, Model model,HttpServletRequest request) {
		try {
			fcService.matchDetail(jsonData, word, model, request);
		} catch (Exception e) {
		    System.out.println(e);
		}
		return "/fconline/matchDetail";
	}
	
	@RequestMapping(value="/user", method=RequestMethod.GET)
	public void user() {
		
	}
	
}
