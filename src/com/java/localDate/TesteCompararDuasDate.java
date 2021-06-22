package com.java.localDate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TesteCompararDuasDate {

	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		Scanner scanner = new Scanner(System.in);
		LocalDate dateInicial = LocalDate.of(2021, 01, 22);
		LocalDate dateFinal = LocalDate.now();
		LocalDate hj = LocalDate.now();

		if (dateInicial.isBefore(dateFinal)) {
			System.out.println(true + " " + dateInicial.format(dtf));
		}
		if (dateFinal.isAfter(dateInicial)) {
			System.out.println(true + " " + dateFinal.format(dtf));

		}
		System.out.println("-----------------------//------------------");
		System.out.println("Date Inicial: " + dateInicial.format(dtf));
		System.out.println("Date Final: " + dateFinal.format(dtf));

		System.out.println("-----------------------//------------------");
		System.out.println(dateInicial.compareTo(dateFinal));
		System.out.println(dateFinal.compareTo(hj));
		System.out.println(dateFinal.isEqual(hj));
		System.out.println(dateFinal.isEqual(dateInicial));


	}

}
