package com.java.stream.reduce;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Reduce01 {

	public static void main(String[] args) {

List<String> names = Stream.of("welcome", "to the", "medium", "where", "we will",  "learn", "streams", "welcome" )		
                      .filter(s -> s.startsWith("w"))
                      .map(s -> s.substring(3))
                      .distinct()
                      .sorted()
                      .collect(Collectors.toList());

names.forEach(s -> System.out.println(s));
                      
	}

}
