package com.java.regex.teste;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.java.regex.ValidacaoMatches;

public class Teste02 {

	public static void main(String[] args) {

		boolean testePattenRegex = testePattenRegex("4156");

		System.out.println(testePattenRegex);
		System.out.println(Util.isNameValido("Adi"));
		System.out.println("1ª Letra Maiuscula: "+ Util.isPrimLetraMaiusc("Adiemo"));
		System.out.println("1ª Letra Maiuscula: "+ ValidacaoMatches.isPrimeiraLetraMaiuscula("Adiemo"));
		

	}

	private static boolean testePattenRegex(String name) {
		String regex = "[a-z]{2}";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(name);

		return matcher.matches();

	}

}
