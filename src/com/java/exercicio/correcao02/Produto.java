package com.java.exercicio.correcao02;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Produto {

	
	private String nome;
	private Double preco;
	private Integer qtd;
	private BigDecimal valor;
	
	public Produto() {
		this.qtd = 2;
	}

	public Produto(String nome, Double preco, Integer qtd) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.qtd = qtd;
	}
	
	public Produto(String nome) {
		this.nome= nome;
	}
	

	public String getNome() {
		
		
		if (this.nome == null) {
			return "Adielmo";
		}
		 
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
	
	public void adicionarProduto(int qtd) {
		this.qtd += qtd;
	}
	
	public boolean removerProduto(int qtd) {
		if (qtd <= this.qtd) {
			this.qtd -=qtd;
			return true;
		}

		return false;
	}
	
	
	

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Produto \nNome: " + this.nome + "\nPreco: " + this.preco + "\nQtd: " + this.qtd 
				+ "\nValor total R$: " + (new DecimalFormat("#,##0.00").format(this.qtd * this.preco));
	}
	
	
}
