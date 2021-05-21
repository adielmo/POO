package com.java.bigDecimal;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class ConvToBigDecimal {

	public static void main(String[] args) {
DecimalFormat df = new DecimalFormat("###,###,###.##");
		BigDecimal val = new BigDecimal("260145.65");
		String string = "12565.11";
		BigDecimal val02 = new BigDecimal(string);
		String bigString= String.valueOf(val);
		
		BigDecimal sum = val02.add(val);
		BigDecimal sub = val.subtract(val02);
		BigDecimal mult = val02.multiply(new BigDecimal(3));
		BigDecimal div = val.divide(new BigDecimal(5));
       		
		System.out.println(df.format(val));
		System.out.println("------------//-----------------");
		System.out.println(df.format(sum));
		System.out.println(df.format(sub));
		System.out.println(df.format(mult));
		System.out.println(df.format(div));
		
		System.out.println("----------------------//------------------");
		String[] arrayNum = 
	          String.valueOf(df.format(sum)).split("[,-.]");//Qdo essa cond. for true, parte
		System.out.println(bigString.replace('0', '3'));//Troca de valores
		System.out.println(bigString.substring(0, 3));//Pegar um char pelas posições
		for(String a : arrayNum) {
			System.out.println(a);
		}
		
	}		
	
}
