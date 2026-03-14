package com.kodewala.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.kodewala.ZeptoOrderApplication;
import com.kodewala.bean.OrderDetails;

@RestController
public class OrderController {

    private final ZeptoOrderApplication zeptoOrderApplication;

    OrderController(ZeptoOrderApplication zeptoOrderApplication) {
        this.zeptoOrderApplication = zeptoOrderApplication;
    }
	@PostMapping("myItems")
	
	public ResponseEntity createOrder(@RequestBody OrderDetails orderDetails) {
		System.out.println("My Output for Products : "+orderDetails.getItemName() + orderDetails.getStatus()+orderDetails.getAmount());
		return  ResponseEntity.ok("Spring Boot is runnig..........");
	}

}
