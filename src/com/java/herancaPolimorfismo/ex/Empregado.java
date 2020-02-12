package com.java.herancaPolimorfismo.ex;

public class Empregado {
	
	private String nome;
	private Double valorHoras;
	private Integer horas;
	
	public Empregado() {
		// TODO Auto-generated constructor stub
	}

	public Empregado(String nome, Double valorHoras, Integer horas) {
		
		this.nome = nome;
		this.valorHoras = valorHoras;
		this.horas = horas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValorHoras() {
		return valorHoras;
	}

	public void setValorHoras(Double valorHoras) {
		this.valorHoras = valorHoras;
	}

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}
	
	public double calcularPagamento() {
		return this.valorHoras * this.horas;
	}
	

}
