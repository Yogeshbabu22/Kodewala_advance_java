package com.kodewala.spring_annotation_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kodewala.spring_annotation_demo.bean.Student;

public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	Student student = context.getBean(Student.class);
    	student.display();
    }
    
}
