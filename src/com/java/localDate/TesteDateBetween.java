package com.java.localDate;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class TesteDateBetween {

	public static void main(String[] args) {
SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
DateTimeFormatter fDateTime = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
DateTimeFormatter fDate = DateTimeFormatter.ofPattern("dd-MM-yyyy");

		//LocalDateTime dateTime = LocalDateTime.now();
		//LocalDate dateAtual = LocalDate.of(2021, Month.MARCH, 12);
		//LocalDate dateAnterior = LocalDate.of(2021, Month.MARCH, 10);
		
		LocalDate dateAtual = LocalDate.parse("2021-02-05");
		LocalDate dateAnterior = LocalDate.parse("2021-01-04");

		System.out.println(ChronoUnit.DAYS.between(dateAtual, dateAnterior));
		//System.out.println(Period.between(dateAtual, dateAnterior));
	
		
		
		
	}

}
