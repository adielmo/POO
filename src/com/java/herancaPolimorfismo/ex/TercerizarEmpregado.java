package com.java.herancaPolimorfismo.ex;

public final class TercerizarEmpregado extends Empregado{
	
	private Double adicional;
	
	public TercerizarEmpregado() {
		// TODO Auto-generated constructor stub
	}

	
	public TercerizarEmpregado(String nome, Double valorHoras, Integer horas, Double adicional) {
		super(nome, valorHoras, horas);
		this.adicional = adicional;
	}


	public Double getAdicional() {
		return adicional;
	}


	public void setAdicional(Double adicional) {
		this.adicional = adicional;
	}
	
	@Override
	public final double calcularPagamento() {
		
		return super.calcularPagamento() + this.adicional * 1.1;
	}
	

}
