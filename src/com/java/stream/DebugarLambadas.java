package com.java.stream;

import java.util.Arrays;
import java.util.List;

public class DebugarLambadas {
	
	public static void main(String[] args) {
		
		List<Integer> numerosInteger = Arrays.asList(237, 4, 67, 8, 2, 687, 3, 5);
		
numerosInteger.stream().map((a) -> new StringBuilder()
		      .append(a)
		      .append(" ")
		      .append("s")
		      .append("a")
		      .append("!"))
              .forEach(System.out::println);
		
	}

}
