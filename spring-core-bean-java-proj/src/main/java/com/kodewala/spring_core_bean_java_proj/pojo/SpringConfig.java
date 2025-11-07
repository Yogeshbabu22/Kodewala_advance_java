package com.kodewala.spring_core_bean_java_proj.pojo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
	@Bean("order")
	public Order createOrderBean() {
		Order order = new Order();
		order.setOrderId(11);
		order.setItemName("Samsung S26");
		order.setStatus("DELIVERED");
		return order;
	}
	

}
