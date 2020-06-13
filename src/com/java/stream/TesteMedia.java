package com.java.stream;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class TesteMedia {
	
	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("0.##");
		
		Item item = new Item(58L, 35, 29.09, "Casa");
		Item item2 = new Item(7L, 16, 33.19, "Lancha");
		Item item3 = new Item(1L, 9, 6.09, "Biscicleta");
		Item item4 = new Item(12L, 2, 39.81, "Moto");
		Item item5 = new Item(2L, 87, 18.34, "Ferro");
		Item item6 = new Item(8L, 10, 23.98, "Mouse");
		Item item7 = new Item(5L, 5, 59.08, "Teclado");
		Item item8 = new Item(1L, 2, 34.09, "Cadeira");
		
		List<Double> numeros = Arrays.asList(237.40, 4.05, 67.35, 8.24, 2.51, 687.12, 3.53, 51.3);
		
		List<Item> itens = Arrays.asList(item, item2, item3, item4, item5, item6, item7, item8);
		
	//Double ss= itens.stream().collect(Collectors.averagingDouble(a -> a.getQtd().intValue()));
DoubleSummaryStatistics teste = itens.stream().collect(Collectors.summarizingDouble(a -> a.getPreco().doubleValue()));
IntSummaryStatistics teste02 = itens.stream().collect(Collectors.summarizingInt(a -> a.getQtd().intValue()));
	



   
		/*
		 * System.out.println("Média: "+ df.format(teste.getAverage()));
		 * System.out.println("Qtd: "+teste.getCount()); System.out.println("Soma: "+
		 * df.format(teste.getSum())); System.out.println("Maior: "+
		 * df.format(teste.getMax())); System.out.println("Menor: "+
		 * df.format(teste.getMin()));
		 * 
		 * System.out.println("==================================");
		 * 
		 * System.out.println("Média: "+ df.format(teste02.getAverage()));
		 * System.out.println("Qtd: "+teste02.getCount()); System.out.println("Soma: "+
		 * df.format(teste02.getSum())); System.out.println("Maior: "+
		 * df.format(teste02.getMax())); System.out.println("Menor: "+
		 * df.format(teste02.getMin()));
		 */


	}

}
