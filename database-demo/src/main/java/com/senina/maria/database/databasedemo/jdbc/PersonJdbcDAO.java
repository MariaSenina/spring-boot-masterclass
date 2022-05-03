package com.senina.maria.database.databasedemo.jdbc;

import com.senina.maria.database.databasedemo.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
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

    // DELETE FROM person WHERE id = xxx
    public int deleteById(int id) {
        return jdbcTemplate.update("delete from person where id = ?", id);
    }

    // INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE) VALUES(...)
    public int insert(Person person) {
        return jdbcTemplate.update("insert into " +
                                        "person (id, name, location, birth_date) " +
                                        "values(?, ?, ?, ?)",
                person.getId(), person.getName(), person.getLocation(), Timestamp.valueOf(person.getBirthDate()));
    }

    // UPDATE PERSON SET NAME = ? ...
    public int update(Person person) {
        return jdbcTemplate.update("update person " +
                                        "set name = ?, location = ?, birth_date = ? " +
                                        "where id = ?",
                person.getName(), person.getLocation(), Timestamp.valueOf(person.getBirthDate()), person.getId());
    }
}
