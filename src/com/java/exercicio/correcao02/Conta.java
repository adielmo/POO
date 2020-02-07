package com.java.exercicio.correcao02;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Conta {
	private static final double TAXA =0.05;
	private String nome;
	private String conta;
	private BigDecimal saldo =  BigDecimal.ZERO;
	
	public Conta() {
		
	}

	public Conta(String nome, BigDecimal saldo, String conta) {		
		this.nome = nome;
		this.saldo = saldo;
		this.conta = conta;
	}
	
	public Conta(String nome, String conta) {		
		this.nome = nome;		
		this.conta = conta;
	}
	public Conta(String nome, String conta, BigDecimal valorDeposito) {		
		this.nome = nome;		
		this.conta = conta;
		depositar(valorDeposito);
		
	}

	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}


	public BigDecimal getSaldo() {
		return this.saldo;
	}

	public String getConta() {
		return this.conta;
	}
	
	
	 public void depositar(BigDecimal valorDeposito) {
		 
		 this.saldo = this.saldo.add(valorDeposito);
	 }
	 
	 public void sacar(double valorSacar) {
		 BigDecimal valorSacarTaxa = valorLiquido(valorSacar);
		 this.saldo = this.saldo.subtract(valorSacarTaxa);
	 }

	@Override
	public String toString() {
		return "Conta \nNome: " + this.nome + "\nConta: " + this.conta + "\nSaldo: "
				+ (new DecimalFormat("#,##0.00").format(this.saldo)) ;
	}
	
	private BigDecimal valorLiquido(double valorSacar) {
		BigDecimal bd= new BigDecimal(TAXA);
		 
		 BigDecimal valorBruto = bd.multiply(new BigDecimal(valorSacar));
		 
		return valorBruto.add(new BigDecimal(valorSacar));
	}
	


	
	

}
