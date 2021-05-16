package com.java.util;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class TesteTimeZone {

	public static void main(String[] args) {
      //System.out.println(Locale.getDefault());
		
		Calendar calendar = Calendar.getInstance();
		TimeZone timeZone = calendar.getTimeZone();
		
		System.out.println(timeZone);
	TimeZone timeZoneSp= TimeZone.getTimeZone("America/Sao_Paulo");
	System.out.println(timeZone.getDisplayName());
	System.out.println(timeZone.getID());
	
	//Calendar 
		
		
		
		
	/*	String[] arrayFusoHoraio = TimeZone.getAvailableIDs();
		System.out.println("Fuso hórario");
		for (String string : arrayFusoHoraio) {
			System.out.println(string);
		}*/
	}

}
