package com.java.string;

import java.util.Random;

public class TestStringReplaceAll {
	public static void main(String[] args) {

		Random random = new Random();
		int count = 0;

		while (count < 10) {
			count++;
			long rand = random.nextLong();
			String uuidRandom = String.valueOf(rand).replaceAll("(?:[^0-9]+)", "");

			System.out.println(rand + "    " + uuidRandom);

//System.out.println(random.nextLong()+"   "+ UUID.randomUUID().toString().split("-")[0]);
		}

		System.out.println("=======//====\n" + count);
	}

}
