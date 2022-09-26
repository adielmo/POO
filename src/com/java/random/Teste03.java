package com.java.random;

import java.time.Duration;
import java.time.Instant;
import java.time.Period;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Teste03 {

	public static void main(String[] args) throws InterruptedException {
		Instant start = Instant.now(); 
		String nextString;
		Long count= 0L;
		String senha = "h54cfbh";
		boolean flag = false;
		long startTime = System.currentTimeMillis();
		
		do {
			// dorme por 1 segundos
			//TimeUnit.SECONDS.sleep(1);
	        
			flag = false;
			
		nextString = new Random().toString();
				
		if (!nextString.equals(senha)) {
			flag = true;
			count ++;
		}
		
		} while (count < 10 ||flag);
		  long endTime = System.currentTimeMillis();
		Instant end = Instant.now(); 
		
		System.out.println("Senha encotrada: "+nextString);
		System.out.println("Qtd: "+ count);
		System.out.println("Tempo de execução: "+ Duration.between(start, end));
		System.out.printf("Tempo de execução em Segundos: %.5f ms%n ", 
				(endTime- startTime)/1000d);
		System.out.println("Milesegundos: " + (endTime - startTime));

	}

}
