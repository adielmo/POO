package com.java.matrizes;

import java.util.Iterator;

public class MatrizVertical {

	public static void main(String[] args) {

		int[][] matriz =new int[4][4];
		int val=1;
		
		for(int coluna=matriz.length-1; coluna >= 0; coluna--) {
			//int val=1;

			for(int linha=0; linha < matriz.length; linha++) {
				
				matriz[linha][coluna]=val;
				val++;
			}
		}
for (int linha = 0; linha < matriz.length; linha++) {
			
			for (int coluna = 0; coluna < matriz.length; coluna++) {
				
				System.out.print(matriz[linha][coluna] + " ");
				
			}
			
			System.out.println();
		}
		
		/*
		 * for (int coluna = matriz.length-1; coluna >= 0; coluna--) {
		 * 
		 * for (int linha = 0; linha < matriz.length; linha++) {
		 * System.out.print(matriz[linha][coluna] + " ");
		 * 
		 * }
		 * 
		 * System.out.println(); }
		 */		
System.out.println();

for(int linha =0; linha < matriz.length; linha ++) {
	
	//System.out.print(matriz[linha][linha]+" ");
	
	System.out.print(matriz[linha][matriz.length-1 -linha] + " ");
}
System.out.println();
for(int linha =0; linha < matriz.length; linha ++) {
	
	System.out.print(matriz[linha][linha]+" ");
}
	}

}
