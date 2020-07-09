package com.java.streamFuncional;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;

import com.java.programacaoFuncional.Item;
import com.java.stream.ClasseAbstract;

public class TesteAbstratc {
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

		List<Item> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12);
		
		// ClasseAbstract aa = new ClasseAbstract();

		// list.forEach(System.out::println);
	}

}
