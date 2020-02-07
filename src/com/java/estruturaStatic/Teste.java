package com.java.estruturaStatic;

import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double valorComprar = 0.0, precoDolar=0.0, compra=0.0;
		
		System.out.println("Preço do Dolar US $: ");
		 precoDolar = sc.nextDouble();
		
		System.out.println("Quantos Dolar vc vai comprar: US $: ");
		valorComprar =sc.nextDouble();
		
		 System.out.println("=========//=======================");
		 
		Produto.imprimir();
		 System.out.println("Quantos Dolar vc vai comprar: US $: ");
			compra =sc.nextDouble();
		
		double comp = Produto.calcular(precoDolar, valorComprar);
		
		System.out.println("Compra 01: " + comp);
		System.out.println("Valor do IOF: " + Produto.valorIof(comp));
		 System.out.println("=========//=======================\n");
		 
		 double comp02 = Produto.valorPagar(compra);
		System.out.println("Compra 02: " + comp02);
		System.out.println("Valor do IOF: " + Produto.valorIof(compra));
		
	}
		

}
