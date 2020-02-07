package com.java.exercicio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class AlunoTeste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome, email, msg;
		int quarto, qtd;
		boolean flag = false;		
		Aluno[] listAlunos = new Aluno[10];
		
		//List<String> ss= new ArrayList<String>();
		List<String> ddd = Arrays.asList("Animal", "peixe", "Aves", "Homem", "Mamiferos");
		
		for(int i=0; i < ddd.size(); i++) {
			
			try {
			if (ddd.get(5).equals("Mamiferos")) {
				System.out.println("True");
			}
			}catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Não existe essa possição " + e.getMessage());
			}
		}
		/*
		 * for(String a : ddd) { System.out.println(a); }
		 */
		
		System.out.println("Quantos quartos vc vai Alugar:");
		qtd = sc.nextInt();

		entradaDeDados(sc, qtd, listAlunos);
		System.out.println("\nSaida de Dados:");
		saidaDeDados(listAlunos);
		sc.close();
	}

	private static void entradaDeDados(Scanner sc, int qtd, Aluno[] listAlunos) {
		String nome;
		String email;
		String msg;
		int quarto;
		boolean flag;
		for (int i = 0; i < qtd; i++) {
			sc.nextLine();

			System.out.println("Digete seu Nome:");
			nome = sc.nextLine();

			System.out.println("Digite seu E-mail " + nome + " :");
			email = sc.nextLine();

			entradaDeQuartos(sc, listAlunos, nome, email);

		}
	}

	private static void entradaDeQuartos(Scanner sc, Aluno[] listAlunos, String nome, String email) {
		String msg;
		int quarto;
		boolean flag;
		do {
			flag = false;
			System.out.println("Digite o número do Quarto " + nome + " :");

			flag = validacaoDeQuartos(sc, listAlunos, nome, email, flag);

		} while (flag);
	}

	private static boolean validacaoDeQuartos(Scanner sc, Aluno[] listAlunos, String nome, String email, boolean flag) {
		String msg;
		int quarto;
		try {
			quarto = sc.nextInt();
			if (listAlunos[quarto] != null || quarto == 0) {
				msg = quarto == 0 ? "Não tem número de Quarto 0!\nQuarto somente de Número de 1 -10:"
						: "Quarto de Número " + listAlunos[quarto].getQuarto() + " já está ocupado!";
				System.out.println(msg);
				flag = true;
			} else {
				listAlunos[quarto] = new Aluno(nome, email, quarto);
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Não existe Quarto com esse número, " + (e.getMessage() + 1) + "!\n");
			flag = true;

		} catch (InputMismatchException e) {
			System.out.println("Não pode digitar 'LETRAS'!" + "\nDigete somente números de 0-9!\n");
			flag = true;
			sc.nextLine();

		}
		return flag;
	}

	private static void saidaDeDados(Aluno[] listAlunos) {
		for (int i = 0; i < listAlunos.length; i++) {

			if (listAlunos[i] != null) {
				System.out.println(i + ": " + listAlunos[i]);
			}

		}
	}

}
