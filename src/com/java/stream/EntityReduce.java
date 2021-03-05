package com.java.stream;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.java.live.Funcionario;

public class EntityReduce {
	
	public static void main(String[] args) {
		 Funcionario f = new Funcionario(1L, "João", 2564.25);
		 Funcionario f2 = new Funcionario(2L, "Maria", 6578.65);	
		 Funcionario f3 = new Funcionario(3L, "Deco", 8971.51);
		 Funcionario f4 = new Funcionario(4L, "Arthur", 9501.05);
		 Funcionario f5 = new Funcionario(5L, "Pedro", 1478.65);	
		 Funcionario f6 = new Funcionario(6L, "Roberto", 3971.51);		 
		 
		List<Funcionario> list = Arrays.asList(f, f2, f3, f4, f5, f6);
		
		 System.out.println("Valor de todos os Funcionarios:");
		  list.stream()
		      .map(Funcionario::getSalario)
		      .reduce(Double::sum)      		    
		      .ifPresent(System.out::println);
		  
		   
		  System.out.println("\nMédia Sálarial Double:");
		  list.stream()
		      .mapToDouble(Funcionario::getSalario)
		      .average()
		      .ifPresent(System.out::println);
		  
	
		      
		      
		  /*
		  System.out.println("\nTodos os Funcionarios:");
		  list.stream().forEach(System.out::println);
		  
		  String head = "\nTodos os Funcionarios oredenados pelo Salário:";
		  System.out.println(head.toUpperCase());
		  list.stream().sorted(Comparator.comparing(Funcionario::getNome).reversed())
		               .forEach(System.out::println);
		               
		               */
	}

}
