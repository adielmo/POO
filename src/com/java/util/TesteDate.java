package com.java.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TesteDate {

	public static void main(String[] args) {
SimpleDateFormat formatDateTime = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
SimpleDateFormat formatDate = new SimpleDateFormat("dd-MM-yyyy");
            Date hoje = new Date();
		
		System.out.println(formatDateTime.format(hoje));
		System.out.println(formatDate.format(hoje));
	}

}
