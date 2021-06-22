package com.java.array;

import java.util.Scanner;

public class TesteChar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nomes = "";// "Adielmo Rabelo Santos";

		System.out.println("Digete seu Nome:");
		nomes = scanner.nextLine();

		char[] arraychar = convCharacter(nomes.trim());

		for (Character array : arraychar) {
			System.out.print(array + " ");
		}
		System.out.println("\n" + arraychar.length);
	}

	private static char[] convCharacter(String nomes) {
		int count = 0;
		try {
			isValide(nomes);

		} catch (RuntimeException e) {
			System.out.println(e);
		}
		char[] arrayChar = new char[nomes.length()];

		while (count < nomes.length()) {
			arrayChar[count] = nomes.charAt(count);

			count++;
		}
		return arrayChar;
	}

	public static void isValide(String nomes) {

		if (nomes.length() < 1) {
			throw new RuntimeException("Tamanho do nome não pode ser menor que 1.");
		}
	}

}
