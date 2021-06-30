package com.java.recursividade;

public class Palidromo {

	public static void main(String[] args) {
		boolean isValido = testPalidromo("sopapos");
		System.out.println(isValido);
		System.out.println(testPalidromo02("sopapos"));
	}

	public static boolean testPalidromo(String name) {
		String reverse="";
		
		for (int i = name.length()-1; i >= 0; i--) {
			reverse += name.toLowerCase().charAt(i);
		}
		//System.out.println(reverse);
		//System.out.println(name.toLowerCase());
		
		if (!reverse.equals(name.toLowerCase())) {
			return false;
	
		}
		return true;
	}

	
	public static boolean testPalidromo02(String name) {
		String reverse = "";

		for (int i = 0; i < name.length(); i++) {
			reverse += name.toLowerCase().charAt(i);
		}

		for (int i = reverse.length() - 1, j = 0; i > 0; i--, j++) {
			Character letraReverse = reverse.charAt(i);

			if (!letraReverse.equals(name.toLowerCase().charAt(j))) {
				return false;

			}
		}

		return true;
	}
	 
}
