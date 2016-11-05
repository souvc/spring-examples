package com.souvc.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.junit.Test;
public class AppTest {

    /***
     * 在类中使用ApplicationContext的方式实例化Spring容器，获取MessageBean对象，并调用execute方法。
     */
    @Test
    public void test1() {
        String conf = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(conf);
        System.out.println(ac);

        MessageBean messagebean = ac.getBean("messagebean", MessageBean.class);
        System.out.println(messagebean.toString());
        messagebean.execute();
    }

}
