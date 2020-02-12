package com.java.herancaPolimorfismo.ex02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class TesteProduto {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		int qtd;
		boolean flag = false;

		System.out.println("Quantidade de Produtos:");
		qtd = sc.nextInt();
		List<Produto> produtos = new ArrayList<>();

		for (int i = 1; i <= qtd; i++) {
			sc.nextLine();
			do {
				 flag =false;
				System.out.println("Origem do Produto (c-i-u):");
				char letra = sc.nextLine().charAt(0);

				switch (letra) {
				case 'c':
				case 'i':
				case 'u':
				
					System.out.println("Nome do " + i + "º " + "Produto: ");
					String nome = sc.nextLine();

					System.out.println("Digete o Preço " + nome + " R$:");
					double preco = sc.nextDouble();

					if (letra == 'c') {

						produtos.add(new Produto(nome, preco));
						break;

					} else if (letra == 'u') {
						System.out.println("Entre com a Data de Fabricação (dd/MM/yyyy):");
						Date dataFabricacao = sdf.parse(sc.next());

						produtos.add(new ProdutoUsado(nome, preco, dataFabricacao));
						break;

					} else if (letra == 'i') {
						System.out.println("Entra com Taxa de Alfandega R$:");
						double taxaAlfandega = sc.nextDouble();

						produtos.add(new ProdutoImportado(nome, preco, taxaAlfandega));

					}

					break;

				default:
					flag = true;
					break;
				}

			} while (flag);

		}
		
		for(int i=0; i < produtos.size(); i++) {
			System.out.println((i+1) + "º " + produtos.get(i));
		}
	}

}
