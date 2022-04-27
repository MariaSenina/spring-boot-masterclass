package com.senina.maria.springbasics;

import com.senina.maria.springbasics.basic.BinarySearchImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringBasicsBasicApplication {

	public static void main(String[] args) {
//		BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());

		// Application Context
		// Auto-close using "try"
		try (AnnotationConfigApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(
						SpringBasicsBasicApplication.class)) {

			BinarySearchImpl binarySearch =
					applicationContext.getBean(BinarySearchImpl.class);
			int result = binarySearch.binarySearch(new int[]{12, 4, 6}, 3);
			System.out.println(result);
		}
	}
}
