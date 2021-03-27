package com.java.streamMetodos;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamBuscarPelaInicial {

	public static void main(String[] args) {
		
		List<String> listNomes = Arrays.asList("Pedro", "Maria", "Arthur", "João", "Marcos", "Bruna", "Joana", "Marta",
				"André", "Carlos", "Daniele", "Frank", "Zelia", "Rebeca", "Sarah", "Umberto", "Eliza", "Natália",
				"Ismael", "Katia", "Bia", "Marcela", "Adielmo", "Jonas", "Joilma", "Bruno", "Willian", "Zanata",
				"Claúdia", "Gustavo", "Felipe", "Roberto", "Luis", "Leonindas", "Moisés", "Heihtor", "Helena", "Lúcia",
				"Erica", "Giovana", "Iasmir", "Jean", "Leó", "Paulo", "Qeirós", "Yuri", "Natah", "Mauro", "Soraia",
				"José", "Nicolas", "Valeira");
		
		//listNomes.stream().map(String::toLowerCase).filter(i -> i.startsWith("j")).forEach(i -> System.out.println(i+ ", "));
		//listNomes.stream().map(String::toUpperCase).filter(i -> i.contains("S")).filter(i -> i.length() < 5).forEach(i -> System.out.println(i+ ", "));
		
		
	//listNomes.stream().map(String::toLowerCase) .filter(i -> i.contains("w")).filter(i -> i.length() > 5).forEach(i -> System.out.println(i+ ", "));
	
	//listNomes.stream().filter(i -> i.length() > 5).sorted(Comparator.comparing(String::trim).reversed()).findFirst().ifPresent(System.out::println);
listNomes.stream().filter(i -> i.length() > 5).sorted((i, j) -> j.compareTo(i)).findFirst().ifPresent(System.out::println);

		 

	}

}
