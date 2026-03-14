package com.kodewala.spring_annotation_demo.bean;

import org.springframework.stereotype.Component;

@Component
public class Student {
	public void display() {
		System.out.println("Hello, I am Student Bean created using Annotation....");
	}

}
