package com.souvc.spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {



    /**
     * 没有修改之前的结果：
     实例化ExampleBean
     初始化ExampleBean对象
     com.souvc.spring.ExampleBean@6b57696f
     实例化ExampleBean
     初始化ExampleBean对象
     com.souvc.spring.ExampleBean@5bb21b69
     false
     */


    /***
     * 控制台没有输出预期的“销毁ExampleBean对象”的结果。
     * 原因在于applicationContext.xml文件中设置的destroy-method属性仅仅对单例模式起作用，在prototype模式下没有意义。
     */


    /**
     * 正确结果：
     *
     实例化ExampleBean
     初始化ExampleBean对象

     com.souvc.spring.ExampleBean@4abdb505
     com.souvc.spring.ExampleBean@4abdb505
     true
     销毁ExampleBean对象
     */

    @Test
    public void testExampleBean() {
        // 实例化Spring容器示例
        String conf = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(conf);

        ExampleBean bean = (ExampleBean) ac.getBean("exampleBean",ExampleBean.class);
        System.out.println(bean);
        ExampleBean bean2 = (ExampleBean) ac.getBean("exampleBean", ExampleBean.class);
        System.out.println(bean2);
        System.out.println(bean == bean2);

        // 关闭Spring容器，注意AbstractApplicationContext里面定义了close方法
        AbstractApplicationContext ctx = (AbstractApplicationContext) ac;
        ctx.close();
    }

    @Test
    public void testExampleBean2() {
        // 实例化Spring容器示例
        String conf = "applicationContext2.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(conf);

        ExampleBean bean = (ExampleBean) ac.getBean("exampleBean",ExampleBean.class);
        System.out.println(bean);
        ExampleBean bean2 = (ExampleBean) ac.getBean("exampleBean", ExampleBean.class);
        System.out.println(bean2);
        System.out.println(bean == bean2);

        // 关闭Spring容器，注意AbstractApplicationContext里面定义了close方法
        AbstractApplicationContext ctx = (AbstractApplicationContext) ac;
        ctx.close();
    }


}
