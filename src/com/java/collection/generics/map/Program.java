package com.java.collection.generics.map;

import java.util.Map;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {
	Map<String, String> cookeis = new TreeMap<>();
	
	cookeis.put("username", "Maria");
	cookeis.put("user", "João");
	cookeis.put("email", "maria@gmail.com");
	cookeis.put("phone", "97451-6587");
	cookeis.put("cpf", "025-654-984-25");
	
	System.out.println("Todos Values do Map Cookeis: " + cookeis.values());
	System.out.println("Retorna todos os Key do Cookeis: " + cookeis.keySet());
	System.out.println("Tamanho do Cookeis: " + cookeis.size());
	System.out.println("Retorna o Value da Chave Espercifica: " + cookeis.get("cpf"));
	System.out.println("Retorna o boolean, verifica a Key: " + cookeis.containsKey("cpf"));
	System.out.println("Retorna o boolean, verifica o Value: " + cookeis.containsValue("João"));
	//cookeis.remove("phone");
	System.out.println("============================");
	System.out.println("Retorna todos os Key do Cookeis: " + cookeis.keySet());
	System.out.println("Todos Values do Map Cookeis: " + cookeis.values());
	System.out.println("============================");

	
	for (String key : cookeis.keySet()) {
		System.out.println(key + ": " + cookeis.get(key));
	} 
	




    
	
	//cookeis.clear();
	

	}

}
