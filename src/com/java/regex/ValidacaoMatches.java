	package com.java.regex;

public abstract class ValidacaoMatches {

	/**
	 * https://www.devmedia.com.br/iniciando-expressoes-regulares/6557
	 * 
	 * 
	 * *^ Inicia
	 * 
	 * *$ Finaliza
	 * 
	 * *| Ou
	 * 
	 */

	public static boolean cep(String cep) {
		return cep.matches("\\d{4}-\\d{3}");
	}

	public static boolean possuiNumero(String nome) {
		return nome.matches("\\d");
	}

	public static boolean letrasNumeros(String nome) {
		return nome.matches("\\w\\d");
	}

	public static boolean isPrimeiraLetraMaiuscula(String nome) {
		// Validação Primeira Letra Maiuscula
		return nome.matches("^[A-Z]+(.)*");
	}

	public static boolean isValidoPlaca(String placa) {
		// Validação Placa do MercoSul QTP5F71 QTP5071
		return placa.matches("[a-zA-Z]{3}[0-9][A-Za-z-0-9][0-9]{2}");
	}

	public static boolean isValidoData(String data) {
		// Validação Data 12-12-2010
		return data.matches("\\d{2}-\\d{2}-\\d{4}");
	}

	public static boolean isValidoEmail(String email) {
		// Validação E-mail
		return email.matches("\\w+@\\w+\\.\\w{2,3}");//\\.\\w{2,3}
	}

}
