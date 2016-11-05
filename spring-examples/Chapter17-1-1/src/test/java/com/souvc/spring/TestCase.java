package com.souvc.spring;
import java.util.Properties;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.mvc.Controller;
public class TestCase {

    /** HandlerMapping 映射测试 */
    @Test
    public void testHandlerMapping(){
        String cfg = "spring-mvc.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(cfg);
        HandlerMapping obj = ac.getBean("handlerMapping", HandlerMapping.class);
        Properties map = ac.getBean("urlMappings", Properties.class);
        System.out.println(obj); 
        System.out.println(map); 
    }
    
    /** 控制器测试 */
    @Test
    public void testHelloController(){
        String cfg = "spring-mvc.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(cfg);
        Controller obj = ac.getBean("helloController", Controller.class);
        System.out.println(obj); 
    }
    
    /** 测试ViewResolver配置 */
    @Test
    public void testViewResolver(){
        String cfg = "spring-mvc.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(cfg);
        ViewResolver obj = ac.getBean("viewResolver", ViewResolver.class);
        System.out.println("OK"+obj);
    }
    
}