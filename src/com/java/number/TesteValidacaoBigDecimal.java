package com.java.number;

import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteValidacaoBigDecimal {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
BigDecimal val01 = null, val02=null;
		//int val01 = 0;
		//int val02 = 0;
		boolean flag = false;
		do {
			try {
				flag = false;

				System.out.println("Digete valor BigDecimal 1º:");
				val01 = scanner.nextBigDecimal();
				System.out.println("Digete valor BigDecimal 2º:");
				val02 = scanner.nextBigDecimal();

			} catch (InputMismatchException e) {

				flag = true;
				System.out.println("Error!!\nDigete novamente!\n");
				// throw new EntradaInvalidaException("Entrada com formato inválido!");
				
			}
     scanner.nextLine();
		} while (flag);

		System.out.println("Valor de " + val01 + " + " + val02 + " = "+ val01.add(val02));
	}

}
