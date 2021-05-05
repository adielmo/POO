package com.java.localDate;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class TestLocalDateTimeChronoUnit {

	public static void main(String[] args) {

		   LocalDateTime dateTime = LocalDateTime.of(1988, 7, 4, 0, 0);
		     LocalDateTime dateTime2 = LocalDateTime.now();
		     
			   LocalDateTime timeAnterior = LocalDateTime.of(2021, Month.MAY, 05, 10, 54);
			     LocalDateTime timeAtual = LocalDateTime.now();
		     
		     
		     long diffInNano = ChronoUnit.NANOS.between(dateTime, dateTime2);
		     long diffInSeconds = ChronoUnit.SECONDS.between(dateTime, dateTime2);
		     long diffInMilli = ChronoUnit.MILLIS.between(dateTime, dateTime2);
		    long diffInMinutes = ChronoUnit.MINUTES.between(dateTime, dateTime2);
		    long diffInHours = ChronoUnit.HOURS.between(dateTime, dateTime2);
		    
		    System.out.println("Minutos: " + ChronoUnit.MINUTES.between(timeAnterior, timeAtual));
		    
		    System.out.println("=========================//=================================");
		     System.out.println("NANOS: " + diffInNano);
		     System.out.println("SEGUNDOS: "+diffInSeconds);
		     System.out.println("MiliSegundos: "+diffInMilli);
		     System.out.println("Minutos: " + diffInMinutes);
		     System.out.println("Horas: " +diffInHours);
		
	}

}
