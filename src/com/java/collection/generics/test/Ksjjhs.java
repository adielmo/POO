package com.java.collection.generics.test;

import java.util.Scanner;

import com.java.collection.generics.ConverterPrimeiraLetra;

public class Ksjjhs {

	public static void main(String[] args) {
		String nome;
		Scanner scanner = new Scanner(System.in);

		System.out.println("DIGETE:");
		nome = scanner.next();
		String aa = "" + nome.charAt(1);
		// System.out.println(ConverterPrimeiraLetra.convertertoUpperCase(nome));
		// System.out.println(aa);

		String name = "" + nome.charAt(1);
		String nn = "" + nome.charAt(1);

		if (name.toUpperCase().equals(nn)) {

			System.out.println(true);
		} else {
			System.out.println(false);
		}

	}

}
