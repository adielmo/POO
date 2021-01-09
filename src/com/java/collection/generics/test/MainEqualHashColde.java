package com.java.collection.generics.test;

import com.java.collection.generics.Client;

public class MainEqualHashColde {
	
	public static void main(String[] args) {
		String a = new String("Test");
		String b = new String("Test");
		
		
		Client c = new Client("Maria", "maria@gmail.com");
		Client c1 = new Client("Maria", "maria@gmail.com");
		
		System.out.println(c.equals(c1));
		System.out.println(c.hashCode());
		System.out.println(c1.hashCode());
		System.out.println(c1.equals(c));
		System.out.println("Test: " + a == b);
	}

}
