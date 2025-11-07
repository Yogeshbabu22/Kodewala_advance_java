package com.kodewala;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kodewala.pojo.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      	ApplicationContext
      	context = new AnnotationConfigApplicationContext(SpringConfig.class);
      	
      	Student stu = context.getBean(Student.class);
      	
      	System.out.println(stu.getStudentId() +"|" + stu.getName() +"|" + stu.getGrade());
      	
      	

    }
}
