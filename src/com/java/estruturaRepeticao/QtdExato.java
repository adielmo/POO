package com.java.estruturaRepeticao;

import java.util.Scanner;

public class QtdExato {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int qtd, valor, soma=0;
		System.out.println("Ditege a qtd de numeros inteiros para soma:");
		 qtd = scanner.nextInt();
		 
		 for(int i=0; i < qtd; i++) {
			 System.out.println("Digete o " + (i+1) + "º valor:");
			 valor=scanner.nextInt();
			 soma += valor;
		 }
		 
		 System.out.println("Valor total: " + soma);

	}

}
