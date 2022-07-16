package com.java.uuid;

import java.util.Random;
import java.util.UUID;

public class Teste01 {

	public static void main(String[] args) {

		
		Random random = new Random(); 
		
		UUID uuidRandom = UUID.randomUUID();
		
		int variant = uuidRandom.variant();
		int version = uuidRandom.version();
		
		long random63BitLong = random.nextLong() & 0x3FFFFFFFFFFFFFFFL;
		long variant3BitFlag = 0x8000000000000000L;
		
		System.out.println(uuidRandom);
		System.out.println(variant);
		System.out.println(version);
		System.out.println(random63BitLong);
		System.out.println(random63BitLong + variant3BitFlag);
	}

}
