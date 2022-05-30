package com.java.math;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Teste02 {

	public static void main(String[] args) {
		String line = 
				"aos 42, mas nos acréscimos, Lucumí aproveitou 564contra-ataque para garantir 45665 a";
		//"[15/Jul/2009:14:58:59 -0700] \"GET / HTTP/1.1\" 403 202\n";
		
		Pattern p =
			Pattern.compile("[0–9]{1,3}\\.[0–9]{1,3}\\.[0–9]{1,3}\\.[0–9]{1,3}");
		
		Matcher m = p.matcher(line);
		
		System.out.println(m.find());
		if (m.find()) {
		//System.out.println("oi");
			System.out.println(m.group());
			//10.223.157.185 — — 
			
		}

	}

}
