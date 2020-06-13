package com.java.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Calcular {
	
	public static void main(String[] args) {
		
		Item item = new Item(58L, 35, 29.09, "Casa");
		Item item2 = new Item(7L, 1, 33.19, "Lancha");
		Item item3 = new Item(1L, 9, 6.09, "Biscicleta");
		Item item4 = new Item(12L, 2, 39.81, "Moto");
		Item item5 = new Item(2L, 87, 18.34, "Ferro");
		Item item6 = new Item(8L, 10, 23.98, "Mouse");
		Item item7 = new Item(5L, 5, 59.08, "Teclado");
		Item item8 = new Item(1L, 2, 34.09, "Cadeira");
		
		List<Item> itens = Arrays.asList(item, item2, item3, item4, item5, item6, item7, item8);
		
		itens.sort((p1, p2) -> - p1.getCodigo().compareTo(p2.getCodigo()));
		//itens.stream().forEach(a -> System.out.println(a));
		System.out.println();
		
		
		List<Item> aa = 
				itens.stream() 
		  .filter((nome) -> nome.getQtd() % 2 != 0)
		  //.mapToDouble(Item::getPreco)
		 .collect(Collectors.toList());
		  //.reduce(0, (a, b) -> a * b);
		
		aa.forEach(System.out::println);
		 
		
		
		
		/*
		 * itens.stream() .distinct() .forEach(a -> System.out.println(a));
		 */
		
		Long som = itens.stream()
				 .filter((nome) -> nome.getCodigo() > 10)
				 .count();
		
	//	System.out.println(som);
		
						 
						 
						 
			Double soma = itens.stream()
		 .filter((nome) -> nome.getNome().toLowerCase().charAt(0) == 'm')
		 .mapToDouble(Item::getPreco)
		 .reduce(0, (p1, p2) -> p1 + p2);
		 //.reduce(0, Double::sum);
		
		//System.out.println(soma);
		
		
		//itens.forEach(p -> System.out.println(p));
		System.out.println();
		
		
		
	}

}
