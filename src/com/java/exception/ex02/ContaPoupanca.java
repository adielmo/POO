package com.java.exception.ex02;

import java.util.Date;

public final class ContaPoupanca extends Conta{
	
	private Double taxaJuros = 0.0;
	
	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(Integer numero, Integer agencia, String nome, Date dataCadastro, Double saldo, Double limeteSaque, Double taxaJuros) {
		super(numero, agencia, nome, dataCadastro, saldo, limeteSaque);
		this.taxaJuros = taxaJuros;
	}
	public ContaPoupanca(Integer numero, Integer agencia, String nome, Date dataCadastro, Double limeteSaque, Double taxaJuros) {
		super(numero, agencia, nome, dataCadastro, limeteSaque);
		this.taxaJuros = taxaJuros;
	}

	public Double getTaxaJuros() {
		return this.taxaJuros;
	}

	public void setTaxaJuros(Double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
	 
	@Override
	public final String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("*** CONTA POUPANÇA ***\n");

		sb.append("Data de Cadastro: " + sdf.format(this.dataCadastro) + "\n");
		sb.append("Agencia: " + getAgencia() + "\n");
		sb.append("Número Conta: " + getNumero() + "\n");		
		sb.append("Nome:a " + getNome() + "\n");
		sb.append("Saldo: " + this.saldo + "\n");
		sb.append("Limete p/Saque: " + this.limeteSaque + "\n");
		sb.append("Taxa de Juros: " + this.taxaJuros +"%\n");
		
		return sb.toString();
	}
	

}
