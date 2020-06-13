package com.java.stream;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class TipoDeStream {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#,###.#####");
				
		/*
		 * IntStream.range(0, 101) .forEach(System.out::println);
		 */
		List<Long> numerosLong = Arrays.asList(237L, 4L, 32L, 29L, 912L, 219L, 198L, 2L);
		List<Integer> numerosInteger = Arrays.asList(237, 4, 67, 8, 2, 687, 3, 5);
		List<Double> numerosDouble = Arrays.asList(237.40, 4.05, 67.35, 8.24, 2.51, 687.12, 3.53, 51.3);
		
		System.out.println("Double para Inteiro");
		
		/* Passando numeros Double para Inteiros! */
		numerosDouble.stream().map(Double::intValue).forEach(System.out::println);
		
		System.out.println("Inteiro para Double\n");
		
		/* Passando numeros Inteiro para Double! */
		numerosInteger.stream().map(Integer::doubleValue).forEach(System.out::println);
		
		System.out.println("Double para Big Decimal\n");
		
		/* Passando numeros Inteiro para BigDecimal! */
		
		numerosDouble.stream().map(BigDecimal::new).forEach(System.out::println);
		
		System.out.println("Inteiro para Big Decimal\n");
		
		numerosInteger.stream().map(BigDecimal::new).forEach(System.out::println);
		
		System.out.println("\nConverter Double para BigDecimal, e soma");
		
	Optional<BigDecimal> valorBig = numerosDouble.stream()
		       .map(BigDecimal::new)
		       .reduce((a, b) -> a.multiply(b));
		     //  .ifPresent((a) -> System.out.println("R$"+df.format(a)));
	
	System.out.println("\nTOTAL: R$ " + df.format(valorBig.get()));
		
		System.out.println("\nConverter Inteiro para BigDecimal, e soma");
		numerosInteger.stream()
		   .map(BigDecimal::new)
		   .reduce(BigDecimal::multiply)
		   .ifPresent((a) -> System.out.println("R$" +df.format(a)));
		
		System.out.println("\nConverter Long para BigDecimal, calcular");
		numerosLong.stream().map(BigDecimal::new).reduce(BigDecimal::add).ifPresent(System.out::println);
		
		
		
		

		  
	}

}
