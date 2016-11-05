package com.souvc.spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试表达式注入
 */
public class AppTest
{

    @Test
    public void test1(){
        String conf = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(conf);
        MessageBean bean = ac.getBean("messagebean",MessageBean.class);
        bean.execute();
    }

}
