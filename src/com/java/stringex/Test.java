package com.java.stringex;

public class Test {

	public static void main(String[] args) {
		String placa = "hxn548*";
		String aa = placa.replaceAll("[^a-zA-Z0-9]", "");

		System.out.println(placa);
		System.out.println(aa);

	}

}
