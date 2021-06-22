package com.java.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BuscarUltimoTresItens {

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
		
		List<Integer> numerosInteger = Arrays.asList(237, 4, 67, 8, 2, 687, 3, 5, 1, 87, 276, 209, 671);

		List<Integer> newList = numerosInteger.stream()
				// .sorted(Comparator.reverseOrder())
				.sorted().collect(Collectors.toList());
		newList.forEach(i -> System.out.print(i + " "));
		
		System.out.println();
		int j =(newList.size() - 4);
		for (int i = newList.size() - 1; i > j; i--) {
			System.out.print(newList.get(i) + " ");
		}
		System.out.println();
		newList.stream()
		.sorted(Comparator.reverseOrder())
		.limit(3)
		.forEach(i -> System.out.print(i + " "));
		System.out.println();
		
		itens.stream()
	         .distinct()
	         //.peek(i -> System.out.println(i))//Espiar antes do filter ou outro
		     .sorted(Comparator.comparing(Item :: getCodigo))
		     .limit(3)
		     //.skip(2)//Pular Quantos
		     
     		 .forEach(i -> System.out.println(i));

		     

	}

}
