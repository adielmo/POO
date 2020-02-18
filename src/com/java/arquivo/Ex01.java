package com.java.arquivo;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int linhas, colunas, valor;
		
		System.out.println("Qtd de Linhas:");
		linhas = sc.nextInt();
		
		System.out.println("Qtd de Colunas:");
		colunas = sc.nextInt();
		
		Integer[][] matriz = new Integer[linhas][colunas];
		
		for(int i=0; i < matriz.length; i++) {
			
			for(int j=0; j < matriz[i].length; j++) {
				System.out.println("Digete na Linha " + i + " Coluna " + j + " :");
				valor = sc.nextInt();
				
				matriz[i][j] = valor;
			}
			
		}
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}

}
