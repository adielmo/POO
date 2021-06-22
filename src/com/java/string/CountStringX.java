package com.java.string;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountStringX {

	public static void main(String[] args) {
        Character letra='z';
		String nome= "Adielmorabelosantos";
		
		int qtdLetra = quantasLetras(nome, letra);
		Set<Character> list = nome.chars()				             
			             	 .map(Character::toLowerCase)
				             .mapToObj(e->(char)e)				             
				             .collect(Collectors.toSet());
		
		List<Character> characters = countLetra(nome);
		characters.stream()
		          .map(Character::toLowerCase)
		          .distinct()
		          .sorted()
		          .forEach(x -> System.out.print(x+" "));
		System.out.println();
		list.stream().sorted().forEach(x -> System.out.print(x+" "));
		System.out.println("\nQtd da letra "+ Character.toUpperCase(letra)+" : "+qtdLetra);
	}

	private static int quantasLetras(String nome, Character letra) {
		int count=0;
		
		for (int i = 0; i < nome.length(); i++) {
			if (letra.equals(nome.toLowerCase().charAt(i))) {
				count ++;
			}
		}
		return count;
	}

	private static List<Character> countLetra(String nome) {	
List<Character> characters = Stream.of(nome)
							.flatMapToInt(String::chars)
							.mapToObj(i -> (char) i)
				            //.mapToObj(i -> Character.valueOf((char) i)
							.collect(Collectors.toList());
		//characters.forEach(i -> System.out.print(i+" "));
return characters;
	}

}
