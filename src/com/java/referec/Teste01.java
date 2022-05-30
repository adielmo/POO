package com.java.referec;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Teste01 {

	public static void main(String[] args) {
		 String name = "adielmo";
		 String letras = Arrays.toString(name.toCharArray());
		
	Optional<String> nome =	Stream.of("Pedro", "Marcos", "Joao", "Paulo")
		.map(x -> x.toLowerCase())	
		.filter(x -> x.startsWith("p"))
		.findFirst();
		 
		//System.out.println(nome.isPresent() ? nome.get() : nome.orElse("Sem Nome."));

		System.out.println(letras);
		System.out.println(letras.replaceAll(",", "")
				                  .replaceAll(" ", ""));
		
		List<String> elements =
				  Stream.of("adielmo", "cabo", "camelo", "tatu", "abano")
				  .filter(element -> element.contains("b"))
				    .collect(Collectors.toList());
				Optional<String> anyElement = elements.stream().findAny();
				Optional<String> firstElement = elements.stream().findFirst();
				
			//	System.out.println("findAny: " + anyElement.get());
				//System.out.println("findFirst: " + firstElement.get());

				List<String> palavras =
					Arrays.asList("gato", "cabo","adielmo", "camelo", "tatu", "abano", "peixe");
				
				System.out.println("Pula 2 Palavras: "
				  +palavras.stream().skip(2).collect(Collectors.toList()));
				
				System.out.println("\nEspirar : "
						+ palavras.stream()
						.peek(x -> System.out.print(x +", "))
						.map(String::toUpperCase)
						.collect(Collectors.toList()));
				System.out.println("--------------------//----------------");
				
				System.out.println(palavras.stream()
						.sorted(Comparator.reverseOrder())
						.collect(Collectors.toList()));
	}

}
