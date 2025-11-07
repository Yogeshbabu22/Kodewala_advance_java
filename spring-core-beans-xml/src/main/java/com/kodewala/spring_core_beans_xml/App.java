package com.kodewala.spring_core_beans_xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        String context = "com\\kodewala\\spring_core_beans_xml\\resources\\applicationContext.xml";
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(context);
        
        Account account = (Account) applicationContext.getBean("acc");
        System.out.println(account.getAccountNumber()+ " " + account.getType() + "  " + account.getIfsc());
    }
}
