package com.souvc.spring.dao;

import com.souvc.spring.entity.Actor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;
import javax.sql.DataSource;
import java.util.Collections;
import java.util.Map;


/***
 * NamedParameterJdbcTemplate 使用案例
 */
@Repository
public class JdbcCorporateEventDao implements  CorporateEventDao{

    //使用JdbcTemplate
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;


    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public int countOfActorsByFirstName(String firstName) {
        String sql = "select count(*) from T_ACTOR where first_name = :first_name";
        Map<String, String> namedParameters = Collections.singletonMap("first_name", firstName);
        return this.namedParameterJdbcTemplate.queryForObject(sql, namedParameters,  Integer.class);
    }

    public int countOfActors(Actor exampleActor) {
        // notice how the named parameters match the properties of the above Actor class
        String sql = "select count(*) from T_ACTOR where first_name = :firstName and last_name = :lastName";
        SqlParameterSource namedParameters = new BeanPropertySqlParameterSource(exampleActor);
        return this.namedParameterJdbcTemplate.queryForObject(sql, namedParameters, Integer.class);
    }
}
