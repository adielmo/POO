package com.java.estrutura;

import java.util.Arrays;

public class Teste {

	public static void main(String[] args) {
		
		//https://javarevisited.blogspot.com/2015/07/how-to-rotate-array-in-java-leetcode-solution.html?utm_source=dlvr.it&utm_medium=facebook#axzz7a3kv59Ul
		int[] input = { 1, 2, 3, 4, 5, 6, 7 };

		System.out.println(Arrays.toString(input));
		System.out.println(Arrays.toString(rotate(input, 3)));
		int[] sample = { 1, 2, 3, 4, 5, 6, 7 };
		rotateInPlace(sample, 3);
		System.out.println(Arrays.toString(sample));
	}

	public static int[] rotate(int[] nums, int k) {
		int[] rotated = new int[nums.length];

		for (int i = k + 1, j = 0; i < nums.length; i++, j++) {
			rotated[j] = nums[i];
		}

		for (int i = 0, j = rotated.length - 1 - k; i <= k; i++, j++) {
			rotated[j] = nums[i];
		}

		return rotated;

	}

	public static void rotateInPlace(int[] input, int index) {
		reverse(input, 0, index);
		reverse(input, index + 1, input.length - 1);
		reverse(input, 0, input.length - 1);
	}

	public static void reverse(int[] input, int startIdx, int endIdx) {
		int length = startIdx + endIdx;

		for (int i = startIdx, j = endIdx; i <= length / 2; i++, j--) {
			int temp = input[j];
			input[j] = input[i];
			input[i] = temp;
		}
	}
}
