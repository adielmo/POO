package com.java.intefaces;

import java.util.Date;

public class Prestacao {
	
	private Date dataVencimento;
	private Integer qtdParcelas;
	
	public Prestacao() {
		// TODO Auto-generated constructor stub
	}

	public Prestacao(Date dataVencimento, Integer qtdParcelas) {
		
		this.dataVencimento = dataVencimento;
		this.qtdParcelas = qtdParcelas;
	}
	
	public Prestacao(Integer qtdParcelas) {		
		
		this.qtdParcelas = qtdParcelas;
	}


	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Integer getQtdParcelas() {
		return qtdParcelas;
	}

	public void setQtdParcelas(Integer qtdParcelas) {
		this.qtdParcelas = qtdParcelas;
	}
	
	
	
	
	
	
	
	
	

}
