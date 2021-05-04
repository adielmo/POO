package com.java.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConvertFraseToNome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = 1;
		String frase = "";
		boolean flag = false;
		//do {
		System.out.println("Digete sua Frase:");
		frase = scanner.nextLine();
		//}while(flag);	
		
	List<String> frases= converterFrase(frase);
	
	for (int i = 0; i < frases.size(); i++) {

		if (count <= 5) {
			System.out.print(frases.get(i)+" ");
			count++;

		} else {
			System.out.println();
			count = 1;
			i--;
		}

	}

	}

	private static List<String> converterFrase(String frase) {
		String list[] = frase.split(" ");
		List<String> nomes = new ArrayList<>();

		for (int i = 0; i < list.length; i++) {

			nomes.add(Character.toString(list[i].charAt(0)).toUpperCase() + list[i].substring(1).toLowerCase());

		}

		return nomes;
	}

}
