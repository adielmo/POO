package com.java.programacaoFuncional;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparadorTeste {
	public static void main(String[] args) {

		// List<Produto> list = new ArrayList<Produto>();

		Produto p1 = new Produto("Feijão", 12.57, 12);
		Produto p2 = new Produto("Arroz", 15.78, 19);
		Produto p3 = new Produto("Acuçar", 2.49, 7);
		Produto p4 = new Produto("Café", 11.75, 23);
		Produto p5 = new Produto("Cerveja", 4.98, 38);
		Produto p6 = new Produto("Refrigerante", 7.89, 41);

		List<Produto> list = Arrays.asList(p1, p2, p3, p4, p5, p6);
		// Collections.sort(list);

		/*
		 * Comparator<Produto> comp = new Comparator<Produto>() {
		 * 
		 * @Override public int compare(Produto p1, Produto p2) {
		 * 
		 * return -p1.getQtd().compareTo(p2.getQtd()); } };
		 */

		Comparator<Produto> comparador = (p1, p2) -> {
			return p1.getNome().toUpperCase().compareTo(p2.getNome());
		};

		list.sort(comparador);

		for (Produto produto : list) {
			System.out.println(produto);
		}

	}

}
