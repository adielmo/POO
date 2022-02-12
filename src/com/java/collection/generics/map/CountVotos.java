package com.java.collection.generics.map;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class CountVotos {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean flag = false;
		int voto = 0;
		Map<String, Integer> votosMap = new HashMap<>();
do {
	flag = false;
		voto = entradaDados(scanner, voto);

		contadorVotos(voto, votosMap);
		
		
		 flag = isLetraValida(scanner);
		
}while(flag);


  for(String key : votosMap.keySet()) { System.out.println(key+"---"+
  votosMap.get(key)); }

votosMap.entrySet().stream().sorted().forEach((key) -> System.out.println("Nome:"+key.getKey() +" Qtd:" +key.getValue()));


	}

	private static boolean isLetraValida(Scanner scanner) {
		boolean flag = false;
		String letra="";
		do {
			System.out.println("Deseja enserir mais um Voto: S - N");
			 letra = scanner.next().toUpperCase();
			 scanner.nextLine();
		} while (!letra.equals("N") && !letra.equals("S"));
		
			switch (letra) {
			case "S":
				flag = true;
				break;
			case "N":
				flag = false;
				break;

			default:
				break;
			}
		
		
		return flag;

	}

	private static void contadorVotos(int voto, Map<String, Integer> votosMap) {
		

		String name = nameCandidado(voto);

		if (!votosMap.containsKey(name)) {
			votosMap.put(name, 1);
		} else {
			Integer qtdVotos = votosMap.get(name);
			votosMap.put(name, qtdVotos += 1);
		}

	}

	private static String nameCandidado(int voto) {
		String name = "";
		switch (voto) {
		case 10:
			name = "Pedro";
			break;

		case 45:
			name = "João";

			break;
		case 23:
			name = "Maria";

			break;

		default:
			break;
		}
		return name;
	}

	private static int entradaDados(Scanner scanner, int voto) {
		boolean flag;
		do {

			try {

				flag = false;

				System.out.println("Escola a Opção:");
				System.out.println("Pedro -- 10");
				System.out.println("João --- 45");
				System.out.println("Maria -- 23");
				voto = scanner.nextInt();

			} catch (InputMismatchException e) {
				System.out.println("\nError de valor: " + e.getLocalizedMessage());
				flag = true;
			}
			flag = isValidarNumero(voto, flag);
			scanner.nextLine();
		} while (flag);
		return voto;
	}

	private static boolean isValidarNumero(int voto, boolean flag) {
		if (flag)
			return true;
		switch (voto) {
		case 10:
		case 45:
		case 23:

			break;

		default:
			System.out.println("Digete a Opção Correta:");
			flag = true;

			break;
		}
		return flag;

	}

}
