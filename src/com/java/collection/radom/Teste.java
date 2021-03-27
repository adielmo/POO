package com.java.collection.radom;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Teste {

	public static void main(String[] args) {

		final int MIN =4;
		final int MAX = 5_000;
		
		//Random random = new Random();
		//ThreadLocalRandom.current().nextInt(MIN, MAX);
		int random =0;
		
		do {
	 random= ThreadLocalRandom.current().nextInt(MIN, MAX);
		
		}while(random != 82);
		
		System.out.println("Número sorteado é: " + random);
	}

}
