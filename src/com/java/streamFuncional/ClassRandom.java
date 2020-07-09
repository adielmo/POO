package com.java.streamFuncional;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.java.stream.ClasseAbstract;

public class ClassRandom {

	public static void main(String[] args) {
		//ClasseAbstract aa= new ClasseAbstract();
		

		List<BigDecimal> listaNumeros = new ArrayList<>();
		
		List<Integer> numerosRandom = 
				Stream.generate(() -> new Random().nextInt(101))
				.filter(a -> a.intValue() > 0)
				.distinct()
				.limit(51)
				.collect(Collectors.toList());

		numerosRandom.stream().map(BigDecimal::new)
		             .reduce(BigDecimal::add).ifPresent(System.out::println);

		numerosRandom.stream()
				// .map(Integer::doubleValue)
				// .filter(a -> a % 2 != 0)
				.map(BigDecimal::new)

				.forEach(b -> listaNumeros.add(b));

		numerosRandom.stream().forEach(a -> System.out.print(a + " "));
		System.out.println("\nLista números Random: " + numerosRandom.stream().count());

		System.out.println("\nLista de números: " + listaNumeros.stream().count());
//Collections.shuffle(listaNumeros);
		listaNumeros.stream().forEach(a -> System.out.print(a + " "));

		/*
		 * numerosRandom.stream().forEach(a -> listaNumeros.add(a));
		 * listaNumeros.forEach(System.out::println);
		 */

		/*
		 * for (int i = 0; i < numerosRandom.size(); i++) { listaNumeros.add(i,
		 * numrosRandom.get(i)); } listaNumeros.stream().forEach(a ->
		 * System.out.println(a));
		 */

	}
}
