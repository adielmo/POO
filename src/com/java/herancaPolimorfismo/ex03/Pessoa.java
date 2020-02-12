package com.java.herancaPolimorfismo.ex03;

public abstract class Pessoa {
	
	private String nome;
	protected Double rendaAnual;
	
	public Pessoa() {
		// TODO Auto-generated constructor stub
	}

	public Pessoa(String nome, Double rendaAnual) {
		
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
	
	public abstract double calcularImposto();

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("---IMPOSTOS PAGOS ---\n");
				
		return sb.toString();
	}
	
	


}
