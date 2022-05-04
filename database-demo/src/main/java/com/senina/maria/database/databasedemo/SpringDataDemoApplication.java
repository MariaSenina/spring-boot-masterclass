package com.senina.maria.database.databasedemo;

import com.senina.maria.database.databasedemo.entity.Person;
import com.senina.maria.database.databasedemo.jpa.PersonJpaRepository;
import com.senina.maria.database.databasedemo.springdata.PersonSpringDataRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;

@SpringBootApplication
public class SpringDataDemoApplication implements CommandLineRunner {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private PersonSpringDataRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("User id 10001 -> {}", repository.findById(10001));
		logger.info("Inserting a new Person. Number of rows inserted -> {}",
				repository.save(new Person("Tara", "Berlin", LocalDateTime.now())));
		logger.info("Updating 10003. Number of rows updated -> {}",
				repository.save(new Person(10003, "Pieter", "Utrecht", LocalDateTime.now())));
		repository.deleteById(10002);

		logger.info("All users -> {}", repository.findAll());
	}
}
