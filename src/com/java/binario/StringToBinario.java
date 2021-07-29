package com.java.binario;

import com.java.binario.util.ConverterBinarioToString;
import com.java.binario.util.ConverterCharToBinario;

public class StringToBinario {

	public static void main(String[] args) {

		String name = "Joylma Costa";
		//String binario = "010000010111001001110100011010000111010101110010";

		String NameOnBinario = converterStringToBinario(name);
		String converterToString = converterBinarioToString(NameOnBinario);

		if (NameOnBinario.length() % 8 == 0) {
			System.out.println("Tamanho: " + NameOnBinario.length());
			System.out.println(String.format("Essa palavra tem %d Letras.", NameOnBinario.length() / 8));
			System.out.println(NameOnBinario);
		}

		System.out.println(converterToString);

	}

	private static String converterBinarioToString(String binario) {
		if ("".equals(binario) || binario.length() % 8 != 0)
			throw new IllegalArgumentException("String vázia ou Inválida");

		StringBuilder nameLine = new StringBuilder();

		for (int i = 0, j = 8; i < binario.length(); i += 8, j += 8) {
			String substring = binario.substring(i, j);
			
			String valString = ConverterBinarioToString.binarioToString(substring);

			nameLine.append(valString);
		}

		return nameLine.toString();

	}

	private static String converterStringToBinario(String name) {
		if ("".equals(name))throw new IllegalArgumentException("String vázia");

		StringBuilder nameLine = new StringBuilder();
		for (int i = 0; i < name.length(); i++) {
			char charAt = name.charAt(i);
			String valString = ConverterCharToBinario.charToBinario(charAt);

			nameLine.append(valString);
		}

		return nameLine.toString();

	}

}
