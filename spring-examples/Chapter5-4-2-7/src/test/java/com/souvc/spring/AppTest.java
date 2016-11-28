package com.souvc.spring;


import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest
{

    /**
     * 1. 正常配置
     */
    @Test
    public  void test1(){
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"});
        FileNameGenerator fileNameGenerator = (FileNameGenerator)context.getBean("fileNameGenerator");
        System.out.println(fileNameGenerator);
        context.close();
    }


    /**
     *  2. Shortcut  短标签模式
     */
    @Test
    public  void test2(){
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"applicationContext2.xml"});
        FileNameGenerator fileNameGenerator = (FileNameGenerator)context.getBean("fileNameGenerator");
        System.out.println(fileNameGenerator);
        context.close();
    }


    /**
     *  3. XML shortcut with the p-namespace
     */
    @Test
    public  void test3(){
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"applicationContext3.xml"});
        FileNameGenerator fileNameGenerator = (FileNameGenerator)context.getBean("fileNameGenerator");
        System.out.println(fileNameGenerator);
        context.close();
    }

}
