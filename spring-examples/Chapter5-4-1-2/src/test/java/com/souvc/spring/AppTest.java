package com.souvc.spring;

import com.souvc.spring.dao.JDBCDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;

public class AppTest {

    /** Setter 注入测试 */
    @Test
    public void testJDBCDataSource() throws Exception{
        String conf = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(conf);
        System.out.println(ac);
        JDBCDataSource ds =  ac.getBean("dataSource", JDBCDataSource.class);
        Connection conn =  ds.getConnection();
        System.out.println(conn);
    }

}
