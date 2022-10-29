package com.java.streamMatch.entity;

import java.math.BigDecimal;
import java.util.Objects;

public class Produto {
	
	private Long id;
	private String name;
	private BigDecimal preco;
	private int estoque;
	
	public Produto() {
		// TODO Auto-generated constructor stub
	}

	public Produto(Long id, String name, BigDecimal preco, int qtd) {
		this.id = id;
		this.name = name;
		this.preco = preco;
		this.estoque = qtd;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPreco() {
		return this.preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public int getQtd() {
		return estoque;
	}

	public void setQtd(int qtd) {
		this.estoque = qtd;
	}
	
	public BigDecimal getValorTotalProduto() {
		return this.preco.multiply(new BigDecimal(this.estoque));
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(id, other.id);
	}

}
