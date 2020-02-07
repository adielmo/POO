package com.java.exercicio.correcao02;

import java.util.Scanner;

import javax.swing.text.AbstractDocument.BranchElement;

public class TesteAluno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Aluno aluno;
		Aluno[] vet = new Aluno[9];
		char letra = 's';
		String nome, email;
		int numeroQuarto;

		do {
			System.out.println("Digete seu Nome:");
			nome = sc.nextLine();
			System.out.println("Digete seu E-mail:");
			email = sc.nextLine();
			System.out.println("Digete 0 nº do seu quarto de 0-9:");
			numeroQuarto = sc.nextInt();

			for (int i = 0; i < vet.length; i++) {

				if (vet[i] == null) {
					vet[i] = new Aluno(nome, email, numeroQuarto);

					break;

				}

			}

			System.out.println("Deseja Alugar masi Um quarto: s/n");
			letra = sc.next().charAt(0);

		} while (letra != 'n');
		
	for (int i = 0; i < vet.length; i++) {
		if (vet[i] != null) {
			System.out.println(vet[i]);
		}
	}

	}

}
