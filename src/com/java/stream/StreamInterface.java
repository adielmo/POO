package com.java.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class StreamInterface {

	public static void main(String[] args) {

		List<Integer> numerosInteger = Arrays.asList(237, 4, 34, 67, 8, 2, 687, 3, 5, 51, 4, 87, 91, 1, 34, 23, 76, 67, 51);

		Stream.generate(() -> new Random()
			  .nextInt(100))
		      .limit(1)
		      //.distinct()
		      .forEach(System.out::println);
		
		
		System.out.println();
		
		Long a= numerosInteger.stream()
		           .distinct()
		           .count();
		
		System.out.println(a);
		              
		            
		              
		              

	}

}
