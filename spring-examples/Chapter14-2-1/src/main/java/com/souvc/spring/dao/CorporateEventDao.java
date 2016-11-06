package com.souvc.spring.dao;

import com.souvc.spring.entity.Actor;

import java.util.List;

public interface CorporateEventDao {

    public  int getrowCount();

    public  int countOfActorsNamedJoe();

    public String getLastName();

    public Actor getActor();

    public List<Actor> getActorList();

    public List<Actor> findAllActors();

    public int insert();

    public int update();

    public int delete();

    public void execute();


}
