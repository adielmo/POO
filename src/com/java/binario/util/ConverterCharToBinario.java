package com.java.binario.util;

public abstract class ConverterCharToBinario {

	public static String charToBinario(char charAt) {
		String letra = String.valueOf(charAt);

		if (letra.matches("[a-z]") || letra.matches("[{|}~`]")) {
			return toString0110To0111(letra);
		}

		if (letra.matches("[A-Z]") || letra.matches("[\\[\\]@_^\\\\]")) {
			return toString0100To0101(letra);
		}

		if (letra.matches("[0-9]") || letra.matches("[,\":;<=>?!#$%&'()*+-./ ]")) {
			return toString0010To0011(letra);
		}
		throw new RuntimeException("Valor não encotrado: " + charAt);
	}

	private static String toString0010To0011(String caracter) {
		String name = "Valor não encotrado";

		switch (caracter) {

		case "0":
			name = ConstanteBinario0011.ZERO;
			break;
		case "1":
			name = ConstanteBinario0011.UM;
			break;
		case "2":
			name = ConstanteBinario0011.DOIS;
			break;
		case "3":
			name = ConstanteBinario0011.TRES;
			break;
		case "4":
			name = ConstanteBinario0011.QUATRO;
			break;
		case "5":
			name = ConstanteBinario0011.CINCO;
			break;
		case "6":
			name = ConstanteBinario0011.SEIS;
			break;
		case "7":
			name = ConstanteBinario0011.SETE;
			break;
		case "8":
			name = ConstanteBinario0011.OITO;
			break;

		case "9":
			name = ConstanteBinario0011.NOVE;
			break;

		case " ":
			name = ConstanteBinario0010.ESPACO;
			break;
		case "!":
			name = ConstanteBinario0010.PONTO_EXCLAMACAO;
			break;
		case "\"":
			name = ConstanteBinario0010.ASPA_DUPLAS;
			break;
		case "#":
			name = ConstanteBinario0010.CERQUILHA;
			break;
		case "$":
			name = ConstanteBinario0010.DOLAR;
			break;
		case "%":
			name = ConstanteBinario0010.PERCENTUAL;
			break;
		case "&":
			name = ConstanteBinario0010.E_COMERCIAL;
			break;
		case "'":
			name = ConstanteBinario0010.APOSTROFO;
			break;

		case "(":
			name = ConstanteBinario0010.ABRE_PARENTES;
			break;

		case ")":
			name = ConstanteBinario0010.FECHA_PARENTES;
			break;
		case "*":
			name = ConstanteBinario0010.ASTERISCO;
			break;
		case "+":
			name = ConstanteBinario0010.SINAL_MAIS;
			break;

		case ",":
			name = ConstanteBinario0010.VIRGULA;
			break;

		case "-":
			name = ConstanteBinario0010.SINAL_MENOS;
			break;

		case ".":
			name = ConstanteBinario0010.PONTO_FINAL;
			break;
		case "/":
			name = ConstanteBinario0010.BARRA_COMUM;
			break;
		case ":":
			name = ConstanteBinario0011.DOIS_PONTOS;
			break;

		case ";":
			name = ConstanteBinario0011.PONTO_VIRGULA;
			break;

		case "<":
			name = ConstanteBinario0011.SINAL_MENOR;
			break;
		case "=":
			name = ConstanteBinario0011.SINAL_IGUAL;
			break;

		case ">":
			name = ConstanteBinario0011.SINAL_MAIOR;
			break;

		case "?":
			name = ConstanteBinario0011.PONTO_INTERROGACAO;

			break;

		default:
			throw new RuntimeException("Valor não encotrado" + caracter);
		}
		return name;

	}

