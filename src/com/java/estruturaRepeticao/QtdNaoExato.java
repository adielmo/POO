package com.java.estruturaRepeticao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QtdNaoExato {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int qtd=1, valor, soma=0, flag=0;
		List<Integer> numeros = new ArrayList<>();
			
		 
		 do {
			 
			 System.out.println("Digete o " + qtd + "º valor:");
				 valor = scanner.nextInt();
				 soma += valor;
				 if (valor != 0) {
					 numeros.add(valor);
				}
		
			qtd ++; 
			//System.out.println("Para sair digete 0:");
			// flag = scanner.nextInt();
		 }while(valor != 0);
		 
		 numeros.forEach(num -> System.out.print(num + " "));
		 System.out.println("\nValor total: " + soma);


	}

}
