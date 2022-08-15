package com.java.streamTeste;

import java.util.Arrays;
import java.util.List;

public class Stream01 {

	public static void main(String[] args) {

		System.out.println("======Stream Api======");
		List<String> names = Arrays.asList("Abdallah", "Mahmoud", "Ahmed");
		        names.stream().filter(name -> name.length() > 5)
		                .findFirst().ifPresent(System.out::println);
		                //.forEach(System.out::println);
		
	}

}
