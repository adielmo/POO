package com.java.checkList;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SizeString {

	public static void main(String[] args) {
		Map<String, Integer> qtdletrasName = new HashMap<>();
		
		var frase = "O Corinthians segue sem saber qual técnico terá na temporada que vem."
				+ " Em pronunciamento na noite de hoje (26), após a derrota por 2 a 0 para "
				+ "o Fluminense, o presidente Duílio Monteiro Alves pediu um pouco mais de "
				+ "paciência antes do anúncio da permanência ou saída de Vítor Pereira. O "
				+ "treinador diz querer permanecer, mas uma questão familiar atrasa a "
				+ "definição.... - Veja mais em https://www.uol.com.br/esporte/futebol/"
				+ "ultimas-noticias/2022/10/27/corinthians-pede-paciencia-para-definir-se"
				+ "-vp-fica-ou-nao-em-2023.htm?cmpid=copiaecola";
		
		//System.out.println(	frase.replaceAll("[,():0-9]", "").replaceAll("[-/=?.]", " "));
		
		Map<String, Integer> contSizeName = contSizeName(qtdletrasName, frase);
		
		/**
		 * Ordenação de Map
		 */
		
		
		  Map<String, Integer> sortMapToValue = sortMapToValue(contSizeName);
		  Map<String, Integer> sortMapToKey = sortMapToKey(contSizeName);	
				
		  sortMapToKey.forEach((key, value) -> {
			System.out.println(key + ": " + value); });
		
		
		/*
		 * contSizeName.forEach((key, value) -> {
		 *  System.out.println(key + ": " + value); });
		 */

	}

	private static Map<String, Integer> sortMapToKey(Map<String, Integer> contSizeName) {
		return contSizeName.entrySet().stream()
			.sorted(Map.Entry.comparingByKey()).collect(Collectors.toMap(
			Map.Entry::getKey, Map.Entry::getValue,
			(olKey, newKey) -> olKey, LinkedHashMap::new));
		
	}

	private static Map<String, Integer> sortMapToValue(Map<String, Integer> contSizeName) {
		return contSizeName.entrySet() .stream()
		  .sorted(Map.Entry.comparingByValue()) .collect(Collectors.toMap(
		  Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> 
		  oldValue, LinkedHashMap::new));
	
	}

	private static Map<String, Integer> contSizeName(Map<String, Integer> qtdletrasName, String frase) {

		String replaceAll = frase.replaceAll("[,():0-9]", "").replaceAll("[-/=?.]", " ");
		String[] splitName = replaceAll.split(" ");
		
		for (int i = 0; i < splitName.length; i++) {
		
			if (qtdletrasName.containsKey(splitName[i])) {
				//Integer integer = qtdletrasName.get(splitName[i]);
			}else {
				var nome =convNameUpperCase(splitName[i]);
				
				qtdletrasName.put(nome, splitName[i].length());
			}
			
		}
		
		return qtdletrasName;
		
	}

	private static String convNameUpperCase(String name) {
		StringBuilder sb = new StringBuilder();
		String[] splitName = name.split("");
		
		for (int i = 0; i < splitName.length; i++) {
			if (i == 0) {
			sb.append(splitName[i].toUpperCase());		
			}else {
				sb.append(splitName[i].toLowerCase());
			}
			
		}
		return sb.toString();
	}

}
