package com.flipkart.versoning.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flipkart.versoning.dao.InvoiceSaverDAO;
import com.flipkart.versoning.entity.Invoice;
import com.flipkart.versoning.exception.PaymentFailedException;
import com.flipkart.versoning.request.PaymentInfo;
import com.flipkart.versoning.response.InvoiceResponse;
@Service
public class InvoiceGeneratorServiceImpl implements InvoiceGeneratorService {
	static double VATPERCENT = 0.12;
	static double GSTPERCENT = 0.18;
	
	@Autowired
	InvoiceSaverDAO invoiceSaverDAO;
	@Override
	public InvoiceResponse generatedInvoice(PaymentInfo paymentInfo) {
		
		System.out.println("Checkingg");
		Invoice invoice = new Invoice();
		invoice.setItemName(paymentInfo.getItemName());
		invoice.setPaymentId(paymentInfo.getPaymentId());
		
		if(paymentInfo.getStatus().equals("PAID")) {
			invoice.setDescription("Your item delivered to your location.....BTM ,Bangalore"+paymentInfo.getAddress());
		}else {
			throw new PaymentFailedException("Payment Failed........");
		}
		invoice.setTotalAmount(calculateTotalVATAmount(paymentInfo.getTotalAmount()));
		int invoiceId = invoiceSaverDAO.createInvoice(invoice);
		invoice.setInvoiceId(invoiceId);
		InvoiceResponse invoiceResponse =getResponse(invoice);
		invoiceResponse.setTotalAmount("Total Amount + Vat Amount: " + invoice.getTotalAmount());
		return invoiceResponse;
	}
	
	
	public String calculateTotalVATAmount(String amount) {
		double vatAmount =Integer.parseInt(amount)*VATPERCENT;
		
		double totalAmount = Integer.parseInt(amount)+vatAmount;
		return Double.toString(totalAmount);
	
	}
	
	public  InvoiceResponse getResponse(Invoice invoice) {
		
		InvoiceResponse invoiceResponse  = new InvoiceResponse();
		invoiceResponse.setInvoiceId("Invoice Id: "+invoice.getInvoiceId());
		invoiceResponse.setItemName("Item name: "+invoice.getItemName());
		invoiceResponse.setPaymentId("Payment Id: "+invoice.getPaymentId());
		invoiceResponse.setDescription("Description : "+invoice.getDescription());
		
		return invoiceResponse;
		
	}
	
	public String calculateTotalGSTAmount(String amount) {
		double gstAmount =Integer.parseInt(amount)*GSTPERCENT;
		
		double totalAmount = Integer.parseInt(amount)+gstAmount;
		return Double.toString(totalAmount);
	
	}
	


	@Override
	public InvoiceResponse generatedInvoiceWithGST(PaymentInfo paymentInfo) {
		
		Invoice invoice = new Invoice();
		invoice.setItemName(paymentInfo.getItemName());
		invoice.setPaymentId(paymentInfo.getPaymentId());
		
		if(paymentInfo.getStatus().equals("PAID")) {
			invoice.setDescription("Your item delivered to your location.....BTM ,Bangalore"+paymentInfo.getAddress());
		}else {
			throw new PaymentFailedException("Payment Failed........");
		}
		invoice.setTotalAmount(calculateTotalGSTAmount(paymentInfo.getTotalAmount()));
		int invoiceId = invoiceSaverDAO.createInvoice(invoice);
		invoice.setInvoiceId(invoiceId);
		InvoiceResponse invoiceResponse =getResponse(invoice);
		invoiceResponse.setTotalAmount("Total Amount + Gst Amount: " + invoice.getTotalAmount());
		return invoiceResponse;
	}
		

	
}
