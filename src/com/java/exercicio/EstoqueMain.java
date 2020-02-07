package com.java.exercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EstoqueMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Produto produto = new Produto();
		List<Produto> list = new ArrayList<>();
		char letra = 's';
		int x = 1;
		boolean flag = true;

	//	do {
			
			
							
				System.out.println("Digete o nome do Produto:");
				produto.setNome(sc.nextLine());

				System.out.println("Digete o Preço:");
				produto.setPreco(sc.nextDouble());

				System.out.println("Digete a qtd:");
				produto.setQtd(sc.nextInt());

				list.add(produto);

				//System.out.println("Deseja enserir mais um Porduto: s-n");
				//letra = sc.next().charAt(0);
				
			/*
			 * if (letra == 'n') { flag = false; } x++; }
			 */
		
		//} while (letra != 'n');
				System.out.println(produto);
		
		  System.out.println("Adicionar mais uma qtd: ");
		  int ff = sc.nextInt();
		  produto.adicionar(ff);
		  
		  System.out.println("Remover uma qtd: " + produto.getNome() + ": ");
		  int valor = sc.nextInt();
		  produto.remover(valor);
		  
		  System.out.println(produto);
		 
	}

}
