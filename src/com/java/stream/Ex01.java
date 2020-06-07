package com.java.stream;

import java.util.Arrays;
import java.util.List;

public class Ex01 {
	
	public static void main(String[] args) {
		String espaco = " ";
		
		List<String> letras = Arrays.asList("d", "a", "h", "k", "b", "C", "f", "y", "u", "I", "S", 
				"x", "m", "q", "j");
		List<Integer> numeros = Arrays.asList(3, 6, 78, 1, 9, 5, 7, 4, 8,34, 87, 
				92, 75, 51, 257);
		
		letras.stream().forEach((l) -> System.out.print(l.toUpperCase() + espaco));
		
		letras.sort((l1, l2) -> l1.toUpperCase().compareTo(l2.toUpperCase()));
		
		System.out.println();
		numeros.stream().forEach(i -> System.out.print(i + espaco));
		
		System.out.println();
		numeros.stream().map((valor) -> valor * 2).forEach(valor -> System.out.print(valor + espaco));
		
		System.out.println();
		
		Integer soma = numeros.stream().reduce(0, (valor1, valor2) -> valor1 + valor2);
		System.out.println(soma);
		
		//numeros.stream().reduce(accumulator)
		
		
		
		System.out.println();
		
		//numeros.stream().filter((p1) -> p1 % 2 == 0).forEach(System.out::println);
		
		/*
		 * for (String cha : letras) { System.out.print(cha.toLowerCase() + espaco); }
		 */
		
		//letras.forEach(System.out::printf);
		
/*		for(String l : letras) {
			System.out.print(l.toUpperCase() + " ");
		}
	
	*/
	}

}
