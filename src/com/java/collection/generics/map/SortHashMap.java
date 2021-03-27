package com.java.collection.generics.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class SortHashMap {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("pedro", 8);
		map.put("arthur", 10);
		map.put("maria", 2);
		map.put("giba", 1);
		map.put("nati", 7);
		map.put("jean", 3);
		
		
		
		Map<Funcionario, Integer> funcMap = new TreeMap<>((o1, o2) -> (int)(o2.getSalario() - o1.getSalario()));
		
	    funcMap.put(new Funcionario(23, "Arthur", "Médico", 12500), 39);
		funcMap.put(new Funcionario(53, "Maria", "Professora", 3500), 9);
		funcMap.put(new Funcionario(23, "Adielmo", "TI", 4521), 6);
		funcMap.put(new Funcionario(23, "Joao", "Jogador", 34900), 18);
		funcMap.put(new Funcionario(23, "Marta", "Engenheiro", 9231), 87);
		
		//System.out.println(funcMap);
		
		List<Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
		Collections.sort(entries,(a, b) -> a.getKey().compareTo(b.getKey()));
		
funcMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Funcionario::getSalario).reversed()))
.forEach(System.out::println);
		
		//map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		//System.out.println("========================================");
		//map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

	}

}
