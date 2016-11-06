package com.souvc.spring;

import com.souvc.spring.dao.JdbcCorporateEventDao;
import com.souvc.spring.entity.Actor;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCase {

    @Test
    public  void  countOfActorsByFirstName(){
        String conf = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(conf);
        JdbcCorporateEventDao jdbcCorporateEventDao = ac.getBean("jdbcCorporateEventDao",JdbcCorporateEventDao.class);
        int count = jdbcCorporateEventDao.countOfActorsByFirstName("Leonor");
        System.out.print(count);
    }


    @Test
    public  void  countOfActors(){
        String conf = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(conf);
        JdbcCorporateEventDao jdbcCorporateEventDao = ac.getBean("jdbcCorporateEventDao",JdbcCorporateEventDao.class);
        Actor exampleActor=new Actor();
        //exampleActor.setId(3L);
        exampleActor.setFirstName("Joe");
        exampleActor.setLastName("Banjo");
        int count = jdbcCorporateEventDao.countOfActors(exampleActor);
        System.out.print(count);
    }




}