package com.java.stream;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

import com.java.programacaoFuncional.Item;

public class TesteList {
	
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("##,###.#####");
		// ClasseAbstract ca= new ClasseAbstract();
		char letra ='a';
		double valor = 40.43;
		
		Item p1 = new Item(3L, "Feijão", 12.57, 12);
		Item p2 = new Item(5L, "Arroz", 15.78, 19);
		Item p3 = new Item(8L, "Acuçar", 2.49, 2);
		Item p4 = new Item(1L, "Café", 11.75, 23);
		Item p5 = new Item(9L, "Cerveja", 4.98, 38);
		Item p6 = new Item(7L, "Refrigerante", 7.89, 41);
		Item p7 = new Item(12L, "Det. Liquido", 1.97, 51);
		Item p8 = new Item(2L, "Sabonete", 2.39, 29);
		Item p9 = new Item(4L, "Desodorante", 15.71, 75);
		Item p10 = new Item(11L, "Espaguete", 3.75, 62);
		Item p11 = new Item(6L, "Queijo Prato", 27.89, 56);
		Item p12 = new Item(11L, "Picanha Bovina", 49.75, 165);
		
		List<Item> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12);
	
		
	List<Item> dd = ClasseAbstract.calcular(produtos);
	IntSummaryStatistics media = ClasseAbstract.calcularMedia(produtos);
	List<Item> ordemPorNome = ClasseAbstract.ordenarProdutosPorNome(produtos);
	List<Item> valorMaior = ClasseAbstract.valorApartir(produtos, valor);
    List<Item> produtoLetra = ClasseAbstract.nomeComLetra(produtos, letra);
    BigDecimal valorPorProduto = ClasseAbstract.valorPorLetra(produtos, letra);
    List<Item> ordemProCodigo  = ClasseAbstract.ordenandoPorCodigo(produtos);
    
	
	
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
