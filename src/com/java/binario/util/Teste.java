package com.java.binario.util;

public class Teste {

	public static void main(String[] args) {
		String letra =":";
//String name ="a";
//String letra ="Adielmo";
String binario = "01000001011001000110100101100101011011000110110101101111";

System.out.println(letra.matches("[,\":;<=>?!#$%&'()*+-./ ]"));
/*
 * for (int i = 0, j = 8; i < binario.length(); i += 8, j += 8) { String
 * substring = binario.substring(i, j); System.out.println(substring); }
 */

/*
 * String digitos = binario.substring(0, 4);
 * 
 * System.out.println(digitos);
 * 
 * System.out.println(digitos.equals("0100") || digitos.matches("[0111]"));
 */


/*
 * if ("".equals(binario) || binario.length() % 8 != 0) throw new
 * IllegalArgumentException("String vázia ou Inválida");
 * 
 * }
 */


//System.out.println(name.matches("[ { - | - } - ~ -`]"));
//System.out.println(name.matches("[a-z]"));
//System.out.println( name.matches("[@ - _ - ^ -.-\\\\ ]"));
//System.out.println( name+"   "+ name.matches("[\\[\\]@_^\\\\ ]"));
//System.out.println(name +"   "+name.matches("\\\\"));
//System.out.println(letra.matches("[a-z]") || letra.matches("[ {|}~`]"));
//System.out.println(letra.matches("[a-z]"));
//System.out.println(letra.matches("[ {|}~`]"));

	}

}
