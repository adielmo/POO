package com.java.streamMatch.entity;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import com.java.streamMatch.service.ProdutoService;
import com.java.streamMatch.service.ProdutoServiceImpl;
//https://www.oracle.com/br/technical-resources/articles/java-stream-api.html
public class TesteProduto {
	public static void main(String[] args) {
		List<Produto> produtos = new ArrayList<>();
		
		ProdutoService pc = new ProdutoServiceImpl();
		SalvaProdutos.addProdutos(produtos);
		
		var validoProdutoEstoqueIgualZero = pc.isValidoProdutoEstoqueIgualZero(produtos);
		var obeterNomeProduto = pc.obeterNomeProduto(produtos);
		var obeterTipoProduto = pc.obeterTipoProduto(produtos);
		var produtoDto = pc.buscarProdutoNamePreco(produtos);
		var estoqueMaiorZero = pc.buscarProdutoEstoqueMaiorZero(produtos);
		var totalProdutoEstoqueMaiorZero = pc.totalProdutoEstoqueMaiorZero(produtos);
		
		
		System.out.println(validoProdutoEstoqueIgualZero);
		
		System.out.println("--------//---------------------\n Lista Produto c/estoque maior zero.");
		estoqueMaiorZero.forEach(x -> System.out.println(x));
		System.out.println("--------//---------------------");
		System.out.println("Total Produto Estoque Maior Zero: "+totalProdutoEstoqueMaiorZero);
		System.out.println("--------//---------------------");
		produtoDto.forEach(x -> System.out.println(x));
		System.out.println("--------//---------------------");
		
		obeterNomeProduto.forEach(name -> {
			System.out.println(name);
		});
		System.out.println("--------//---------------------");
		obeterTipoProduto.forEach(x -> System.out.print(x+", "));
		System.out.println("\n--------//---------------------");
		
	}

	



}
