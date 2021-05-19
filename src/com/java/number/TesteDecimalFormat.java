package com.java.number;

import java.text.DecimalFormat;
import java.util.Locale;

public class TesteDecimalFormat {

	public static void main(String[] args) {
		System.out.println(Locale.getDefault());

		DecimalFormat df = new DecimalFormat("###,###,###.##");
		double valDouble = 4542.56;
		
		System.out.println(df.format(5125982.562));
		System.out.println(df.format(0.1));
		System.out.println("=============//=============");
		System.out.println(df.format(valDouble));

	}

}
