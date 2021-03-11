package com.java.estruturaRepeticao;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double qtd;
		int flag = 0;
		
		opcoes(scanner, flag);
		
		System.out.println("Fimmmmmm");
		scanner.close();
	}

	public static void opcoes(Scanner scanner, int flag) {
		double qtd;
		do {
			System.out.println("Digete o valor da operação que vai de 1 a 10: ");
			qtd = scanner.nextDouble();
			int op = mostrarOperacao(scanner);

			switch (op) {

			case 1:
				System.out.println("Operação escolhida foi Adição");
				for (int i = 1; i < 11; i++) {

					System.out.println(i + " + " + qtd + " = " + (i + qtd));
				}
				flag = desejaContinuar(scanner);
				break;
			case 2:
				System.out.println("Operação escolhida foi Subritação");

				for (int i = 1; i < 11; i++) {

					System.out.println(qtd + " - " + i + " = " + (qtd - i));
				}
				flag = desejaContinuar(scanner);

				break;

			case 3:
				System.out.println("Operação escolhida foi Multiplicação");

				for (int i = 1; i < 11; i++) {

					System.out.printf("\n"+i + " x " + qtd + " = " + String.format("%.2f", (i * qtd)));
				}
				flag = desejaContinuar(scanner);

				break;

			case 4:
				System.out.println("Operação escolhida foi Divisão");

				for (int i = 1; i < 11; i++) {

					System.out.printf("\n"+qtd + " / " + i + " = " + String.format("%.2f", (qtd / i)));
				}
				flag = desejaContinuar(scanner);

				break;

			default:
				System.out.println("Escolha o número de 1 há 4");
				break;
			}

		} while (flag != 0);
	}

	public static int desejaContinuar(Scanner scanner) {
		System.out.println("\n\nDIGETE 0 PARA SAIR:");
		int flag = scanner.nextInt();
		return flag;

	}

	public static int mostrarOperacao(Scanner scanner) {
		int valor;
		do {
			System.out.println("Escolha o número de 1 há 4:");
			System.out.println("1 - Adição");
			System.out.println("2 - Subtração");
			System.out.println("3 - Multiplicação");
			System.out.println("4 - Divisão");

			valor = scanner.nextInt();
		} while (valor == 0 || valor > 4);
		return valor;
	}
	
}