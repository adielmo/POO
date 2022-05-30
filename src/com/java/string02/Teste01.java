package com.java.string02;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Teste01 {

	public static void main(String[] args) {
String numerosString = "1, 2, 3, 4, 5, 6, 7, 8, 9, 0";
		
		
		List<Integer> numeros = 
				Stream.of(numerosString.split(","))
				.map(String::trim)
				.map(Integer::parseInt)
				.collect(Collectors.toList());
		
		System.out.println("String:");
		Stream.of(numerosString)
		       .forEach(x -> System.out.print(x +"-"));
		System.out.println("\nInteger:");
		numeros
		       .forEach(x -> System.out.print(x +"-"));

	}

}
