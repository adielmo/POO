package com.java.math;

public class Palavra {

	public static void main(String[] args) {

		String name = "Arara";

		System.out.println(inverter(name));
		System.out.println(name.toLowerCase());

	}

	public static String inverter(String name) {
		String newName = "";
		StringBuilder  builder = new StringBuilder();

		for (int i = name.length() - 1; i >= 0; i--) {
			//newName += name.charAt(i);
			builder.append(name.charAt(i));
		}
		return  builder.toString().toLowerCase(); //newName.toLowerCase();
	}

}
