package com.java.streamMatch.entity;

import java.math.BigDecimal;

public class ProdutoDto {
	
	private String nome;
	private BigDecimal preco;
	
	public ProdutoDto() {
		// TODO Auto-generated constructor stub
	}

	public ProdutoDto(Produto produto) {
		
		this.nome = produto.getName();
		this.preco = produto.getPreco();
	}

	public String getNome() {
		return nome;
	}

	
	public BigDecimal getPreco() {
		return preco;
	}

	

	@Override
	public String toString() {
		return "ProtudoDto [nome=" + this.nome + ", preco=" + this.preco + "]";
	}

}
