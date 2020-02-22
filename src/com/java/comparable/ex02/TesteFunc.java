package com.java.comparable.ex02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class TesteFunc {

	public static void main(String[] args) {
		List<Funcionario> listFuncionario = new ArrayList<>();
		
		String path = "c:\\temp\\funcionarios.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String funcionario = br.readLine();
			
			while (funcionario != null) {
				
				String[] fields = funcionario.split("*");
				listFuncionario.add(
new Funcionario(cbo, cargo, cargaHoraria, pisoSalarial, mediaSalarial, salarioMediana, tetoSalarial, salarioHora));
				
				funcionario=br.readLine();
						
			}	

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
