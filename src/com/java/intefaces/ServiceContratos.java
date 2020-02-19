package com.java.intefaces;

public class ServiceContratos implements CalcularContratos{

	Contrato contrato = new Contrato();
	


	@Override
	public void calcularQtdParcelaDeContrato() {
		// long datasParcelas = contrato.getDataContrato().getTime() * 
		
	}

	@Override
	public double calcularTaxaPorPagamento() {
		double valorPorParcelas, valorPagar;
		valorPorParcelas = contrato.getValorTotal() / contrato.getPrestacao().getQtdParcelas();
		
		for (int i = 1; i <= contrato.getPrestacao().getQtdParcelas(); i++) {
			
			valorPagar =valorPorParcelas + (valorPorParcelas * (0.01 * i));
			return valorPagar + (valorPagar * 0.02);
			
		}
		return 0;
	}




}
