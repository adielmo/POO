package com.java.estruturaRepetitiva;

import java.util.Scanner;

public class Teste03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
  int menor = Integer.MAX_VALUE;
  int maior = Integer.MIN_VALUE;
		int x = 0;
		int soma = 0;
		int qtd = 0;
		char letra = 's';

		System.out.println("Qtd de números: ");
		qtd = sc.nextInt();
		Integer[] valor = new Integer[qtd];

		for (int i = 0; i < valor.length; i++) {
			System.out.println("Digete o valor: " + (i + 1));

			if (valor[i] == null) {
				valor[i] = sc.nextInt();
			}

		}

		for (int i = 0; i < valor.length; i++) {
			if (valor[i] > maior) {
				maior = valor[i];
			}
			
			/*
			 * if (valor[i] != 0) { soma += valor[i]; }
			 */

		}
		System.out.printf("Valor é %d", soma);

		/*
		 * for (int i = 0; i < x; i++) { if (i % 2 != 0) {
		 * System.out.println("Numero impar: " + i); } }
		 */

	}

}
