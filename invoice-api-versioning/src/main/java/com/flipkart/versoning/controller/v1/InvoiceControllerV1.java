package com.flipkart.versoning.controller.v1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.flipkart.versoning.entity.Invoice;
import com.flipkart.versoning.request.PaymentInfo;
import com.flipkart.versoning.response.InvoiceResponse;
import com.flipkart.versoning.service.InvoiceGeneratorService;

@Controller
public class InvoiceControllerV1{
	
	@Autowired
	InvoiceGeneratorService invoiceGeneratorService;
	@PostMapping("generateInvoiceV1.0")
	@ResponseBody
	public ResponseEntity createInvoice (@RequestBody PaymentInfo paymentInfo) {
		System.out.println(paymentInfo.getItemName());
		InvoiceResponse invoiceResponse = invoiceGeneratorService.generatedInvoice(paymentInfo);
		
		return ResponseEntity.ok(invoiceResponse);
	}

}
