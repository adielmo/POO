package com.java.intefaces;

public class ServiceContratos implements CalcularContratos {
	private static final double TAXA_01 = 0.01;
	private static final double TAXA_02 = 0.02;

	@Override
	public double taxaPagamento(double valor) {
		return valor * TAXA_02;

	}

	@Override
	public double pagamento(double valor, int mes) {

		return valor * TAXA_01 * mes;
	}

}
