package com.java.exercicio.arrays;

public class Produto {

	private String nome;
	private Double preco;
	private Integer qtd;

	public Produto() {
		// TODO Auto-generated constructor stub
	}

	public Produto(String nome, Double preco) {

		this.nome = nome;
		this.preco = preco;
	}

	public Produto(String nome, Double preco, Integer qtdProduto) {

		this.nome = nome;
		this.preco = preco;
		this.qtd = qtdProduto;
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

	public void setQtd(Integer qtd) {
		this.qtd = qtd;
	}

	public Integer getQtd() {
		return this.qtd;
	}

	@Override
	public String toString() {
		return "\nProduto \nNome: " + this.nome + " \nPreco: R$ " + this.preco
				+"\nQtd: " + this.qtd;
	}

}
