package com.java.comparable;

public class Funcionario implements Comparable<Funcionario> {

	private String nome;
	private Double salario;

	public Funcionario() {
		// TODO Auto-generated constructor stub
	}

	public Funcionario(String nome, Double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
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

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	@Override
	public int compareTo(Funcionario outro) {

		return - this.nome.compareTo(outro.getNome());
	}
	/*
	 * @Override public int compareTo(Funcionario outro) {
	 * 
	 * return nome.compareTo(outro.getNome()); }
	 */

	@Override
	public String toString() {
		return this.nome +" - " +this.salario;
	}

}
