package com.souvc.spring;


import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest{

    @Test
    public  void test(){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        HelloWorld bean = (HelloWorld) context.getBean("beans1");
        bean.sayHello("Spring 4");
        context.close();
    }

    @Test
    public  void test2(){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans2.xml");
        HelloWorld bean = (HelloWorld) context.getBean("beans2");
        bean.sayHello("Spring 4");
        context.close();
    }

    @Test
    public  void test3(){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans3.xml");
        HelloWorld bean = (HelloWorld) context.getBean("beans3");
        bean.sayHello("Spring 4");
        context.close();
    }


    @Test
    public  void test4(){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("composing.xml");

        HelloWorld bean1 = (HelloWorld) context.getBean("beans1");
        bean1.sayHello("Spring 4");


        HelloWorld bean2 = (HelloWorld) context.getBean("beans2");
        bean2.sayHello("Spring 4");


        HelloWorld bean3 = (HelloWorld) context.getBean("beans3");
        bean3.sayHello("Spring 4");

        HelloWorld beans4 = (HelloWorld) context.getBean("beans4");
        beans4.sayHello("Spring 4");

        HelloWorld bean5 = (HelloWorld) context.getBean("beans5");
        bean5.sayHello("Spring 4");

        context.close();
    }

}
