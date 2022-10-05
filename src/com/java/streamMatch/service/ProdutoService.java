package com.java.streamMatch.service;

import java.math.BigDecimal;
import java.util.List;

import com.java.streamMatch.entity.Produto;
import com.java.streamMatch.entity.ProdutoDto;
import com.java.streamMatch.entity.ProdutoEstoqueZeroDto;

public interface ProdutoService {
	
	boolean isValidoProdutoEstoqueIgualZero(List<Produto> produtos);
	List<String> obeterNomeProduto(List<Produto> produtos);
	List<String> obeterTipoProduto(List<Produto> produtos);
    List<ProdutoDto> buscarProdutoNamePreco(List<Produto> produtos);
	List<ProdutoEstoqueZeroDto> buscarProdutoEstoqueMaiorZero(List<Produto> produtos);
    BigDecimal totalProdutoEstoqueMaiorZero(List<Produto> produtos);
   
}
