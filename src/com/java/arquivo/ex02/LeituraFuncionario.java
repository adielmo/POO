package com.java.arquivo.ex02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LeituraFuncionario {
	public static void main(String[] args) {

		boolean flag = false;
		Scanner scanner = new Scanner(System.in);
do {
	flag = false;
	
		System.out.println("Entre com o path do file:");
		System.out.println("c:\\temp\\entrada.txt");
		String path = scanner.nextLine();

		System.out.println("Digete o salário");
		Double salario = scanner.nextDouble();

		System.out.println("Digete a primeira letra do Funcionario:");
		String nome = scanner.next();

		char letra = nome.toUpperCase().charAt(0);

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			List<Funcionario> list = new ArrayList<>();
			String line = br.readLine();

			while (line != null) {
				String[] fields = line.split(",");

list.add(new Funcionario(fields[0], Integer.parseInt(fields[1]), fields[2], fields[3].charAt(0),
						Double.parseDouble(fields[4])));

				line = br.readLine();
			}

list.stream().sorted((a, b) -> a.getEmail().compareTo(b.getEmail())).filter((a) -> a.getSalario() > salario)
					.forEach(System.out::println);

Double total = list.stream().filter(a -> a.getNome().toUpperCase().charAt(0) == letra)
					// .map(Funcionario :: getSalario)
					.mapToDouble(Funcionario::getSalario).reduce(0, (a, b) -> a + b);

			System.out.println();
			list.stream().filter(a -> a.getNome().toUpperCase().charAt(0) == letra).forEach(System.out::println);
			
			System.out.println(String.format("\nTotal de R$ %.2f\n", total));
			
		DoubleSummaryStatistics valoresSalario = list.stream().collect(Collectors.summarizingDouble(Funcionario::getSalario));
		
		System.out.println("Total R$ " + valoresSalario.getSum());
		System.out.println("Média R$ " + String.format("%.2f", valoresSalario.getAverage()));
		System.out.println("Qtd de Itens: " + valoresSalario.getCount());
		System.out.println("Menor preço R$ " + valoresSalario.getMin());
		System.out.println("Maior preço  R$ " + valoresSalario.getMax());
		

			/*
			 * list.stream() .sorted((a, b) -> a.getSexo().compareTo(b.getSexo()))
			 * .map(Funcionario::getSalario) .filter((a) -> a > 2500)
			 * .forEach(System.out::println);
			 */

			

		} catch (Exception e) {
			flag = true;
			System.out.println("Error !");
			scanner.nextLine();
		}
}while(flag);
		scanner.close();
	}

}
