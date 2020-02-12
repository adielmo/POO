package com.java.herancaPolimorfismo.ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteEmpregado {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int qtd;
		char letra;
		boolean flag = false;

		System.out.println("Qtd de Empregados:");
		qtd = sc.nextInt();
		List<Empregado> empregados = new ArrayList<>();

		entradaDeDados(sc, qtd, empregados);
		
		System.out.println("---PAGAMENTOS----");
		
		for (Empregado empregado : empregados) {
			System.out.println(empregado.getNome() + " - R$" + String.format("%.2f", empregado.calcularPagamento()));
			
		}

	}

	private static void entradaDeDados(Scanner sc, int qtd, List<Empregado> empregados) {
		char letra;
		boolean flag;
		for (int i = 1; i <= qtd; i++) {
			sc.nextLine();
			do {
				flag = false;
				
				System.out.println("Empregado é Tercerizado (s - n):");
				letra = sc.nextLine().charAt(0);

				if (letra == 's') {
					System.out.println("Digete o " + i + "º " + "nome: ");
					String nome = sc.nextLine();

					System.out.println("Digete o Valor Horas de " + nome + " R$:");
					double valorHoras = sc.nextDouble();

					System.out.println("Digete a Qtd de Horas do Empregado " + nome + " :");
					int horas = sc.nextInt();

					System.out.println("Digete o valor Adicional do Empregado " + nome + " :");
					double valorAdicional = sc.nextDouble();
					
					//Empregado empTercerizado = new TercerizarEmpregado(nome, valorHoras, horas, valorAdicional);
					
					empregados.add(new TercerizarEmpregado(nome, valorHoras, horas, valorAdicional));
					
					flag = true;
				} else if (letra == 'n') {
					System.out.println("Digete o " + i + "º " + "nome: ");
					String nome = sc.nextLine();

					System.out.println("Digete o Valor Horas de " + nome + " R$:");
					double valorHoras = sc.nextDouble();

					System.out.println("Digete a Qtd de Horas do Empregado " + nome + " :");
					int horas = sc.nextInt();

					//Empregado empregado = new Empregado(nome, valorHoras, horas);
					empregados.add(new Empregado(nome, valorHoras, horas));

					flag = true;
				}

			} while (!flag);

		}
	}

}
