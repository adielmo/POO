package com.java.localDate;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class TesteLocalDateTimeDuration {

	public static void main(String[] args) {
		
		LocalDateTime dateTime = LocalDateTime.of(1988, 7, 4, 0, 0);
	     LocalDateTime dateTime2 = LocalDateTime.now();
	     
	

	     
	     int diffInNano = java.time.Duration.between(dateTime, dateTime2).getNano();
	     long diffInSeconds = java.time.Duration.between(dateTime, dateTime2).getSeconds();
	     long diffInMilli = java.time.Duration.between(dateTime, dateTime2).toMillis();
	     long diffInMinutes = java.time.Duration.between(dateTime, dateTime2).toMinutes();
	     long diffInHours = java.time.Duration.between(dateTime, dateTime2).toHours();
	     
	     System.out.println("=========================//=================================");
	     System.out.println("NANOS: " + diffInNano);
	     System.out.println("SEGUNDOS: "+diffInSeconds);
	     System.out.println("MiliSegundos: "+diffInMilli);
	     System.out.println("Minutos: " + diffInMinutes);
	     System.out.println("Horas: " +diffInHours);
	
		  

	}

}
