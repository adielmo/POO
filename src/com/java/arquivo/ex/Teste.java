package com.java.arquivo.ex;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Teste {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("##,###.#####");
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy-HH:mm:ss");	
		
		Date dataAtual = new Date();
		String data = dateFormat.format(dataAtual);
		
		String path = "c:\\temp\\doc"+data+".txt";
		
		System.out.println(data);
		System.out.println(path);
	}

}
