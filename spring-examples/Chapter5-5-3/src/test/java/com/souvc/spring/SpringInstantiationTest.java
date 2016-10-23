package com.souvc.spring;

import examples.*;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Calendar;
import java.util.Date;
import java.util.Map;

/**
 * Created by Administrator on 2016/10/4.
 */
public class SpringInstantiationTest {


    /**
     * 测试 1. 用构造器来实例化的方式。
     */
    @Test
    public void testInstantiationWithAConstructorTest() {
        String conf = "instantiatingbeans/instantiation-with-a-constructor.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(conf);

        // 利用Spring调用构造器 GregorianCalendar 创建 Calendar实例.

        //根据名称返回一个Bean，客户端需要自己进行类型转换；
        Calendar cal = (Calendar)ac.getBean("calendarObj1"); //方式1
        System.out.println("cal:" + cal);

        // 根据名称和指定的类型返回一个Bean，客户端无需自己进行类型转换，如果类型转换失败，容器抛出异常；
        Calendar cal1 = ac.getBean("calendarObj1", Calendar.class); // 方式2
        System.out.println("cal1:" + cal1);

        // 根据指定的类型返回一个Bean，客户端无需自己进行类型转换，如果没有或有多于一个Bean存在容器将抛出异常
        Calendar cal2 = ac.getBean(Calendar.class); // 方式3
        System.out.println("cal2:" + cal2);

        // 根据指定的类型返回一个键值为名字和值为Bean对象的Map，如果没有Bean对象存在则返回空的Map。
        Map map = ac.getBeansOfType(Calendar.class); // 方式4
        System.out.println("map:" + map);

        //map:{calendarObj1=java.util.GregorianCalendar[time=1475498415899,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Shanghai",offset=28800000,dstSavings=0,useDaylight=false,transitions=19,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2016,MONTH=9,WEEK_OF_YEAR=41,WEEK_OF_MONTH=2,DAY_OF_MONTH=3,DAY_OF_YEAR=277,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=40,SECOND=15,MILLISECOND=899,ZONE_OFFSET=28800000,DST_OFFSET=0]}
        //可以根据key值获取
        System.out.println("map:" + map.get("calendarObj1"));



        //自定义类

        //直接根据里名字首字母小写来获取实例
        ExampleBean exampleBean=(ExampleBean)ac.getBean("exampleBean");
        System.out.println("exampleBean："+exampleBean);

        //通过类.class来获取类实例,并且可以自定义命名
        ExampleBeanTwo anotherExample = ac.getBean("anotherExample", ExampleBeanTwo.class); // 方式2
        System.out.println("anotherExample：" + anotherExample);

    }



    /**
     * 测试 2. 使用静态工厂方法实例化的方式。
     */
    @Test
    public void testInstantiationWithAStaticFactoryMethodTest() {
        // 实例化Spring容器示例
        String conf = "instantiatingbeans/instantiation-with-a-static-factory-method.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(conf);

        // 利用Spring调用 Calendar 的静态工厂方法getInstance() 创建 Calendar实例.
        Calendar cal2 = ac.getBean("calendarObj2", Calendar.class);
        System.out.println("cal2:" + cal2);


        //自定义对象
        ClientService clientService=(ClientService)ac.getBean("clientService");
        System.out.println("clientService:"+clientService);

        ClientService clientService2=ac.getBean("clientService",ClientService.class);
        System.out.println("clientService2:"+clientService2);
    }


    /** 测试 3. 使用实例工厂方法实例化的方式。*/
    @Test
    public void testInstantiationUsingAnInstanceFactoryMethodTest() {
        // 实例化Spring容器示例
        String conf = "instantiatingbeans/instantiation-using-an-instance-factory-method.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(conf);

        // 利用Spring创建 GregorianCalendar 对象作为工厂, 调用getTime()方法创建Date类型对象实例.
        Date date = ac.getBean("dateObj", Date.class);
        System.out.println("date:" + date);


        //自定义实例工厂
        ConnectService connectService=ac.getBean("connectService", ConnectServiceImpl.class);
        System.out.println("connectService:" + connectService);

        AccountService accountService=ac.getBean("accountService", AccountServiceImpl.class);
        System.out.println("accountService:" + accountService);

    }



}
