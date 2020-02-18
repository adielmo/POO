package com.java.arquivo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CriandoArquivo {
	public static void main(String[] args) {
		String[] vetorNomes = new String[] { "Pedro", "Luis", "Amanda", "João" };

		String path = "c:\\temp\\nomes.txt";

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {

			for (String nome : vetorNomes) {
				bw.write(nome);
				bw.newLine();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
