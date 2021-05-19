package com.java.testeInstaciof;

public class Teste {
	
	public static void main(String[] args) {
		
		PessoaFisica pf = new PessoaFisica();
		PessoaJuridica pj = new PessoaJuridica();
		Clientes clientes = new Clientes();
		
		if (pf instanceof Cliente) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		
	/*	
		if (pf instanceof Cliente) {
		System.out.println("Pessoa Fisíca: " + pf.calcular(50));	
		}else {
			System.out.println(false);
		}
		
		*/
	}

}
