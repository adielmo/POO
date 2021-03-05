package com.java.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.java.live.Funcionario;

public class StreamMaxMinAvarageLimit {
	
	public static void main(String[] args) {
		 Funcionario f = new Funcionario(1L, "João", 2564.25);
		 Funcionario f2 = new Funcionario(2L, "Maria", 6578.65);	
		 Funcionario f3 = new Funcionario(3L, "Deco", 8971.51);
		 Funcionario f4 = new Funcionario(4L, "Arthur", 9501.05);
		 Funcionario f5 = new Funcionario(5L, "Pedro", 1478.65);	
		 Funcionario f6 = new Funcionario(6L, "Roberto", 3971.51);
		 
		 
		List<Funcionario> list = Arrays.asList(f, f2, f3, f4, f5, f6);
		 System.out.println("Menor Sálario:");
		  list.stream().min(Comparator.comparing(Funcionario::getSalario))
		 .ifPresent(System.out::println);
		  
		  System.out.println("Maior Sálario:");
		  list.stream().max(Comparator.comparing(Funcionario::getSalario))
		      .ifPresent(System.out::println);
		  
		  System.out.println("Os Dois 1º funcionarios:");
		   list.stream()
		       .skip(2)
		       .forEach(System.out::println);
		   
			  System.out.println("Pula os dois primeiro funcionarios:");
			   list.stream()
			       .distinct()
			       .forEach(System.out::println);
			   
			   System.out.println("\nTrás os 5 primeiros funcionarios:");
			   list.stream()
			       .limit(5)
			       .forEach(System.out::println);
	}
}
