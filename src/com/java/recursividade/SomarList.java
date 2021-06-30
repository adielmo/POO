package com.java.recursividade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SomarList {

	public static void main(String[] args) {
		List<Integer> positivos = new ArrayList<>();
		List<Integer> negativos = new ArrayList<>();
		List<Integer> numeros = Arrays.asList(25, 23, 98, 150, 245, 877);
		List<Integer> num = Arrays.asList(25, -23, 98, -150, -245, 877);

	Integer soma =	numeros.stream().reduce(Integer::sum).orElse(0);
	System.out.println("Total: "+numeros.stream().reduce(0, (i, x) -> i + x));
	
	num.stream().forEach(i -> {
		if (i < 0) {
			negativos.add(i);
		}else {
			positivos.add(i);
		}
	});
	
		Integer count = 0;
		for (Integer i : numeros) {
			count += i;
		}

		System.out.println(count);
		System.out.println(soma);
		positivos.forEach(x -> System.out.print(x + " "));
		negativos.forEach(x -> System.out.print(x + " "));
	}

}
