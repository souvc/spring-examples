package com.souvc.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.souvc.spring.hello.HelloWorld;
import com.souvc.spring.hello.impl.HelloWorldImpl;


//相当于在xml 里面生明  <bean id="helloBean" class="HelloWorldImpl">
@Configuration
public class AppConfig {
	
	@Bean(name="helloBean")
    public HelloWorld helloWorld() {
        return new HelloWorldImpl();
    }
	
}