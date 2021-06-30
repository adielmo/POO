package com.java.recursividade;

/**
 * 
 * @author Adielmo
 *
 */
public class Fatorial {

	public static void main(String[] args) {
		int numFatorial = testeFatorial(0);

		System.out.println(numFatorial);
	}
//4 * 3 * 2 * 1 = 24 -> essa é lógica, multiplicar pelo número q vem antes
	private static int testeFatorial(int x) {
		int valorFatorial = x;

		for (int i = x-1; i > 0; i--) {
			valorFatorial *= i;
		}
		return valorFatorial;
	}
}