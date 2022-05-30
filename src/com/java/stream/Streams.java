package com.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

	public static void main(String[] args) {
		String numeros =" 1, 2, 3, 4, 5, 6, 7, 8, 9";
		List<Integer> listNumeros = 
				Stream.of(numeros.split(","))
				.map(String::trim)
				.map(Integer::parseInt)
				.collect(Collectors.toList());
		List<String> names= Arrays.asList
				("Pedro", "Joao", "Leonardo", "Maria", "Joana", "Priscila", "Marta",
				"Natalia", "Leo", "Mariana", "Jonas");
		
		String nameFirname = names.stream()
				             //.filter(x -> x.startsWith("Joas"))
				             .filter(x -> x.equalsIgnoreCase("Joana"))
				            .findAny()				             
				             .orElse("Nome não existe.");
		
		System.out.println(nameFirname);
		
		
		//System.out.println(numeros);
		//listNumeros.forEach(x -> System.out.print(x + ", "));

	}

	
}
