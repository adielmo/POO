package com.java.stringdate;

import java.time.format.DateTimeFormatter;

public class Teste01 {

	public static void main(String[] args) {
		String formatData ="dd/MM/yyyy";
DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(formatData);
		String data = "20010101";
		String dataFormatada =  data.subSequence(0, 4)
				              +"/"+data.subSequence(4, 6)
				              +"/"+data.substring(6);
		
		System.out.println(dataFormatada);
		//LocalDate date =  LocalDate.parse(data, dateTimeFormatter);
		
		//System.out.println(dateTimeFormatter.format(LocalDate.));

	}

}
