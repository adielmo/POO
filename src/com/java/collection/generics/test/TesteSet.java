package com.java.collection.generics.test;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.java.generics.ex.TesteMaioresValores;

public class TesteSet {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int qtd, val  =0;
		int maiorValor=Integer.MIN_VALUE;
		int menorValor=Integer.MAX_VALUE;
		
		System.out.println("Qtd de valores");
		qtd = scanner.nextInt();
		
	Set<Integer> valores = new HashSet<>();
		
		for (int i = 0; i < qtd; i++) {
			System.out.println("Digete o " + (i+1) + "º valor: ");
			val = scanner.nextInt();
			valores.add(val);
			
			
		}
		
	for (Integer integer : valores) {
		System.out.print(integer + ", ");
	}
			}

}
