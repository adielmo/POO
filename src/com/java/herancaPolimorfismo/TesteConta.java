package com.java.herancaPolimorfismo;

public class TesteConta {

	public static void main(String[] args) {
		// Conta conta = new Conta(451, "Adielmo", 654.32);
		Conta cc = new ContaCorrente(654, "Fernanda", 500.10, 200.40);
		Conta cp = new ContaPoupanca(562, "Pedro", 500.10, 5.0);

		System.out.println(cc);
		 System.out.println(cp);

		cp.saque(200);
		cc.saque(200);
		//cc.depositar(50);

		//((ContaCorrente) cc).emprestimo(50);

		//((ContaCorrente) cc).saque(200);

		//if (cc instanceof ContaCorrente) {
		//	((ContaCorrente) cc).emprestimo(250);
		//}
		
		System.out.println(cc);
		
		System.out.println(cp);
	}

}
