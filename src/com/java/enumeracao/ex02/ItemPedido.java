package com.java.enumeracao.ex02;

public class ItemPedido {
	
	private Integer qtd;
	private double preco;
	
	private Produto produto;
	
	public ItemPedido() {
		// TODO Auto-generated constructor stub
	}

	public ItemPedido(Integer qtd, double preco, Produto produto) {
	
		this.qtd = qtd;
		this.preco = preco;
		this.produto = produto;
	}

	public Integer getQtd() {
		return qtd;
	}

	public void setQtd(Integer qtd) {
		this.qtd = qtd;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public Double subTotal() {
		
		return this.preco * this.qtd;
	}

	@Override
	public String toString() {
		return "Nome: " + this.produto.getNome() + ", Qtd:" + this.qtd + 
				", Valor R$ " + this.preco + ", SubTotal R$ " + String.format("%.2f", subTotal()) +"\n";
	}
	
	
	
	
	
	

}
