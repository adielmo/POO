package com.java.PackBigDecimal;

import java.math.BigDecimal;

public class Teste {

	public static void main(String[] args) {
	
		BigDecimal n1, n2, saldo;
	 n1 =	new BigDecimal(12);
	 n2 =	new BigDecimal(23);

		if (n1.compareTo(n2)== 1) {
			System.out.println(false);
			
		}else if (n2.compareTo(n1) == 1) {
			System.out.println(true);
		}

		System.out.println(n2 = n2.subtract(n1));
		System.out.println("N1: " + n1);
		System.out.println("N2: " + n2);
	

	}

}
