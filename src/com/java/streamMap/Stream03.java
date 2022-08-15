package com.java.streamMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Stream03 {

	private static Integer mapValues;
	private static String mapKeys;

	public static void main(String[] args) {

		System.out.println("======Stream HashMap Reduce======");
		Map<String, Integer> maps = new HashMap<>();
		maps.put("a", 15);
		maps.put("b", 25);
		maps.put("c", 10);
		maps.put("d", 3);
		maps.put("e", 56);
		maps.put("f", 72);
		maps.put("g", 4);
		maps.put("h", 9);
		maps.put("i", 16);
		maps.put("j", 7);
		StringBuilder sb = new StringBuilder();
		List<String> y= maps.entrySet()
					        .stream()
					        .map(x -> x.getKey())
			                .collect(Collectors.toList());
		y.stream()
		.peek(x -> System.out.println(x))
        .map(x -> sb.append(x));
		System.out.println(sb.toString());
		
	//y.forEach(x -> System.out.println(y));

		//mapValues = getMapValues(maps);
		    //String mapKeys =
		    		getMapKeys(maps);

		 //System.out.println(mapValues);
		 System.out.println(mapKeys);

	}
	private static void getMapKeys(Map<String, Integer> maps) {
		StringBuilder sb = new StringBuilder();
		 	  maps.entrySet()				
				  .stream()
				  .peek(x ->System.out.print(x.getKey()))
				  .map(x -> sb.append(x.getKey()));
				 // .toString();
		 
		 //return sb.toString();
				
	}

	private static Integer getMapValues(Map<String, Integer> maps) {

		return maps.values()
				   .stream()
				   .mapToInt(Integer::valueOf)
				   .sum();

	}

	

}
