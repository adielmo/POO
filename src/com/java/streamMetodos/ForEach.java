package com.java.streamMetodos;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ForEach {

	public static void main(String[] args) {
		List<String> listNomes = Arrays.asList("Pedro", "Maria", "Arthur", "João", "Marcos", "Bruna", "Joana", "Marta",
				"André", "Carlos", "Daniele", "Frank", "Zelia", "Rebeca", "Sarah", "Umberto", "Eliza", "Natália",
				"Ismael", "Katia", "Bia", "Marcela", "Adielmo", "Jonas", "Joilma", "Bruno", "Willian", "Zanata",
				"Claúdia", "Gustavo", "Felipe", "Roberto", "Luis", "Leonindas", "Moisés", "Heihtor", "Helena", "Lúcia",
				"Erica", "Giovana", "Iasmir", "Jean", "Leó", "Paulo", "Qeirós", "Yuri", "Natah", "Mauro", "Soraia",
				"José", "Nicolas", "Valeira");
		
		listNomes.stream().max(Comparator.comparing(String::length)).ifPresent(i-> System.out.println("Maior Palavra: "+i));
		listNomes.stream().min(Comparator.comparing(String::length)).ifPresent(i-> System.out.println("Menor Palavra: "+i));
		
		System.out.println("\n=======================================================================");
listNomes.stream().sorted(Comparator.comparing(String::toUpperCase)).forEach(i -> System.out.print(" "+i+" "));
System.out.println();
System.out.println(listNomes.stream().sorted().collect(Collectors.toList()));

System.out.println("\n=======================================================================\n");
listNomes.stream().sorted((a, b) -> a.compareTo(b)).forEach(i -> System.out.print(" "+i+" "));
System.out.println("\n\n================================================String Maiusculas");
listNomes.stream().map(a -> a.toUpperCase()).forEach(i -> System.out.print(" "+i+" "));

System.out.println("\n\n================================================String Minusculas");
listNomes.stream().map(String::toLowerCase).sorted((a, b) -> a.compareTo(b)). forEach(i -> System.out.print(" "+i+" "));

System.out.println("\n\n================================================Ordenação por");
//listNomes.stream().filter(a -> a.charAt(0) =="a") .sorted((a, b) -> a.compareTo(a)).forEach(i -> System.out.print(i + ", "));

listNomes.stream().filter(a -> a.charAt(0) =='a').forEach(i -> System.out.print(i));



	}
	
}
