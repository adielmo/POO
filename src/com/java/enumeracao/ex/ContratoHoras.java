package com.java.enumeracao.ex;

import java.util.Date;

public class ContratoHoras {

	private Date data;
	private Double valorHoras;
	private Integer horas;

	public ContratoHoras() {

	}

	public ContratoHoras(Date data, Double valorHoras, Integer horas) {
		this.data = data;
		this.valorHoras = valorHoras;
		this.horas = horas;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Double getValorHoras() {
		return this.valorHoras;
	}

	public void setSalario(Double valorHoras) {
		this.valorHoras = valorHoras;
	}

	public Integer getHoras() {
		return this.horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}

	public double valorTotal() {
		return this.valorHoras * this.horas;

	}

}
