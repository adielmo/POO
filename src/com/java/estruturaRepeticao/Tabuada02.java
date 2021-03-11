package com.java.estruturaRepeticao;

import java.util.Scanner;

public class Tabuada02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int qtd, i =1;
		System.out.println("Digete o valor da Tabuada: ");
		 qtd = scanner.nextInt();
		 
do {
	System.out.println(i + " x " + qtd +" = " + (i*qtd));
i++;
} while (i < 11);

		 
	/*	for (int i = 1; i < 11; i++) {
			
			System.out.println(i + " x " + qtd +" = " + (i*qtd));
		} */

	}

}
