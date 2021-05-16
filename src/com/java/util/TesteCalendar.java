package com.java.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TesteCalendar {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy HH:mm:ss a z");
		SimpleDateFormat sdf02 = new SimpleDateFormat("dd/MM/yyyy");

		Calendar calendar = Calendar.getInstance();
		GregorianCalendar gregorianCalendar = new GregorianCalendar();
		Calendar cal = new GregorianCalendar(2021, 4, 14, 21, 07, 56);
		String data = "14/05/2021";
		
		try {
			Date date = sdf02.parse(data);
			System.out.println("Date Parse: " + sdf.format(date));
		} catch (ParseException e) {

			e.printStackTrace();
		}
		// Metodo para saber se o ano é bisexto, retorn o boolean
		System.out.println(gregorianCalendar.isLeapYear(2024));
		System.out.println(sdf.format(cal.getTime()));

	}

	public static void imprimirCaledar(Calendar calendar) {
		int ano = calendar.get(Calendar.YEAR);
		int mes = calendar.get(Calendar.MONDAY);
		int dia = calendar.get(Calendar.DAY_OF_MONTH);
		int hora = calendar.get(Calendar.HOUR_OF_DAY);
		int minutos = calendar.get(Calendar.MINUTE);
		int segundos = calendar.get(Calendar.SECOND);

		System.out.println(dia + "-" + "0" + (mes + 1) + "-" + ano);
		System.out.printf("Ano de %d do mês %d do dia %d, hora de %d:%d:%d", ano, (mes + 1), dia, hora, minutos,
				segundos);
		System.out.println();
	}

}
