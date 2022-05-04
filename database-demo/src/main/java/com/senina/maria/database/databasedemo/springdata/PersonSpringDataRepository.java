package com.senina.maria.database.databasedemo.springdata;

import com.senina.maria.database.databasedemo.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

// In <...> -> which entity we want to manage, which datatype is the primary key
public interface PersonSpringDataRepository extends JpaRepository<Person, Integer> {
}
