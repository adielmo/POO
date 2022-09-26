package com.java.switchcase;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.stream.IntStream;

public class Teste01 {
	
	public static void main(String[] args) {
	List<Integer> listInt = new ArrayList();	
		
	
		for (int i = 0; i < 15; i++) {
			int inteiro = new Random().nextInt(100);
			listInt.add(inteiro);
			
		}
listInt.forEach(i -> {
	System.out.println("Valor: " + i);
});
	
		
	}

}
