package com.java.stringex;

import java.util.Scanner;

public class TestePlacaAutomoveis {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
String placa ="";
boolean flag = false;
do {
System.out.println("Digete sua Placa de Automovél:\nEx:(JKS6542)");
 placa = scanner.next();
  flag = isValidePlaca(placa);
  
  
}while(!flag);

 imprimir(placa);
	}


	private static void imprimir(String placa) {
		StringBuilder builderPlaca = new StringBuilder(placa);
		builderPlaca.insert(placa.length()-4, "-");
		System.out.println(builderPlaca.toString().toUpperCase());
	}
//   placa = placa.replaceAll("[^a-zA-Z0-9]", "");

	private static boolean isValidePlaca(String placa) {
String newPLaca= placa.replaceAll("[^a-zA-Z0-9]", "");
		if (newPLaca.length() != 7) {
			return false;
		}
		if (!newPLaca.substring(0, 3).matches("[a-zA-Z]*")) {
				return false;
		}
		if (!newPLaca.substring(3).matches("[0-9]*")) {
			return false;
		}
		
		return true;
	}

}
