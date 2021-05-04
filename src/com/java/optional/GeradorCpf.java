package com.java.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GeradorCpf {

	public static void main(String[] args) {
		int count=0;
		boolean flag = false;
		StringBuilder sb = new StringBuilder();
		List<String> cpfs = new ArrayList<>();
		
		while(count < 2) {
		
		do {
            flag=false;
			int cpfInt = new Random().nextInt(1000000000);
			int cpfI = new Random().nextInt(10);
            long cpfLong = Long.valueOf(cpfInt+cpfI);
			String cpfString = String.valueOf(cpfInt);			

			if (cpfLong > 0 && cpfString.length() == 11) {
				
				  sb.append(cpfString.substring(0, 3)); sb.append(".");
				  sb.append(cpfString.substring(3, 6)); sb.append(".");
				  sb.append(cpfString.substring(6, 9)); sb.append("-");
				  sb.append(cpfString.substring(9, 11));
				 
			//	System.out.println(cpfString);
			} else {
				flag = true;
			}

		} while (flag);
cpfs.add(sb.toString());
count ++;
		//System.out.println(sb.toString());
		}
		
		cpfs.forEach(i-> System.out.println(i));
		
	}

}
