package com.java.string;

import java.util.Scanner;

public class PrimeiraLetraToUpperCase {

	public static void main(String[] args) {
		String nome;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digete seu Primeiro Nome:");
		nome = scanner.next();

		String[] letras = toUpperCase(nome);

		System.out.print("Nome ToUpperCase: ");
		for (String letra : letras) {

			System.out.print(letra);

		}
		System.out.print("\nNome Digetado: " + nome);
		scanner.close();
	}

	private static String[] toUpperCase(String nome) {
		validarString(nome);
		String letras[] = new String[nome.length()];

		for (int i = 0; i < nome.length(); i++) {

			if (i == 0) {
				letras[i] = Character.toString(nome.charAt(i)).toUpperCase();
			} else {
				letras[i] = Character.toString(nome.charAt(i)).toLowerCase();
			}

		}
		return letras;
	}

	private static void validarString(String nome) {
		if (nome.isEmpty()) {
			throw new RuntimeException("Nome está vazio!");
		}
	}

}
