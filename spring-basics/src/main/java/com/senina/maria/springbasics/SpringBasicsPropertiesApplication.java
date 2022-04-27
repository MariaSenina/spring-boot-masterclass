package com.senina.maria.springbasics;

import com.senina.maria.springbasics.properties.SomeExternalService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("classpath:app.properties")
public class SpringBasicsPropertiesApplication {
	private static Logger LOGGER = LoggerFactory.getLogger(SpringBasicsPropertiesApplication.class);

	public static void main(String[] args) {
		// Application Context
		// Auto-close using "try"
		try (AnnotationConfigApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(
						SpringBasicsPropertiesApplication.class)) {

			SomeExternalService someExternalService =
					applicationContext.getBean(SomeExternalService.class);
			LOGGER.info("{}", someExternalService);
			LOGGER.info("{}", someExternalService.returnServiceURL());
		}
	}
}
