package com.java.matrizes.ex;

import java.util.Scanner;

public class TesteMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int linhas, colunas, valor;
		boolean flag = true;

		Integer[][] tabela = entradaDeDadosDaTabela(sc);

		imprimirTodaTabela(tabela);

		validacaoDeValor(sc, flag, tabela);

	}
	
	

	private static void validacaoDeValor(Scanner sc, boolean flag, Integer[][] tabela) {
		int valor;
		do {
		
			System.out.println("Digete o valor a ser encotrado na Tabela:");
			valor = sc.nextInt();

			for (int i = 0; i < tabela.length; i++) {

				for (int j = 0; j < tabela[i].length; j++) {

					if (tabela[i][j] == valor) {

						imprimirDados(valor, tabela, i, j);
						flag = false;

					} 

				}

			}
			if (flag) {
				System.out.printf("Não encotrado na Tabela o valor de %d!\n", valor);
				
			}

		} while (flag);
	}

    private static void imprimirDados(int valor, Integer[][] tabela, int i, int j) {
	
System.out.printf("Posição do valor %d na Tabela é, Linha %d, Coluna %d:\n", valor, i, j);

	
	if (j > 0 ) {
		System.out.printf("Valor %d na Tabela tem ao seu lado Esquerdo %d:\n", valor, tabela[i][j - 1]);
	}

	if (j < tabela[i].length - 1) {
		System.out.printf("Valor %d na Tabela tem ao seu lado Direita %d:\n", valor, tabela[i][j + 1]);
	}

	if (i < tabela.length - 1) {
		
		System.out.printf("Valor %d na Tabela tem a Baixo %d:\n\n", valor, tabela[i + 1][j]);
	}
	if (i > 0) {
		System.out.printf("Valor %d na Tabela tem a Cima %d:\n\n", valor, tabela[i - 1][j]);
	}
		
	}

	private static Integer[][] entradaDeDadosDaTabela(Scanner sc) {
		int linhas;
		int colunas;
		int valor;
		System.out.println("Quantidades de Linhas:");
		linhas = sc.nextInt();

		System.out.println("Quantidade de Colunas:");
		colunas = sc.nextInt();

		Integer[][] tabela = new Integer[linhas][colunas];

		for (int i = 0; i < tabela.length; i++) {

			for (int j = 0; j < tabela[i].length; j++) {
				System.out.printf("Digete o valor da Linha %d e da Coluna %s:\n", i, j);
				valor = sc.nextInt();

				if (tabela[i][j] == null) {

					tabela[i][j] = valor;
				}

			}
		}
		return tabela;
	}

	private static void imprimirTodaTabela(Integer[][] tabela) {
		for (int i = 0; i < tabela.length; i++) {

			for (int j = 0; j < tabela[i].length; j++) {

				System.out.print(tabela[i][j] + " ");

			}
			System.out.println();
		}
	}

}
