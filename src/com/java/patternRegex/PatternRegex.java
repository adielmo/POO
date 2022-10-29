package com.java.patternRegex;

import java.util.regex.Pattern;
/**
 * https://howtodoinjava.com/java/regex/start-end-of-string/
 * @author adielmo
 *
 */
public class PatternRegex {
	
	/**
	 * matches()
	 *  procura por toda a string, ou seja,
	 * o padrão que você está procurando deve ser exatamente
	 * igual à string sendo usada para procurar.
	 * É como se estivesse usando um igual.
	 */
	

	/**
	 * find()
	 *  procura por aquele padrão na string e se achar
	 *  qualquer parte que "bata" com o padrão está bom pra ele. 
	 *  Ele usa um substring. É como se usasse um LIKE do SQL.
	 *   Ou é como se usasse um ^ no começo e um $ no fim em uma expressão regular.
	 */
	
	private static final Pattern NUMBER_PATTERN = Pattern.compile("^[0-9]");
	private static final Pattern DATE_PATTERN = Pattern.compile("^\\d{2}-\\d{2}-\\d{4}$");
	private static final Pattern FIRST_CARACT_PATTERN = Pattern.compile("^[!@#\\$%\\^\\&*\\)\\[\\]\\(+=._-]");
	private static final Pattern FIRST_PALAVRA = Pattern.compile("^First");
	private static final Pattern FIRST_CONSOANT_VOGAL = Pattern.compile("^[mtsMTS][aeiou]");
	private static final Pattern NOT_COMEC_LETRA = Pattern.compile("[^abc]");
	
	public static boolean notContLetras(String regex) {
		return NOT_COMEC_LETRA.matcher(regex).find();	
		}
	public static boolean isValidConsoantVogal(String regex) {
		return FIRST_CONSOANT_VOGAL.matcher(regex).find();	
		}
	
	public static boolean isValidPalavra(String regex) {
	return FIRST_PALAVRA.matcher(regex).find();	
	}
	
	public static boolean isValidFirstCaracter(String regex) {
	return FIRST_CARACT_PATTERN.matcher(regex).find();	
	}
	 
	 public static boolean isValidDate(String regex) {					
			return DATE_PATTERN.matcher(regex).find();
		}
	
	public static boolean isValidNum(String regex) {
		//return regex.matches("123456");		
		//return NUMBER_PATTERN.matcher(regex).matches();
		
		return NUMBER_PATTERN.matcher(regex).find();
	}

}
