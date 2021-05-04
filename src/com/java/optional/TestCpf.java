package com.java.optional;

public class TestCpf {

	public static void main(String[] args) {

		GeraCpfCnpj gerarCpf = new GeraCpfCnpj();

		String cpfValido = gerarCpf.cpf(true);
		System.out.println(cpfValido);

	}

}
