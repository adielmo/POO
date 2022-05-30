package com.java.string;

public class Split {

	public static void main(String[] args) {

		String frase = "How to split a string only on the first occurrence of delimiter in Java";
		String[] names = null;
		int count = 0;
		while (frase.length() > count) {
			names = frase.split(" ");
			count++;
		}
		for (int i = 0; i < names.length; i++) {
			if (names.length - 1 > i) {
				System.out.print(names[i] + "-");
			}
			else {
				System.out.print(names[i]);
			}

			
		}

	}

}
