package com.java.string;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TesteLivro {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		System.out.println("Entre com o path do file:");
		System.out.println("c:\\temp\\atelie-catalogo-produtos.csv");
		String path = scanner.nextLine();

		try (BufferedReader bf = new BufferedReader(new FileReader(path))) {
			List<Livro> livros = new ArrayList<>();
			String linha = bf.readLine();

			while (count <= 5) {linha = bf.readLine();count++;}

			while (linha != null) {
				String[] fields = linha.split(";");
				String valor = fields[4].substring(3);

				livros.add(new Livro(fields[0], fields[1], fields[2], fields[3],
						Double.parseDouble(valor.replace(",", "."))));
				linha = bf.readLine();

			}
			count++;
			/*
			 * for(int i=0; i < livros.size(); i++) {
			 * System.out.println((i+1)+"º: "+livros.get(i)); }*:/
			 * 
			 * /* if (!livros.isEmpty()) { livros.forEach(System.out::println);
			 * 
			 * }
			 */
			System.out.println("-------------------------------//----------------------------------");

			List<String> listAssunto = livros.stream().filter(x -> x.getAssunto().contains("Poesia"))
					.map(Livro::getAssunto).collect(Collectors.toList());
			List<Livro> livroAutor = livros.stream().filter(x -> x.getAutor().equalsIgnoreCase("Lincoln Secco"))
					.collect(Collectors.toList());// .forEach(System.out::println);;
			double qtd = livros.stream().count();
			List<String> autores = livros.stream().distinct().limit(10).map(Livro::getAutor).sorted()
					.collect(Collectors.toList());
			double valores = livros.stream().mapToDouble(Livro::getValor).reduce(0, (a, b) -> a + b);

			autores.forEach(System.out::println);
			System.out.println(String.format("Quantidade de Autores: %.0f", qtd));
			System.out.println(String.format("Valor Total : R$ %.2f", valores));
			System.out.println(String.format("Média de valores: R$ %.2f", (valores / qtd)));

			//livroAutor.forEach(i -> System.out.println(i));
			//listAssunto.forEach(i -> System.out.println(i));

		} catch (Exception e) {
			System.out.println("Error !!" + e.getMessage());
		}

	}
}
