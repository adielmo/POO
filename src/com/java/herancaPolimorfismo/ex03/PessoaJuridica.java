package com.java.herancaPolimorfismo.ex03;

public class PessoaJuridica extends Pessoa{

	
	private Integer qtdFuncionarios;
	
	public PessoaJuridica() {
	super();
	
	}

	public PessoaJuridica(String nome, Double rendaAnual, Integer qtdFuncionarios) {
		super(nome, rendaAnual);
		this.qtdFuncionarios = qtdFuncionarios;
	}

	public Integer getQtdFuncionarios() {
		return qtdFuncionarios;
	}

	public void setQtdFuncionarios(Integer qtdFuncionarios) {
		this.qtdFuncionarios = qtdFuncionarios;
	}
	
	@Override
	public double calcularImposto() {
		boolean flag = this.qtdFuncionarios > 10 ? true : false;
		
		if (flag) {
		return this.rendaAnual * 0.14;	
		}
		return  this.rendaAnual * 0.16;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append(" Empresa: " + getNome());
		sb.append(" Valor a Pagar R$: " + String.format("%.2f", this.calcularImposto())+"\n");
		
		return super.toString() + sb.toString();
	}
	
}
