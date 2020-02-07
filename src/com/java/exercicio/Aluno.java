package com.java.exercicio;

public class Aluno {
	
	private String nome;
	private String email;
	private Integer quarto;
	
	public Aluno() {
		// TODO Auto-generated constructor stub
	}

	public Aluno(String nome, String email, Integer quarto) {
		super();
		this.nome = nome;
		this.email = email;
		this.quarto = quarto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getQuarto() {
		return quarto;
	}

	public void setQuarto(Integer quarto) {
		this.quarto = quarto;
	}

	@Override
	public String toString() {
		return "Aluno Nome:" + this.nome
				+ " E-mail:" + this.email 
				+ " Quarto:" + this.quarto;
	}
	
	
	

}
