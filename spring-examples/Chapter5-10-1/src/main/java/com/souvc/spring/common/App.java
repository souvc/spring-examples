package com.souvc.spring.common;

import com.souvc.spring.customer.services.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"Spring-AutoScan.xml"});
    	CustomerService cust = (CustomerService)context.getBean("customerService");
    	System.out.println(cust);
    	
    }
}
