package com.senina.maria.database.databasedemo.jdbc;

import com.senina.maria.database.databasedemo.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

@Repository
public class PersonJdbcDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    // Custom RowMapper
    class PersonRowMapper implements RowMapper<Person> {

        @Override
        public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
            Person person = new Person();
            person.setId(rs.getInt("id"));
            person.setName(rs.getString("name"));
            person.setLocation(rs.getString("location"));
            person.setBirthDate(rs.getTimestamp("birth_date").toLocalDateTime());

            return person;
        }
    }

    // SELECT * FROM person
    public List<Person> findAll() {
        return jdbcTemplate.query("select * from person", new PersonRowMapper());
    }

    // SELECT * FROM person WHERE id = xxx
    public Person findById(int id) {
        return jdbcTemplate.queryForObject("select * from person where id = ?",
                new PersonRowMapper(),
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
