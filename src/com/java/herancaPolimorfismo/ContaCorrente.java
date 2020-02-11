package com.java.herancaPolimorfismo;

public class ContaCorrente extends Conta {

	private Double limete;

	public ContaCorrente() {
		// TODO Auto-generated constructor stub
	}

	public ContaCorrente(Integer numero, String nome, Double saldo, Double limete) {
		super(numero, nome, saldo);
		this.limete = limete;
	}

	public Double getLimete() {
		return limete;
	}

	public void setLimete(Double limete) {
		this.limete = limete;
	}

	public boolean emprestimo(double valorEmprestimo) {

		if (this.limete > valorEmprestimo) {
            saldoLimete(valorEmprestimo);
			this.saldo += valorEmprestimo;
			return true;
		}
		return false;
	}

	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("\n-----Dados da Conta Corrente----");
		sb.append("\nNome: " + getNome());
		sb.append("\nNúmero: " + getNumero());
		sb.append("\nSaldo: " + this.saldo);
		sb.append("\nLimite: " + this.limete);
		//sb.append("");
		
		return sb.toString();
	}
	
	private void saldoLimete(double valorEmprestimo) {
		this.limete -= valorEmprestimo;	
}

}
