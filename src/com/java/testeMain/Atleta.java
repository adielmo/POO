package com.java.testeMain;

public class Atleta {
	
	private String nome;
	private String sexo;
	private Integer idade;
	private Double peso;
	private Double altura;
	
	
	public Atleta() {
		// TODO Auto-generated constructor stub
	}


	public Atleta(String nome, String sexo, Integer idade, Double peso, Double altura) {
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	public Integer getIdade() {
		return idade;
	}


	public void setIdade(Integer idade) {
		this.idade = idade;
	}




	public Double getAltura() {
		return altura;
	}


	public Double getPeso() {
		return peso;
	}


	public void setPeso(Double peso) {
		this.peso = peso;
	}


	public void setAltura(Double altura) {
		this.altura = altura;
	}


	@Override
	public String toString() {
		return "Atleta [nome=" + nome + ", sexo=" + sexo + ", idade=" + idade + ", peso=" + peso + ", altura=" + altura
				+ "]";
	}


	
}
