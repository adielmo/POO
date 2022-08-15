package com.java.streamTeste;

import java.util.Arrays;
import java.util.List;

public class Stream02 {

	public static void main(String[] args) {

		System.out.println("======Stream Acumulador Reduce======");
		 Integer total = acumulador(Arrays.asList(5, 56, 6, 8, 58, 4));
		 Integer total02 = acumulador02(Arrays.asList(5, 56, 6, 8, 58, 4));
		 
		 
		 System.out.println(total02);
		
		
		
		        
		
	}

	

	private static Integer acumulador02(List<Integer> asList) {
		return asList.stream().reduce(0, Integer::sum);
	}

	private static Integer acumulador(List<Integer> asList) {
		return asList.stream().reduce(0,(x, y) -> x +y);
	}

}
