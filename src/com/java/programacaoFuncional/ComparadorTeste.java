package com.java.programacaoFuncional;

import java.util.ArrayList;
import java.util.List;

public class ComparadorTeste {
	public static void main(String[] args) {

		List<Produto> list = new ArrayList<>();

		Produto p1 = new Produto(3L, "Feijão", 12.57, 12);
		Produto p2 = new Produto(5L, "Arroz", 15.78, 19);
		Produto p3 = new Produto(8L, "Acuçar", 2.49, 2);
		Produto p4 = new Produto(1L, "Café", 11.75, 23);
		Produto p5 = new Produto(9L, "Cerveja", 4.98, 38);
		Produto p6 = new Produto(7L, "Refrigerante", 7.89, 41);
		Produto p7 = new Produto(12L, "Det. Liquido", 1.97, 51);
		Produto p8 = new Produto(2L, "Sabonete", 2.39, 29);
		Produto p9 = new Produto(4L, "Desodorante", 15.71, 75);
		Produto p10 = new Produto(11L, "Espaguete", 3.75, 62);
		Produto p11 = new Produto(6L, "Queijo Prato", 27.89, 56);
		Produto p12 = new Produto(11L, "Picanha Bovina", 49.75, 165);
		// List<Produto> list = Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10,
		// p11, p12);

		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		list.add(p6);
		list.add(p7);
		list.add(p8);
		list.add(p9);
		list.add(p10);
		list.add(p11);
		list.add(p12);

		// list.sort((a1, a2) ->
		// a1.getNome().toUpperCase().compareTo(a2.getNome().toUpperCase()));
		// .sorted((a1, a2) -> a1.getNome().toUpperCase().compareTo(a2.getNome().toUpperCase()))
		
		/*
		 * double total = list.stream() .filter(x1 ->
		 * x1.getNome().toUpperCase().charAt(0) == 'K') .mapToDouble(Produto ::
		 * getPreco) .reduce((a, b) -> a + b).orElse(0);
		 */
		long total = list.stream()				
				.filter(x1 -> x1.getNome().toUpperCase().charAt(0) == 'R')
				.count();
				//.mapToDouble(Produto :: getPreco)
		        //.reduce((a, b) -> a + b).orElse(0);		
		

	System.out.println(total);
	
	
for(Produto item : list) {
	System.out.println(item);
}

	//list.forEach(System.out::println);
	
		/*
		 * for(int i=0; i < list.size(); i++) { System.out.println(list.get(i)); }
		 */

		// System.out.println(String.format("%.2f\n", tt));

//list.forEach(System.out::println);

	}

}
