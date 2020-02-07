package com.java.exercicio.correcao02;

import java.math.BigDecimal;
import java.util.Scanner;

public class TesteConta {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		String nome, conta;
		char letra;
		Conta conta2;
		
		System.out.println("Digete seu Nome:");
		nome = sc.nextLine();
		System.out.println("Digete o Numero da sua Conta:");
		conta = sc.nextLine();
		
		System.out.println("Deseja fazer seu 1° deposito na abertura da conta: s/n");
		letra = sc.next().charAt(0);

		if (letra != 'n') {
			
			System.out.println("Digete o valor do deposito R$: ");
			BigDecimal valorDeposito = sc.nextBigDecimal();
			conta2 = new Conta(nome, conta, valorDeposito);
			System.out.println(conta2);
			
		} else {
			conta2 = new Conta(nome, conta);
			System.out.println(conta2);
			
		}
		

		System.out.println("Deseja fazer algum deposito: s/n");
		letra = sc.next().charAt(0);
		System.out.println(conta2);

		depositar(sc, letra, conta2);

		System.out.println("\nDeseja sacar o R$ da sua conta: s/n");
		letra = sc.next().charAt(0);

		sacar(sc, letra, conta2);
		System.out.println(conta2);	

	}

	private static void sacar(Scanner sc, char letra, Conta conta2) {
		if (letra != 'n') {
			System.out.println("\nDigete para de saque: R$");
			double valorSacar = sc.nextDouble();
			conta2.sacar(valorSacar);
		}
	}

	private static void depositar(Scanner sc, char letra, Conta conta2) {
		if (letra != 'n') {
			System.out.println("\nDigete o valor para deposito: R$");
			BigDecimal valorDeposito = sc.nextBigDecimal();
			conta2.depositar(valorDeposito);
			System.out.println("Saldo R$: " + conta2.getSaldo());

		}
	}

}
