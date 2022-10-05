package com.java.streamMatch.entity;

import java.math.BigDecimal;

public class ProdutoEstoqueZeroDto {
	
	private String nome;
	private Integer estoque;
	private BigDecimal preco;
	private BigDecimal totalProduto;
	
	public ProdutoEstoqueZeroDto() {
		// TODO Auto-generated constructor stub
	}

	public ProdutoEstoqueZeroDto(Produto produto) {
		
		this.nome = produto.getName();
		this.estoque=produto.getQtd();
		this.preco = produto.getPreco();
		this.totalProduto = produto.getValorTotalProduto();
	}

	public String getNome() {
		return nome;
	}

	
	public BigDecimal getPreco() {
		return preco;
	}

	

	public Integer getEstoque() {
		return estoque;
	}

	public BigDecimal getTotalProduto() {
		return totalProduto;
	}

	@Override
	public String toString() {
		return "Nome:" + this.nome + ", Estoque:" + estoque + ", Preco: R$" + this.preco +" Total Produto: R$"+ this.totalProduto;
	}

	

}
