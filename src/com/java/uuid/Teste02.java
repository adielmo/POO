package com.java.uuid;

import java.util.UUID;

public class Teste02 {

	public static void main(String[] args) {
		UUID id;
		String uuidString;
		
		id = UUID.randomUUID();
		uuidString= String.valueOf(id);
		
		
UUID fromString = UUID.fromString(uuidString);

		System.out.println("UUID: " + id);
		System.out.println("String: " + uuidString);
		System.out.println(id.equals(fromString));
	}

}
