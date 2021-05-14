package com.java.string;

public class Produto {

	private Long id;
	private String nome;
	private Double preco;
	private int qtd;

	public Produto() {
		// TODO Auto-generated constructor stub
	}

	public Produto(Long id, String nome, Double preco, int qtd) {
		super();
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.qtd = qtd;
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

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + ", preco=" + preco + ", qtd=" + qtd + "]";
	}

	
}
