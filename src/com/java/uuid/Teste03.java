package com.java.uuid;

import java.util.UUID;

public class Teste03 {

	public static void main(String[] args) {
		String string ="58e0a7d7-eebc-11d8-9669-0800200c9a66";
 String uuidToString =String.valueOf(UUID.randomUUID().toString());
 UUID stringToUuid = UUID.fromString(string);
 
 System.out.println("Uuid to String: "+uuidToString);
 System.out.println("------------//---------------");
 System.out.println("String to Uuid: "+ stringToUuid);
	}

}
