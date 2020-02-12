package com.java.herancaPolimorfismo.ex03;

public class PessoaFisica extends Pessoa {

	private Double gastoSaude;

	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, Double rendaAnual, Double gastoSaude) {
		super(nome, rendaAnual);
		this.gastoSaude = gastoSaude;
	}

	public Double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}

	@Override
	public double calcularImposto() {

		boolean flag = this.rendaAnual < 20000.00 ? true : false;

		if (flag) {

			return 0.15 * this.rendaAnual;
		}

		return (0.25 * this.rendaAnual) - (this.gastoSaude * 0.50);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append(" Nome: " + getNome());
		sb.append(" Valor a Pagar R$: " + String.format("%.2f", this.calcularImposto()) + "\n");

		return super.toString() + sb.toString();
	}

}
