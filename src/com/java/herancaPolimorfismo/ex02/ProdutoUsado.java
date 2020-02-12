package com.java.herancaPolimorfismo.ex02;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class ProdutoUsado extends Produto{
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date dataFabricacao;
	
	public ProdutoUsado() {
		// TODO Auto-generated constructor stub
	}

	public ProdutoUsado(String nome, Double preco, Date dataFabricacao) {
		super(nome, preco);
		this.dataFabricacao = dataFabricacao;
	}

	public Date getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(Date dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}
	
	
	@Override
	public final String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("(Data de Fabricação: " + sdf.format(this.dataFabricacao) + ")\n");
		
		return super.toString() + sb.toString();
	}

}
