package com.java.readcsv;

import java.math.BigDecimal;

public class Produto {
	
	private Long id;
	private String codigoBarra;
	private String descricao;
	private BigDecimal custoReposicao;
	private String markDown;
	private String valorVenda;
	private String numNcm;
	private String estoque;
	private String secao;
	
	public Produto() {
		// TODO Auto-generated constructor stub
	}

	public Produto(Long id, String codigoBarra, String descricao, BigDecimal custoReposicao, String markDown,
			String valorVenda, String numNcm, String estoque, String secao) {
		
		this.id = id;
		this.codigoBarra = codigoBarra;
		this.descricao = descricao;
		this.custoReposicao = custoReposicao;
		this.markDown = markDown;
		this.valorVenda = valorVenda;
		this.numNcm = numNcm;
		this.estoque = estoque;
		this.secao = secao;
	}

	public Produto(String codigoBarra, String descricao, BigDecimal custoReposicao, String markDown, String valorVenda,
			String numNcm, String estoque, String secao) {
	
		this.codigoBarra = codigoBarra;
		this.descricao = descricao;
		this.custoReposicao = custoReposicao;
		this.markDown = markDown;
		this.valorVenda = valorVenda;
		this.numNcm = numNcm;
		this.estoque = estoque;
		this.secao = secao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigoBarra() {
		return codigoBarra;
	}

	public void setCodigoBarra(String codigoBarra) {
		this.codigoBarra = codigoBarra;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getCustoReposicao() {
		return custoReposicao;
	}

	public void setCustoReposicao(BigDecimal custoReposicao) {
		this.custoReposicao = custoReposicao;
	}

	public String getMarkDown() {
		return markDown;
	}

	public void setMarkDown(String markDown) {
		this.markDown = markDown;
	}

	public String getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(String valorVenda) {
		this.valorVenda = valorVenda;
	}

	public String getNumNcm() {
		return numNcm;
	}

	public void setNumNcm(String numNcm) {
		this.numNcm = numNcm;
	}

	public String getEstoque() {
		return estoque;
	}

	public void setEstoque(String estoque) {
		this.estoque = estoque;
	}

	public String getSecao() {
		return secao;
	}

	public void setSecao(String secao) {
		this.secao = secao;
	}

	@Override
	public String toString() {
		return "Produto [id:" + id + ", CodigoBarra:" + this.codigoBarra + ", Descricao:" + this.descricao + ", "
				+ "CustoReposicao:" + this.custoReposicao + ", MarkDown:" + this.markDown + ", ValorVenda:" + this.valorVenda + 
				", NumNcm:" + this.numNcm + ", Estoque:" + this.estoque + ", Secao:" + this.secao ;
	}

}
