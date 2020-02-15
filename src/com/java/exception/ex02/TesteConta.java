package com.java.exception.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteConta {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		String entrada;
		int opcao = 1, posicao;
		double valorDeposito;
		List<Conta> contas = new ArrayList<>();

		while (!flag) {
			System.out.println("***********************//***********************");
			// System.out.println("Data Atual: " + sdf.format(dataAtual) + "\n");
			System.out.println("*** Digete a opção desejada: ***");
			System.out.println("1 - Cadastrar uma Conta:");
			System.out.println("2 - Depositar:");
			System.out.println("3 - Saque:");
			System.out.println("4 - Consultar conta:");
			System.out.println("5 - Consultar todas as Contas:");
			System.out.println("5 - Sair:");

			try {
				entrada = sc.next();
				opcao = Integer.parseInt(entrada);

				switch (opcao) {
				case 1:
					System.out.println("Entre com Número da Conta:");
					int numero = sc.nextInt();

					System.out.println("Entre com Número da Agencia:");
					int agencia = sc.nextInt();

					System.out.println("Entre com Nome:");
					String nome = sc.next();

					System.out.println("Qual o valor do Limete para Saque:");
					double limeteSaque = sc.nextDouble();

					System.out.println("Deseja fazer um Deposito (s-n):");
					char letra = sc.next().charAt(0);

					if (letra == 's') {
						System.out.println("Entre com o valor R$:");
						valorDeposito = sc.nextDouble();

						contas.add(new Conta(numero, agencia, nome, valorDeposito, limeteSaque));
					}

					contas.add(new Conta(numero, agencia, nome, limeteSaque));

					break;

				case 2:
					System.out.println("Entre numero Agencia:");
					agencia = sc.nextInt();
					System.out.println("Entre numero :");
					numero = sc.nextInt();
					posicao = buscarAgenciaConta(contas, agencia, numero);

					if (posicao >= 0) {
						System.out.println("Entre com valor R$ :");
						valorDeposito = sc.nextDouble();

						contas.get(posicao).depositar(valorDeposito);
					}

					break;
				case 3:
					System.out.println("Entre numero Agencia:");
					agencia = sc.nextInt();
					System.out.println("Entre numero :");
					numero = sc.nextInt();
					posicao = buscarAgenciaConta(contas, agencia, numero);
					
					if (posicao >= 0) {
						System.out.println("Entre com valor R$ :");
						double valorSaque = sc.nextDouble();
						contas.get(posicao).saque(valorSaque);
					}
					
					break;
					
				case 4:
					
					System.out.println("Entre numero Agencia:");
					agencia = sc.nextInt();
					System.out.println("Entre numero :");
					numero = sc.nextInt();
					posicao = buscarAgenciaConta(contas, agencia, numero);
					
					contas.get(posicao).toString();

					
					break;
					
				case 5:
					
					for (int i = 0; i < contas.size(); i++) {
						System.out.println((i + 1) + "º" + contas.get(i));

					}
					break;
				case 6:
					System.exit(0);
					flag = true;
					break;

				default:
					System.out.println("Opção Inválida!!");
					break;
				}

			} catch (Exception e) {
				System.out.println("Entra Inválida!!");
			}

		}
	}

	private static int buscarAgenciaConta(List<Conta> contas, int agencia, int numero) {

		for (int i = 0; i < contas.size(); i++) {

			if (contas.get(i).getNumero() == numero && contas.get(i).getAgencia() == agencia) {
				return i;
			}

		}
		return -1;
	}

}
