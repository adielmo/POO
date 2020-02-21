package com.java.intefaces;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Prestacao {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date dataVencimento;
	private Double valorPorParcela;
	
	public Prestacao() {
		// TODO Auto-generated constructor stub
	}

	public Prestacao(Date dataVencimento, Double valorPorParcela) {
		
		this.dataVencimento = dataVencimento;
		this.valorPorParcela = valorPorParcela;
	}
	
	public Prestacao(Double qtdParcelas) {		
		
		this.valorPorParcela = qtdParcelas;
	}


	public Date getDataVencimento() {
		return this.dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Double getValorPorParcela() {
		return this.valorPorParcela;
	}

	public void setValorPorParcela(Double valorPorParcela) {
		this.valorPorParcela = valorPorParcela;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(sdf.format(this.dataVencimento) + " ");
		sb.append(String.format("%.2f", this.valorPorParcela));
		
		return sb.toString();
	}
	
	
	
	
	
	
	

}
