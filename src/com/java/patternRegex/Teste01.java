package com.java.patternRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Teste01 {

	public static void main(String[] args) {
		var number = "64565";
		Pattern pattern = Pattern.compile("^[0-9]");
		Matcher matcher = pattern.matcher(number);
		boolean find = matcher.find();
		
	
        //("^[!@#\\$%\\^\\&*\\)\\(+=._-]")
		// ^[mts][aeiou]"
		
		System.out.println(PatternRegex.isValidNum(number));
		System.out.println(PatternRegex.isValidDate("12-02-2022"));
		System.out.println(PatternRegex.isValidFirstCaracter("]adielmo"));
		System.out.println(PatternRegex.isValidPalavra("FirstKnig"));
		System.out.println(PatternRegex.isValidConsoantVogal("Sarta"));
		System.out.println(PatternRegex.notContLetras("adielmo"));
	}

}
