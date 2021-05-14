package com.java.string;

public class TestSplit {

	public static void main(String[] args) {
		String texto ="1; Arroz Carreteiro 1k; 7.98;30;";		
	
		String[] tex= texto.split(";");    
     
		/*
		 * Long num =Long.parseLong(tex[0]); String prod = tex[1]; double preco =
		 * Double.parseDouble(tex[2]); int num02 =Integer.parseInt(tex[3]);
		 * 
		 * System.out.println(num + " " + prod + " "+ preco +" " + num02);
		 */
  


Produto produto = new Produto(Long.parseLong(tex[0]), tex[1], Double.parseDouble(tex[2]), Integer.parseInt(tex[3]));

  System.out.println(produto);
	}

}
