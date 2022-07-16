package com.java.collection.generics;

public class TesteMain {

	public static void main(String[] args) {

		TesteGenerics<String> genericsString = new TesteGenerics<>("Adielmo");
		TesteGenerics<Double> genericsDouble = new TesteGenerics<>(5.5);
		TesteGenerics<Integer> genericsInt = new TesteGenerics<>(5);
		
	genericsDouble.print();
	genericsInt.print();
	genericsString.print();
		
	}

}
