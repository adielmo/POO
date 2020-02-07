package com.java.matrizes.ex;

public class Data {
	public static void main(String[] args) {
		
		Integer[][] mat = new Integer[3][4]; 

		entradaDeDados(mat);
		
		saidaDeDados(mat);
		
		fimDePrograma();
		
	}

	private static void fimDePrograma() {
		System.out.println("Fim do Programa!!");
		
	}

	private static void saidaDeDados(Integer[][] mat) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				System.out.print(mat[i][j] + " ");
				
			}
			
		}
	}

	private static void entradaDeDados(Integer[][] mat) {
		for (int i = 0; i < mat.length; i++) {

			for (int j = 0; j < mat.length; j++) {

				mat[i][j] = ((i +j) % 3);
			}
		}
	}
}
