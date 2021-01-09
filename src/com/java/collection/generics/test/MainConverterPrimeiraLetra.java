package com.java.collection.generics.test;

import java.util.Scanner;

import com.java.collection.generics.ClassGenerics;
import com.java.collection.generics.ConverterPrimeiraLetra;
import com.java.collection.generics.TratarException;

public class MainConverterPrimeiraLetra {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int qtd = 0;
		String nome;

		ClassGenerics<String> nomes = new ClassGenerics<>();

		System.out.println("Qtd:");
		qtd = scanner.nextInt();

		for (int i = 0; i < qtd; i++) {
			System.out.println("Digete o " + (i + 1) + "º Nome:");
			nome = scanner.next();

			String name = "" + nome.charAt(1);
			String nn = "" + nome.charAt(1);

			if (name.toUpperCase().equals(nn)) {
				nomes.adicionar(ConverterPrimeiraLetra.converterToLowerCase(nome));
			}
			if (name.toLowerCase().equals(nn)) {
				nomes.adicionar(ConverterPrimeiraLetra.convertertoUpperCase(nome));
			}

		}
		
		int posicao=10;
		nomes.getImprimir();
		System.out.println("\nPrimeiro Nome: " + nomes.getPrimeiro());
		System.out.println("Ultimo Nome: " + nomes.getUltimo());
		try {
		System.out.println("Item na posição "+posicao + " na List: "+ nomes.getPosicao(posicao));
		
		}catch (IndexOutOfBoundsException e) {
			
			System.out.println(String.format("Posição %d não existe na lista", posicao));
		}
	}

}
