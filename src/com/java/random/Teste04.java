package com.java.random;

import java.util.UUID;

public class Teste04 {

	public static void main(String[] args) {
		//Random random = new Random();
		  String string = UUID.randomUUID().toString();
		  String replaceAll = string.replaceAll("[^0-9]", "");
		  String replace = string.replace("a", "A");
		  String replaceAll2 = string.replaceAll("[-]", "");
		  //String replaceFirst = string.replaceFirst("a", "A");
		  
		  System.out.println(string);
		  System.out.println(replaceAll);
		  System.out.println(replace);
		  System.out.println(replaceAll2);
		
		
		
		/*
		 * String nextString = random.toString(); int nextInt = random.nextInt(10);
		 * double nextDouble = random.nextDouble();
		 * 
		 * System.out.println(nextString); System.out.println(nextInt);
		 * System.out.println(nextDouble);
		 */

	}

}
