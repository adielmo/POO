package com.java.dateUtil;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DiferencasEntreDatas {

	public static void main(String[] args) {
		// SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		DateTimeFormatter dtfDateTime = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		DateTimeFormatter dfDate = DateTimeFormatter.ofPattern("dd-MM-yyyy");

		LocalDate endDate = LocalDate.now();
		LocalDateTime endTime = LocalDateTime.now();

		LocalDate startDate = LocalDate.of(2019, 02, 15);
		LocalDateTime statTime = LocalDateTime.of(2021, 05, 18, 12, 21, 36);

		System.out.println(startDate);
		System.out.println(endDate);
		Period period = Period.between(startDate, endDate);

		long dia = ChronoUnit.DAYS.between(startDate, endDate);
		long mes = ChronoUnit.MONTHS.between(startDate, endDate);
		long ano = ChronoUnit.YEARS.between(startDate, endDate);

		System.out.println("Dif. ChronoUnit em dia: " + dia);
		System.out.println("Dif. ChronoUnit Mês: " + mes);
		System.out.println("Dif. ChronoUnit Ano: " + ano);
		
		System.out.println("================//====================");
		System.out.println("Dif. em Period --> Dia:" + period.getDays() + "  Mês:" + period.getMonths() + "  Ano:"
				+ period.getYears());

		System.out.println("===================//=======================");
		System.out.println(endTime.format(dtfDateTime));
		System.out.println(endDate.format(dfDate));
		System.out.println(statTime.format(dtfDateTime));

		System.out.println("Tempo usando Duration");
		Duration duration = Duration.between(statTime, endTime);
		long horas = duration.toHours();
		long minutos = duration.toMinutes();
		long segundos = duration.getSeconds();
		
		System.out.println(horas);
		System.out.println(minutos);
		System.out.println(segundos);
		
		System.out.println("Tempo usando ChronoUnit");

		long hor = ChronoUnit.HOURS.between(statTime, endTime);
		long minut = ChronoUnit.MINUTES.between(statTime, endTime);
		long segund = ChronoUnit.SECONDS.between(statTime, endTime);

		
		System.out.println(hor);
		System.out.println(minut);
		System.out.println(segund);

		
	}

}
