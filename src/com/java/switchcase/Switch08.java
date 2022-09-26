package com.java.switchcase;

public class Switch08 {

	public static void main(String[] args) {
	 DAYS diaSemana = DAYS.TUESDAY;

		switch (diaSemana) {
		case MONDAY:
			System.out.println("Segunda-Feira");
			break;
		case TUESDAY:
			System.out.println("Terça-Feira");
			break;
		case WEDNESDAY:
			System.out.println("Quarta-Feira");
			break;

		case THURSDAY:
			System.out.println("Quinta-feira");
			break;
		case FRIDAY:
			System.out.println("Sexta-Feira");
			break;

		case SATURDAY:
			System.out.println("Sábado");
			break;
		case SUNDAY:
			System.out.println("Domingo");
			break;

		default:
			System.out.println("Unknown");
			break;
		}

	}

}
