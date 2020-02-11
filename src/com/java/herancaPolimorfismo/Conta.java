package com.java.herancaPolimorfismo;

public class Conta {
	
	private Integer numero;
	private String nome;
	protected Double saldo;
	
	public Conta() {
		// TODO Auto-generated constructor stub
	}

	public Conta(Integer numero, String nome, Double saldo) {
		
		this.numero = numero;
		this.nome = nome;
		this.saldo = saldo;
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

	
	public void depositar(double valorDeposito) {
		this.saldo += valorDeposito;
	}
	
	public boolean saque(double valorDeSaque) {

		if (this.saldo > valorDeSaque) {
			this.saldo -= valorDeSaque + (0.05 * valorDeSaque);
			return true;

		}

		return false;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("\n-----Dados da Conta----");
		sb.append("\nNome: " + this.nome);
		sb.append("\nNúmero: " + this.numero);
		sb.append("\nSaldo: " + this.saldo);
		
		return sb.toString();
	}

	
	
	

}
