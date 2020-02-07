package com.java.exercicio.arrays;

import java.util.Scanner;

public class Teste02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome;
		double preco;
		double soma = 0;
		int qtdProduto;

		System.out.println("Quantos Produtos: ");
		int qtd = sc.nextInt();

		Produto[] p = new Produto[qtd];

		entradaDeDados(sc, p);
		saidaDeDados(p);
		
		System.out.printf("%nTotal de intes em Estoque: %d", calcularEstoque(p));
		System.out.printf("%nValor Total em R$: %.2f%n", calcularValoresDeEstoque(p));
		System.out.printf("\nMédia dos preços é: R$ %.2f", calcularValoresDeEstoque(p) / calcularEstoque(p));
	
	}

	private static void saidaDeDados(Produto[] p) {
		for (int i = p.length - 1; i >= 0; i--) {
			System.out.println(p[i].toString());
			System.out.println("Valor de " + p[i].getNome() + " em R$: " + calcularValoresDeEstoque(p, i));
		}
	}

	private static void entradaDeDados(Scanner sc, Produto[] p) {
		String nome;
		double preco;
		int qtdProduto;
		for (int i = 0; i < p.length; i++) {
			sc.nextLine();
			System.out.println("Digete o Nome do produto na possição " + i + " :");
			nome = sc.nextLine();

			System.out.printf("Digete o Preço do %s :\n", nome);
			preco = sc.nextDouble();

			System.out.printf("Digete q Qtd de %s :%n", nome);
			qtdProduto = sc.nextInt();

			p[i] = new Produto(nome, preco, qtdProduto);

		}
	}

	public static double calcularMedia(double soma, Produto[] p) {
		return soma / p.length;
	}

	public static double calcularValoresDeEstoque(Produto[] p) {
		double totalReais = 0;

		for (int i = 0; i < p.length; i++) {

			if (p[i] != null) {
				totalReais += (p[i].getQtd() * p[i].getPreco());
			}
		}
		return totalReais;

	}

	public static double calcularValoresDeEstoque(Produto[] p, int i) {
		double totalReais = 0;

		if (p[i] != null) {
			totalReais += (p[i].getQtd() * p[i].getPreco());

		}
		return totalReais;

	}

	public static int calcularEstoque(Produto[] p) {
		int totalItens = 0;
		for (int i = 0; i < p.length; i++) {
			totalItens += p[i].getQtd();
		}
		return totalItens;
	}


	/*
	 * for (int i = 0; i < p.length; i++) {
	 * 
	 * if (p[i] != null) {
	 * 
	 * soma += p[i].getPreco(); }
	 * 
	 * }
	 */

	

	/*
	 * for (Produto pp : p) { System.out.println(pp); }
	 */
}
