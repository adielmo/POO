package com.java.dateUtil;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class TesteLocalDateTime {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss a z");
		LocalDateTime hojeHora = LocalDateTime.now();
		LocalDateTime data = LocalDateTime.of(2020, 3, 10, 12, 10, 25);
		String dt = "2019-05-15 12:02:14";// formato UTC

		System.out.println(hojeHora);
		System.out.println(data);
		//System.out.println(LocalDateTime.parse(dt));
		//System.out.println(sdf.format(hojeHora));
		
		System.out.println("=======================//==========================");		
		
		System.out.println("=======================//==========================");
		
		

		System.out.println("=======================//==========================");
		

		System.out.println("=======================//==========================");

	}

}
