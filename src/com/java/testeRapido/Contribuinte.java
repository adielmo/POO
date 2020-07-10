package com.java.testeRapido;

import java.io.Serializable;

public abstract class Contribuinte implements Serializable, Gastos{

	private static final long serialVersionUID = 1L;
	
	private String nome;
	private Double rendaAnual;

	public Contribuinte() {
		
	}

	public Contribuinte(String nome, Double rendaAnual) {

		this.nome = nome;
		this.rendaAnual = rendaAnual;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getRendaAnual() {
		return rendaAnual;
	}

	public void setRendaAnual(Double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}

		
	
	@Override
	public String toString() {
		return "Contribuinte [nome=" + nome + ", rendaAnual=" + rendaAnual + "]";
	}

}
