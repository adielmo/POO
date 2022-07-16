package com.java.character;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Teste01 {

	public static void main(String[] args) {
		String name = "Adielmo";
		List<String> names =new ArrayList<>();
				Arrays.asList("Pedro", "Paulo", "Aldo", "José", "Dom", "Aldir");
				names.add("Pedro");
				names.add("Paulo");
				names.add("Aldo");
				names.add("Dom");
				names.add("Aldir");
		/*
		 * try {
		 * 
		 * } catch (UnsupportedOperationException e) { System.out.println("Error: "
		 * +e.getMessage()); }
		 */
		names.removeIf(x -> (x.toLowerCase().charAt(0) == 'a'));
		
		names.forEach(System.out::println);

		// nomes.removeIf(x -> x.charAt(0) == 'F');
		// names.forEach(System.out::print);

		char[] charName = name.toCharArray();

		for (char c : charName) {
			System.out.print(c + " ");
		}
		System.out.println();

		// System.out.println(String.valueOf(charName[4]).toUpperCase());
	}

}
