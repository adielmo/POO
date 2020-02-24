package com.java.generics.ex;

public class TesteMaioresValores {
	
	public static void main(String[] args) {
		MaiorValor ex = new MaiorValor();

		System.out.println("Maior Integer: " + ex.maiorInteger);
		System.out.println("Menor Integer: " + ex.menorInteger);

		System.out.println("\nMaior Long: " + ex.maiorLong);
		System.out.println("Menor Long: " + ex.menorLong);

		System.out.println("\nMaior Double: " + ex.maiorDouble);
		System.out.println("Menor Double: " + ex.menorDouble);
	}

}
