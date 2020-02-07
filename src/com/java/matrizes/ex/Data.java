package com.java.matrizes.ex;

public class Data {
	public static void main(String[] args) {
		
		Integer[][] mat = new Integer[3][4]; 

		for (int i = 0; i < mat.length; i++) {

			for (int j = 0; j < mat.length; j++) {

				mat[i][j] = ((i +j) % 3);
			}
		}
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				System.out.print(mat[i][j] + " ");
				
			}
			
		}
	}
}
