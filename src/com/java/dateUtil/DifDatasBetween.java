package com.java.dateUtil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DifDatasBetween {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Date startDate = null;
		Date endDate = null;

		try {
			endDate = sdf.parse("18-05-2021");
			startDate = sdf.parse("01-05-2021");

		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(sdf.format(startDate));
		System.out.println(sdf.format(endDate));

		long difMilliSegundos = Math.abs(endDate.getTime() - startDate.getTime());
		long difDia = TimeUnit.DAYS.convert(difMilliSegundos, TimeUnit.MILLISECONDS);
		System.out.println(difDia);
	}

}
