package com.java.arquivo.ex02;

import java.util.Scanner;

public class SaidaToUpperCase {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digete a primeira letra do Funcionario:");
		String nome = scanner.next();

		char letra = nome.toUpperCase().charAt(0);

		System.out.println(letra);

	}

}
