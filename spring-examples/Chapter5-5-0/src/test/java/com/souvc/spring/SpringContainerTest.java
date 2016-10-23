package com.souvc.spring;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import java.io.File;

/**测试Spring环境*/
public class SpringContainerTest {

    /** ClassPathXmlApplicationContext：ApplicationContext实现，从classpath获取配置文件； */
    @Test
    public void testBeanFactory() {
        String conf = "springcontainer/spring-container.xml";
        BeanFactory context = new ClassPathXmlApplicationContext(conf);
        System.out.println(context);
    }

    /**多个配置文件*/
    @Test
    public void testApplicationContext() {
        ApplicationContext context =new ClassPathXmlApplicationContext(new String[] {"springcontainer/spring-container.xml", "springcontainer/spring-container2.xml"});
        System.out.println(context);
    }

    /** 从一个bean中加载其他的配置文件*/
    @Test
    public void testComposingXML() {
        String conf = "springcontainer/composing-xml-based-configuration-metadata.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(conf);
        System.out.println(ac);
    }


    /**通过Resource来获取配置文件 */
    @Test
    public void testClassPathResource() {
        Resource resource = new ClassPathResource("springcontainer/spring-container.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);
        System.out.println(beanFactory);
    }


    /**XmlBeanFactory：BeanFactory实现，提供基本的IOC容器功能，可以从classpath或文件系统等获取资源；*/
    @Test
    public void testXmlBeanFactory() {
        File file = new File("src\\main\\resources\\springcontainer\\spring-container.xml");
        Resource resource = new FileSystemResource(file);
        BeanFactory beanFactory = new XmlBeanFactory(resource);
        System.out.println(beanFactory);
    }


    /**FileSystemXmlApplicationContext：ApplicationContext实现，从文件系统获取配置文件。*/

    // 从绝对路径加载配置文件  从文件系统获取配置文件。
    @Test
    public void testFileSystemXmlApplicationContext() {
        String conf = "I:\\MyCode\\Spring4x\\spring-core\\spring-ioc-container\\src\\main\\resources\\springcontainer\\spring-container2.xml";
        ApplicationContext ac = new FileSystemXmlApplicationContext(conf);
        System.out.println(ac);
    }


    // 从相对路径加载配置文件2  从文件系统获取配置文件。
    @Test
    public void testFileSystemXmlApplicationContext2() {
        String conf = "src\\main\\resources\\springcontainer\\spring-container2.xml";
        ApplicationContext ac = new FileSystemXmlApplicationContext(conf);
        System.out.println(ac);
    }

}
