package com.java.character;

import java.util.ArrayList;
import java.util.List;

public class Teste02 {

	public static void main(String[] args) {

		  List<Integer> list =new ArrayList<>();
		  
		  list.add(2);
		  list.add(1);
		  list.add(null);
		  list.add(5);
		  list.add(10);
		  list.add(null);
		  list.add(7);
		  list.add(null);
		  list.add(8);
		  list.add(null);
		  list.add(null);
		  list.add(9);
		  list.add(8);
		  list.add(3);
		  list.add(4);
		  
			
			  list.forEach(x -> System.out.print(x+ " ")); list.removeIf(x -> x == null);
			  System.out.println();
			 

			  
		  
			
		
		  
		  list.stream().sorted().distinct().forEach(x -> System.out.print(x+ " "));
		  

	}
}
