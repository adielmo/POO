package com.java.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class VetorToArray {

	public static void main(String[] args) {
		
		Object[] vetorNames = 
{"Maça", "Uva", "Pera", "Abacaxi", "Limão"};
	
		
	
		List<Object> arrayNames = Arrays.asList(vetorNames);
		
		
		
		for (int i = 0; i < vetorNames.length; i++) {
			System.out.print(vetorNames[i] +"-");
		}
		System.out.println();
		
		arrayNames.forEach(x ->System.out.print(x + "*"));

	}

}
