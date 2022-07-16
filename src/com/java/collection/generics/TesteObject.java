package com.java.collection.generics;

import java.util.ArrayList;
import java.util.List;

public class TesteObject {

	public static void main(String[] args) {
List<Object> teste = new ArrayList<>();

teste.add(2);
teste.add("Teste");
teste.add(2.5);

 Double num =(Double) teste.get(1);
 System.out.println(num);

//System.out.println(teste);
/*
 * if (teste instanceof Double) {
 * 
 * }
 */

	}

}
