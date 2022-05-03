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
}
