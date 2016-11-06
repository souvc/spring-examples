package com.souvc.spring;

import com.souvc.spring.dao.EmpDAO;
import com.souvc.spring.entity.Emp;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestCase {

    @Test
    public  void  findAll(){
        String conf = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(conf);
        EmpDAO empDao = ac.getBean("jdbcEmpDao2",EmpDAO.class);
        List<Emp> list = empDao.findAll();
        for(Emp emp : list){
            System.out.println(emp.getEmpno() +" "+emp.getEname());
        }
    }

}