package com.java.recursividade;


/**
 * 
 * @author Adielmo
 *
 */
public class Recursividade {

	public static void main(String[] args) {
		int numRecursivo = testeRecursividade(4);
		
		System.out.println(numRecursivo);
	}

	private static int testeRecursividade(int i) {
		if (i == 0) {

			return 1;
		}

		return i * testeRecursividade(i - 1);
	}

}
