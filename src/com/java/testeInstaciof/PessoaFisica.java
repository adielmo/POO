package com.java.testeInstaciof;

public class PessoaFisica implements Cliente{

	@Override
	public double calcular(double valor) {
		
		return valor + (valor * 0.10);
	}


}
