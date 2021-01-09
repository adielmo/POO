package com.java.collection.generics.test;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class TestSet02 {

	public static void main(String[] args) {
		Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));
		//union
		Set<Integer> c = new TreeSet<>(a);
		c.addAll(b);
		System.out.println("Junção de Conj, A & B, valores únicos: "+c);
		//intersection
		
			System.out.println("Conj A: "+ a);
			System.out.println("Conj B: "+ b);
		
		Set<Integer> d = new TreeSet<>(a);
		d.retainAll(b);
		System.out.println("Insenção somente de valores IGUAIS,\n valores dos Conj, A & B: "+ d);
		//difference
		Set<Integer> e = new TreeSet<>(a);
		e.removeAll(b);
		System.out.println("Insenção somente de valores DIFERENTES,\n valores dos Conj, A & B: "+ e);
		}
}
