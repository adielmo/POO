package com.java.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TesteReduce {
	public static void main(String[] args) {
		
		Item item = new Item(58L, 35, 29.09, "Tapete");
		Item item2 = new Item(7L, 1, 33.19, "Carro");
		Item item3 = new Item(1L, 9, 6.09, "Motocicleta");
		Item item4 = new Item(12L, 2, 39.81, "Casa");
		Item item5 = new Item(2L, 87, 18.34, "Cama");
		Item item6 = new Item(8L, 10, 23.98, "Mouse");
		Item item7 = new Item(5L, 5, 59.08, "Teclado");

		List<Item> items = Arrays.asList(item, item2, item3, item4, item5, item6, item7);

		// items.stream().forEach(saida -> System.out.println(saida));
		System.out.println();

		items.sort((i1, i2) -> -i1.getCodigo().compareTo(i2.getCodigo()));
		// items.forEach(p -> System.out.println(p));

		// System.out.println();

		items.sort((nome1, nome2) -> nome1.getNome().toUpperCase().compareTo(nome2.getNome().toUpperCase()));
		//items.forEach(nomes -> System.out.println(nomes));

		// System.out.println();

		Double total = items.stream()
				.filter((nome) -> nome.getNome().charAt(0) == 'M')
				.mapToDouble(Item::getPreco)
				.reduce(0, (valor1, valor2) -> valor1 + valor2);

		System.out.println(total);

		Integer qtdProduto = items.stream().skip(5).mapToInt(Item::getQtd).reduce((p1, p2) -> p1 + p2).orElse(0);

		System.out.println(qtdProduto);

		
		  Double tt = items.stream() 
				  .skip(4) 
				  .limit(3) 
				  .mapToDouble(Item::getPreco)
		  .reduce(1, (n1, n2)-> n1 * n2);
		  
		  System.out.println(tt);
		  
		  
		  List<String> numeros = Arrays.asList("a", "d", "i", "e", "l", "m", "o");
		  
		  
   String nome = numeros.stream().map(letra -> String.valueOf(letra)).collect(Collectors.joining());   		
		  
	//System.out.println(nome.toUpperCase());
   
		/*
		 * Optional<Integer> menorValor = items.stream() .mapToInt(Item::getQtd)
		 * .max(Comparator.comparing(q -> q.));
		 */
		 

	}

}
