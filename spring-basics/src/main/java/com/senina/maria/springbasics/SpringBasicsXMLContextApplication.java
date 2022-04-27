package com.senina.maria.springbasics;

import com.senina.maria.springbasics.xml.XmlPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan
public class SpringBasicsXMLContextApplication {

	public static void main(String[] args) {

		Logger LOGGER = LoggerFactory.getLogger(SpringBasicsXMLContextApplication.class);

		// Application Context
		// Auto-close using "try"
		try (ClassPathXmlApplicationContext applicationContext =
				new ClassPathXmlApplicationContext("applicationContext.xml")) {

			XmlPersonDAO personDAO =
					applicationContext.getBean(XmlPersonDAO.class);
			LOGGER.info("{}", personDAO);
			LOGGER.info("{}", personDAO.getXmlJdbcConnection());
		}
	}
}
