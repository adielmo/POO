package com.java.dateUtil;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class TesteTimeZone {

	public static void main(String[] args) {
		// System.out.println(Locale.getDefault());

		Calendar calendar = Calendar.getInstance();
		TimeZone timeZone = calendar.getTimeZone();

		System.out.println(timeZone);
		System.out.println(calendar);
		System.out.println("============//==========");
		TimeZone timeZoneSp = TimeZone.getTimeZone("America/Sao_Paulo");
		System.out.println(timeZone.getDisplayName());
		System.out.println(timeZone.getID());
		System.out.println("============//==========");

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss a z");
		System.out.println(sdf.format(calendar.getTime()));
		System.out.println("============//==========");

		Calendar calendarSp = Calendar.getInstance(timeZoneSp);
		System.out.println(sdf.format(calendarSp.getTime()));

		// Calendar

		/*
		 * String[] arrayFusoHoraio = TimeZone.getAvailableIDs();
		 * System.out.println("Fuso hórario"); for (String string : arrayFusoHoraio) {
		 * System.out.println(string); }
		 */
	}

}
