package com.java.bigDecimal;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Teste02 {

	public static void main(String[] args) {
		
		DecimalFormatSymbols dfs = DecimalFormatSymbols.getInstance(new Locale("pt", "BR"));
		dfs.setDecimalSeparator('.');
		dfs.setGroupingSeparator(',');
		DecimalFormat df = new DecimalFormat("#,##0.0#", dfs);
		
		BigDecimal bigDecimal = new BigDecimal(8125.60);
		df.setParseBigDecimal(true);
		
		System.out.println(df.format(bigDecimal));
		System.out.println(df.format(new BigDecimal(123456123456.78)));
		

		
		
	}

}
