package com.java.comparable;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Teste {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		String path = "c:\\temp\\ordenar.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String nome = br.readLine();

			while (nome != null) {
				list.add(nome);
				nome = br.readLine();

			}

			Collections.sort(list);
			for (int i = 0; i < list.size(); i++) {

				System.out.println((i + 1) + "º - " + list.get(i));
			}

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
