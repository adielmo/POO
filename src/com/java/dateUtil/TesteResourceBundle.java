package com.java.dateUtil;

import java.util.Locale;
import java.util.ResourceBundle;

public class TesteResourceBundle {

	public static void main(String[] args) {		
		System.out.println(Locale.getDefault());		
		//Locale.setDefault(new Locale("en", "US"));		
		System.out.println(Locale.getDefault());
		
		ResourceBundle rb = ResourceBundle.getBundle("meu-text");
           System.out.println(rb.getString("hello")+ " "+rb.getString("world"));
		
	}

}
