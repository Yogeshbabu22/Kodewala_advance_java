package com.kodewala.spring_java_config_demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kodewala.spring_java_config_demo.pojo.Address;
import com.kodewala.spring_java_config_demo.pojo.Student;

@Configuration
public class AppConfig {
	@Bean
	public Address addressBean() {
		return new Address("Bhubneswar", "Odisha");
		
	}
	@Bean
	public Student studentBean() {
		return new Student("Yogesh Kumar Behera",addressBean());
		
	}
	
	

}
