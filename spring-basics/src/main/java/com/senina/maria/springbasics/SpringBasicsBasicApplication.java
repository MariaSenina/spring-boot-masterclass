package com.senina.maria.springbasics;

import com.senina.maria.springbasics.basic.BinarySearchImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBasicsBasicApplication {

	public static void main(String[] args) {
//		BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());

		// Application Context
		ApplicationContext applicationContext = SpringApplication.run(SpringBasicsBasicApplication.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		int result = binarySearch.binarySearch(new int[] {12, 4, 6}, 3);
		System.out.println(result);
	}
}
