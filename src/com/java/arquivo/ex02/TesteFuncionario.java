package com.java.arquivo.ex02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TesteFuncionario {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Entre com o path do file:");
		System.out.println("c:\\temp\\ex.txt");
		String path = scanner.nextLine();
		
		System.out.println("Digete o salário");
		Double salario = scanner.nextDouble();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			List<Funcionario> list = new ArrayList<>();
			String line = br.readLine();

			while (line != null) {
				String[] fields = line.split(",");


				list.add(new Funcionario(fields[0], Integer.parseInt(fields[1]), fields[2], fields[3].charAt(0),
						Double.parseDouble(fields[4])));
				
				line = br.readLine();
			}
			
List<Funcionario> func = list.stream()
    .sorted((a, b) -> a.getEmail().compareTo(b.getEmail()))
    .filter((a) -> a.getSalario() > salario)
    .collect(Collectors.toList());

func.forEach(System.out::println);
			

		} catch (Exception e) {
			System.out.println("Error !");
		}
scanner.close();
	}

}
