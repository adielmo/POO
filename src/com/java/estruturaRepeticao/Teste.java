package com.java.estruturaRepeticao;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("00.00");
		Map<String, Integer> map = new HashMap<>();
		int flag = 0;
		int total =0, coelhoTotal=0, ratoTotal=0, sapoTotal=0;
		do {
		String linha = outAnimais(scanner);
		String[] fields = linha.split(",");
		
		if (map.containsKey(fields[0])) {
			map.put(fields[0], Integer.parseInt(fields[1]) + map.get(fields[0]));	
		}
		
		map.put(fields[0], Integer.parseInt(fields[1]));
	
	 flag = outSaida(scanner);
	
		}while(flag != 0);
		
	
	for(String key : map.keySet()) {
		total += map.get(key);
		coelhoTotal += map.get("c");
		ratoTotal += map.get("r");
		sapoTotal += map.get("s");
	}
		
	

	
	System.out.println("Relatorio de Valores");
	System.out.println("Total de cobais: " + total);
	System.out.println("Total de Coelho: " + coelhoTotal);
	System.out.println("Total de Rato: " + ratoTotal);
	System.out.println("Total de Sapo: " + sapoTotal);
	System.out.println("Percentual de Coelho: " + df.format((total / coelhoTotal) * 100) +"%");
	System.out.println("Percentual de Rato: " + df.format((total / ratoTotal) * 100) +"%");
	System.out.println("Percentual de Sapo: " + df.format((total / sapoTotal) * 100) +"%");




	}
public static void imprimir() {
}
	
	
	
	public static int outSaida(Scanner scanner) {
		System.out.println("DIDETE 0 PARA SAIR:");
		int flag =  scanner.nextInt();
		return flag;
	}
	
	public static String outAnimais(Scanner scanner) {
	
		System.out.println("Digete a letra  e  a quantidade para representar o animal: ");
		System.out.println("r - Rato");
		System.out.println("s - Sapo");
		System.out.println("c - Coelho");
		System.out.println("Ex: s 10");
		String linha = scanner.next();
	 linha = scanner.nextLine();
		return linha;

	}

}
