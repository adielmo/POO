package com.java.streamTeste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

import com.java.live.Funcionario;

public class MapReduce {

	public static void main(String[] args) {
	List<Integer> sum = Arrays.asList(12, 36, 5, 47, 0, 6, 1, 61, 154, 8264, 1, 12, 5);
	List<Integer> num = Arrays.asList(5, 3, 2, 3, 7, 1, 2);
			         sum.stream()
			            .filter(a -> a > 15)
			            .reduce((a, b) -> a + b)
			            .ifPresent(System.out::println);
			         
			       System.out.println();
			       
			         sum.stream()
			           .filter(a -> a % 2 != 0)
			            .skip(2)
			            .limit(10)
			            .distinct()
			            .reduce(Integer::sum)
			            .ifPresent(System.out::println);
			         System.out.println();
			         
			         num.stream()
			            .reduce((a, b) -> a * b)
			            .ifPresent(System.out::println);
			         
			         System.out.println();
	Integer val = num.stream().reduce(1, (a, b) -> a * b);
					                 
					                 
			 System.out.println(val);
			 System.out.print("Maior valor: ");   
			 
	sum.stream()
			   .mapToInt(x -> x)
			   .max()
			   .ifPresent(System.out::println);
	
	 System.out.print("Menor valor: "); 
	  sum.stream().mapToInt(x -> x).min().ifPresent(System.out::println);
	  
	//  List<Funcionario> list = new ArrayList<>();
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
	  
	  System.out.println("\nTodos os Funcionarios:");
	  list.stream().forEach(System.out::println);
	  
	  String head = "\nTodos os Funcionarios oredenados pelo Salário:";
	  System.out.println(head.toUpperCase());
	  list.stream().sorted(Comparator.comparing(Funcionario::getSalario))
	               .forEach(System.out::println);
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
			         
			      /*   num.stream()
			            .mapToDouble(Integer::new)
			            .forEach(System.out::println);
	}*/
	}

}
