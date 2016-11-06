package com.souvc.spring.dao;

import com.souvc.spring.entity.Actor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/***
 * JdbcTemplate 使用案例
 */
@Repository
public class JdbcCorporateEventDao implements  CorporateEventDao{

    //使用JdbcTemplate
    private JdbcTemplate jdbcTemplate;


    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public int getrowCount() {
        int rowCount = this.jdbcTemplate.queryForObject("select count(*) from t_actor", Integer.class);
        return rowCount;
    }

    public int countOfActorsNamedJoe() {
        int countOfActorsNamedJoe = this.jdbcTemplate.queryForObject("select count(*) from t_actor where first_name = ?", Integer.class, "Joe");
        return countOfActorsNamedJoe;
    }

    public String getLastName() {
        String lastName = this.jdbcTemplate.queryForObject(
                "select last_name from t_actor where id = ?",
                new Object[]{3}, String.class);
        return lastName;
    }


    public Actor getActor() {
        Actor actor = this.jdbcTemplate.queryForObject("select id, first_name, last_name from t_actor where id = ?",
                new Object[]{1},
                new RowMapper<Actor>() {
                    public Actor mapRow(ResultSet rs, int rowNum) throws SQLException {
                        Actor actor = new Actor();
                        actor.setId(rs.getLong("id"));
                        actor.setFirstName(rs.getString("first_name"));
                        actor.setLastName(rs.getString("last_name"));
                        return actor;
                    }
                });
        return actor;
    }


    public List<Actor> getActorList() {
        List<Actor> actors = this.jdbcTemplate.query( "select first_name, last_name from t_actor",
                new RowMapper<Actor>() {
                    public Actor mapRow(ResultSet rs, int rowNum) throws SQLException {
                        Actor actor = new Actor();
                        actor.setFirstName(rs.getString("first_name"));
                        actor.setLastName(rs.getString("last_name"));
                        return actor;
                    }
                });
        return actors;
    }



    public List<Actor> findAllActors() {
        return this.jdbcTemplate.query( "select first_name, last_name from t_actor", new ActorMapper());
    }
    private static final class ActorMapper implements RowMapper<Actor> {
        public Actor mapRow(ResultSet rs, int rowNum) throws SQLException {
            Actor actor = new Actor();
            actor.setFirstName(rs.getString("first_name"));
            actor.setLastName(rs.getString("last_name"));
            return actor;
        }
    }


    public int insert() {
        return this.jdbcTemplate.update( "insert into t_actor (first_name, last_name) values (?, ?)", "Leonor", "Watling");
    }

    public int update() {
        return this.jdbcTemplate.update("update t_actor set last_name = ? where id = ?", "Banjo", 3);
    }

    public int delete() {
        String actorId="2";
        return this.jdbcTemplate.update("delete from t_actor where id = ?", Long.valueOf(actorId));
    }


    public void execute() {
        this.jdbcTemplate.execute("create table mytable (id integer, name varchar(100))");
    }
}
