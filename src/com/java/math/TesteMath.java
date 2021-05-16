package com.java.math;

public class TesteMath {	
	public static void main(String[] args) {
		System.out.println(Math.pow(2, 3));//2³
		System.out.println(Math.round(4.7));//Trabalha com acerodamento
		System.out.println(Math.round(4.4));//Trabalha com acerodamento
		System.out.println(Math.ceil(4.7));//Trabalha com acerodamento sempre para Cima
		System.out.println(Math.ceil(4.4));//Trabalha com acerodamento sempre para Cima
		System.out.println(Math.floor(4.7));//Trabalha com acerodamento sempre para Baixo
		System.out.println(Math.floor(4.4));//Trabalha com acerodamento sempre para Baixo
		double mathRandom =Math.random();//Gerando um némero Random
		System.out.println(mathRandom);
		System.out.println(Math.round(mathRandom));//Aredodando esse número
		System.out.println(Math.round(mathRandom * 100));//Pegando o número random e multiplicando por 100
		System.out.println(Math.sin(mathRandom));


	}

}
