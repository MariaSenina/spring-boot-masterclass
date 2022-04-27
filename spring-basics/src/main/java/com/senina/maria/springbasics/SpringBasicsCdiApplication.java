package com.senina.maria.springbasics;

import com.senina.maria.springbasics.cdi.SomeCdiBusiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringBasicsCdiApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringBasicsCdiApplication.class);

	public static void main(String[] args) {
		// Application Context
		AnnotationConfigApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(SpringBasicsCdiApplication.class);
		SomeCdiBusiness business = applicationContext.getBean(SomeCdiBusiness.class);

		LOGGER.info("{}, dao-{}", business, business.getSomeCdiDao());
	}
}
