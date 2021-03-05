package com.java.streamTeste;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

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
	  

	
	  
			         
			  
	}

}
