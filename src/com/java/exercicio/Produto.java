package com.java.exercicio;

public class Produto {

	
	public String nome;
	public Double preco;
	public Integer qtd;
	
	public Produto() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Produto(String nome, Double preco, Integer qtd) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.qtd = qtd;
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
	
	public double valorEstoque() {
		return this.preco * this.qtd;
	}
	
	public void adicionar(int qtd) {
		 this.qtd += qtd;
	}
	
	public void remover(int qtd) {
		
		if (this.qtd >= qtd) {
			this.qtd -= qtd;
		}
		System.out.println("Estoque inferior ao pedido!");
	}



	@Override
	public String toString() {
		return "Produto Nome: " + nome + ", Preço: R$" + preco + ", Quantidade: " + qtd + " Valor de esoque: " + valorEstoque();
	}
	
	
	
	
}
