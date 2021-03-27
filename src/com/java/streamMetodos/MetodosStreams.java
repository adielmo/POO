package com.java.streamMetodos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MetodosStreams {

	public static void main(String[] args) {
		
		List<String> listNomes = Arrays.asList("Pedro", "Maria", "Arthur", "João", "Marcos", "Bruna", "Joana", "Marta",
				"André", "Carlos", "Daniele", "Frank", "Zelia", "Rebeca", "Sarah", "Umberto", "Eliza", "Natália",
				"Ismael", "Katia", "Bia", "Marcela", "Adielmo", "Jonas", "Joilma", "Bruno", "Willian", "Zanata",
				"Claúdia", "Gustavo", "Felipe", "Roberto", "Luis", "Leonindas", "Moisés", "Heihtor", "Helena", "Lúcia",
				"Erica", "Giovana", "Iasmir", "Jean", "Leó", "Paulo", "Qeirós", "Yuri", "Natah", "Mauro", "Soraia",
				"José", "Nicolas", "Valeira");
		
		listNomes.stream().map(String::toLowerCase).filter(i -> i.startsWith("j")).sorted().forEach(i->System.out.print(i + ", "));
		System.out.println();
		
		listNomes.stream().filter(i -> i.length() > 6).map(String::toUpperCase).sorted().forEach(i ->System.out.print(i + ", "));
		System.out.println();
		listNomes.stream().filter(a -> a.toUpperCase().charAt(0) == 'A').forEach(i ->System.out.print(i + ", "));
		System.out.println();
		//listNomes.stream().collect(Collectors.summarizingInt(a -> a.getQtd().intValue()));


		
	}

}
