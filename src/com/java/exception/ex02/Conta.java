package com.java.exception.ex02;

public class Conta {

	private Integer numero;
	private Integer agencia;
	private String nome;
	private Double saldo = 0.0;
	private Double limeteSaque = 0.0;

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

	public void saque(double valorSaque)throws SaqueException {
		validarSaque(valorSaque);
		this.saldo -= valorSaque;
		
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("*** CONTA BANCARIA ***\n");

		sb.append("Agencia: " + this.agencia + "\n");
		sb.append("Número Conta: " + this.numero + "\n");		
		sb.append("Nome:a " + this.nome + "\n");
		sb.append("Saldo: " + this.saldo + "\n");
		sb.append("Limete p/Saque: " + this.limeteSaque + "\n");

		return sb.toString();
	}
	
	private void validarSaque(double valorSaque) throws SaqueException {
		if (!(valorSaque < this.saldo)) {
			throw new SaqueException("Valor do Saque é maior que o Saldo Disponivél");
		}

		if (!(valorSaque <= this.limeteSaque)) {
			throw new SaqueException("Valor do Saque é maior, que o valor de Limete Disponivél");
		}
	}

}
