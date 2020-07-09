package com.java.streamFuncional;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

import com.java.programacaoFuncional.Item;

public class ClassSummaryStaticics {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("##,###.#####");

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
		Item p13 = new Item(5L, "Pão Frances", 1.99, 17);

		List<Item> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13);
		
		DoubleSummaryStatistics mediaAtributoPreco = produtos.stream().collect(Collectors.summarizingDouble(a -> a.getPreco().doubleValue()));
		IntSummaryStatistics mediaAtributoQtd = produtos.stream()
				                                        .collect(Collectors.summarizingInt(a -> a.getQtd().intValue()));
		System.out.println("Qtd:" + mediaAtributoQtd.getCount());
		System.out.println("Soma: " + mediaAtributoQtd.getSum());
		System.out.println("Média: " + df.format(mediaAtributoQtd.getAverage()));
		System.out.println("Maior valor: " + mediaAtributoQtd.getMax());
		System.out.println("Menor valor: " + mediaAtributoQtd.getMin());
		System.out.println("--------------------------");
		System.out.println("Qtd:" + mediaAtributoPreco.getCount());
		System.out.println("Soma: " + mediaAtributoPreco.getSum());
		System.out.println("Média: " + df.format(mediaAtributoPreco.getAverage()));
		System.out.println("Valor Máximo: " + mediaAtributoPreco.getMax());
		System.out.println("Valor Minino: " + mediaAtributoPreco.getMin());
		
	}

}
