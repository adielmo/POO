package com.java.array;

public class TesteFor {

	public static void main(String[] args) {
		int[] soma = new int[400]; 
				int count = 0;

		for (int i = 0; i < 6; ++i) {
			for(int y=i; y < 3; ++y) {
				soma[y]=i * 400  + y;
			}
			for(int sum : soma) {
			System.out.println(sum);
			}
		/*	if (count < 100) {

				System.out.print(i+" ");
				count++;
			} else {
				System.out.println();
				count = 0;
				--i;
			} */
		}
	}

}
