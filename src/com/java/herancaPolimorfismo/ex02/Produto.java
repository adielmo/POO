package com.java.herancaPolimorfismo.ex02;

public class Produto {
	
	private String nome;
	protected Double preco;
	
	public Produto() {
		// TODO Auto-generated constructor stub
	}

	public Produto(String nome, Double preco) {
		
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
			sb.append("----Etiqueta de Preço------\n");
			sb.append("Nome: " + this.nome);
		sb.append("\nPreço: " + this.preco + "\n");
		
		return sb.toString();
	}
	
	
	
	

}
