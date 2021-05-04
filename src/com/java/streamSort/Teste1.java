package com.java.streamSort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Teste1 {

	public static void main(String[] args) {
List<String> list = Arrays.asList("Pedro", "Marcos", "João", "Arthur", "Bia", "Carla", "Yuri", "Adielmo");

//Collections.sort(list);
//System.out.println(list);
list.stream().sorted((a, b) -> a.compareTo(b)).forEach(i -> System.out.print(i + " "));
System.out.println();
list.stream().sorted(Comparator.reverseOrder()).forEach(i -> System.out.print(i + " "));
list.stream().sorted(Comparator.reverseOrder()).map(String::toUpperCase)
             .findFirst().ifPresent(i -> System.out.print("\nPega o Primeiro: "+i));
System.out.println();


list.stream().sorted(Comparator.comparing(String::toUpperCase)).filter(i -> i.startsWith("A"))
.forEach(i -> System.out.print(i + " "));
System.out.println();

long count =list.stream().sorted(Comparator.comparing(String::toUpperCase)).filter(i -> i.startsWith("A"))
.count();
System.out.println(count);




	}

}
