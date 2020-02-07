package com.java.listas.ex;

public class Funcionario {
	
	private Integer id;
	private String nome;
	private Double salario;
	
	public Funcionario() {
		
	}

	public Funcionario(Integer id, String nome, Double salario) {
		
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	
	public double aumentarSalario(double taxa) {
		return this.salario * (taxa / 100);
	}
	
	public double novoSalario(Double taxa) {
		
		return aumentarSalario(taxa) + this.salario;
	}

	@Override
	public String toString() {
		return "Funcionario Id:" + this.id + ", Nome: " + this.nome + ", Salario: " + this.salario;
	}
	
	
	
	

}
