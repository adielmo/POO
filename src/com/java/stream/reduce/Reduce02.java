package com.java.stream.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Reduce02 {

	public static void main(String[] args) {

		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
		//List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
		
		Integer sum = integers.stream().reduce(0, (a, b) -> a + b);
		Integer sum02 =  integers.stream().reduce(0, Integer::sum);
		//Integer sum03 =  integers.stream().reduce(0, ArithmeticUtils::add);
		Integer sum03 =  integers.stream().collect(Collectors.summingInt(Integer::intValue));
		Double average =  integers.stream().map(Double::valueOf).mapToDouble(Double::doubleValue).average().orElse(0);
		
		String string = "Item1 10 Item2 25 Item3 30 Item4 45";
		

		Integer soma = Arrays.stream(string.split(" "))
		    .filter((s) -> s.matches("\\d+"))
		    .peek(s -> System.out.println(s))
		    .mapToInt(Integer::valueOf)
		    .sum();		
		
	
	/**
	 * 	 \d+ Significa:
	 * \d significa um dígito (caractere no intervalo 0-9) e +significa 1 ou mais vezes. 
			Então, \d+é 1 ou mais dígitos.
	 */
			
	
		/*
	    System.out.println("Soma: "+sum);
		System.out.println("Soma02: "+sum02);
		System.out.println("Soma03: " + sum03);
		System.out.println("Média de " + sum + " é :" + average);
		System.out.println(soma);
		*/

	}

}
