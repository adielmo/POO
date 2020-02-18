package com.java.exception.ex02;

public enum TipoConta {

	POUPANCA("Poupança"),
	CORRENTE("Corrente");

	private String nome;

	private TipoConta(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

}
