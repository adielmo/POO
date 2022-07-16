package com.java.recursividade;

public class Teste {
	public static void main(String[] args) {
		 contRecursividade(15);
		
	}

	private static int contRecursividade(int i) {

		if (i > 0) {
			System.out.println("x: "+ i);
			return contRecursividade(--i);
		}else {
		return 0;	
		}
	}
	
}
