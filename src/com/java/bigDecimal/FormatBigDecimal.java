package com.java.bigDecimal;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class FormatBigDecimal {

	public static void main(String[] args) {
		
		  Locale brasil = new Locale( "pt", "BR" );
		  DecimalFormat numberFormat = new DecimalFormat( "#######0.0000", 
				                                     new DecimalFormatSymbols( brasil ) );
		  numberFormat.setParseBigDecimal( true );
		    numberFormat.setDecimalSeparatorAlwaysShown( true );
		    numberFormat.setMinimumFractionDigits( 4 );
		    //return numberFormat;
		
		var inteiro =1;
		var bigDecimal = new BigDecimal(12.56);
		var add = bigDecimal.add(BigDecimal.valueOf(inteiro));
		
		System.out.println("Before: "+add);
		System.out.println("Afeter: "+numberFormat.format(add));
		
	}

}
