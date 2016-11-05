package com.souvc.spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {

    /**
     * 输出结果：
     实例化ExampleBean
     com.souvc.spring.ExampleBean@6b57696f
     实例化ExampleBean
     com.souvc.spring.ExampleBean@5bb21b69
     false
     */

    /**
     * 说明调用了2次ExampleBean类的构造方法创建了两个Bean对象，比较结果是false表示bean1和bean2引用了这两个不同的对象, 这样创建bean就不再是单例模式了。
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
