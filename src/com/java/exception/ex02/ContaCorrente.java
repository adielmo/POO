package com.java.exception.ex02;

import java.util.Date;

public final class ContaCorrente extends Conta {

	private Double taxaManutencao = 0.0;

	public ContaCorrente() {
		super();
	}

	public ContaCorrente(Integer numero, Integer agencia, String nome, Date dataCadastro, Double saldo,
			Double limeteSaque, Double taxaManutencao) {
		super(numero, agencia, nome, dataCadastro, saldo, limeteSaque);

		this.taxaManutencao = taxaManutencao;
	}

	public ContaCorrente(Integer numero, Integer agencia, String nome, Date dataCadastro, Double limeteSaque,
			Double taxaManutencao) {
		super(numero, agencia, nome, dataCadastro, limeteSaque);

		this.taxaManutencao = taxaManutencao;
	}

	public Double getTaxaManutencao() {
		return taxaManutencao;
	}
	@Override
	public double calcularSaldoLiquido() {
	
		return this.saldo -= ((this.taxaManutencao / 100) * this.saldo);
	}


	@Override
	public final String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("*** CONTA CORRENTE ***\n");

		sb.append("Data de Cadastro: " + sdf.format(this.dataCadastro) + "\n");
		sb.append("Agencia: " + getAgencia() + "\n");
		sb.append("Número Conta: " + getNumero() + "\n");
		sb.append("Nome:a " + getNome() + "\n");
		sb.append("Saldo R$: " + this.saldo + "\n");
		sb.append("Limete p/Saque: " + this.limeteSaque + "\n");
		sb.append("Taxa de Manutenção: " + this.taxaManutencao + "%\n");
		sb.append("Saldo c/Taxa Manut R$: " + String.format("%.2f", calcularSaldoLiquido())+ "\n");

		return sb.toString();
	}



}
