package com.kodewala.zomato.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodewala.zomato.entity.InvoiceEntity;
import com.kodewala.zomato.repository.InvoiceRepository;
import com.kodewala.zomato.request.InvoiceRequest;

@Service
public class InvoiceService {

	@Autowired
    InvoiceRepository invoiceRepository;

 
	public int createInvoice(InvoiceRequest invoiceRequest) {
		
		InvoiceEntity entity = new InvoiceEntity();
		entity.setGstNo(invoiceRequest.getGstNo());
		entity.setInvValue(invoiceRequest.getInvValue());
		entity.setNote(invoiceRequest.getNote());
		entity.setStatus(invoiceRequest.getStatus());
		entity.setDescription(invoiceRequest.getDescription());
		
		entity= invoiceRepository.save(entity);
		return entity.getInvId();
				
				
	}
	
	public InvoiceEntity getDetailsById( int invoiceID) {
		InvoiceEntity details =invoiceRepository.findById(invoiceID).get();
		return details;
		
	}
	public int updateDetailsById(InvoiceRequest invoiceRequest) {
		
		InvoiceEntity entity = new InvoiceEntity();
		entity.setGstNo(invoiceRequest.getGstNo());
		entity.setInvValue(invoiceRequest.getInvValue());
		entity.setNote(invoiceRequest.getNote());
		entity.setStatus(invoiceRequest.getStatus());
		entity.setDescription(invoiceRequest.getDescription());
		
		invoiceRepository.save(entity);
		return invoiceRequest.getInvId();
		
	}
	
	public String deleteDetails(int invoiceID) {
		invoiceRepository.deleteById(invoiceID);
		return "Delete SUccessfull";
	}
	
	

}
