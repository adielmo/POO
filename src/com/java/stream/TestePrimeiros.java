package com.java.stream;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.java.programacaoFuncional.Produto;

public class TestePrimeiros{
	
	
	
	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("##,###.#####");
		
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
		
List<Produto> pp = produtos.stream()

		.sorted(Comparator.comparingDouble(Produto::getPreco))
		//.reversed())
		//.filter((p) -> p.si)
		//.limit(2)
		.collect(Collectors.toList());

pp.forEach(System.out::println);


Optional<BigDecimal> valorBigDecimal = produtos.stream()
        .map(Produto::getPreco)
        .map(BigDecimal::new)
        .reduce((valor01, valor02) -> valor01.add(valor02));

        
DoubleSummaryStatistics teste = produtos.stream()
                                        .collect(Collectors.summarizingDouble((a) -> a.getPreco().doubleValue()));
/*
System.out.println("\nValor Total em Double: R$" + df.format(teste.getSum()));
System.out.println("Média Total: R$" + df.format(teste.getAverage()));
System.out.println("Qtd de Produtos: " + df.format(teste.getCount()));
System.out.println("Maior valor: " + df.format(teste.getMax()));
System.out.println("Menor valor: " + df.format(teste.getMin()));
System.out.println("\nValor Total BigDecimal: R$ " + df.format(valorBigDecimal.get()));
*/		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * List<Double> pp = produtos.stream() .map(Produto::getPreco)
		 * .sorted(Comparator.reverseOrder()) .limit(3) .collect(Collectors.toList());
		 * // .forEach(System.out::println);
		 * 
		 * pp.forEach(System.out::println);
		 */
	}

}
