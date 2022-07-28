package com.java.regex.teste;

public abstract class Util {

	public static boolean isNameValido(String name) {

		return name.matches("[a-zA-Z]{2}");
	}

	public static boolean isPrimLetraMaiusc(String name) {
		
		return name.matches("[A-Z][a-z]{1,}");
	}

}
