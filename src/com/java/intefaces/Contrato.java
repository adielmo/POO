package com.java.intefaces;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Contrato{
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Integer numero;
	private Date dataContrato;
	private Double valorTotal;
	
	private Prestacao prestacao;
	
	public Contrato() {
		
	}

	public Contrato(Integer numero, Date dataContrato, Double valorTotal, Prestacao prestacao) {
		
		this.numero = numero;
		this.dataContrato = dataContrato;
		this.valorTotal = valorTotal;
		this.prestacao = prestacao;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Date getDataContrato() {
		return this.dataContrato;
	}

	public void setDataContrato(Date dataContrato) {
		this.dataContrato = dataContrato;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Prestacao getPrestacao() {
		return this.prestacao;
	}

	public void setPrestacao(Prestacao prestacao) {
		this.prestacao = prestacao;
	}

	@Override
	public String toString() {
	StringBuilder sb = new StringBuilder();
	
	sb.append("Número Contrato: " + this.numero);
	sb.append("Data Contrato: " + sdf.format(this.dataContrato));
	sb.append("Número Contrato: " + this.numero);
	sb.append("Qtd de Parcelas: " + this.prestacao.getQtdParcelas());
	
	return sb.toString();
	}

	
	
		

}
