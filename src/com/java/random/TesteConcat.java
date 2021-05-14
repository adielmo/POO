package com.java.random;

public class TesteConcat {

	public static void main(String[] args) {
		byte[] alfatetoMaiusculo =new byte[26];
		byte[] alfatetoMinusculo =new byte[26];
		byte[] bytsNumeros =new byte[10];
		
		byte countNum=48;
		for (int i = 0; i < bytsNumeros.length; i++) {
			bytsNumeros[i]= countNum;
			countNum++;
		}
		
		byte countMin=97;
		for (int i = 0; i < alfatetoMinusculo.length; i++) {
			alfatetoMinusculo[i]= countMin;
			countMin++;
		}

		byte count=65;
		for (int i = 0; i < alfatetoMaiusculo.length; i++) {
			alfatetoMaiusculo[i]= count;
			count++;
		}
		String bytsNymeros = new String(bytsNumeros);
		String alfaMInusculo = new String(alfatetoMinusculo);
		String alfaMaiusculo = new String(alfatetoMaiusculo);
		
		System.out.println(bytsNymeros);
		System.out.println(alfaMaiusculo);
		System.out.println(alfaMInusculo);
		
	}

}
