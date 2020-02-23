package com.java.comparable.ex02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class TesteFunc {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		List<Funcionario> listFuncionario = new ArrayList<>();
		String path = "c:\\temp\\funcionarios.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String funcionario = br.readLine();

			while (funcionario != null) {

				String[] fields = funcionario.split(";");
				listFuncionario.add(new Funcionario(Long.parseLong(fields[0]), fields[1], Long.parseLong(fields[2]),
						Double.parseDouble(fields[3]), Double.parseDouble(fields[4]), Double.parseDouble(fields[5]),
						Double.parseDouble(fields[6]), Double.parseDouble(fields[7])));

				funcionario = br.readLine();
			}
			Collections.sort(listFuncionario);

			for (int i=0; i < listFuncionario.size(); i++) {
				
				if (i+1 < 10) {
				System.out.println((i+1)+"º --- " + listFuncionario.get(i));
					
				}else if (i+1 < 100) {
					System.out.println((i+1)+"º -- " + listFuncionario.get(i));	
				}else {
					System.out.println((i+1)+"º - " + listFuncionario.get(i));
				}
			}

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
