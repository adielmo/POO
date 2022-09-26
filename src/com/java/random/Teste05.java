package com.java.random;

import java.time.Duration;
import java.time.Instant;
import java.util.UUID;

public class Teste05 {

	public static void main(String[] args) {
		boolean flag = false;
		String senha = "e12b1d40b5c948bcbc9121a148474c4f";
		Long count = 0L;
		String uuidString;
		Instant start = Instant.now();
		
		 
		 do {
			 
			 flag=false;
			 String uuid = UUID.randomUUID().toString();
			 uuidString = uuid.replaceAll("[-]", "");
			 
			 if (!senha.equals(uuidString)) {
				 flag=true;
				count++;
			}
			//flag = verificarCount(count);
			
		} while (flag);
		 Instant end = Instant.now();
		 Duration between = Duration.between(start, end);
		 
		 System.out.println("Senha: "+ senha);
		 System.out.println("Encotrada: "+ uuidString);
		 System.out.println("Qtd: "+ count);
		 System.out.println("Tempo Execução: "+ between);
	}

	private static boolean verificarCount(Long count) {
		if (count > 1000000L) {
			return false;
		}
		return true;
	}

}
