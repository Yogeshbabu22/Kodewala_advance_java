package com.kodewala.spring_java_config_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kodewala.spring_java_config_demo.pojo.Student;

public class App 
{
    public static void main( String[] args )
    {
   ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
    Student student = (Student) applicationContext.getBean("studentBean");
    student.displayInfo();
    
    }
}
