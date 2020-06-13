package com.java.programacaoFuncional;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Teste {
	
	public static void main(String[] args) {
		
		List<Produto> list = new ArrayList<Produto>();
		
		list.add(new Produto(1L , "Geladeira", 128.78, 3));
		list.add(new Produto(2L, "TV", 652.09, 2));
		list.add(new Produto(3L, "Fogão", 439.34, 1));
		list.add(new Produto(4L, "Sofá", 324.87, 4));
		list.add(new Produto(5L, "Micro_Ondas", 348.01, 1));
		list.add(new Produto(6L, "Home Theater", 1652.09, 2));
		list.add(new Produto(7L, "Caixa Bob", 1439.34, 1));
		list.add(new Produto(8L, "Aspiradó", 761.83, 3));
		list.add(new Produto(9L, "cama", 365.98, 2));
		list.add(new Produto(10L, "armario", 1239.02, 1));
		list.add(new Produto(11L, "mini System", 546.87, 5));
		
		
		
		//list.sort((p1, p2) -> p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase()));
		
		/*
		 * for (Produto produto : list) { System.out.println(produto); }
		 */
		
		//list.sort((a, b) -> a.getNome().toUpperCase().compareTo(b.getNome().toUpperCase()));
		 // list.sort(Comparator.comparing(Produto::getNome));
list.stream().sorted((a, b) -> a.getNome().toUpperCase().compareTo(b.getNome().toUpperCase()))
                            // .map(a -> a.getNome().substring(0).toUpperCase())
                              .map(a -> a.getNome().replaceFirst(regex, replacement))
		                     .forEach(System.out::println);
		
		System.out.println();
		list.forEach(System.out::println);
	}

}
