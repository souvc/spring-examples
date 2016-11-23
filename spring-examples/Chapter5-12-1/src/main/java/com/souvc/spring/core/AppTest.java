package com.souvc.spring.core;
 
import com.souvc.spring.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.souvc.spring.hello.HelloWorld;
 
public class AppTest {
	public static void main(String[] args) {
	    
		//相当于  ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	    HelloWorld obj = (HelloWorld) context.getBean("helloBean");
	    
	    obj.printHelloWorld("Spring4 Java Config");

	}
}