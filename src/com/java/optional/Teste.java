package com.java.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Teste {

	public static void main(String[] args) {
		// int cpf=1000000000; //01.865.025.151

		List<Cliente> clientes = new ArrayList<>();

		for (int i = 1; i <= 1000; i++) {
			GeraCpfCnpj gerarCpf = new GeraCpfCnpj();

			String cpfValido = gerarCpf.cpf(true);

			clientes.add(new Cliente(Long.valueOf(i), "Nome_" + i, cpfValido, String.format("nome.%d@gmail.com", i)));

		}

		clientes.forEach(i -> System.out.println(i));

	}

}
