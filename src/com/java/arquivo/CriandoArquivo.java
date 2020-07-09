package com.java.arquivo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CriandoArquivo {
	public static void main(String[] args) {
		
		String[] vetorNomes = new String[] { "Pedro, 12, 3.63", "Luis, 78, 2.64",
				"Amanda, 16, 14.76", "João, 62, 5.87" };

		String path = "c:\\temp\\saida.txt";

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
