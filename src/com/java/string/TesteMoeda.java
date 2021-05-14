package com.java.string;

import java.util.Scanner;

public class TesteMoeda {

	public static void main(String[] args) {
		String moeda ="R$ 39,90";
		//int valor = Integer.parseInt(moeda.replaceAll("[^0-9.]", ""));

		String valor = moeda.substring(3);
		double val = Double.parseDouble(valor.replace(",", "."));
		

		
		System.out.println(val);
		//Error !!For input string: "R$ 39,90"


	}

}
