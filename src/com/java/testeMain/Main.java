package com.java.testeMain;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean flag = false;
		int tamanhoArray=0;
		Atleta[] vetorAtletas = null;

		do {

			try {
				flag = false;
				System.out.println("Digete a qtd de Atletas:");

				vetorAtletas = new Atleta[scanner.nextInt()];

			}

			catch (InputMismatchException e) {
				scanner.next();
				flag = true;
				System.out.println("Error: " + e.getMessage());
			}

		} while (flag);
		// System.out.println(atletas.length);

		do {
		String nome;
		String sexo;
		Integer idade;
		Double peso;
		Double altura;
		
		
		
		System.out.println("Digete os dados do Atleta: " + (tamanhoArray + 1));

		System.out.println("Digete o Nome do Atleta:");
		nome = scanner.next();
		System.out.println("Digete o Sexo de " + nome + " : F-M");
		sexo = scanner.next();
		System.out.println("Digete o Idade de " + nome + " :");
		idade = scanner.nextInt();
		System.out.println("Digete o Peso de " + nome + " :");
		peso = scanner.nextDouble();
		System.out.println("Digete o altura de " + nome + " :");
		altura = scanner.nextDouble();

		Atleta atleta = new Atleta(nome, sexo, idade, peso, altura);
		//for (int i = 0; i < vetorAtletas.length; i++) {

			vetorAtletas[tamanhoArray]= atleta;
			tamanhoArray ++;
	//	}
		
		
		}while (tamanhoArray < vetorAtletas.length );//Enquanto for Verdadeiro Volta.
		//Fim Input
		
		
		for (int i = 0; i < vetorAtletas.length; i++) {
			System.out.println(vetorAtletas[i]);
			
		}
	
		//Inicio Ouput
		
		//AtletaMaisAltoMasculino
		Atleta atletaMascMaisAlto = buscarAtletaMaisAlto(vetorAtletas);
		
		//AtletaFemMaiorPeso
		Atleta atletaFemMaiorPeso = buscarAtletaFemMaiorPeso(vetorAtletas);
		
		//MediaIdadeAtletas
		Double mediaIdadesAtletas = buscarAvgAtletas(vetorAtletas);
		
		System.out.println("\nAtleta Mais Alto Masculino: " + atletaMascMaisAlto);
		System.out.println("Atleta Feminino com maior peso: " + atletaFemMaiorPeso);
		System.out.println("Média de idade dos Atletas: " + mediaIdadesAtletas);
		
	}

	private static Double buscarAvgAtletas(Atleta[] vetorAtletas) {
		Double avgAge = 0.0;
		for (int i = 0; i < vetorAtletas.length; i++) {
			
			avgAge += vetorAtletas[i].getIdade();
		}
		
		return avgAge / vetorAtletas.length;
	}

	private static Atleta buscarAtletaFemMaiorPeso(Atleta[] vetorAtletas) {
		Double atletaMaiorPeso = Double.MIN_VALUE;
		int posicaoAtletaFemMaiorPeso = 0;;
		
		for ( int i = 0; i < vetorAtletas.length; i++) {
			if (vetorAtletas[i].getSexo().equalsIgnoreCase("F") && 
					vetorAtletas[i].getPeso() > atletaMaiorPeso) {
				atletaMaiorPeso = vetorAtletas[i].getPeso();
				posicaoAtletaFemMaiorPeso = i;
			}
			
			
		}
		
		return vetorAtletas[posicaoAtletaFemMaiorPeso];
	}

	private static Atleta buscarAtletaMaisAlto(Atleta[] vetorAtletas) {
		Double atletaAlto = Double.MIN_VALUE;
		int posicaoAtletaMaisAlto =0;
		
		
		for (int i = 0; i < vetorAtletas.length; i++) {
			if (vetorAtletas[i].getSexo().equalsIgnoreCase("M") && 
					vetorAtletas[i].getAltura() > atletaAlto) {
				
				atletaAlto = vetorAtletas[i].getAltura();
				posicaoAtletaMaisAlto=i;
			}
			
			
		}
		
		return vetorAtletas[posicaoAtletaMaisAlto];
	}

}
