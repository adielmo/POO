package com.java.random;

import java.util.UUID;

public class TesteUuidRandom {
public static void main(String[] args) {
	
	//String uuid= UUID.randomUUID().toString().split("-")[0];
	//replaceAll("[^0-9.]", "");
	String uuidRandom = UUID.randomUUID().toString();
	String uuid= uuidRandom.replaceAll("[-]", "");
    String numeros = uuidRandom.replaceAll("[^0-9.]", "");
    String letras = uuidRandom.replaceAll("[^a-z.]", "");
    
	System.out.println(uuidRandom+"       "+ uuidRandom.length());
	System.out.println(uuid+"       "+uuid.length());
	System.out.println("Somente Números: "+numeros + "     "+numeros.length());
	System.out.println("Somente Letras: "+letras+ "         "+letras.length());

}

	
}
