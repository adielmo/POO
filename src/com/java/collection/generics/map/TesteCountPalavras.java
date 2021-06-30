package com.java.collection.generics.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TesteCountPalavras {

	public static void main(String[] args) {
		String frase = "Esse texto, eu poderia simplesmente escrever aqui para você não repetir palavras durante um texto e me dar por satisfeito, "
				+ "mas eu quero ajudar você a entender tudo o que está por trás do processo de escrever um texto"
				+ " melhor você um";
		//String frase ="a chave é nunca desistir, nunca msmo";
		
//		String[] nome = frase.toLowerCase().split(" ");
		String[] nome = frase.toLowerCase().replaceAll("[^a-zA-Zêçã0-9 ]", "").split(" ");

		Map<String, Integer> maps = new HashMap<>();
		Set<Product> setNomes = new HashSet<>();

		for (int i = 0; i < nome.length; i++) {

			if (!maps.containsKey(nome[i])) {
				maps.put(nome[i], 1);
			} else {
				int valor = maps.get(nome[i]);
				maps.put(nome[i], valor += 1);
			}
		}
					
		for(String key : maps.keySet()) {
			//System.out.println(key + ": " + maps.get(key));
			Product nomes = new Product(key, Double.valueOf(maps.get(key)));	
			setNomes.add(nomes);
		}
		
		//setNomes.stream().sorted(Comparator.comparing(Product::getPrice).reversed()).forEach(i -> System.out.println(i));
//setNomes.stream().sorted(Comparator.comparing(Product::getName).reversed()).limit(5).forEach(i -> System.out.println(i));
		setNomes.stream().sorted(Comparator.comparing(Product::getPrice).reversed())
		.limit(15).forEach(i -> System.out.println(i));		
		     
		
	}

}
