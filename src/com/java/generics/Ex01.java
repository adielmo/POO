package com.java.generics;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) throws listaVaziaExecption {
		Scanner sc = new Scanner(System.in);
		Servicos<String> valor = new Servicos<>();
		
		int qtd = sc.nextInt();
		
		for (int i = 0; i < qtd; i++) {

			String nome = sc.next();
			valor.adicionar(nome);

		}
		
		valor.imprimir();
		valor.first();
		

		

	}

}
