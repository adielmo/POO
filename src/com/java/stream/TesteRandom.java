package com.java.stream;

import java.util.Random;

public class TesteRandom {
	public static void main(String[] args) {
			
		int	num = valorRandom(1560);
			
			System.out.println(num);
		
	}
	

	private static int valorRandom(int valorAte) {
		Random random = new Random();	
		boolean flag = false;
		int num;
		do {
			num =random.nextInt(valorAte);
			if (num % 2 == 0) {
				flag = true;
			}
			
		} while (!flag);
		return num;
	}

}
