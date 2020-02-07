package com.java.exercicio.correcao02;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteLoja {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<Produto> list = new ArrayList<>();
		String nome="";
		double preco;
		int qtd;
		Produto p5 = new Produto();
		
		System.out.println(p5.getValor());
		
		p5.setValor(new BigDecimal(45));
		System.out.println(p5.getQtd());
		System.out.println(p5.getValor().subtract(new BigDecimal(p5.getQtd())));
		System.out.println("Nome: " + p5.getNome());
		
		System.out.println("Digete do produto: ");
		nome= sc.nextLine();
		p5.setNome(nome);
		System.out.println("Nome: " + p5.getNome());
/*		
		System.out.println("Digite a Qtd: ");
		qtd =sc.nextInt();
		
		System.out.println("Digete o preço: ");
		preco =sc.nextDouble();
		
		Produto p = new Produto(nome, preco, qtd);
		//list.add(p);
		System.out.println("========================//=======================");
		System.out.println(p);
		System.out.println("========================//=======================");
		System.out.println("Adicionar mais quantas "+ p.getNome() + ": ");
		qtd = sc.nextInt();
		p.adicionarProduto(qtd);
		System.out.println("Remover mais quantas "+ p.getNome() + ": ");
		qtd = sc.nextInt();
	    System.out.println(p.removerProduto(qtd));
	    System.out.println("========================//=======================");
	    System.out.println(p);
*/
		
	}

}
