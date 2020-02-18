package com.java.exception.ex02;

import java.util.Date;

public final class ContaPoupanca extends Conta {

	private Double taxaJuros = 0.0;

	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(Integer numero, Integer agencia, String nome, Date dataCadastro, Double saldo,
			Double limeteSaque, Double taxaJuros, TipoConta tipoConta) {
		super(numero, agencia, nome, dataCadastro, saldo, limeteSaque, tipoConta);
		this.taxaJuros = taxaJuros;
	}

	public ContaPoupanca(Integer numero, Integer agencia, String nome, Date dataCadastro, Double limeteSaque,
			Double taxaJuros, TipoConta tipoConta) {
		super(numero, agencia, nome, dataCadastro, limeteSaque, tipoConta);
		this.taxaJuros = taxaJuros;
	}

	public Double getTaxaJuros() {
		return this.taxaJuros;
	}

	public void setTaxaJuros(Double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
	
   @Override
	public double calcularSaldoLiquido() {
		return this.saldo += ((this.taxaJuros / 100) * this.saldo);
	}

	@Override
	public final String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("*** CONTA POUPANÇA ***\n");

		sb.append("Data de Cadastro: " + sdf.format(this.dataCadastro) + "\n");
		sb.append("Agencia: " + getAgencia() + "\n");
		sb.append("Número Conta: " + getNumero() + "\n");
		sb.append("Nome:a " + getNome() + "\n");
		sb.append("Saldo R$: " + String.format("%.2f", this.saldo )+ "\n");
		sb.append("Limete p/Saque: " + this.limeteSaque + "\n");
		sb.append("Taxa de Juros: " + this.taxaJuros + "%\n");
		sb.append("Saldo C/Juros R$: " + String.format("%.2f", calcularSaldoLiquido()) + "\n");

		return sb.toString();
	}

}
