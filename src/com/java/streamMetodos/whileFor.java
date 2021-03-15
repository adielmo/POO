package com.java.streamMetodos;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.IntStream;

public class whileFor {

	public static void main(String[] args) {

		List<String> listNomes = Arrays.asList("Pedro", "Maria", "Arthur", "João", "Marcos", "Bruna", "Joana", "Marta",
				"André", "Carlos", "Daniele", "Frank", "Zelia", "Rebeca", "Sarah", "Umberto", "Eliza", "Natália",
				"Ismael", "Katia", "Bia", "Marcela", "Adielmo", "Jonas", "Joilma", "Bruno", "Willian", "Zanata",
				"Claúdia", "Gustavo", "Felipe", "Roberto", "Luis", "Leonindas", "Moisés", "Heihtor", "Helena", "Lúcia",
				"Erica", "Giovana", "Iasmir", "Jean", "Leó", "Paulo", "Qeirós", "Yuri", "Natah", "Mauro", "Soraia",
				"José", "Nicolas", "Valeira");

		System.out.println("Total de nomes: " + listNomes.stream().count());

		int count = 0, flag = 0;;
		/*
		 * for (int i = 0; i < listNomes.size(); i++) {
		 * 
		 * if (count < 13) { System.out.print(listNomes.get(i) + ", "); count++; } else
		 * {
		 * 
		 * System.out.println(); System.out.print(listNomes.get(i) + ", "); count = 1; }
		 * }
		 */
		
		while (count < listNomes.size()) {
			if (flag < 3) {
				System.out.print(listNomes.get(count) + ", ");
				flag++;

			} else {
				System.out.println();
				System.out.print(listNomes.get(count) + ", ");
				flag = 1;
			}
			count ++;
		}

	}

}
