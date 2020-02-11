package com.java.herancaPolimorfismo;

public final class ContaPoupanca extends Conta {

	private Double taxaJuros;

	public ContaPoupanca() {
		// TODO Auto-generated constructor stub
	}

	public ContaPoupanca(Integer numero, String nome, Double saldo, Double taxaJuros) {
		super(numero, nome, saldo);
		this.taxaJuros = taxaJuros;
	}

	public Double getTaxaJuros() {
		return taxaJuros;
	}

	public void calcularTaxaDeJuros() {

		this.saldo += (this.taxaJuros / 100) * this.saldo;
	}

	@Override
	public boolean saque(double valorDeSaque) {
		if (this.saldo > valorDeSaque) {

			this.saldo -= valorDeSaque;
			return true;
		}

		return false;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append("\n-----Dados da Conta Poupança----");
		sb.append("\nNome: " + getNome());
		sb.append("\nNúmero: " + getNumero());
		sb.append("\nSaldo: " + this.saldo);
		sb.append("\nT.Juros: " + this.taxaJuros);

		return sb.toString();
	}

}
