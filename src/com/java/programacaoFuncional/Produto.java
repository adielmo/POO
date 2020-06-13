package com.java.programacaoFuncional;

public class Produto{
	
	private Long id;
	private String nome;
	private Double preco;
	private Integer qtd;
	
	public Produto() {
		
	}

	public Produto(Long id, String nome, Double preco, Integer qtd) {
		
		this.nome = nome;
		this.preco = preco;
		this.qtd = qtd;
		this.id = id;
	}
	
	public Long getId() {
		return this.id;
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

	public Integer getQtd() {
		return qtd;
	}

	public void setQtd(Integer qtd) {
		this.qtd = qtd;
	}

	@Override
	public String toString() {
		return "Código:" + this.id +" Nome:" + this.nome + ", Preco:" + this.preco + ", Qtd: " + this.qtd;
	}


}
