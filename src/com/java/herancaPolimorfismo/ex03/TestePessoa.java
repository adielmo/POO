package com.java.herancaPolimorfismo.ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestePessoa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Pessoa> pessoas = new ArrayList<>();
		int qtd;
		boolean flag = false;

		System.out.println("Entre com a Qtd:");
		qtd = sc.nextInt();

		for (int i = 1; i <= qtd; i++) {
			sc.nextLine();

			do {
				flag = false;
				System.out.println("Qual tipo de Pessoa(pf - pj)");
				String letras = sc.nextLine();

				switch (letras) {
				case "pf":
				case "pj":
					System.out.println("Digete o " + i + "º " + " Nome: ");
					String nome = sc.nextLine();

					System.out.println("Digete a Renda Anual " + nome + " R$:");
					double rendaAnual = sc.nextDouble();

					if (letras.equals("pf")) {

						System.out.println("Qual o valor do gasto com Saúde " + nome + " R$:");
						double gastoSaude = sc.nextDouble();
						pessoas.add(new PessoaFisica(nome, rendaAnual, gastoSaude));

						break;
					} else if (letras.equals("pj")) {
						System.out.println("Qual a Qtd de Fúncionarios da Empresa " + nome + " :");
						int qtdFuncionarios = sc.nextInt();

						pessoas.add(new PessoaJuridica(nome, rendaAnual, qtdFuncionarios));
						break;
					}

				default:
					flag = true;
					break;
				}

			} while (flag);

		}
		double totalImposto = 0;

		for (int i =0; i < pessoas.size(); i++) {

			System.out.println((i+1 + "º " + pessoas.get(i)));
			
			totalImposto += pessoas.get(i).getRendaAnual();
		}
		
		System.out.printf("TOTAL DE IMPOSTOS R$: %.2f", totalImposto);

	}

}
