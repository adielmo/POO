package com.java.estruturaRepetitiva;

import java.util.Scanner;

public class TesteRepeticao {

	public static void main(String[] args) {
		/*
		 * int valor = 1; int soma = 0;
		 */
		Scanner sc = new Scanner(System.in);

		String combustivel = "";
		boolean flag = true;
		int opcao = 0;
		double qtdLitros = 0;
		double valorLitro = 0;
		double totalPagar = 0, totalGasol = 0, totalDisel = 0, totalAlccol = 0;
		double totalDia = 0;
		

		do {
			// flag = false;
			System.out.println("ESCOLHA A OPÇÃO COMBUSTIVÉL\n1-Álcool R$ 4.60L\n2-Gasolina R$ 4.98L\n3-Diesel R$ 3.87L");
			opcao = sc.nextInt();

			if (opcao == 1) {
				qtdLitros = qtdLitros(sc);
				combustivel = "Álcool";
				valorLitro = 4.60;

				totalPagar = qtdLitros * valorLitro;
				totalAlccol += totalPagar;
			} else if (opcao == 2) {
				qtdLitros = qtdLitros(sc);
				combustivel = "Gasolina";
				valorLitro = 4.98;

				totalPagar = qtdLitros * valorLitro;
				totalGasol += totalPagar;
			}

			else if (opcao == 3) {
				qtdLitros = qtdLitros(sc);
				combustivel = "Diesel";
				valorLitro = 3.87;

				totalPagar = qtdLitros * valorLitro;
				totalDisel += totalPagar;

			} else if (opcao == 4) {
				flag = false;
			} else {

				System.out.println("\nOpção Invalida\n,Digete novamente outra opção!!\n");
			}

			totalDia += totalPagar;

			if (flag && totalPagar > 0) {
				System.out.println("**********Cumpom Fiscal**************");
				System.out.printf("Tipo do combustivél %s\n", combustivel);
				System.out.printf("Qtd L %.2f x %.2f = %.2f\n ", qtdLitros, valorLitro, totalPagar);
				System.out.printf("****-Valor a pagar R$ %.2f-****\n", totalPagar);

				do {
					double valorTroco = 0, valorReceber = 0;;
					System.out.println("Digete o valor a receber R$");
					valorReceber = sc.nextDouble();
					
					if (valorReceber >= totalPagar) {
						flag = false;
						valorTroco = valorReceber - totalPagar;
						System.out.printf("Valor do troco é R$ %.2f\n", valorTroco);
					}else {
						System.out.printf("O valor é menor q %.2f", totalPagar);
					}

				} while (flag);
				flag = true;
			}

		} while (flag);

		System.out.println("**********Relatório do Dia**************");
		System.out.printf("Combustivél %s", combustivel);
		System.out.printf("Qtd em L %.2f", qtdLitros);
		System.out.printf("Valor Total R$ %.2f", totalAlccol);

	}

	private static double qtdLitros(Scanner sc) {
		double qtdLitros;
		System.out.println("Quantos litros");
		qtdLitros = sc.nextDouble();
		return qtdLitros;
	}

}