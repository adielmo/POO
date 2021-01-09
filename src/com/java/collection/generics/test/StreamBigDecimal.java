package com.java.collection.generics.test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StreamBigDecimal {
	
	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(5, 98, 01, 76, 162, 98, 52, 71, 29, 17);
		List<String> letrasList = Arrays.asList("e", "o", "z", "p", "f", "a", "j", "p", "q", "k", "g", "w", "e");
		//intList.add(23);
		//intList.add(87);
		System.out.print("Integer para BigDecimal, total em BigDecimal: ");
		intList.stream()
		     .limit(2)
		      //.distinct()
		     .map(BigDecimal::new)
		     .reduce(BigDecimal::add)
		     .ifPresent(System.out::print);
		       
		
		//intList.stream().forEach(System.out::print);
		System.out.println("\nNúmeros Pares");
		intList.stream().filter(a -> a % 2 == 0).forEach(System.out::println);
		
		System.out.println("Números Distict");
		intList.stream()
		.skip(3)//Pular os três primeiros
		.limit(3)//trás os 3 primeiros
		.distinct()//Não trás numeros repetidos
		.forEach(num -> System.out.print(num +  " - "));
		
		System.out.print("\nSomar total: ");
		intList.stream().reduce((a, b) -> a + b ).ifPresent(System.out::println);
		
		System.out.print("Somar total 02: ");
		intList.stream().filter(a -> a % 2 == 0).reduce(Integer::sum).ifPresent(System.out::println);
		
		System.out.print("Mult total: ");
		int aa= intList.stream().distinct().filter(a -> a % 2 == 0).reduce(1, (a, b) -> a * b);//.ifPresent(System.out::println);
		System.out.print(aa);
		
		System.out.print("\nMutiplicar total: ");
		intList.stream()
				.distinct()
				.filter(a -> a% 2 == 0)
				.map(BigDecimal::new)
				.reduce(BigDecimal::multiply)
				.ifPresent(System.out::print);
		
		System.out.print("\nLetras ToUpperCase: ");
		letrasList.stream()
		.distinct()
		.map(nome -> nome.toUpperCase())
		.forEach(nome -> System.out.print(nome + " - "));
		
		System.out.print("\nQtd de Valores: ");
		System.out.print(intList.stream().distinct().count());
		System.out.print("\nMédia de Valores: ");
		intList.stream()
		       .distinct()
		       .mapToInt(i -> i)
		       .average()
		       .ifPresent(media -> System.out.println(media));
		       
		       
		          
	}

}
