package com.java.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Teste {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String nome = "";
		int flag = 0, numeros = 0;
		//Pattern pattern = Pattern.compile("[A-Z]");
		//Matcher matcher;

		do {
			flag = 0;

			//entradaUmaLetraToUpperCase(scanner);

			//entradaValidarNumeros(scanner);
			entradaValidarCpf(scanner);

			System.out.println("Digete 0 para Sair: ");
			flag = scanner.nextInt();

			scanner.nextLine();
		} while (flag != 0);

		System.out.println("Fim!!!!!!!!!!!!!!!");

	}

	private static void entradaValidarCpf(Scanner scanner) {
		System.out.println("Digete o Cpf 11 Números:");
		String cpf = scanner.next();
		
		boolean valido = isValideCpf(cpf);
		if (valido) {
			System.out.println("Cpf válido: " + cpf);
		} else {
			System.out.println(false);
		}

	}

	private static boolean isValideCpf(String cpf) {
		//return cpf.matches("[0-9]{11}");
		return cpf.matches("[0-9]{3}.?[0-9]{3}.?[0-9]{3}-?[0-9]{2}");
		
	}

	private static void entradaValidarNumeros(Scanner scanner) {
		System.out.println("Digete Somente Números:");
		String numero = scanner.next();

		if (isValideNumeros(numero)) {
			System.out.println("Formato Válido: " + numero);
		} else {
			System.out.println("Formatos Inválido:\nFormato[00000] ");

		}

	}

	private static boolean isValideNumeros(String numeros) {
		return numeros.matches("[0-9]+");
	}

	private static void entradaUmaLetraToUpperCase(Scanner scanner) {
		String nome = "";
		System.out.println("Digete Somente Letras:");
		nome = scanner.next();

		if (isValideString(nome)) {
			System.out.println("Válido: " + nome);
		} else {
			System.out.println("Formato Inválido!\nFormato[Xxxxx]\n");
		}

	}

	private static boolean isValideString(String nome) {
		return nome.matches("[A-Z][a-z]{1,}");
	}

}
