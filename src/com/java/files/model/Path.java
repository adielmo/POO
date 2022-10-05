package com.java.files.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Path {
	
	DateFormat dDate = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
	Date date = new Date();
	String dateFormat = dDate.format(date);
	String replaceAll = dateFormat.replaceAll("[: -]", "");
	
	
public static final String PATHIN = "C:\\Users\\Escritorio 01\\Downloads\\Rede\\projetoJavaTwlio\\customers.csv";
//public static String PATHOUT = "C:\\Users\\Escritorio 01\\Downloads\\Rede\\projetoJavaTwlio\\"+"customers"+ 
		             //   new Random().nextInt(100)+"-"+replaceAll+".csv";
	
	


}
