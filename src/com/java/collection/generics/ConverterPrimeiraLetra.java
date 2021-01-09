package com.java.collection.generics;

public abstract class ConverterPrimeiraLetra {
	
	public static String convertertoUpperCase(String nome) {
		String letra = "" + nome.charAt(0);

		String nomeIncompleto = nome.substring(1);
		String letraMaiuscula = letra.toUpperCase();
		return letraMaiuscula + nomeIncompleto;
	}
	
	
	public static String converterToLowerCase(String nome) {
		String letra =""+nome.charAt(0);
		
		String nomeIncompleto = nome.substring(1);
		String letraMinuscula = nomeIncompleto.toLowerCase();
		return letra+letraMinuscula;
		
	}
	

}
