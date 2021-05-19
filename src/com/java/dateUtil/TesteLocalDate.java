package com.java.dateUtil;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TesteLocalDate {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		LocalDate hoje = LocalDate.now();
		LocalDate data = LocalDate.of(2020, 3, 10);
		String dt = "2019-05-15";// formato UTC

		System.out.println(hoje);
		System.out.println(data);
		System.out.println(LocalDate.parse(dt));
		System.out.println("=======================//==========================");
		// Adicionando Ano,Mês ou Dia em uma Data, usando LocalDate.plus
		LocalDate maisMes = hoje.plusMonths(2);// Menos 2 mês
		System.out.println(maisMes);
		System.out.println(maisMes.plusDays(5));// Mais 5 Dias
		System.out.println(maisMes.plus(2, ChronoUnit.YEARS));// Mais 2 Anos

		System.out.println("=======================//==========================");
		// Podemos voltar um Ano,Mês ou Dia em uma Data, usando LocalDate.min
		LocalDate menosMes = hoje.minusMonths(3);// Menos 3 Mês
		System.out.println(menosMes);
		System.out.println(menosMes.plusDays(10));// Menos 10 Dias
		System.out.println(menosMes.minus(2, ChronoUnit.MONTHS));// Menos 2 mês

		System.out.println("=======================//==========================");
		System.out.println(hoje.getDayOfWeek());// Dia da Semana
		System.out.println(hoje.getMonth());// Mês do Ano
		System.out.println(hoje.getYear());// Ano
		System.out.println(hoje.isLeapYear());//VErificar se Ano Bisexto

		System.out.println("=======================//==========================");

	}

}
