package com.java.localDate;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TesteDateTime {

	public static void main(String[] args) {
SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
DateTimeFormatter fDateTime = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
DateTimeFormatter fDate = DateTimeFormatter.ofPattern("dd-MM-yyyy");

		LocalDateTime dateTime = LocalDateTime.now();
		LocalDate date = LocalDate.now();
		
		System.out.println(date.format(fDate));
		System.out.println(dateTime.format(fDateTime));
		
	}

}
