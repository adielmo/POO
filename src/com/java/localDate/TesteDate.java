package com.java.localDate;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class TesteDate {

	public static void main(String[] args) {
		
		
		 LocalDate dateOfBirth = LocalDate.of(1980, Month.JULY, 4);
	     LocalDate currentDate = LocalDate.now();
	     
	     long diffInDays = ChronoUnit.DAYS.between(dateOfBirth, currentDate);
	     long diffInMonths = ChronoUnit.MONTHS.between(dateOfBirth, currentDate);
	     long diffInYears = ChronoUnit.YEARS.between(dateOfBirth, currentDate);
	     
	     System.out.println(diffInDays);
	     System.out.println(diffInMonths);
	     System.out.println(diffInYears);


	}

}
