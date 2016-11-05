package com.souvc.spring;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AppTest {

    /**
     * 测试采用引用方式注入集合对象
     */
    @Test
    public void test2() {
        String conf = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(conf);
        System.out.println(ac);

        MessageBean messagebean = ac.getBean("messagebean", MessageBean.class);
        System.out.println(messagebean.toString());
        messagebean.execute();
    }

}
