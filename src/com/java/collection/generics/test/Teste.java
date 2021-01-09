package com.java.collection.generics.test;

import java.util.Scanner;

import com.java.collection.generics.ClassGenerics;

public class Teste {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int qtd , valor =0;
		String nome;
		ClassGenerics<String> generics = new ClassGenerics<>();
		
		System.out.println("Quantidade é:");
		qtd=scanner.nextInt();
		
		for (int i = 0; i < qtd	; i++) {
			System.out.println("Digete:");
			
			nome= scanner.next();
			generics.adicionar(nome);
			
		}
		
		System.out.println("Primeiro valor: "+ generics.getPrimeiro());
		System.out.println("Ultimo valor: "+ generics.getUltimo());
		generics.getImprimir();
		
	}

}
