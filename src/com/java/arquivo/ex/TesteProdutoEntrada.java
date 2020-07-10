package com.java.arquivo.ex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TesteProdutoEntrada {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Entre com o path do file:");
		System.out.println("c:\\temp\\doc.txt");
		String path = scanner.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			List<Produto> list = new ArrayList<>();

			String line = br.readLine();

			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Produto(fields[0], Integer.parseInt(fields[1]), Double.parseDouble(fields[2])));

				line = br.readLine();

			}
		double avg = list.stream()
			    .map(p -> p.getPreco())			    
			    .reduce(0.0, (a, b) -> a + b) / list.size();
		System.out.println("Média de preços: " + String.format("%.2f", avg));
		
	List<String> nomes = list.stream()
		     .filter(p -> p.getPreco() < avg)
		     .sorted((a, b) -> -a.getNome().toUpperCase().compareTo(b.getNome().toUpperCase()))		     
		     .map(p -> p.getNome())
		     .collect(Collectors.toList());
	
	nomes.forEach(System.out::println);
	
	Long qtd = list.stream().count();
	System.out.println("Qtd: " + qtd);
	list.forEach(System.out::println);
	

		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
