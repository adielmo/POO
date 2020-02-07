package com.java.matrizes;

import java.util.Scanner;

public class Teste01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int qtd, valor, count=0;
		System.out.println("Qual o tamanho da Matriz Linha:");
		qtd = sc.nextInt();

		Integer[][] matrizes = new Integer[qtd][qtd];

		for (int i = 0; i < matrizes.length; i++) {

			for (int j = 0; j < matrizes[i].length; j++) {

				System.out.println("Digete o valor na Linha " + i + ", Coluna " + j);
				valor = sc.nextInt();

				if (matrizes[i][j] == null) {

					matrizes[i][j] = valor;
				}

			}

		}
		for (int i = 0; i < matrizes.length; i++) {
			
			for (int j = 0; j < matrizes[i].length; j++) {
				
				if (matrizes[i][j] < 0) {
					count ++;
				}
				
			}
			
		}

		for (int i = 0; i < matrizes.length; i++) {

			System.out.println(matrizes[i][i]);

		}
		System.out.println("==========================//====================");
		System.out.println("Qtd número Negativo: " + count);


		sc.close();
	}

}
