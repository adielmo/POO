	package com.java.random;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class FormatBigDecimal {

	public static void main(String[] args) {
	var	x = new BigDecimal(0.06);
	var	y = new BigDecimal(3904.2792187459645);
	
	var setScale = x.add(y).setScale(2, RoundingMode.HALF_EVEN);
	System.out.println(setScale);

	}

}
