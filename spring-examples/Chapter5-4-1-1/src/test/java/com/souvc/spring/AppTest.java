package com.souvc.spring;

import com.souvc.spring.dao.JDBCDataSource;
import com.souvc.spring.dao.UserDAO;
import com.souvc.spring.entity.User;
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

    /** 构造器参数注入 */
    @Test
    public void testOracleUserDAO(){
        String conf = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(conf);
        //获取MysqlUserDAO的实例
        UserDAO userDAO =  ac.getBean("userDAO", UserDAO.class);
        //查询用户对象
        User tom =  userDAO.findByName("Tom");
        System.out.println(tom);
    }


}
