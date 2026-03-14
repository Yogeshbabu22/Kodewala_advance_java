package com.user.scheduling.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.scheduling.entity.UserBirthday;
import com.user.scheduling.repository.UserBirthdayRepository;

@Service
public class BirthdayService {
	@Autowired
	UserBirthdayRepository userBirthdayRepository;
	
	 public void processBirthdayWishes() {

	        List<UserBirthday> users = userBirthdayRepository.findTodaysBirthdays();

	        if (users.isEmpty()) {
	            System.out.println("No birthdays today");
	            return;
	        }

	        for (UserBirthday user : users) {
	            System.out.println(" Happy Birthday " + user.getName());
	        }
	 }

}
