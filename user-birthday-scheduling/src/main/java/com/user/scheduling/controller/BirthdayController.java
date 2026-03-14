package com.user.scheduling.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.scheduling.service.BirthdayService;

@RestController
@RequestMapping("/birthday")
public class BirthdayController {
	@Autowired
	 BirthdayService birthdayService;
	 @GetMapping("/send")
	    public String sendWishesManually() {
	        birthdayService.processBirthdayWishes();
	        return "Birthday wishes sent successfully!";
	    }

}
