package com.java.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {		

		Scanner sc = new Scanner(System.in);
		//String[] nomes = {"Adielmo", "Joilma", "Maria"};
		int[] nomes = new int[3];
		
		
		for (int i = 0; i < nomes.length; i++) {			
			
			try {
				System.out.println((i + 1) + "º Nome:");
				int nome = sc.nextInt();
				nomes[i] = nome;
				
			} catch (InputMismatchException e) {
				System.out.println("Enserindo valor Inválido!!" + e.getMessage());
				sc.nextLine();
			}
		}
		 
		
		try {
			System.out.println("\n" + nomes[0]);
		} catch (Exception e) {
			System.out.println("Erro de Posição do Vetor!!");
		}

	}
	
}
