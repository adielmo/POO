package com.java.estruturaStatic;

import java.text.DecimalFormat;

public class Produto {

	public static final double IOF = 0.06;
	
	public static final double DOLAR = 4.21;
	
	DecimalFormat df = new DecimalFormat("#,###.00");

	
	
	public static double calcular(double precoDolar, double valorComprar) {
		return ((precoDolar * valorComprar) * IOF) + (precoDolar * valorComprar);
	}
	
	public static void imprimir() {
		System.out.println("Valo do Dolar atual US$ " + DOLAR);
		System.out.println("Valor atual do IOF:" + (IOF * 100) +  "%");
	}

	public static double valorPagar(double compra) {
		
		return (compra * DOLAR) * IOF +(compra * DOLAR);
	}
	
	public static double valorIof(double compra) {
		return (compra * DOLAR) * IOF;
	}
	
	public static double valorIof(double valorComprar, double precoDolar) {
		return (valorComprar * precoDolar) * IOF;
	}



}
