package com.souvc.spring;

import com.souvc.spring.dao.JdbcCorporateEventDao;
import com.souvc.spring.entity.Actor;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestCase {

    @Test
    public  void  getrowCount(){
        String conf = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(conf);
        JdbcCorporateEventDao jdbcCorporateEventDao = ac.getBean("jdbcCorporateEventDao",JdbcCorporateEventDao.class);
        int count = jdbcCorporateEventDao.getrowCount();
        System.out.print(count);
    }


    @Test
    public  void  countOfActorsNamedJoe(){
        String conf = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(conf);
        JdbcCorporateEventDao jdbcCorporateEventDao = ac.getBean("jdbcCorporateEventDao",JdbcCorporateEventDao.class);
        int count = jdbcCorporateEventDao.countOfActorsNamedJoe();
        System.out.print(count);
    }


    @Test
    public  void  getLastName(){
        String conf = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(conf);
        JdbcCorporateEventDao jdbcCorporateEventDao = ac.getBean("jdbcCorporateEventDao",JdbcCorporateEventDao.class);
        String lastName = jdbcCorporateEventDao.getLastName();
        System.out.print(lastName);
    }

    @Test
    public  void  getActor(){
        String conf = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(conf);
        JdbcCorporateEventDao jdbcCorporateEventDao = ac.getBean("jdbcCorporateEventDao",JdbcCorporateEventDao.class);
        Actor actor = jdbcCorporateEventDao.getActor();
        System.out.print(actor);
    }


    @Test
    public  void  getActorList(){
        String conf = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(conf);
        JdbcCorporateEventDao jdbcCorporateEventDao = ac.getBean("jdbcCorporateEventDao",JdbcCorporateEventDao.class);
        List<Actor> actors = jdbcCorporateEventDao.getActorList();
        System.out.print(actors);
    }


    @Test
    public  void  findAllActors(){
        String conf = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(conf);
        JdbcCorporateEventDao jdbcCorporateEventDao = ac.getBean("jdbcCorporateEventDao",JdbcCorporateEventDao.class);
        List<Actor> actors = jdbcCorporateEventDao.findAllActors();
        System.out.print(actors);
    }


    @Test
    public  void  insert(){
        String conf = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(conf);
        JdbcCorporateEventDao jdbcCorporateEventDao = ac.getBean("jdbcCorporateEventDao",JdbcCorporateEventDao.class);
        int count= jdbcCorporateEventDao.insert();
        System.out.println(count);
        List<Actor> actors = jdbcCorporateEventDao.findAllActors();
        System.out.print(actors);
    }


    @Test
    public  void  update(){
        String conf = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(conf);
        JdbcCorporateEventDao jdbcCorporateEventDao = ac.getBean("jdbcCorporateEventDao",JdbcCorporateEventDao.class);
        int count= jdbcCorporateEventDao.update();
        System.out.println(count);
        List<Actor> actors = jdbcCorporateEventDao.findAllActors();
        System.out.print(actors);
    }

    @Test
    public  void  delete(){
        String conf = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(conf);
        JdbcCorporateEventDao jdbcCorporateEventDao = ac.getBean("jdbcCorporateEventDao",JdbcCorporateEventDao.class);
        int count= jdbcCorporateEventDao.delete();
        System.out.println(count);
        List<Actor> actors = jdbcCorporateEventDao.findAllActors();
        System.out.print(actors);
    }


    @Test
    public  void  execute(){
        String conf = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(conf);
        JdbcCorporateEventDao jdbcCorporateEventDao = ac.getBean("jdbcCorporateEventDao",JdbcCorporateEventDao.class);
        jdbcCorporateEventDao.execute();

    }


}