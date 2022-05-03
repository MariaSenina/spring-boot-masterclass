package com.senina.maria.database.databasedemo;

import com.senina.maria.database.databasedemo.jpa.PersonJpaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaDemoApplication implements CommandLineRunner {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private PersonJpaRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(JpaDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("User id 10001 -> {}", repository.findById(10001));

//		logger.info("All users -> {}", dao.findAll());
//		logger.info("Deleting 10002. Number of rows deleted -> {}", dao.deleteById(10002));
//		logger.info("Inserting 10004. Number of rows inserted -> {}",
//				dao.insert(new Person(10004, "Tara", "Berlin", LocalDateTime.now())));
//		logger.info("Updating 10003. Number of rows updated -> {}",
//				dao.update(new Person(10003, "Pieter", "Utrecht", LocalDateTime.now())));
	}
}
