package com.java.localDate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TesteAfter {

	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		Scanner scanner = new Scanner(System.in);
		LocalDate dateNascimento;
		String stringDate = "23-12-1984";
		
		System.out.println("Digete a Data, nesse formato: dd-MM-yyyy");
		//String nextDate = scanner.next();
		dateNascimento = LocalDate.parse(stringDate, dtf);
		
		
		
		System.out.println("Menos 1 dia: "+dateNascimento.minusDays(1));
		System.out.println("Mais 1 dia: "+dateNascimento.plusDays(1));
		
	
		System.out.println("Menos 1 Mes: "+dateNascimento.minusMonths(1));
		System.out.println("Mais 1 Mes: "+dateNascimento.plusMonths(1));
		
		System.out.println("=========================//===============");
		System.out.println("Menos 1 Ano: "+dateNascimento.minusYears(1));
		System.out.println("Mais 1 Ano: "+dateNascimento.plusYears(1));
		
		
		System.out.println("=========================//===============");
		System.out.println("Data Nascimento depois data atual:"
		                   +dateNascimento.isAfter(LocalDate.now()));
		System.out.println("Data Nascimento depois data atual:"
		                    +dateNascimento.isBefore(LocalDate.now()));
		 
		

	}

}
