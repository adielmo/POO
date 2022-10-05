package com.java.streamMatch;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 * @author Adielmo
 *
 */
public class AnyMatch {
	// https://receitasdecodigo.com.br/java/java-8-stream-anymatch-com-exemplos
	public static void main(String[] args) {
		var buscaNome ="MARTA";
		 List<Integer> ls = Arrays.asList(2, 3, 4, 5, 6, 7);
		 List<String> lsString = 
			 Arrays.asList("marta", "Receitas", "de", "Código", "Stream", "Marta",
					 "anyMatch", "Maria", "Pedro", "Marta");
		 
			long countName = isCountName(lsString, buscaNome);
		boolean validoNumPar = isValidoNumPar(ls);
		boolean validoStringSize2 = isValidoStringSize(lsString, buscaNome);
		
		boolean validoStringSize = isValidoStringSize(lsString);
		Collection<String> nomesMaior = nomesMaior(lsString);
		
		System.out.println(validoNumPar);
		System.out.println(validoStringSize);
		System.out.println("Tem o name "+buscaNome+" :"+ validoStringSize2);
		System.out.println("Qunatos nome tem "+buscaNome+" na lista :"+ countName);
		
	System.out.println("===========================//======================");
	nomesMaior.forEach(name -> {
		System.out.println(name);
	});
	
	
	}

	private static long isCountName(List<String> lsString, String buscaNome) {
		return lsString.stream()
				.filter(name -> name.toLowerCase().equals(buscaNome.toLowerCase()))
				//.distinct()
				.count();
		
	}

	private static boolean isValidoStringSize(List<String> lsString, String buscaNome) {
	return lsString.stream()
			//.map(String::toLowerCase)
			.anyMatch(name -> name.toUpperCase().equals(buscaNome.toUpperCase()));
		
	}

	private static Collection<String> nomesMaior(List<String> lsString) {
		return lsString.stream().filter(name -> name.length() > 5)
				.collect(Collectors.toSet());
		
	}

	private static boolean isValidoStringSize(List<String> lsString) {
		 return lsString.stream().anyMatch(name -> name.length() < 5);
		
	}

	private static boolean isValidoNumPar(List<Integer> ls) {
		return ls.stream().anyMatch(x -> x % 2 == 0);
		
	}

}
