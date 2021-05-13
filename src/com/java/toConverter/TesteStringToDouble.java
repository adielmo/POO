package com.java.toConverter;

import java.util.Scanner;

public class TesteStringToDouble {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String value = "";
		Array<Double> array = new Array<>(1);

		for (int i = 0; i < array.tamanho(); i++) {

			System.out.println("Digete um Número na Posição do Array:" + i);
			value = scanner.next();
			array.adiciona(Double.parseDouble(value));

		}

	}

	static class Array<T> {

		private T[] elementos;
		private int tamanho;

		/*
		 * public Array() { this.elementos = (T[]) new Object[1]; this.tamanho=0; }
		 */

		public Array(int tamanho) {
			this.elementos = (T[]) new Object[tamanho];
			this.tamanho = 0;
		}

		public boolean adiciona(T elemento) {
			aumentarTamanho();

			if (this.tamanho < this.elementos.length) {
				this.elementos[this.tamanho] = elemento;
				this.tamanho++;

				return true;
			}
			return false;
		}

		public int tamanho() {

			return this.tamanho;
		}

		public void aumentarTamanho() {
			if (this.tamanho == elementos.length) {

				@SuppressWarnings("unchecked")
				T[] novoArray = (T[]) new Object[elementos.length * 2];

				for (int i = 0; i < elementos.length; i++) {
					novoArray[i] = elementos[i];
				}
				this.elementos = novoArray;
			}

		}

	}
}
