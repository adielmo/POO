package com.java.estruturaRepetitiva;

import java.util.Scanner;

public class TesteFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valor = 1, soma = 0;

		for (int i = 0; i < valor; i++) {
			System.out.println("Digete o valor:");
			valor = sc.nextInt();
			soma += valor;
			
		}
		System.out.println(soma);
	}

}
