package com.kodewala.zomato.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kodewala.zomato.entity.InvoiceEntity;
import com.kodewala.zomato.request.InvoiceRequest;
import com.kodewala.zomato.service.InvoiceService;



@RestController
public class InvoiceController {
	
	@Autowired
	InvoiceService invoiceService;
	
	@PostMapping("/generateInvoice")
	public String generateInvoice(@RequestBody InvoiceRequest invoiceRequest) {
		int id = invoiceService.createInvoice(invoiceRequest);
		return "Your Invoice generated Successfully, and Your id is: " + id;
		
	}
	
	//get Details
	@PostMapping("/getDetails")
	public InvoiceEntity getDetailsById(@RequestBody int invoiceID) {
		InvoiceEntity msg =invoiceService.getDetailsById(invoiceID);
		return msg;
	}
	
	//Update 
	@PostMapping("/updateDetails")
	public String updateDetails(@RequestBody InvoiceRequest invoiceRequest) {
		
	System.out.println("Invoice Description : " + invoiceRequest.getDescription());
	int id = 	invoiceService.updateDetailsById(invoiceRequest);
		return "Update Successfull : " + id;
		
	}
	//Delete Details
	@PostMapping("/deleteDetails")
	public String deleteDetails(@RequestBody int invoiceID) {
		System.out.println("xyz");
		String delete =invoiceService.deleteDetails(invoiceID);
		return delete;
	}

}
