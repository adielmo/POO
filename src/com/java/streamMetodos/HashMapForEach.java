package com.java.streamMetodos;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapForEach {

	public static void main(String[] args) {
		List<String> listNomes = Arrays.asList("Pedro", "Maria", "Arthur", "João", "Marcos", "Bruna", "Joana", "Marta",
				"André", "Carlos", "Daniele", "Frank", "Zelia", "Rebeca", "Sarah", "Umberto", "Eliza", "Natália",
				"Ismael", "Katia", "Bia", "Marcela", "Adielmo", "Jonas", "Joilma", "Bruno", "Willian", "Zanata",
				"Claúdia", "Gustavo", "Felipe", "Roberto", "Luis", "Leonindas", "Moisés", "Heihtor", "Helena", "Lúcia",
				"Erica", "Giovana", "Iasmir", "Jean", "Leó", "Paulo", "Qeirós", "Yuri", "Natah", "Mauro", "Soraia",
				"José", "Nicolas", "Valeira");
		Map<Integer, String> map = new HashMap<>();

		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		map.put(4, "d");
		map.put(5, "e");
		map.entrySet().stream().filter(i-> i.getKey() % 2 == 0).forEach(i -> System.out.println(i));
System.out.println();


		/*
		System.out.println(map.containsKey(4));

		for (Integer key : map.keySet()) {
			System.out.println("Chave: " + key + " Value:" + map.get(key));
		}

		System.out.println();
		map.forEach((key, value) -> System.out.println("Chave: " + key + " Valor:" + value));
		System.out.println();
		
		map.entrySet().stream().forEach(i -> System.out.println(i));
		System.out.println("===========================");
		
		map.entrySet().stream().skip(1).limit(3).forEach(i -> System.out.println(i));
		System.out.println("=============================================");

		map.forEach((i, y) -> {
			System.out.println(i + ":" + y);
		});
 */
	}

}
