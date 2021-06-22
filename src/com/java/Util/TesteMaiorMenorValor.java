package com.java.Util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TesteMaiorMenorValor {

	public static void main(String[] args) {
		String misturas = "jfhsdFAhkjjkfdhjkdf465465FSDJK4324346543s/-*-*476(*$&¨()(_)*¨/|1";

		System.out.println("Tamanho do Array:");

		int[] arrayInteiro = entradaArrayInt(new Scanner(System.in).nextInt());

		int menorValor = validarMenorValor(arrayInteiro);
		int maiorValor = validarMaiorValor(arrayInteiro);

		List<Integer> numList = Arrays.stream(arrayInteiro).boxed().collect(Collectors.toList());
		numList.stream().sorted(Comparator.reverseOrder()).forEach(x -> System.out.print(x + " "));
		
		System.out.println("\nMenor valor da List: " + menorValor);
		System.out.println("\nMaior valor da List: " + maiorValor);
				
		String letras = misturas.replaceAll("[^a-zA-Z]", "");
		String numeros = misturas.replaceAll("[^0-9]", "");
		List<Character> list = new ArrayList<>();

		for (int i = 0; i < letras.length(); i++) {
			list.add(letras.charAt(i));
		}
		list.stream().map(x -> x.toLowerCase(x)).distinct().sorted().forEach(x -> System.out.print(x + " "));
		System.out.println();
        list.stream().map(x -> x.toUpperCase(x)) .sorted().forEach(x -> System.out.print(x + " "));        
		System.out.println("\n" + letras);
		List<Integer> listNumeros = new ArrayList<>();
		
for (int i = 0; i < numeros.length(); i++) {
	listNumeros.add(Integer.parseInt(String.valueOf(numeros.charAt(i))));
}
listNumeros.stream().distinct().sorted().forEach(x -> System.out.print(x +" "));
	}

	private static int[] entradaArrayInt(int tam) {
		int[] arrayInt = new int[tam];

		for (int i = 0; i < arrayInt.length; i++) {
			arrayInt[i] = new Random().nextInt(1000);
		}

		return arrayInt;
	}

	private static int validarMaiorValor(int[] arrayInt) {
		int maiorValor = Integer.MIN_VALUE;

		for (int i = 0; i < arrayInt.length; i++) {

			if (arrayInt[i] > maiorValor) {
				maiorValor = arrayInt[i];
			}
		}
		return maiorValor;
	}

	private static int validarMenorValor(int[] arrayInt) {
		int menorValor = Integer.MAX_VALUE;

		for (int i = 0; i < arrayInt.length; i++) {

			if (arrayInt[i] < menorValor) {
				menorValor = arrayInt[i];
			}
		}
		return menorValor;
	}

}
