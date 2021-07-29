package com.java.binario.util;

public abstract class ConverterBinarioToString {

	public static String binarioToString(String binario) {
		if (binario.length() != 8 || "".equals(binario))
			throw new IllegalArgumentException("Tamanho inválido ou Está vázia");

		String digitos = binario.substring(0, 4);

		if (digitos.equals("0110") || digitos.equals("0111")) {
			return toString0110To0111(binario);
		}

		if (digitos.equals("0100") || digitos.equals("0101")) {
			return toString0100To0101(binario);
		}

		if (digitos.equals("0010") || digitos.equals("0011")) {
			return toString0010To0011(binario);
		}

		throw new RuntimeException("Valor não encotrado: " + binario);

	}

	private static String toString0010To0011(String caracter) {
		String name = "Valor não encotrado";

		switch (caracter) {
		case ConstanteBinario0010.PERCENTUAL:
			name="%";
			break;

		case ConstanteBinario0011.ZERO:
			name = "0";
			break;
		case ConstanteBinario0011.UM:
			name = "1";
			break;
		case ConstanteBinario0011.DOIS:
			name = "2";
			break;
		case ConstanteBinario0011.TRES:
			name = "3";
			break;
		case ConstanteBinario0011.QUATRO:
			name = "4";
			break;
		case ConstanteBinario0011.CINCO:
			name = "5";
			break;
		case ConstanteBinario0011.SEIS:
			name = "6";
			break;
		case ConstanteBinario0011.SETE:
			name = "7";
			break;
		case ConstanteBinario0011.OITO:
			name = "8";
			break;

		case ConstanteBinario0011.NOVE:
			name = "9";
			break;

		case ConstanteBinario0010.ESPACO:
			name = " ";
			break;
		case ConstanteBinario0010.PONTO_EXCLAMACAO:
			name = "!";
			break;
		case ConstanteBinario0010.ASPA_DUPLAS:
			name = "\"";
			break;
		case ConstanteBinario0010.CERQUILHA:
			name = "#";
			break;
		case ConstanteBinario0010.DOLAR:
			name = "$";
			break;

		case ConstanteBinario0010.E_COMERCIAL:
			name = "&";
			break;
		case ConstanteBinario0010.APOSTROFO:
			name = "'";
			break;

		case ConstanteBinario0010.ABRE_PARENTES:
			name = "(";
			break;

		case ConstanteBinario0010.FECHA_PARENTES:
			name = ")";
			break;
		case ConstanteBinario0010.ASTERISCO:
			name = "*";
			break;
		case ConstanteBinario0010.SINAL_MAIS:
			name = "+";
			break;

		case ConstanteBinario0010.VIRGULA:
			name = ",";
			break;

		case ConstanteBinario0010.SINAL_MENOS:
			name = "-";
			break;

		case ConstanteBinario0010.PONTO_FINAL:
			name = ".";
			break;
		case ConstanteBinario0010.BARRA_COMUM:
			name = "/";
			break;
		case ConstanteBinario0011.DOIS_PONTOS:
			name = ":";
			break;

		case ConstanteBinario0011.PONTO_VIRGULA:
			name = ";";
			break;

		case ConstanteBinario0011.SINAL_MENOR:
			name = "<";
			break;
		case ConstanteBinario0011.SINAL_IGUAL:
			name = "=";
			break;

		case ConstanteBinario0011.SINAL_MAIOR:
			name = ">";
			break;

		case ConstanteBinario0011.PONTO_INTERROGACAO:
			name = "?";

			break;

		default:
			throw new RuntimeException("Valor não encotrado" + caracter);
		}
		return name;

	}

