package com.java.exception.ex02;

public class Conta {

	private Integer numero;
	private Integer agencia;
	private String nome;
	private Double saldo;
	private Double limeteSaque;

	public Conta() {
		// TODO Auto-generated constructor stub
	}

	public Conta(Integer numero, Integer agencia, String nome, Double saldo, Double limeteSaque) {

		this.numero = numero;
		this.agencia = agencia;
		this.nome = nome;
		this.saldo = saldo;
		this.limeteSaque = limeteSaque;
	}
	
	public Conta(Integer numero, Integer agencia, String nome, Double limeteSaque) {

		this.numero = numero;
		this.agencia = agencia;
		this.nome = nome;		
		this.limeteSaque = limeteSaque;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSaldo() {
		return saldo;
	}

	public Double getLimeteSaque() {
		return limeteSaque;
	}

	public void setLimeteSaque(Double limeteSaque) {
		this.limeteSaque = limeteSaque;
	}

	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}

	public Integer getAgencia() {
		return this.agencia;
	}

	public void depositar(double valorDeposito) {
		this.saldo += valorDeposito;
	}

	public void saque(double valorSaque) {

		if (valorSaque < this.saldo && valorSaque <= this.limeteSaque) {
			this.saldo += valorSaque;
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("*** CONTA BANCARIA ***\n");

		sb.append("Número Conta: " + this.numero + "\n");
		sb.append("Agencia: " + this.agencia + "\n");
		sb.append("Nome: " + this.nome + "\n");
		sb.append("Saldo: " + this.saldo + "\n");
		sb.append("Limete p/Saque: " + this.limeteSaque + "\n");

		return sb.toString();
	}

}
