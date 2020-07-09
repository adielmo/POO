package com.java.programacaoFuncional;

import java.util.ArrayList;
import java.util.List;

public class ComparadorTeste {

	public static void main(String[] args) {

		List<Item> list = new ArrayList<>();

		Item p1 = new Item(1L, "Feijão", 12.57, 12);
		Item p2 = new Item(2L, "Arroz", 15.78, 19);
		Item p3 = new Item(3L, "Acuçar", 2.49, 7);
		Item p4 = new Item(4L, "Café", 11.75, 23);
		Item p5 = new Item(5L, "Cerveja", 4.98, 38);
		Item p6 = new Item(6L, "Refrigerante", 7.89, 41);
		Item p7 = new Item(7L, "Det. Liquido", 1.97, 51);
		Item p8 = new Item(8L, "Sabonete", 2.39, 29);
		Item p9 = new Item(9L, "Desodorante", 15.71, 75);
		Item p10 = new Item(10L, "Espaguete", 3.75, 62);
		Item p11 = new Item(11L, "Queijo Prato", 27.89, 56);
		Item p12 = new Item(12L, "Picanha Bovina", 49.75, 15);
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

		list.sort((a1, a2) -> a1.getNome().toUpperCase().compareTo(a2.getNome().toUpperCase()));

		list.stream().sorted((a1, a2) -> a1.getNome().toUpperCase().compareTo(a2.getNome().toUpperCase()));

		double total = list.stream().filter(x1 -> x1.getNome().toLowerCase().charAt(0) == 'c')
				.mapToDouble(Item::getPreco).reduce(0, (a, b) -> a + b);

		System.out.println(total);
	}

}
