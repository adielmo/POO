package com.java.array;

import java.util.Arrays;
import java.util.List;

public class ArrayToVetor {

	public static void main(String[] args) {
		
		List<String> arrayNames = 
Arrays.asList("Maça", "Uva", "Pera", "Abacaxi", "Limão");
		
		Object[] vetorNames = arrayNames.toArray();
		
		for (int i = 0; i < vetorNames.length; i++) {
			System.out.print(vetorNames[i] +"-");
		}
		System.out.println();
		
		arrayNames.forEach(x ->System.out.print(x + "*"));

	}

}
