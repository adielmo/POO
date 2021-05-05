package com.java.array;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int count=0, opcao=0, qtd=0;
	boolean flag =false;
	
	do {
		try {
			System.out.println("Tamanho do Array:");
			qtd = scanner.nextInt();
		} catch (InputMismatchException e) {
			qtd = -1;
			System.out.println("Digete Somente Números!\n");
		}
		scanner.nextLine();
	}while(qtd <= 0);
	
	int[] numeros = new int[qtd];
		
	for (int i = 0; i < numeros.length; i++) {
		boolean valido = false;
		do {
			try {
				valido = false;
				System.out.println("Qual número vc vai enserir posição do Array " + (i) + " :");
				numeros[i] = scanner.nextInt();

			} catch (InputMismatchException e) {
				valido = true;
				System.out.println("Digete Somente Números");
			}
			scanner.nextLine();
		} while (valido);

	}
	System.out.println("Order DESC");
	for(int i=numeros.length-1; i >= 0; i--) {
		System.out.print("Posição ["+i+"]= " + numeros[i]+ "   ");	
	
	}
	System.out.println("\n========================///===========================");
	System.out.println("Order ASC");
	while (count < numeros.length) {
		System.out.print("Posição ["+count+"]= " + numeros[count]+ "   ");	
	count++;
	}
	System.out.println("\n========================///===========================");
	do {
		
		try {
			flag = false;
			System.out.println("Digete sua Opção:");
			System.out.println("1 - Buscar o valor por Posição:");
			System.out.println("2 - Tamanho do Array:");
			System.out.println("3 - Buscar por Valor:");
			System.out.println("4 - Sair:");
			opcao = scanner.nextInt();

		} catch (InputMismatchException e) {
			System.out.println("Digete Somente Números:");
			flag = true;
		}
		
	switch (opcao) {
	
	case 1:
		
		findByValue(numeros, scanner);
		break;
	case 2:
		System.out.println("Tamanho do Array: " + sizeArray(numeros));
		break;
	case 3:

		System.out.println("Digete o valor q deseja buscar:");
		int value = scanner.nextInt();
		int posicao = buscarPosicaoDoValorFirst(numeros, scanner, value);
		if (posicao >= 0) {
			System.out.println(String.format("O valor %d encontra na Posição %d .", value, posicao));

		}		
		System.out.println(String.format("Valor %d não Encotrado! ", value));
		
		break;
	case 4:
		flag=true;
		System.out.println("Fim do Programa!!!!!!!!!!!");
		break;
		
	default:
		
		System.out.println("Error, Tente novamente!\n");
		break;
	}
	scanner.nextLine();
	}while(!flag);

	}

	private static int buscarPosicaoDoValorFirst(int[] numeros, Scanner scanner, int value) {
		boolean flag= false;
	;
	do {
		try {
		flag=false;
	
		
			for (int i = 0; i < numeros.length; i++) {
				if (numeros[i] == value) {
					return i;
				}
			}
		}catch (InputMismatchException e) {
			System.out.println("Digete Somente Números:");
			flag=true;
		}	
	}while(flag);
	
	return -1;	
	}

	private static int sizeArray(int[] numeros) {
		return numeros.length;
	}

	private static void findByValue(int[] numeros, Scanner scanner) {
		boolean flag = false;
		do {
			System.out.println("Escolha a Posição de (0 há "+ (numeros.length-1)+")");
			flag = false;
			try {
				
				System.out.println("Digete a Posição q deseja buscar o valor:");
				int posi = scanner.nextInt();

				isEmpety(numeros);
				isPresent(numeros, posi);

				System.out.println("Valor da Posição " + posi + " :" + numeros[posi]);
		} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Essa posição não existe no Array!");
				flag = true;
			}

		} while (flag);

	}
	
	

	private static boolean isPresent(int[] numeros, int posi) {
		try {
			return numeros.length <= posi ? true : false;

		} catch (ArrayIndexOutOfBoundsException e) {
			throw new RuntimeException("Está posição não existe!!" + posi);
		}
	}

	private static boolean isEmpety(int[] numeros) {
		return numeros.length == 0 ? true : false; 
		
	}

}
