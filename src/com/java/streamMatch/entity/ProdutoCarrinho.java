package com.java.streamMatch.entity;

import java.math.BigDecimal;

public class ProdutoCarrinho {
	
	private Long id;
	private String nomeProduto;
	private BigDecimal valorUnitarioVenda;
	private int quantidadeVenda;
	private BigDecimal totalProduto;
	
	public ProdutoCarrinho() {
		// TODO Auto-generated constructor stub
	}

	public ProdutoCarrinho(Long id, String nomeProduto, BigDecimal valorUnitarioVenda, int quantidadeVenda) {
		
		this.id = id;
		this.nomeProduto = nomeProduto;
		this.valorUnitarioVenda = valorUnitarioVenda;
		this.quantidadeVenda = quantidadeVenda;
	}
	
	public ProdutoCarrinho(Produto prod, BigDecimal valorUnitarioVenda, int quantidadeVenda) {
		
		this.id = prod.getId();
		this.nomeProduto = prod.getName();
		this.valorUnitarioVenda = valorUnitarioVenda;
		this.quantidadeVenda = quantidadeVenda;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public BigDecimal getValorUnitarioVenda() {
		return valorUnitarioVenda;
	}

	public void setValorUnitarioVenda(BigDecimal valorUnitarioVenda) {
		this.valorUnitarioVenda = valorUnitarioVenda;
	}

	public int getQuantidadeVenda() {
		return quantidadeVenda;
	}

	public void setQuantidadeVenda(int quantidadeVenda) {
		this.quantidadeVenda = quantidadeVenda;
	}
	
	public BigDecimal getValorTotalProduto() {
		return this.valorUnitarioVenda.multiply(new BigDecimal(quantidadeVenda));
	}

	public BigDecimal getTotalProduto() {
		return totalProduto;
	}

	public void setTotalProduto(BigDecimal totalProduto) {
		this.totalProduto = totalProduto;
	}

	

}
