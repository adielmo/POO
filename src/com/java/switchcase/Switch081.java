package com.java.switchcase;

public class Switch081 {

	public static void main(String[] args) {
		String diaSemana = "Thursday";

		switch (diaSemana) {
		case "Monday":
			System.out.println("Segunda-Feira");
			break;
		case "Tuesday":
			System.out.println("Terça-Feira");
			break;
		case "Wednesday":
			System.out.println("Quarta-Feira");
			break;

		case "Thursday":
			System.out.println("Quinta-feira");
			break;
		case "Friday":
			System.out.println("Sexta-Feira");
			break;

		case "Saturday":
			System.out.println("Sábado");
			break;
		case "Sunday":
			System.out.println("Domingo");
			break;

		default:
			System.out.println("Unknown");
			break;
		}

	}

}
