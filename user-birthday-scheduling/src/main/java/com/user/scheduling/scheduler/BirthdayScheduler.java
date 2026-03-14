package com.user.scheduling.scheduler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.user.scheduling.service.BirthdayService;

@Component   // ❗ REQUIRED
public class BirthdayScheduler {

    @Autowired
    private BirthdayService birthdayService;


    @Scheduled(cron = "0 57"
    		+ " 15 * * ?", zone = "Asia/Kolkata")
    public void sendBirthdayWishes() {
        System.out.println("🎯 Printing at exactly 3:30 PM");
        birthdayService.processBirthdayWishes();
    }
}
