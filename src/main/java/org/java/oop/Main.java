package org.java.oop;

import org.java.oop.config.Config;
import org.java.oop.logic.BubbleSort;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
//		BubbleSort<String> sort = new BubbleSort<>();
//		System.out.println(sort.sort(Arrays.asList(args)));

		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		BubbleSort sort = context.getBean(BubbleSort.class);

		System.out.println(sort);
	}
}
