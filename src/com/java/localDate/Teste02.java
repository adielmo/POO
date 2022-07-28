package com.java.localDate;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
/**
 * 
 * @author Adielmo
 *
 */
public class Teste02 {

	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		LocalDate dateNascimento;
		String stringDate = "23-12-1984";

		System.out.println("Digete a Data, nesse formato: dd-MM-yyyy");
		dateNascimento = LocalDate.parse(stringDate, dtf);
		
		System.out.println(dateNascimento);
		System.out.println("=========================//===============");
		/**
		 * ChronoUnit
		 */
		 


		  long betweenDays = ChronoUnit.DAYS.between(dateNascimento, LocalDate.now());
		  long betweenMonths = ChronoUnit.MONTHS.between(dateNascimento, LocalDate.now());
		  long betweenYears = ChronoUnit.YEARS.between(dateNascimento, LocalDate.now());
		  
		System.out.println("\nUsando ChronoUnit para calcular Datas: \nIdade em Ano: " +
		        betweenYears+"\nIdade em Mes:"+
				betweenMonths+"\nIdade em Dias:"+
		        betweenDays);

		System.out.println("=========================//===============");
		
		/**
		 * Period 
		 */
		Period betweenPeriod = Period.between(dateNascimento, LocalDate.now());
		
		System.out.println("\nUsando Period para Calcular Datas: \nIdade= "+
		                   betweenPeriod.getYears()+"/"+
				           betweenPeriod.getMonths()+"/"+
		                   betweenPeriod.getDays());

		System.out.println("=========================//===============");
		System.out.println("Calculando Idade de Maneira errada: " + 
		         (LocalDate.now().getYear() - dateNascimento.getYear()));
		System.out.println("=========================//===============");
		System.out.println("Qual sua Idade Ano: " + ChronoUnit.YEARS.between(dateNascimento, LocalDate.now()));

	}
}
