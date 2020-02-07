package com.java.exercicio.arrays;

import java.util.Locale;
import java.util.Scanner;

public class Teste01 {

	public static void main(String[] args) {
		//Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantas possições vai ser seu Array:");
		int qtd = sc.nextInt();
		double soma = 0;
		double[] vet = new double[qtd];

		for (int i = 0; i < vet.length; i++) {
			System.out.println("Digete o valor na posição " + i +" :");
			vet[i] = sc.nextDouble();
		}

		for (int i = 0; i < vet.length; i++) {
			soma += vet[i];
		}

		System.out.println("Valores digitados foram:");
		
		for (double saida : vet) {
			System.out.print(saida + " ");
		}
		System.out.printf("\nValor Total é %.2f: ", soma);
		
		System.out.printf("\nValor da media é %.2f\n: ", soma /vet.length);

	}

}
