package com.java.arrayList;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Teste {

	public static void main(String[] args) {
		Set<Integer> numerosDistinct = null;
		
    Integer[] listArrays = {5, 0, 9, 1, 6, 4, 5, 8, 6, 7, 11, 5, 48, 17, 10, 31,23, 0};
 
    
    for(int num : listArrays) {
    	System.out.print(num+" ");
    }
    System.out.println("\nTamanho: "+listArrays.length);
    System.out.println("=================//=====================");
    List<Integer> list = Arrays.asList(5, 0, 9, 1, 6, 4, 5, 8, 6, 7, 11, 5, 48, 17, 10, 31,23, 0);
    
  //  for(Integer num : listArrays) {
    List<Integer> listNumeros=Arrays.stream(listArrays).collect(Collectors.toList());
    //List<Integer> listNumeros =(Arrays.asList(listArrays));

   // }
    listNumeros.forEach(i->System.out.print(i+" "));		
	numerosDistinct = new HashSet<>(list);

		 list.stream().distinct().sorted(Comparator.reverseOrder()).forEach(i->System.out.print(i+" "));
		 System.out.println();
		list.stream().sorted(Comparator.naturalOrder()).forEach(i->System.out.print(i+" "));
	

	System.out.println("\nTamanho: " + numerosDistinct.size());
   numerosDistinct.forEach(i->System.out.print(i+" "));
	}

}
