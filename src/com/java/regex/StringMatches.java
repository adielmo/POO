package com.java.regex;

/**
 * 
 * @author Adielmo
 *
 */
public class StringMatches {
		public static void main(String[] args) {

		String nome = "Adielmo";
		String name = "Adielmo";
		String letrasNumeros = "A2";
		String cep = "23073-504";
		String placa = "QTP5F71";
		String data = "02-05-1995";
		String email = "adielmo@gmail.com";


		boolean valido = ValidacaoMatches.isPrimeiraLetraMaiuscula(nome);
		boolean numero = ValidacaoMatches.possuiNumero(name);

		System.out.println("Possui número: " + numero);
        System.out.println("Letra e Número:" + ValidacaoMatches.letrasNumeros(letrasNumeros));
		System.out.println(valido);
		System.out.println(ValidacaoMatches.cep(cep));
		System.out.println("Placa Válida: "+ValidacaoMatches.isValidoPlaca(placa));
		System.out.println("Placa Válida: "+ValidacaoMatches.isValidoPlaca("QTP5071"));
		System.out.println("Data: " + ValidacaoMatches.isValidoData(data));
		System.out.println("Email: " + ValidacaoMatches.isValidoEmail(email));

	}
	
}
