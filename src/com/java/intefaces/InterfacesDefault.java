package com.java.intefaces;

public class InterfacesDefault {

	public static void main(String[] args) {
		new Pessoa().corredor();
		new Pessoa().rapido();
		new Piloto().corredor();
		new Piloto().rapido();
	}

	interface Corredor {
		public abstract void corredor();

		default void rapido() {
			System.out.println("Correndo Default !!");
		}

	}

	static class Pessoa implements Corredor {

		@Override
		public void corredor() {
			System.out.println("Pessoa Correndo!!");
		}

	}

	static class Piloto implements Corredor {

		@Override
		public void corredor() {
			System.out.println("Piloto Correndo!!");

		}
		
		@Override
		public void rapido() {
			System.out.println("Piloto Rápido !!");
			//Corredor.super.rapido();
		}

	}

}
