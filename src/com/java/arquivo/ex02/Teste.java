package com.java.arquivo.ex02;

public class Teste {

	public static void main(String[] args) {
		String nome="     Adielmo      ";
		String numero = "123.08";
		String vazia = "    ";
		double val = 10.123;
		double hh = Double.parseDouble(numero);
		double soma= val + hh;
		/*
		 * System.out.println(nome.trim().toLowerCase()); String aa =
		 * String.valueOf(numero); 
		 * System.out.println("String: " + aa.length());
		 * 
		 * System.out.println(vazia.trim().isEmpty());
		 */
		System.out.println(hh);
		System.out.println(val);
		System.out.println("String para Double: " + soma);

	}

}
