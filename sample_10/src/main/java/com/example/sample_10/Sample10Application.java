package com.example.sample_10;

import config.MyConfig;
import inface.SortingAlgo;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Sample10Application {

	public static void main(String[] args) {
		ApplicationContext context =
				new AnnotationConfigApplicationContext(MyConfig.class);
		SortingAlgo sortingAlgo = context.getBean("insert", SortingAlgo.class);
		sortingAlgo.doSort();
	}
}
