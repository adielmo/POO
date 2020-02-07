package com.java.exercicio;

public class AlunoException extends Exception {

	private static final long serialVersionUID = 1L;
	String nome;

	public AlunoException(String nome) {
		this.nome = nome;
	}

	@Override
	public String getMessage() {

		return "Número de Quarto não existe!\nDigete novamente!\n";
	}

}
