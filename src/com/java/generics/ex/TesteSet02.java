package com.java.generics.ex;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class TesteSet02 {

	public static void main(String[] args) {
		Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));
		
		// União de elementos diferentes, entre dois Conjuntos
		Set<Integer> c = new TreeSet<>(a);
		c.addAll(b);
		System.out.println(c);
		
		// Elementos Iguais
		Set<Integer> d = new TreeSet<>(a);
		d.retainAll(b);
		System.out.println("Elementos Iguais:" + d);
		
		// Elementos Diferentes
		Set<Integer> e = new TreeSet<>(a);
		e.removeAll(b);
		System.out.println("Elementos Diferentes: "+e);
	}

}
