package com.java.herancaPolimorfismo;

public class TesteConta {

	public static void main(String[] args) {
		Conta conta = new Conta(451, "Adielmo", 654.32);
		Conta cc = new ContaCorrente(654, "Fernanda", 451.51, 352.39);
		Conta cp = new ContaPoupanca(562, "Pedro", 942.50, 5.0);

		System.out.println(cc);
		cc.depositar(50);
		cc.saque(200);

		((ContaCorrente) cc).emprestimo(25);

		if (cc instanceof ContaCorrente) {
			((ContaCorrente) cc).emprestimo(250);
		}

		// System.out.println(conta);
		System.out.println(cc);
		System.out.println(cp);

		((ContaPoupanca) cp).calcularTaxaDeJuros();
		System.out.println(cp);

	}

}
