package com.souvc.spring;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AppTest {

    /**
     * 测试通过配置Spring就可以为Bean注入集合参数值。
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
