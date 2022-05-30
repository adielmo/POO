package com.java.math;

public class Teste01 {

	public static void main(String[] args) {

		
		System.out.println("Valor de PI: " + Math.PI);
		System.out.println("O valor de E é: " + Math.E);
		System.out.println("'e' elevado ao quadrado = "+ Math.exp(2));
		System.out.println("4 elevado ao cubo = " + Math.pow(4, 4));
		System.out.println("A raiz quadrada de Pi é = "+ Math.sqrt( 64 ));
		
		double num =64;
		double aa = Math.sqrt(num);
		System.out.println(aa);
		
		System.out.println(aa % 2 == 0 ? String.format("%4.3f é raiz quadrada.", num) : 
			                               String.format("%4.3f não é raiz quadrada.", num));
	}

}
