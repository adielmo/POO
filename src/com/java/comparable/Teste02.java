package com.java.comparable;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Teste02 {
	public static void main(String[] args) {
		List<Funcionario> listFuncionarios = new ArrayList<>();
		String path = "c:\\temp\\listaFuncionarios.csv";

try (BufferedReader br = new BufferedReader(new FileReader(path))) {
	String funconario = br.readLine();

		while (funconario != null) {
			String[] fields = funconario.split(",");
				
	listFuncionarios.add(new Funcionario(fields[0], Double.parseDouble(fields[1])));
	funconario = br.readLine();
	
			}

			Collections.sort(listFuncionarios);
			
			for (Funcionario func : listFuncionarios) {
				System.out.println(func);
			}

		} catch (IOException e) {
			System.out.println("Error! " + e.getMessage());
		}
	}

}
