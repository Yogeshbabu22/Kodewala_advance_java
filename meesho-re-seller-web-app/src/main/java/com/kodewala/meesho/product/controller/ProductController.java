package com.kodewala.meesho.product.controller;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kodewala.meesho.bean.Product;
import com.kodewala.meesho.hibernate.config.ConnectHibernate;

@Controller
public class ProductController {
	
	
	@RequestMapping("/showAddProductPage")
	public String showAddProductPage() {
		return "addProduct";
		
	}
	@PostMapping("/addProduct")
	public String addProduct(@ModelAttribute Product product) {

		ConnectHibernate connectHibernate = new ConnectHibernate();
		Session session=connectHibernate.getHibernateConnection();
		Transaction transaction =session.beginTransaction();
		session.save(product);
		
		transaction.commit();
		return "meesho-re-seller-home";
	}
	

	@RequestMapping("/updateProductPage")
	public String updateProductPage() {
		return "updateProduct";
		
	}
	
	@RequestMapping("/deleteProductPage")
	public String deleteProductPage() {
		return "deleteProduct";
		
	}
	
	@RequestMapping("/viewProductPage")
	public String viewProductPage() {
		return "viewProduct";
		
	}
	
	


}
