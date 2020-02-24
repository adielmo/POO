package com.java.generics.ex;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TesteSet {
	public static void main(String[] args) {
		
		//Set<String> set = new HashSet<String>();
		//Set<String> set = new TreeSet<String>();
		Set<String> set = new LinkedHashSet<String>();		
	
		
		set.add("Tv");
		set.add("Fogão");
		set.add("Geladeira");
		set.add("Tablet");
		
		/*
		 * for (int i = 0; i < set.size(); i++) { System.out.println(set); }
		 */
		
		System.out.println();
		for (String string : set) {
			System.out.println(string);
		}
	

	}

}
