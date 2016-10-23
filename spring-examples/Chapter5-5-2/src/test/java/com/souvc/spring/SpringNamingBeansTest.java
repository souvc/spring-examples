package com.souvc.spring;

import NamingBeans.HelloService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringNamingBeansTest {


    /** 一、不指定id，只配置必须的全限定类名，由IoC容器为其生成一个标识，客户端必须通过接口“T getBean(Class<T> requiredType)”获取Bean*/
    @Test
    public void testGetBeanByType() {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("namebeans/naming-beans-type.xml");
        //根据类型获取bean
        HelloService helloService = beanFactory.getBean(HelloService.class);
        helloService.sayHello();

        //No bean named 'helloService' is defined
        //HelloService helloService2 = (HelloService)beanFactory.getBean("helloService");
        //helloService2.sayHello();

    }

    /** 二、指定id，必须在Ioc容器中唯一；*/
    @Test
    public void testGetBeanById() {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("namebeans/naming-beans-id.xml");
        //根据id获取bean
        HelloService helloService = beanFactory.getBean("helloWorld2", HelloService.class);
        helloService.sayHello();
    }

    /** 三、指定name，这样name就是“标识符”，必须在Ioc容器中唯一；*/
    @Test
    public void testGetBeanByName() {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("namebeans/naming-beans-name.xml");
        //根据name获取bean
        HelloService helloService = beanFactory.getBean("helloWorld3", HelloService.class);
        helloService.sayHello();
    }
    /**四、指定id和name，id就是标识符，而name就是别名，必须在Ioc容器中唯一；*/
    @Test
    public void testGetBeanByNameOrId() {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("namebeans/naming-beans-id-or-name.xml");
        //根据id获取bean
        HelloService bean1 = beanFactory.getBean("bean1", HelloService.class);
        bean1.sayHello();
        //根据别名获取bean
        HelloService bean2 = beanFactory.getBean("alias1", HelloService.class);
        bean2.sayHello();
        //根据id获取bean
        HelloService bean3 = beanFactory.getBean("bean3", HelloService.class);
        bean3.sayHello();
        String[] bean3Alias = beanFactory.getAliases("bean3");
        //因此别名不能和id一样，如果一样则由IoC容器负责消除冲突
        Assert.assertEquals(0, bean3Alias.length);
    }

    /**五、指定多个name，多个name用“,”、“;”、“ ”分割，第一个被用作标识符，其他的（alias1、alias2、alias3）是别名，所有标识符也必须在Ioc容器中唯一；*/
    @Test
    public void testManyNames() {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("namebeans/naming-beans-many-names.xml");
        //1根据id获取bean
        HelloService bean1 = beanFactory.getBean("bean1", HelloService.class);
        bean1.sayHello();
        //2根据别名获取bean
        HelloService alias11 = beanFactory.getBean("alias11", HelloService.class);
        alias11.sayHello();
        //3验证确实是四个别名
        String[] bean1Alias = beanFactory.getAliases("bean1");
        System.out.println("=======namingbean5.xml bean1 别名========");
        for(String alias : bean1Alias) {
            System.out.println(alias);
        }
        Assert.assertEquals(4, bean1Alias.length);
        //根据id获取bean
        HelloService bean2 = beanFactory.getBean("bean2", HelloService.class);
        bean2.sayHello();
        //2根据别名获取bean
        HelloService alias21 = beanFactory.getBean("alias21", HelloService.class);
        alias21.sayHello();
        //验证确实是两个别名
        String[] bean2Alias = beanFactory.getAliases("bean2");
        System.out.println("=======namingbean5.xml bean2 别名========");
        for(String alias : bean2Alias) {
            System.out.println(alias);
        }
        Assert.assertEquals(2, bean2Alias.length);
    }

    /**六、使用<alias>标签指定别名，别名也必须在IoC容器中唯一**/
    @Test
    public void testGetBeanByAlias() {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("namebeans/naming-beans-alias.xml");
        //根据id获取bean
        HelloService bean = beanFactory.getBean("bean", HelloService.class);
        bean.sayHello();
        //根据别名获取bean
        HelloService alias1 = beanFactory.getBean("alias1", HelloService.class);
        alias1.sayHello();
        HelloService alias2 = beanFactory.getBean("alias2", HelloService.class);
        alias2.sayHello();
        String[] beanAlias = beanFactory.getAliases("bean");
        System.out.println("=======namingbean6.xml bean 别名========");
        for(String alias : beanAlias) {
            System.out.println(alias);
        }
        System.out.println("=======namingbean6.xml bean 别名========");
        Assert.assertEquals(2, beanAlias.length);
    }

}
