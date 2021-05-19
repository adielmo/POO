package com.java.stringex;

public class TesteBuilder {

	public static void main(String[] args) {

		String nome = "jdo6541";
		StringBuilder builder = new StringBuilder(nome);
		builder.insert(nome.length() - 4, "-");
		System.out.println("PLACA: "+builder.toString().toUpperCase());
	}

}