	private static String toString0100To0101(String codigoBinario) {
		String caracter = "Valor não encotrado";

		switch (codigoBinario) {

		case ConstanteBinario0100.LETRA_MAIUSCULA_A:
			caracter = "A";
			break;
		case ConstanteBinario0100.LETRA_MAIUSCULA_B:
			caracter = "B";
			break;
		case ConstanteBinario0100.LETRA_MAIUSCULA_C:
			caracter = "C";
			break;
		case ConstanteBinario0100.LETRA_MAIUSCULA_D:
			caracter = "D";
			break;
		case ConstanteBinario0100.LETRA_MAIUSCULA_E:
			caracter = "E";
			break;
		case "F":
			caracter = ConstanteBinario0100.LETRA_MAIUSCULA_F;
			break;
		case "G":
			caracter = ConstanteBinario0100.LETRA_MAIUSCULA_G;
			break;
		case ConstanteBinario0100.LETRA_MAIUSCULA_H:
			caracter = "H";
			break;
		case ConstanteBinario0100.LETRA_MAIUSCULA_I:
			caracter = "I";
			break;

		case ConstanteBinario0100.LETRA_MAIUSCULA_J:
			caracter = "J";
			break;

		case ConstanteBinario0100.LETRA_MAIUSCULA_K:
			caracter = "K";
			break;
		case ConstanteBinario0100.LETRA_MAIUSCULA_L:
			caracter = "L";
			break;
		case ConstanteBinario0100.LETRA_MAIUSCULA_M:
			caracter = "M";
			break;
		case ConstanteBinario0100.LETRA_MAIUSCULA_N:
			caracter = "N";
			break;
		case ConstanteBinario0100.LETRA_MAIUSCULA_O:
			caracter = "O";
			break;
		case ConstanteBinario0101.LETRA_MAIUSCULA_P:
			caracter = "P";
			break;
		case ConstanteBinario0101.LETRA_MAIUSCULA_Q:
			caracter = "Q";
			break;
		case ConstanteBinario0101.LETRA_MAIUSCULA_R:
			caracter = "R";
			break;

		case "S":
			caracter = ConstanteBinario0101.LETRA_MAIUSCULA_S;
			break;

		case ConstanteBinario0101.LETRA_MAIUSCULA_T:
			caracter = "T";
			break;
		case ConstanteBinario0101.LETRA_MAIUSCULA_U:
			caracter = "U";
			break;
		case ConstanteBinario0101.LETRA_MAIUSCULA_V:
			caracter = "V";
			break;

		case ConstanteBinario0101.LETRA_MAIUSCULA_X:
			caracter = "X";
			break;

		case ConstanteBinario0101.LETRA_MAIUSCULA_W:
			caracter = "W";
			break;

		case ConstanteBinario0101.LETRA_MAIUSCULA_Y:
			caracter = "Y";
			break;
		case ConstanteBinario0101.LETRA_MAIUSCULA_Z:
			caracter = "Z";
			break;
		case ConstanteBinario0100.ARROBA:
			caracter = "@";
			break;

		case ConstanteBinario0101.ABRE_COLCHETE:
			caracter = "[";
			break;

		case ConstanteBinario0101.BARRA_INVERSA:
			caracter = "\\";
			break;
		case ConstanteBinario0101.FECHA_COLCHETE:
			caracter = "]";
			break;

		case ConstanteBinario0101.CIRCUNFLEXO:
			caracter = "^";
			break;

		case ConstanteBinario0101.SUBLINHADO:
			caracter = "_";

			break;

		default:
			throw new RuntimeException("Valor não encotrado: " + codigoBinario);
		// break;
		}
		return caracter;
	}

	private static String toString0110To0111(String codigoBinario) {
		String caracter = "Valor não encotrado";

		switch (codigoBinario) {

		case ConstanteBinario0110.LETRA_MINUSCULA_A:
			caracter = "a";
			break;

		case ConstanteBinario0110.LETRA_MINUSCULA_B:
			caracter = "b";
			break;
		case ConstanteBinario0110.LETRA_MINUSCULA_C:

			caracter = "c";
			break;

		case ConstanteBinario0110.LETRA_MINUSCULA_D:

			caracter = "d";
			break;
		case ConstanteBinario0110.LETRA_MINUSCULA_E:
			caracter = "e";
			break;
		case ConstanteBinario0110.LETRA_MINUSCULA_F:
			caracter = "f";
			break;
		case ConstanteBinario0110.LETRA_MINUSCULA_G:
			caracter = "g";
			break;
		case ConstanteBinario0110.LETRA_MINUSCULA_H:
			caracter = "h";
			break;
		case ConstanteBinario0110.LETRA_MINUSCULA_I:
			caracter = "i";
			break;

		case ConstanteBinario0110.LETRA_MINUSCULA_J:
			caracter = "j";
			break;

		case ConstanteBinario0110.LETRA_MINUSCULA_K:
			caracter = "k";
			break;
		case ConstanteBinario0110.LETRA_MINUSCULA_L:
			caracter = "l";
			break;
		case ConstanteBinario0110.LETRA_MINUSCULA_M:
			caracter = "m";
			break;
		case ConstanteBinario0110.LETRA_MINUSCULA_N:
			caracter = "n";
			break;
		case ConstanteBinario0110.LETRA_MINUSCULA_O:
			caracter = "o";
			break;
		case ConstanteBinario0111.LETRA_MINUSCULA_P:
			caracter = "p";
			break;
		case ConstanteBinario0111.LETRA_MINUSCULA_Q:
			caracter = "q";
			break;
		case ConstanteBinario0111.LETRA_MINUSCULA_R:
			caracter = "r";
			break;

		case ConstanteBinario0111.LETRA_MINUSCULA_S:
			caracter = "s";
			break;

		case ConstanteBinario0111.LETRA_MINUSCULA_T:
			caracter = "t";
			break;
		case ConstanteBinario0111.LETRA_MINUSCULA_U:
			caracter = "u";
			break;
		case ConstanteBinario0111.LETRA_MINUSCULA_V:
			caracter = "v";
			break;

		case ConstanteBinario0111.LETRA_MINUSCULA_X:
			caracter = "x";
			break;

		case ConstanteBinario0111.LETRA_MINUSCULA_W:
			caracter = "w";
			break;

		case ConstanteBinario0111.LETRA_MINUSCULA_Y:
			caracter = "y";
			break;
		case ConstanteBinario0111.LETRA_MINUSCULA_Z:
			caracter = "z";
			break;
		case ConstanteBinario0111.ABRE_CHAVE:
			caracter = "{";
			break;

		case ConstanteBinario0111.BARRA_VERTICAL:
			caracter = "|";
			break;

		case ConstanteBinario0111.FECHA_CHAVE:
			caracter = "}";
			break;
		case ConstanteBinario0111.ACENTO_TIL:
			caracter = "~";
			break;

		case ConstanteBinario0110.ACENTO_GRAVE:
			caracter = "`";
			break;

		default:
			throw new RuntimeException("Valor não encotrado" + codigoBinario);
		// break;
		}
		return caracter;
	}

}