	private static String toString0100To0101(String caracter) {
		String name = "Valor não encotrado";

		switch (caracter) {

		case "A":
			name = ConstanteBinario0100.LETRA_MAIUSCULA_A;
			break;
		case "B":
			name = ConstanteBinario0100.LETRA_MAIUSCULA_B;
			break;
		case "C":
			name = ConstanteBinario0100.LETRA_MAIUSCULA_C;
			break;
		case "D":
			name = ConstanteBinario0100.LETRA_MAIUSCULA_D;
			break;
		case "E":
			name = ConstanteBinario0100.LETRA_MAIUSCULA_E;
			break;
		case "F":
			name = ConstanteBinario0100.LETRA_MAIUSCULA_F;
			break;
		case "G":
			name = ConstanteBinario0100.LETRA_MAIUSCULA_G;
			break;
		case "H":
			name = ConstanteBinario0100.LETRA_MAIUSCULA_H;
			break;
		case "I":
			name = ConstanteBinario0100.LETRA_MAIUSCULA_I;
			break;

		case "J":
			name = ConstanteBinario0100.LETRA_MAIUSCULA_J;
			break;

		case "K":
			name = ConstanteBinario0100.LETRA_MAIUSCULA_K;
			break;
		case "L":
			name = ConstanteBinario0100.LETRA_MAIUSCULA_L;
			break;
		case "M":
			name = ConstanteBinario0100.LETRA_MAIUSCULA_M;
			break;
		case "N":
			name = ConstanteBinario0100.LETRA_MAIUSCULA_N;
			break;
		case "O":
			name = ConstanteBinario0100.LETRA_MAIUSCULA_O;
			break;
		case "P":
			name = ConstanteBinario0101.LETRA_MAIUSCULA_P;
			break;
		case "Q":
			name = ConstanteBinario0101.LETRA_MAIUSCULA_Q;
			break;
		case "R":
			name = ConstanteBinario0101.LETRA_MAIUSCULA_R;
			break;

		case "S":
			name = ConstanteBinario0101.LETRA_MAIUSCULA_S;
			break;

		case "T":
			name = ConstanteBinario0101.LETRA_MAIUSCULA_T;
			break;
		case "U":
			name = ConstanteBinario0101.LETRA_MAIUSCULA_U;
			break;
		case "V":
			name = ConstanteBinario0101.LETRA_MAIUSCULA_V;
			break;

		case "X":
			name = ConstanteBinario0101.LETRA_MAIUSCULA_X;
			break;

		case "W":
			name = ConstanteBinario0101.LETRA_MAIUSCULA_W;
			break;

		case "Y":
			name = ConstanteBinario0101.LETRA_MAIUSCULA_Y;
			break;
		case "Z":
			name = ConstanteBinario0101.LETRA_MAIUSCULA_Z;
			break;
		case "@":
			name = ConstanteBinario0100.ARROBA;
			break;

		case "[":
			name = ConstanteBinario0101.ABRE_COLCHETE;
			break;

		case "\\":
			name = ConstanteBinario0101.BARRA_INVERSA;
			break;
		case "]":
			name = ConstanteBinario0101.FECHA_COLCHETE;
			break;

		case "^":
			name = ConstanteBinario0101.CIRCUNFLEXO;
			break;

		case "_":
			name = ConstanteBinario0101.SUBLINHADO;

			break;

		default:
			throw new RuntimeException("Valor não encotrado" + caracter);
		// break;
		}
		return name;
	}

	private static String toString0110To0111(String caracter) {
		String name = "Valor não encotrado";

		switch (caracter) {

		case "a":
			name = ConstanteBinario0110.LETRA_MINUSCULA_A;
			break;
		case "b":
			name = ConstanteBinario0110.LETRA_MINUSCULA_B;
			break;
		case "c":
			name = ConstanteBinario0110.LETRA_MINUSCULA_C;
			break;
		case "d":
			name = ConstanteBinario0110.LETRA_MINUSCULA_D;
			break;
		case "e":
			name = ConstanteBinario0110.LETRA_MINUSCULA_E;
			break;
		case "f":
			name = ConstanteBinario0110.LETRA_MINUSCULA_F;
			break;
		case "g":
			name = ConstanteBinario0110.LETRA_MINUSCULA_G;
			break;
		case "h":
			name = ConstanteBinario0110.LETRA_MINUSCULA_H;
			break;
		case "i":
			name = ConstanteBinario0110.LETRA_MINUSCULA_I;
			break;

		case "j":
			name = ConstanteBinario0110.LETRA_MINUSCULA_J;
			break;

		case "k":
			name = ConstanteBinario0110.LETRA_MINUSCULA_K;
			break;
		case "l":
			name = ConstanteBinario0110.LETRA_MINUSCULA_L;
			break;
		case "m":
			name = ConstanteBinario0110.LETRA_MINUSCULA_M;
			break;
		case "n":
			name = ConstanteBinario0110.LETRA_MINUSCULA_N;
			break;
		case "o":
			name = ConstanteBinario0110.LETRA_MINUSCULA_O;
			break;
		case "p":
			name = ConstanteBinario0111.LETRA_MINUSCULA_P;
			break;
		case "q":
			name = ConstanteBinario0111.LETRA_MINUSCULA_Q;
			break;
		case "r":
			name = ConstanteBinario0111.LETRA_MINUSCULA_R;
			break;

		case "s":
			name = ConstanteBinario0111.LETRA_MINUSCULA_S;
			break;

		case "t":
			name = ConstanteBinario0111.LETRA_MINUSCULA_T;
			break;
		case "u":
			name = ConstanteBinario0111.LETRA_MINUSCULA_U;
			break;
		case "v":
			name = ConstanteBinario0111.LETRA_MINUSCULA_V;
			break;

		case "x":
			name = ConstanteBinario0111.LETRA_MINUSCULA_X;
			break;

		case "w":
			name = ConstanteBinario0111.LETRA_MINUSCULA_W;
			break;

		case "y":
			name = ConstanteBinario0111.LETRA_MINUSCULA_Y;
			break;
		case "z":
			name = ConstanteBinario0111.LETRA_MINUSCULA_Z;
			break;
		case "{":
			name = ConstanteBinario0111.ABRE_CHAVE;
			break;

		case "|":
			name = ConstanteBinario0111.BARRA_VERTICAL;
			break;

		case "}":
			name = ConstanteBinario0111.FECHA_CHAVE;
			break;
		case "~":
			name = ConstanteBinario0111.ACENTO_TIL;
			break;

		case "`":
			name = ConstanteBinario0110.ACENTO_GRAVE;
			break;

		default:
			throw new RuntimeException("Valor não encotrado" + caracter);
		// break;
		}
		return name;
	}

}
