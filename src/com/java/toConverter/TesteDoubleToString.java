package com.java.toConverter;

import java.util.Scanner;

public class TesteDoubleToString {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
double value =0;
int qtd=0;
double sum=0;

System.out.println("Tamanho do Array:");
qtd=scanner.nextInt();

String[] array= new String[qtd];

for (int i = 0; i < array.length; i++) {
	System.out.println("Digete um Número na Posição do Array:"+i);
	value = scanner.nextDouble();
	array[i]=String.valueOf(value);

}

for(String aa: array) {
	System.out.println(aa);
}

   
  
	}

}
