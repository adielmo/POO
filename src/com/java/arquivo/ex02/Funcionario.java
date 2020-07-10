package com.java.arquivo.ex02;

import java.io.Serializable;

public class Funcionario implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String nome;
	private Integer idade;
	private String email;
	private Character sexo;
	private Double salario;
	
	public Funcionario() {
		// TODO Auto-generated constructor stub
	}

	public Funcionario(String nome, Integer idade, String email, Character sexo, Double salario) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.email = email;
		this.sexo = sexo;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Character getSexo() {
		return sexo;
	}

	public void setSexo(Character sexo) {
		this.sexo = sexo;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		
		return "Nome:" + this.nome + ", Idade:" + this.idade + ", E-mail:" + this.email + ", Sexo:" + this.sexo + ", Salário="
				+ this.salario ;
	}
	
	

}
