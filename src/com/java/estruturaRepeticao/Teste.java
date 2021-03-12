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
		char flag;
		int total = 0, coelhoTotal = 0, ratoTotal = 0, sapoTotal = 0;
		do {
			String linha = outAnimais(scanner);

			if (linha != null) {
				String[] fields = linha.split(",");

				if (map.containsKey(fields[0])) {
					map.put(fields[0], Integer.parseInt(fields[1]) + map.get(fields[0]));
				} else {

					map.put(fields[0], Integer.parseInt(fields[1]));
				}

			}

			flag = outSaida(scanner);

		} while (flag != 'n');
		
		coelhoTotal = map.get("c");
		ratoTotal = map.get("r");
		sapoTotal = map.get("s");
		for (String key : map.keySet()) {
			total += map.get(key);

		}
		
			System.out.println("Relatorio de Valores");
			System.out.println("Total de cobais: " + total);
			System.out.println("Total de Coelho: " + coelhoTotal);
			System.out.println("Total de Rato: " + ratoTotal);
			System.out.println("Total de Sapo: " + sapoTotal);
			System.out.println("Percentual de Coelho: " + df.format((double) coelhoTotal / total * 100.0) + "%");
			System.out.println("Percentual de Rato: " + df.format((double) ratoTotal / total * 100.0) + "%");
			System.out.println("Percentual de Sapo: " + df.format((double) sapoTotal / total * 100.0) + "%");
			
			
			System.out.println("Todos Itens:");
			for(String key : map.keySet()) {
			System.out.println("Chave: " + key + " Valor: " + map.get(key));
		}
				
		scanner.close();
	}
	
	

	public static char outSaida(Scanner scanner) {
		char flag;
		do {
			System.out.println("DESEJA CONTINUAR: S - N");
			flag = scanner.next().charAt(0);

		} while (flag != 's' && flag != 'n');

		return flag;
	}

	public static String outAnimais(Scanner scanner) {
		char letra;
		boolean flag = false;
		String linha=" ";
		do {
			System.out.println("Digete a letra  e  a quantidade para representar o animal: ");
			System.out.println("r - Rato");
			System.out.println("s - Sapo");
			System.out.println("c - Coelho");
			System.out.println("Ex: s,10");

			 linha = scanner.next();
			letra = linha.charAt(0);
			switch (letra) {
			case 'r':
				break;
				
			case 's':
				break;
				
			case 'c':

				break;

			default:
				System.out.println("Letra invalida:");
				flag = true;
				break;
			}
						
		}while(flag);
		
return linha;
	}

}
