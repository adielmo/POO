package com.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class StreamOpcao {
	
	public static void main(String[] args) {
String frase = "Deixe um curtir no vídeo!";		
List<Integer> numerosInteger = Arrays.asList(237, 4, 34, 67, 8, 2, 687, 3, 5, 51, 4, 87, 91, 1, 34, 23, 76, 67, 51);

Stream.of("Se ", "fosse ", "tudo ", "diferente ", "seria ", "outra ", "coisa!")
      .forEach(System.out::print);
System.out.println();

Pattern pattern = Pattern.compile(" ");
pattern.splitAsStream(frase).forEach(System.out::print);

	}

}
