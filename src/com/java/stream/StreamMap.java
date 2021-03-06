package com.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.java.live.Funcionario;

public class StreamMap {

	public static void main(String[] args) {

		Funcionario f = new Funcionario(1L, "João", 2564.25);
		Funcionario f2 = new Funcionario(2L, "Maria", 6578.65);
		Funcionario f3 = new Funcionario(3L, "Deco", 8971.51);
		Funcionario f4 = new Funcionario(4L, "Arthur", 9501.05);
		Funcionario f5 = new Funcionario(5L, "Pedro", 1478.65);
		Funcionario f6 = new Funcionario(6L, "Roberto", 3971.51);

		List<Funcionario> list = Arrays.asList(f, f2, f3, f4, f5, f6);
		System.out.println("Todos os Funcionários");
		list.stream().forEach(System.out::println);
		
		System.out.println("\nSomente os Funcionários");
		list.stream().map(x -> x.getNome()).forEach(System.out::println);
		//.collect(Collectors.toList());
		
		/*
		 * stream().flatMap 
		 * usando no caso, oneToMany 
		 * onde um Cliente tem uma list de algo
		 */
	}

}
