package com.senina.maria.springbasics;

import com.senina.maria.springbasics.scope.PersonDAO;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringBasicsScopeApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringBasicsScopeApplication.class);

	public static void main(String[] args) {
		// Application Context
		AnnotationConfigApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(SpringBasicsScopeApplication.class);
		PersonDAO personDao = applicationContext.getBean(PersonDAO.class);
		PersonDAO personDao2 = applicationContext.getBean(PersonDAO.class);

		LOGGER.info("{}", personDao);
		LOGGER.info("{}", personDao.getJdbcConnection());

		LOGGER.info("{}", personDao2);
		LOGGER.info("{}", personDao2.getJdbcConnection());
	}
}
