package com.flipkart.versoning.service;

import org.springframework.stereotype.Service;

import com.flipkart.versoning.entity.Invoice;
import com.flipkart.versoning.request.PaymentInfo;
import com.flipkart.versoning.response.InvoiceResponse;

@Service
public interface InvoiceGeneratorService {
	InvoiceResponse generatedInvoice(PaymentInfo paymentInfo);

	InvoiceResponse generatedInvoiceWithGST(PaymentInfo paymentInfo);

}
