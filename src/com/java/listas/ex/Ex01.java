package com.java.listas.ex;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		int qtd, id;
		String nome;
		double salario = 0, taxa, aumento = 0;
		boolean flag = false;

		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos Fúncionarios vc vai Enserir?");
		qtd = sc.nextInt();
		// Funcionario func;
		Funcionario[] funcionario = new Funcionario[qtd];

		sc.nextLine();
		for (int i = 0; i < funcionario.length; i++) {

			System.out.println("Digete o seu Nome:");
			nome = sc.nextLine();

			do {
				flag = false;
			
				System.out.println("Digete o seu Id único " + nome + " : ");
				id = sc.nextInt();
				sc.nextLine();

				for (int j = 0; j < i; j++) {

					if (funcionario[j].getId() == id) {
						flag = true;
						System.out.printf(nome + " o número desse Id já existe (%d)\n\n", id);
						break;

					}
				}

			} while (flag);
		
			System.out.println("Digete o seu Salário " + nome + " R$:");
			salario = sc.nextDouble();

			funcionario[i] = new Funcionario(id, nome, salario);
			sc.nextLine();

		}
		System.out.println("-------------------//----------------------");
		for (Funcionario funcionario2 : funcionario) {
			System.out.println(funcionario2);

		}
		System.out.println("-------------------//----------------------");


		System.out.println("Digete o Id q vc deseja buscar:");
		id = sc.nextInt();

		for (int j = 0; j < funcionario.length; j++) {

			if (funcionario[j].getId() == id) {

				System.out.println(funcionario[j].getNome() + ", digete o valor de aumento em %:");
				taxa = sc.nextDouble();

				imprimir(aumento, taxa, salario, funcionario[j]);
				flag = true;
				break;
				

			} 
						

		}
		
		imprimirOpcoes(flag, funcionario);
	
		
		
		sc.close();
	}



	private static void imprimirOpcoes(boolean flag, Funcionario[] funcionario) {
		if (!flag) {
			System.out.println("\n---- Opção Digitada ERRADA----");
			  System.out.println("----Opção de Id Válidos----");			
			for (Funcionario funcionario2 : funcionario) {
				System.out.println(funcionario2);

			}

		}
	}


	private static void imprimir(double aumento, double taxa, double salario, Funcionario funcionario) {
		System.out.println("\n" + funcionario);
		System.out.printf("Valor do aumento: R$ %.2f\n", funcionario.aumentarSalario(taxa));
		System.out.println("Percentual da Taxa: " + taxa + "%");
		System.out.printf("Novo Salário R$: %.2f", funcionario.novoSalario(taxa));
	
		
	}

}
