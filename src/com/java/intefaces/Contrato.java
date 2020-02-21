package com.java.intefaces;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private Integer numero;
	private Date dataContrato;
	private Double valorTotal;

	private List<Prestacao> prestacoes = new ArrayList<>();

	public Contrato() {

	}

	public Contrato(Integer numero, Date dataContrato, Double valorTotal) {

		this.numero = numero;
		this.dataContrato = dataContrato;
		this.valorTotal = valorTotal;

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
	
	public List<Prestacao> getPrestacoes() {
		return prestacoes;
	}

	public void adicionarPrestacao(Prestacao prestacao) {
		prestacoes.add(prestacao);
	}

	public void removerPrestacao(Prestacao prestacao) {
		prestacoes.remove(prestacao);
	}

}
