package com.java.estruturaRepetitiva;

import java.util.Scanner;

public class Teste04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome = "Adielmo Rabelo Santos";
		String or = "ab.cde.FG.HIJ";
		String original = "abcde FGHIJ ABC abc DEFG";
		String orig = "       FGHIJ                ";
		String o = "etiraosespaçossobreçalentesdocomeçoedofimdastring";
	

		String[] palavras;
		palavras = nome.split(" ");

		for (int i = 0; i < palavras.length; i++) {
			System.out.print(palavras[i] + " ");
		}
System.out.println(palavras.length);
		/*
		 * System.out.println(nome.substring(5)); System.out.println(nome.substring(5,
		 * 10));
		 */

		/*
		 * System.out.println("Digete seu nome completo:"); nome = sc.nextLine();
		 * System.out.println("Maiusculo: " + nome.toUpperCase());
		 * System.out.println("Minusculo: " + nome.toLowerCase());
		 * System.out.println("Nomes s/Espaços: " + nome.trim());
		 */
		/*
		 * System.out.println(orig); System.out.println(orig.trim());
		 * System.out.println(o.replace("", ".")); System.out.println(o.length());
		 * System.out.println(or.replace(".", "-"));
		 * System.out.println(original.replace(" ", ""));
		 * System.out.println(orig.trim());
		 */

	}

}
