package com.java.stream;

import java.util.Random;

public class NumeroRandom {

	public static void main(String[] args) {

		System.out.println(numeroAleatorio());

		System.out.println(numeroAleatorio());

		// System.out.println(numeroAleatorio());

		/*
		 * System.out.println("Qtd de Loop é de " + qtd() + " para chegar ao número "+
		 * numeroAleatorio());
		 */

		/*
		 * Stream.generate(() -> new Random().nextInt(100)) .limit(1) .filter(a -> a % 2
		 * == 0) .forEach(System.out::println);
		 */

//	num.forEach(System.out::println);

		/*
		 * Stream.generate(() -> new Random() .nextInt(100)) .limit(1) //.distinct()
		 * .forEach(System.out::println);
		 */
	}

	private static int numeroAleatorio() {
		Random numero = new Random();
		boolean flag = false;
		int numeroAleatorio = 0;

		do {

			// flag = false;
			numeroAleatorio = numero.nextInt();

			if (numeroAleatorio >= 50 && numeroAleatorio <= 500) {
				flag = true;
			}
		} while (!flag);
		return numeroAleatorio;
	}

}
