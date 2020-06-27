package com.java.stream;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

import com.java.programacaoFuncional.Produto;

public class TesteList {
	
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("##,###.#####");
		// ClasseAbstract ca= new ClasseAbstract();
		char letra ='a';
		double valor = 40.43;
		
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
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12);
	
		
	List<Produto> dd = ClasseAbstract.calcular(produtos);
	IntSummaryStatistics media = ClasseAbstract.calcularMedia(produtos);
	List<Produto> ordemPorNome = ClasseAbstract.ordenarProdutosPorNome(produtos);
	List<Produto> valorMaior = ClasseAbstract.valorApartir(produtos, valor);
    List<Produto> produtoLetra = ClasseAbstract.nomeComLetra(produtos, letra);
    BigDecimal valorPorProduto = ClasseAbstract.valorPorLetra(produtos, letra);
    List<Produto> ordemProCodigo  = ClasseAbstract.ordenandoPorCodigo(produtos);
    
	
	
	//dd.forEach(System.out::println);
	//System.out.println();
	//ordem.forEach(System.out::println);	
	//valorMaior.forEach(System.out::println);
    //produtoLetra.forEach(System.out::println);   
    //ordemPorNome.forEach(System.out::println);
    //produtos.forEach(System.out::println);
     ordemProCodigo.forEach(System.out::println);
    System.out.println();
    System.out.println("Qtd dos Produtos q começam com a letra " + letra + " R$: " + df.format(valorPorProduto));
	
	/*
	System.out.println("\nValor Total em Double: R$" + df.format(media.getSum()));
	System.out.println("Média Total: R$" + df.format(media.getAverage()));
	System.out.println("Qtd de Produtos: " + df.format(media.getCount()));
	System.out.println("Maior valor: " + df.format(media.getMax()));
	System.out.println("Menor valor: " + df.format(media.getMin()));
*/
		
	}

}
