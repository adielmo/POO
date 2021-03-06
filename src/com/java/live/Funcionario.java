package com.java.live;

import java.util.List;

public class Funcionario {

	private Long id;
	private String nome;
	private Double salario;




	public Funcionario(Long id, String nome, Double salario) {		
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public static void calcularAumento(double percentual, List<Funcionario> list, int pos) {
		double salarioAtual = list.get(pos).getSalario();

		list.get(pos).setSalario((salarioAtual * (percentual / 100)) + salarioAtual);
	}

	@Override
	public String toString() {
		return "Funcionario [id=" + id + ", nome=" + nome + ", salario=" + salario + "]";
	}

}
