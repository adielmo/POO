package com.java.random;

import java.time.Duration;
import java.time.Instant;
import java.time.Period;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Teste02 {

	public static void main(String[] args) throws InterruptedException {
		Instant start = Instant.now(); 
		Integer nextInt;
		Long count= 0L;
		int senha = 5641;
		boolean flag = false;
		long startTime = System.currentTimeMillis();
		
		do {
			// dorme por 1 segundos
			//TimeUnit.SECONDS.sleep(1);
	        
			flag = false;
			
		nextInt = new Random().nextInt(100000000);
		
		if (nextInt != senha) {
			flag = true;
			count ++;
		}
		
		} while (flag);
		  long endTime = System.currentTimeMillis();
		Instant end = Instant.now(); 
		
		System.out.println("Senha encotrada: "+nextInt);
		System.out.println("Qtd: "+ count);
		System.out.println("Tempo de execução: "+ Duration.between(start, end));
		System.out.printf("Tempo de execução em Segundos: %.5f ms%n ", 
				(endTime- startTime)/1000d);
		System.out.println("Milesegundos: " + (endTime - startTime));

	}

}
