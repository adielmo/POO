package com.java.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TesteString {
	
	public static void main(String[] args) {
		
		List<String> letras = Arrays.asList("q", "w", "e", "r", "T", "y", "u", "I", "o", "p",
				                           "a", "S", "d", "F", "g", "H", "J", "K", "l", "ç",
				                           "Z", "x", "c", "v", "B", "N", "M");
		
		
		
		  letras.stream() .map(String::toUpperCase) .map((a) -> new
		  StringBuilder().append(a).append("-")) .forEach(System.out::print);
		  
			 
		
		
		  Collections.shuffle(letras); System.out.println(); letras.forEach(a ->
		  System.out.print(a.toUpperCase() + "-"));
		 
		 
		      
	
	}
}
