package com.kodewala.spring_java_config_demo.pojo;

public class Student {
	private  String name;
	private Address address;
	
	public Student(String name, Address address) {
		this.name = name;
		this.address = address;
	}
	
	public void displayInfo() {
		System.out.println("Student name: " + name);
		address.showAddress();
	}
	
	

}
