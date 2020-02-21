package com.java.intefaces;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TesteContrato {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		int numContrato, qtdParcelas;
		Date dataContrato;
		double valorContrato;

		System.out.println("Número do Contrato:");
		numContrato = sc.nextInt();

		System.out.println("Data do Contrato:");
		dataContrato = sdf.parse(sc.next());

		System.out.println("Valor de Contrato R$:");
		valorContrato = sc.nextDouble();

		Contrato contrato = new Contrato(numContrato, dataContrato, valorContrato);

		System.out.println("Qtd de Parcelas:");
		qtdParcelas = sc.nextInt();

		Servicos servicos = new Servicos(new ServiceContratos());

		servicos.processarContrato(contrato, qtdParcelas);

		System.out.println("Parcelas:");

		for (Prestacao x : contrato.getPrestacoes()) {
			System.out.println(x);

		}
	}

}
