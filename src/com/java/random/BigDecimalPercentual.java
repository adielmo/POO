package com.java.random;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;

public class BigDecimalPercentual {

	public static void main(String[] args) {
		Locale localeBR = new Locale("pt", "BR");
		DecimalFormat df = new DecimalFormat("0.##");
		

		double start = 1000, end = 25000;
		double random = new Random().nextDouble();
		double result = start + (random * (end - start));
		BigDecimal big = new BigDecimal(result).setScale(2, RoundingMode.HALF_EVEN);
		
		System.out.println("BigDecimal: "+big);
		System.out.println(result);
		System.out.println(df.format(result));
		//df.applyLocalizedPattern(null);
		System.out.println("=============//=============================");
		NumberFormat format = NumberFormat.getPercentInstance(localeBR);
		format.setMaximumIntegerDigits(2);
		format.setMaximumFractionDigits(2);

		String format2 = format.format(big);
		String format3 = format.format(result);
		//System.out.println(format2);
		System.out.println(format3);

	}

}
