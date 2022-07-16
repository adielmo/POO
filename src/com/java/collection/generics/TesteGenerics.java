package com.java.collection.generics;

public class TesteGenerics<T> {
	
	T t;

	public TesteGenerics(T t) {
	
		this.t = t;
	}
	
	public void print() {
		System.out.println(t);
	}

}
