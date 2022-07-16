package com.java.recursividade;

public class Teste02 {
	public static void main(String[] args) {
		contRecursividade(1, 15);

	}

	private static int contRecursividade(int i, int x) {

		if (x < i) {
			return i;
		}
		//System.out.println("recurs: " + x);
		System.out.print(x +" "); 
		return contRecursividade(i, --x);
	}

}
