package com.senina.maria.database.databasedemo.jdbc;

import com.senina.maria.database.databasedemo.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonJdbcDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    // SELECT * FROM person
    public List<Person> findAll() {
        return jdbcTemplate.query("select * from person", new BeanPropertyRowMapper<>(Person.class));
    }

    // SELECT * FROM person WHERE id = xxx
    public Person findById(int id) {
        return jdbcTemplate.queryForObject("select * from person where id = ?",
                new BeanPropertyRowMapper<>(Person.class),
                id);
    }
}
