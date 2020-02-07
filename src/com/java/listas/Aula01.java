package com.java.listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Aula01 {

	public static void main(String[] args) {
		List<String> nomes = new ArrayList<>();
		List<Integer> numeros = Arrays.asList(12, 89, 5, 68, 564, 7, 51, 4, 10, 73, 35);

		nomes.add("Paulo");
		nomes.add("Maria");
		nomes.add("Fernanda");
		nomes.add("Adriana");
		nomes.add("Flávio");
		nomes.add("Luana");
		nomes.add("Amanda");

		for (String n : nomes) {
			System.out.print(n + " - ");
		}
		
		nomes.add(0, "Adielmo");
		nomes.add(5, "Joilma");
		System.out.println("=====================================");
		
		System.out.println();
		for (String nn : nomes) {
			System.out.print(nn + " - ");
		}

		nomes.removeIf(x -> x.charAt(0) == 'F');
		System.out.println("=====================================");
		/*
		 * for(String aa : nomes) { System.out.print(aa + " + "); }
		 */
		for (String nn : nomes) {
			System.out.print(nn + " - ");

		}
		System.out.println("=====================================");

		String nome = "";
		nome = "Joilma";

		System.out.println("Nome está na Posição: " + nomes.indexOf(nome));
		System.out.println("=====================================");
		
		List<String> names = nomes.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

		for (String string : names) {

			System.out.print(string + " - ");

		}
		System.out.println("\n=====================================");
		
		String sss = nomes.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(sss);
		
		System.out.println("\n=====================================");
		List<Integer> hh = numeros.stream().filter(x -> x > 10 && x < 100).collect(Collectors.toList());
		System.out.println(hh);
		
		System.out.println("\n=====================================");
		
	
		
		 // Integer result = 
				  numeros .parallelStream() 
				  .reduce((subtotal, element) -> subtotal + element)
				  .ifPresent(System.out::println);
		 		
		//System.out.printf("Total: %d", result);
		System.out.println("\n=====================================");
		

		/*
		 * nomes.remove("Luana"); nomes.remove(3); System.out.println();
		 * 
		 * for(String nn : nomes) { System.out.print(nn + " - "); }
		 */
	}

}
