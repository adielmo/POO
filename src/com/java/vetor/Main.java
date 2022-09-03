package com.java.vetor;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {

	public static void main(String[] args) {
		Set<String> collectSet = Stream.of("Maria", "Joana", "Paula", "Joana").collect(Collectors.toSet());
		
		Student student = new Student(1.56, 
				collectSet,
			    Arrays.asList(56, 82),
				new String[]{"A", "B", "C", "D", "E", "F"});
		
System.out.println(student);
		
		
	}

}
