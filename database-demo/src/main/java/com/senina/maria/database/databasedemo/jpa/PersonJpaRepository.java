package com.senina.maria.database.databasedemo.jpa;

import com.senina.maria.database.databasedemo.entity.Person;
import com.senina.maria.database.databasedemo.jdbc.PersonJdbcDAO;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
// NOTE: normally transaction handling goes in the Business layer
public class PersonJpaRepository {
    @PersistenceContext
    private EntityManager manager;

    public Person findById(int id) {
        return manager.find(Person.class, id);
    }

    /*
    Updates OR Inserts based on whether the passed person has an ID set or not:
     - If the ID is already set, it will update the data
     - If the ID is not set yet, a new Person will be inserted
     */
    public Person update(Person person) {
        return manager.merge(person);
    }

    public void deleteById(int id) {
        Person person = findById(id);
        manager.remove(person);
    }

    // Implemented using JPQL (Java Persistence Query Language)
    public List<Person> findAll() {
        TypedQuery query = manager.createNamedQuery("find_all_people", Person.class);
        return query.getResultList();
    }
}
