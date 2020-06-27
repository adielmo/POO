package com.java.stream;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.java.programacaoFuncional.Produto;

public abstract class ClasseAbstract {

	public static List<Produto> calcular(List<Produto> prod) {

		return prod.stream().filter(a -> a.getNome().toUpperCase().charAt(0) == 'A').collect(Collectors.toList());

	}

	public static IntSummaryStatistics calcularMedia(List<Produto> produtos) {

		return produtos.stream().collect(Collectors.summarizingInt(a -> a.getQtd().intValue()));

	}

	public static List<Produto> ordenarProdutosPorNome(List<Produto> produtos) {

		return produtos.stream().sorted(Comparator.comparing(Produto::getNome).reversed()).collect(Collectors.toList());
	}

	public static List<Produto> valorApartir(List<Produto> produtos, double valor) {

		return produtos.stream()
				// .map(Produto::getPreco)
				.filter(a -> a.getPreco() > valor).collect(Collectors.toList());
	}

	public static List<Produto> nomeComLetra(List<Produto> produtos, char letra) {

		return produtos.stream().filter(a -> a.getNome().toLowerCase().charAt(0) == letra).collect(Collectors.toList());
	}

	public static BigDecimal valorPorLetra(List<Produto> produtos, char letra) {

		return produtos.stream()
				       .filter(a -> a.getNome().toLowerCase().charAt(0) == letra)
				       .map(Produto::getQtd)
				       .map(BigDecimal::new)
				       .reduce((a, b) -> a.add(b))
				       .orElse(null);

	}

	 static List<Produto> ordenandoPorCodigo(List<Produto> produtos) {
		
		return produtos.stream()
				       .sorted(Comparator.comparingLong(Produto::getId))
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
