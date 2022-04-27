package com.senina.maria.springbasics;

import com.senina.maria.springbasics.xml.XmlPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBasicsXMLContextApplication {
	private static Logger LOGGER = LoggerFactory.getLogger(SpringBasicsXMLContextApplication.class);

	public static void main(String[] args) {

		// Application Context
		// Auto-close using "try"
		try (ClassPathXmlApplicationContext applicationContext =
				new ClassPathXmlApplicationContext("applicationContext.xml")) {

			LOGGER.info("Beans Added -> {}", (Object) applicationContext.getBeanDefinitionNames());

			XmlPersonDAO personDAO =
					applicationContext.getBean(XmlPersonDAO.class);
			LOGGER.info("{}", personDAO);
			LOGGER.info("{}", personDAO.getXmlJdbcConnection());
		}
	}
}
