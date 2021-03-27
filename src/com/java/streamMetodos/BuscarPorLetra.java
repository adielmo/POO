package com.java.streamMetodos;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class BuscarPorLetra {

	public static void main(String[] args) {
		List<String> listNomes = Arrays.asList("Pedro", "Maria", "Arthur", "João", "Marcos", "Bruna", "Joana", "Marta",
				"André", "Carlos", "Daniele", "Frank", "Zelia", "Rebeca", "Sarah", "Umberto", "Eliza", "Natália",
				"Ismael", "Katia", "Bia", "Marcela", "Adielmo", "Jonas", "Joilma", "Bruno", "Willian", "Zanata",
				"Claúdia", "Gustavo", "Felipe", "Roberto", "Luis", "Leonindas", "Moisés", "Heihtor", "Helena", "Lúcia",
				"Erica", "Giovana", "Iasmir", "Jean", "Leó", "Paulo", "Qeirós", "Yuri", "Natah", "Mauro", "Soraia",
				"José", "Nicolas", "Valeira", "Jamily", "Ji");
		
		/*for (int j = 0; j < listNomes.size(); j++) {
			//char letra =
			
			if ( listNomes.get(j).charAt(0) == 'A') {
				System.out.println(listNomes.get(j));
			}
		}
		*/
		
 //listNomes.stream().map(i -> i.toLowerCase()).filter(i -> i.charAt(0) == 'a').forEach(System.out::println);

	listNomes.stream().filter(i -> i.charAt(0) == 'J').sorted((a, b) -> a.compareTo(b)).forEach(i -> System.out.println(i));

	}

}
