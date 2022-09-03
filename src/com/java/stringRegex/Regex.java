package com.java.stringRegex;

public class Regex {

	public static void main(String[] args) {
		String name = "yxxi";
		
		boolean nameValide = isNameValide(name);
		System.out.println(nameValide);
	}

	private static boolean isNameValide(String name) {
		
		return name.matches("x(?!y)");
	}

}
