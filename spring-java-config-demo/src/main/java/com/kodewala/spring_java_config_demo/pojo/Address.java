package com.kodewala.spring_java_config_demo.pojo;

public class Address {
	private String city;
	private String state;
	
	public Address(String city, String state) {
		this.city = city;
		this.state = state;
	}
	
public void showAddress() {
	System.out.println("City " + city + ", State: " + state );
}	
}
