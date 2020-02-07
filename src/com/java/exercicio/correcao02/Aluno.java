package com.java.exercicio.correcao02;

public class Aluno {
	
	private String nome;
	private String email;
	private Integer numeroQuarto;
	
	public Aluno() {
		// TODO Auto-generated constructor stub
	}
	
	public Aluno(String nome, String email, Integer numeroQuarto) {
		super();
		this.nome = nome;
		this.email = email;
		this.numeroQuarto = numeroQuarto;
	}
	
	public Aluno(String nome, String email) {
		
		this.nome = nome;
		this.email = email;
		
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

	public Integer getNumeroQuarto() {
		return numeroQuarto;
	}

	public void setNumeroQuarto(Integer NumeroQuarto) {
		this.numeroQuarto = NumeroQuarto;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", email=" + email + ", NumeroQuarto=" + numeroQuarto + "]";
	}
	
	

}
