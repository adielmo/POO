package com.java.stringex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TesteString {

	public static void main(String[] args) {
		boolean flag = false;
		Scanner scanner = new Scanner(System.in);
		String nome = "";
		String numeros = "";
		// ([^a-zA-Z]) qualquer coisa que não seja a-zA-Z, uma vez.
		// ([a-zA-Z]+) a-zA-Z qualquer quantidade devendo ter ao menos 1

		do {
			do {
				flag = false;
				System.out.println("Digete seu Nome:");
				nome = scanner.next();
				flag = isValideString(nome);
			} while (!flag);

			do {
				flag = false;
				System.out.println("Digete seu Números:");
				numeros = scanner.next();
				flag = isNumeros(numeros);
			} while (!flag);

		} while (!flag);

		System.out.println("Nome: " + nome + "\nNúmero: " + Integer.parseInt(numeros));

	}

	private static boolean isNumeros(String numeros) {

		if (numeros.matches("[0-9]*")) {
			return true;
		}
		return false;
	}

	private static boolean isValideString(String nome) {
		// Pattern pattern = Pattern.compile("[a-zA-Z]{5,}");
		// Pattern pattern = Pattern.compile("[a-z]*");
		// Matcher matcher = pattern.matcher(nome);

		if (nome.matches("[a-z]*")) {
			return true;
		}
		return false;
	}

}
