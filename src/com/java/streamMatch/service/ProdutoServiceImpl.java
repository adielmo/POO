package com.java.streamMatch.service;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.java.streamMatch.entity.Produto;
import com.java.streamMatch.entity.ProdutoDto;
import com.java.streamMatch.entity.ProdutoEstoqueZeroDto;

public class ProdutoServiceImpl implements ProdutoService{

	@Override
	public boolean isValidoProdutoEstoqueIgualZero(List<Produto> produtos) {
		return produtos.stream().anyMatch(prod -> prod.getQtd() < 1);
	}

	@Override
	public List<String> obeterNomeProduto(List<Produto> produtos) {
		return produtos.stream().map(Produto::getName).collect(Collectors.toList());
		/*
		 * for (int i = 0; i < produtos.size(); i++) { return produtos.get(i).getName();
		 * }
		 */
	}

	@Override
	public List<String> obeterTipoProduto(List<Produto> produtos) {
		return produtos.stream().filter(name -> name.getName().startsWith("TV"))
                .map(Produto::getName)
                .collect(Collectors.toList());
	}

	@Override
	public List<ProdutoDto> buscarProdutoNamePreco(List<Produto> produtos) {
		return produtos.stream()
			       .map(x -> new ProdutoDto(x))
			       .sorted(Comparator.comparing(ProdutoDto::getPreco).reversed())
			       .collect(Collectors.toList());
	}

	@Override
	public List<ProdutoEstoqueZeroDto> buscarProdutoEstoqueMaiorZero(List<Produto> produtos) {
		return produtos.stream().filter(prod -> prod.getQtd() > 0)
                .sorted(Comparator.comparing(Produto::getQtd).reversed())
                .map(prod -> new ProdutoEstoqueZeroDto(prod))
                .collect(Collectors.toList());
	}

	@Override
	public BigDecimal totalProdutoEstoqueMaiorZero(List<Produto> produtos) {
		return	produtos.stream()
		        .filter(prod -> prod.getQtd() > 0)
		        .map(Produto::getValorTotalProduto)
		        .reduce(BigDecimal.ZERO, (atual, proximo) -> atual.add(proximo));
	}

	
}
