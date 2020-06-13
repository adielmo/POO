package com.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TesteCaulc {
	
	public static void main(String[] args) {
		
		Item item = new Item(58L, 35, 29.09, "Casa");
		Item item2 = new Item(7L, 16, 33.19, "Lancha");
		Item item3 = new Item(1L, 9, 6.09, "Biscicleta");
		Item item4 = new Item(12L, 2, 39.81, "Moto");
		Item item5 = new Item(2L, 87, 18.34, "Ferro");
		Item item6 = new Item(8L, 10, 23.98, "Mouse");
		Item item7 = new Item(5L, 5, 59.08, "Teclado");
		Item item8 = new Item(1L, 2, 34.09, "Cadeira");
		
		List<Item> itens = Arrays.asList(item, item2, item3, item4, item5, item6, item7, item8);
		List<Integer> numeros = Arrays.asList(23, 4, 67, 8, 2, 687, 3, 51);
		
Optional<Integer> menorValor = numeros.stream()            
             .reduce((a, b) -> Math.min(a, b));

 Optional<Item> aa= itens.stream().findFirst();
 
 
List<Item> sortedList = itens
	        .stream()
	        .sorted((a, b) -> a.getNome().toUpperCase().compareTo(b.getNome().toUpperCase()))
	        .collect(Collectors.toList());
    
 sortedList.forEach(System.out::println);
 
 System.out.println();
 
 itens.forEach(System.out::println);
 
 //System.out.println(aa.get());

/*
		 * double mm = itens.stream() .mapToDouble(Item::getQtd)
		 * .reduce(Double.POSITIVE_INFINITY,(a, b) -> Math.max(a, b));
		 */
      //.orElse((Double) null);

System.out.println("Valor: " + menorValor.get());
//System.out.println("Item: "+ mm);
				  
	}

}
