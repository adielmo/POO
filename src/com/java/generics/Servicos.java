package com.java.generics;

import java.util.ArrayList;
import java.util.List;

public class Servicos<T> {
	List<T> list = new ArrayList<>();

	public void adicionar(T valor) {
		list.add(valor);
	}

	public void remover(T valor) {
		list.remove(valor);
	}

	public void imprimir() throws listaVaziaExecption {

		validarLista();

		for (T saida : list) {
			System.out.print(saida + " ");
		}
	}

	public void first() throws listaVaziaExecption {
		validarLista();
		System.out.println("\nFirst: "+ list.get(0));
	}

	private void validarLista() throws listaVaziaExecption {
		if (list.isEmpty()) {
			throw new listaVaziaExecption("Está lista está Vazia!!");
		}
	}

}
