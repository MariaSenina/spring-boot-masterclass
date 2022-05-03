package com.senina.maria.database.databasedemo.jpa;

import com.senina.maria.database.databasedemo.entity.Person;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
// NOTE: normally transaction handling goes in the Business layer
public class PersonJpaRepository {
    @PersistenceContext
    private EntityManager manager;

    public Person findById(int id) {
        return manager.find(Person.class, id);
    }

    // Updates OR Inserts based on whether the passed person has an ID set or not
    // If the ID is already set, it will update the data
    // If the ID is not set yet, a new Person will be inserted
    public Person update(Person person) {
        return manager.merge(person);
    }
}
