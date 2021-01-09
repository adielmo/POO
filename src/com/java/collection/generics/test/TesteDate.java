package com.java.collection.generics.test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class TesteDate {

	public static void main(String[] args) {
		DateFormat format = new SimpleDateFormat("dd-MM-yyyy_HH:mm:ss");
		Random random = new Random();
		Date dateAtual = new Date();

		
		String dt = format.format(dateAtual);
		
		System.out.println(dt);
		System.out.println(random.nextInt(101));
		
		System.out.println("out_"+ random.nextInt(1001)+"_"+dt+".txt");

	}

}
