package com.java.live;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TesteFuncionario {

	public static void main(String[] args) {
		int qtdFuncionario = 0;
		int count = 0;

		List<Funcionario> list = new ArrayList<Funcionario>();
		Scanner scanner = new Scanner(System.in);

		qtdFuncionario = validarNumeros(qtdFuncionario, scanner);

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

		Funcionario.calcularAumento(percentual, list, pos);

		list.stream().sorted(Comparator.comparing(Funcionario::getNome)).forEach(System.out::println);

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
		Long codigo = 0L;
		String nome = "";

		codigo = validarCodigo(count, list, scanner, codigo);
		nome = validarNome(scanner);

		System.out.println("Digete o Salário de " + nome + " :");
		Double salario = scanner.nextDouble();

		list.add(count, new Funcionario(codigo, nome, salario));

		count++;
		return count;
	}

	private static String validarNome(Scanner scanner) {
		boolean flag = false;
		String nome = "";
		// Pattern pattern = Pattern.compile("[a-zA-Z]+");

		do {

			flag = false;

			System.out.println("Digete o Nome:");
			nome = scanner.next();
			// Matcher matcher = pattern.matcher(nome);

			if (!nome.matches("[a-zA-Z]+")) {

				System.out.println("Error\nDigete Somente Letras!\n");
				flag = true;
				//scanner.next();
			}

		} while (flag);

		return nome;

	}

	private static Long validarCodigo(int count, List<Funcionario> list, Scanner scanner, Long codigo) {
		boolean flag;
		do {

			flag = false;

			try {

				System.out.println("Digete o código do Funcionario " + (count + 1) + " :");
				codigo = scanner.nextLong();

			} catch (InputMismatchException e) {

				System.out.println("Entrada inválida!\n");
				flag = true;
				scanner.next();

			}

			for (int i = 0; i < list.size(); i++) {

				if (list.get(i).getId().equals(codigo)) {
					flag = true;
					System.out.println("Codigo já existente! \nDigete outro!");
				}
			}

		} while (flag);
		return codigo;
	}

	private static int validarNumeros(int qtdFuncionario, Scanner scanner) {
		boolean flag = false;
		do {
			flag = false;
			try {
				System.out.println("Digete a Qtd de funcionario:");
				qtdFuncionario = scanner.nextInt();

			} catch (InputMismatchException e) {
				flag = true;
				System.out.println("Entrada inválida !\n");
				scanner.next();
			}

		} while (flag);

		return qtdFuncionario;
	}

}
