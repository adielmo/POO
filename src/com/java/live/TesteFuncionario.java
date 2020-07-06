package com.java.live;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteFuncionario {

	public static void main(String[] args) {
		int qtdFuncionario = 0;
		int count = 0;

		List<Funcionario> list = new ArrayList<Funcionario>();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digete a Qtd de funcionario:");
		qtdFuncionario = scanner.nextInt();

		while (count < qtdFuncionario) {
			count = entradaDeDados(count, list, scanner);

		}

		for (int i = 0; i < list.size(); i++) {

			System.out.println(list.get(i));

		}

		boolean flag = false;
		int pos = 0;

		do {
			flag = false;

			System.out.println("\nDigete pelo Id qual Funcionario deseja da o aumento:\n");

			System.out.println("Digete o Id válido:");
			Long codigo = scanner.nextLong();

			pos = BuscarPosicao(scanner, list, codigo);

			if (pos < 0) {
				System.out.println("Id de funcionario não encotrado!");
				flag = true;
			}

		} while (flag);

		System.out.println(
				"Digete o percental do aumento ao funcionario " + list.get(pos).getNome().toUpperCase() + " :");
		double percentual = scanner.nextDouble();

		calcularAumento(scanner, percentual, list, pos);

		for (int i = 0; i < list.size(); i++) {

			System.out.println(list.get(i));

		}

	}

	private static int BuscarPosicao(Scanner scanner, List<Funcionario> list, Long codigo) {

		for (int i = 0; i < list.size(); i++) {

			if (list.get(i).getId().equals(codigo)) {

				return i;

			}

		}

		return -1;
	}

	private static int entradaDeDados(int count, List<Funcionario> list, Scanner scanner) {
		boolean flag = false;
		Long codigo;

		do {
			flag = false;
			System.out.println("Digete o código do Funcionario " + (count + 1) + " :");
			codigo = scanner.nextLong();

			for (int i = 0; i < list.size(); i++) {

				if (list.get(i).getId().equals(codigo)) {
					flag = true;
					System.out.println("Codigo já existente! \nDigete outro!");
				}
			}

		} while (flag);

		System.out.println("Digete o Nome:");
		String nome = scanner.next();

		System.out.println("Digete o Salário de " + nome + " :");
		Double salario = scanner.nextDouble();

		list.add(count, new Funcionario(codigo, nome, salario));

		count++;
		return count;
	}

	private static void calcularAumento(Scanner scanner, double percentual, List<Funcionario> list, int pos) {
		double salarioAtual = list.get(pos).getSalario();

		list.get(pos).setSalario((salarioAtual * (percentual / 100)) + salarioAtual);
	}
}
