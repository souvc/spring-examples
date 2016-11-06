package com.souvc.spring.dao;

import com.souvc.spring.entity.Actor;

import java.util.List;

public interface CorporateEventDao {


    public int countOfActorsByFirstName(String firstName);

    public int countOfActors(Actor exampleActor);

}
