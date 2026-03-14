package com.kodewala.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Login {
	
	@RequestMapping("/login")
	public ModelAndView doLogin() {
		System.out.println("Login Done");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("displayLogin");
		return mv;
	}
	
	@RequestMapping("/logout")
	public ModelAndView doLogOut() {
		System.out.println("LogOut Done");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("displayLogOut");
		return mv;
	}

}
