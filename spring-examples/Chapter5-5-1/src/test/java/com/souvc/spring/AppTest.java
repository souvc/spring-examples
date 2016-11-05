package com.souvc.spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {

    /***
     * 输出结果：
     实例化ExampleBean
     com.souvc.spring.ExampleBean@4abdb505
     com.souvc.spring.ExampleBean@4abdb505
     true
     */


    /***
     * 在软件运行期间ExampleBean的构造器只被调用过一次, 创建过一个对象，两次获得引用变量bean1, bean2，通过比较操作符“ ==” 进行比较的输出结果为true，
     * 说明是引用了同一个对象, 也就说明Spring容器创建Bean对象是唯一实例, 是单例对象。
     */
    @Test
    public void testCreateBeanObject() {
        // 实例化Spring容器示例
        String conf = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(conf);

        ExampleBean bean = (ExampleBean) ac.getBean("exampleBean", ExampleBean.class);
        System.out.println(bean);
        ExampleBean bean2 = (ExampleBean) ac.getBean("exampleBean", ExampleBean.class);
        System.out.println(bean2);
        System.out.println(bean == bean2);
    }

}
