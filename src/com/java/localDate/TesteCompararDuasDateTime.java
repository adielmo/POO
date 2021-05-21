package com.java.localDate;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TesteCompararDuasDateTime {

	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		Scanner scanner = new Scanner(System.in);
		LocalDateTime dateInicial = LocalDateTime.of(2021, 01, 22, 04, 12, 41);
		LocalDateTime dateFinal = LocalDateTime.now();

		if (dateInicial.isBefore(dateFinal)) {
			System.out.println(true);
			System.out.println("Buscar relatório date passada e date Atual:");
			
		}
		if (dateFinal.isAfter(dateInicial)) {
			System.out.println(true);
			System.out.println("Comprar uma Passagem Data atua e Data futura:");

		}

		System.out.println("Date Inicial: " + dateInicial.format(dtf));
		System.out.println("Date Final: " + dateFinal.format(dtf));

	}

}
