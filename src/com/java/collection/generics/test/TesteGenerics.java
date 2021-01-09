package com.java.collection.generics.test;

import java.util.List;
import java.util.Scanner;

import com.java.generics.ex.TesteMaioresValores;

public class TesteGenerics {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int qtd, val  =0;
		int maiorValor=Integer.MIN_VALUE;
		int menorValor=Integer.MAX_VALUE;
		
		System.out.println("Digete a Qtd de números:");
		qtd = scanner.nextInt();
	  int [] valores = new int[qtd];
		
		for (int i = 0; i < qtd; i++) {
			System.out.println("Digete o " + (i+1) + "º valor: ");
			val = scanner.nextInt();
			valores[i]= val;
			
			
		}
		System.out.print("List de valores: ");
		for (int i = 0; i < valores.length; i++) {
			System.out.print( + valores[i] + ", ");
		}
		
		
			System.out.println("\nPrimeiro valor foi: " + valores[0]);
			
			for (int i = 0; i < valores.length; i++) {
				if (valores[i] > maiorValor) {
					maiorValor=valores[i];
				}
			}
			
			for (int i = 0; i < valores.length; i++) {
				if (valores[i] < menorValor) {
					menorValor=valores[i];
				}
			}
			
			System.out.println("Maior da List: " + maiorValor);
			System.out.println("Menor da List: " + menorValor);
			
		
	}

}
