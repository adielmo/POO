package com.java.enumeracao.ex;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TesteTrabalhador {
	public static void main(String[] args) throws ParseException {
		String nomeDepartamento, nome, nivelTrabalhador;
		Date dataContrato;
		double baseSalario = 0, valorHora = 0;
		int qtd, qtdHoras;
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Digite o nome do Departamento:");
		nomeDepartamento = sc.nextLine();
		System.out.println("Entre com os dados do Trabalhador:");
		System.out.println("Nome:");
		nome = sc.nextLine();
		System.out.println("Digete o Nível do Trabalhador:");
		nivelTrabalhador = sc.nextLine();
		System.out.println("Digete a base salárial:");
		baseSalario = sc.nextDouble();

		Trabalhador trabalhador = new Trabalhador(nome, NivelTrabalhador.valueOf(nivelTrabalhador), baseSalario,
				new Departamento(nomeDepartamento));

		System.out.println("Digete a quantidade de  contratos:");
		qtd = sc.nextInt();

		for (int i = 1; i <= qtd; i++) {
			System.out.println("Digete a data do " + i + "º" + " Contrato (DD/MM/YYYY HH:mm:ss):");
			dataContrato = sdf.parse(sc.next());

			System.out.println("Valor da hora do "+ i + "º" + " Contrato:");
			valorHora = sc.nextDouble();
			System.out.println("Quantidade de Horas do " + i + "º" + " Contrato:");
			qtdHoras = sc.nextInt();

			ContratoHoras contratoHoras = new ContratoHoras(dataContrato, valorHora, qtdHoras);
			trabalhador.adicionarContrato(contratoHoras);

		}
		System.out.println("Calcular Salário:");
		System.out.println("Entre com Data do Contrato (MM/YYYY):");
		String dataContratoBuscar = sc.next();
		int mes = Integer.parseInt(dataContratoBuscar.substring(0, 2));
		int ano = Integer.parseInt(dataContratoBuscar.substring(3));

		System.out.println("Nome do Trabalhador: " + trabalhador.getNome());
		System.out.println("Departamento-------: " + trabalhador.getDepartamento().getNome());
		System.out.println("Data: " + dataContratoBuscar);
		System.out.println("Valor da Renda total R$: " + String.format("%.2f", trabalhador.renda(ano, mes)));

	}

}
