package com.java.stream;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.java.programacaoFuncional.Item;

public abstract class ClasseAbstract {

	public static List<Item> calcular(List<Item> prod) {

		return prod.stream().filter(a -> a.getNome().toUpperCase().charAt(0) == 'A').collect(Collectors.toList());

	}

	public static IntSummaryStatistics calcularMedia(List<Item> produtos) {

		return produtos.stream().collect(Collectors.summarizingInt(a -> a.getQtd().intValue()));

	}

	public static List<Item> ordenarProdutosPorNome(List<Item> produtos) {

		return produtos.stream().sorted(Comparator.comparing(Item::getNome).reversed()).collect(Collectors.toList());
	}

	public static List<Item> valorApartir(List<Item> produtos, double valor) {

		return produtos.stream()
				// .map(Produto::getPreco)
				.filter(a -> a.getPreco() > valor).collect(Collectors.toList());
	}

	public static List<Item> nomeComLetra(List<Item> produtos, char letra) {

		return produtos.stream().filter(a -> a.getNome().toLowerCase().charAt(0) == letra).collect(Collectors.toList());
	}

	public static BigDecimal valorPorLetra(List<Item> produtos, char letra) {

		return produtos.stream()
				       .filter(a -> a.getNome().toLowerCase().charAt(0) == letra)
				       .map(Item::getQtd)
				       .map(BigDecimal::new)
				       .reduce((a, b) -> a.add(b))
				       .orElse(null);

	}

	 static List<Item> ordenandoPorCodigo(List<Item> produtos) {
		
		return produtos.stream()
				       .sorted(Comparator.comparingLong(Item::getId))
				       .collect(Collectors.toList());
	}

	
	/*
	 * public static BigDecimal valorPorLetra(List<Produto> produtos, char letra) { 
	 * return produtos.stream() 
	 *                .filter(a -> a.getNome().toLowerCase().charAt(0) == letra)
	 *                .map(Produto::getPreco) 
	 *                .map(BigDecimal::new) 
	 *                .reduce(BigDecimal::add)
	 *                .orElse(null);
	 * 
	 * }
	 */

}
