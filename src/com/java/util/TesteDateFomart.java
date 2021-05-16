package com.java.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import com.java.stream.Calcular;

public class TesteDateFomart {

	public static void main(String[] args) {
       
		Date date = new Date();
		String dateFormat = DateFormat.getInstance().format(date);
		String horaDateFormat = DateFormat.getTimeInstance().format(date);
		String dataCurta = DateFormat.getTimeInstance(DateFormat.SHORT).format(date);
		String dataMed = DateFormat.getTimeInstance(DateFormat.MEDIUM).format(date);
		String dataLong = DateFormat.getTimeInstance(DateFormat.LONG).format(date);
		String dateHora= DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.SHORT).format(date);
		String hoje = "12-05-2021 02:23";

	try {
		Date dia=DateFormat.getInstance().parse(hoje);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dia);
		System.out.println(calendar);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    //Locale.setDefault(new Locale("pt", "Brazil"));
	//Locale.setDefault(new Locale("en", "US"));
		
		System.out.println(date);
		System.out.println(Locale.getDefault());
		System.out.println("Date Comp: "+dateFormat);
		System.out.println("Hora Comp: "+horaDateFormat);
		System.out.println("Hora Curta: "+ dataCurta);
		System.out.println("Medium: " + dataMed);
		System.out.println("Long: " + dataLong);
        System.out.println("Date & Hora: " + dateHora);
		

	}

}
