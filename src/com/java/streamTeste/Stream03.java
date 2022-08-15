package com.java.streamTeste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stream03 {

	public static void main(String[] args) {

		System.out.println("======Stream listToList Reduce======");
		List<Integer> listIntPares = new ArrayList<>();
List<Integer> listInteger = 
	Arrays.asList(12, 36, 5, 47, 0, 6, 1, 61, 154, 8264, 1, 12, 5);

listIntegerPares(listInteger, listIntPares);

listInteger.forEach(x -> System.out.print(x+ " "));
System.out.println();
listIntPares.forEach(x -> System.out.print(x+ " "));



	}

	private static void listIntegerPares(List<Integer> listInteger, List<Integer> listIntPares) {
		
		
		listInteger.stream()
		           .filter(x -> x % 2 ==0)
		           .forEach(x -> listIntPares.add(x));
		
	}

}
