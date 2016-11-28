package com.souvc.spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 */
public class AppTest {

    @Test
    public  void  test(){
        ApplicationContext context=new ClassPathXmlApplicationContext("SpringBeans.xml");
        Chinese p=context.getBean(Chinese.class);
        System.out.println(p.getName());
        System.out.println(p.getAge());
    }
}
