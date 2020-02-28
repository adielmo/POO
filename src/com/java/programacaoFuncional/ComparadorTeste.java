package com.java.programacaoFuncional;

import java.util.ArrayList;
import java.util.List;

public class ComparadorTeste {
	public static void main(String[] args) {

		List<Produto> list = new ArrayList<>();

		Produto p1 = new Produto("Feijão", 12.57, 12);
		Produto p2 = new Produto("Arroz", 15.78, 19);
	/*	Produto p3 = new Produto("Acuçar", 2.49, 7);
		Produto p4 = new Produto("Café", 11.75, 23);
		Produto p5 = new Produto("Cerveja", 4.98, 38);
		Produto p6 = new Produto("Refrigerante", 7.89, 41);
		Produto p7 = new Produto("Det. Liquido", 1.97, 51);
		Produto p8 = new Produto("Sabonete", 2.39, 29);
		Produto p9 = new Produto("Desodorante", 15.71, 75);
		Produto p10 = new Produto("Espaguete", 3.75, 62);
		Produto p11 = new Produto("Queijo Prato", 27.89, 56);
		Produto p12 = new Produto("Picanha Bovina", 49.75, 15);*/
		//List<Produto> list = Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12);		
		
		  list.add(p1);
		  list.add(p2);
	/*	  list.add(p3);
		  list.add(p4);
		  list.add(p5);
		  list.add(p6);
		  list.add(p7);
		  list.add(p8);
		  list.add(p9);
		  list.add(p10);
		  list.add(p11);
		  list.add(p12);		*/	
		  
	/*	  int total =0;		  
		  for (int i = 0; i < list.size(); i++) {
			total += list.get(i).getQtd();
		}*/
  //int total = list.stream().reduce(0,(x, y) -> x + y.getQtd(), Integer::sum);
    double total = list.stream().mapToDouble(Produto::getPreco).reduce(0,(x, y) -> x * y);	  
		  
		  System.out.println(total);
		
		
	}

}
