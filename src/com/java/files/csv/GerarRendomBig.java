package com.java.files.csv;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;

public class GerarRendomBig {

	public static void main(String[] args) {
		var big01 = new BigDecimal(22.60).setScale(2, RoundingMode.HALF_EVEN);
		var big02 = new BigDecimal(100);
		Locale localeBR = new Locale("pt", "BR");
		DecimalFormat df = new DecimalFormat("0.##");
		
		
		//Saida no formato de porcentagem
		NumberFormat percentual = NumberFormat.getPercentInstance(localeBR);
		 
		percentual.setMinimumFractionDigits(0);
		percentual.setMaximumFractionDigits(2);
       
		
		double start = 1000, end = 25000;
		double random = new Random().nextDouble();
		double result = start + (random * (end - start));
		
		var big = new BigDecimal(result).setScale(2, RoundingMode.HALF_EVEN);
		
		System.out.println(result);
		System.out.println(big);
		System.out.println("==================//=============================");
		//System.out.println(percentual.format(big01.divide(big02)));
		System.out.println(percentual.format(big01.divide(big02)));
	}

}
