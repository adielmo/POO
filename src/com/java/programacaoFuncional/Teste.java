package com.java.programacaoFuncional;

import java.util.ArrayList;
import java.util.List;

public class Teste {
	
	public static void main(String[] args) {
		
		List<Produto> list = new ArrayList<Produto>();
		
		list.add(new Produto("Geladeira", 128.78, 3));
		list.add(new Produto("TV", 652.09, 2));
		list.add(new Produto("Fogão", 439.34, 1));
		list.add(new Produto("Sofá", 324.87, 4));
		list.add(new Produto("Micro_Ondas", 348.01, 1));
		list.add(new Produto("Home Theater", 1652.09, 2));
		list.add(new Produto("Caixa Bob", 1439.34, 1));
		list.add(new Produto("Aspiradó", 761.83, 3));
		
		
		
		//list.sort((p1, p2) -> p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase()));
		
		/*
		 * for (Produto produto : list) { System.out.println(produto); }
		 */
		list.sort((p1, p2) -> p1.getQtd().compareTo(p2.getQtd()));
		list.forEach(System.out::println);
	}

}
