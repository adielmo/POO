package com.java.collection.generics;

import java.util.ArrayList;
import java.util.List;

public class ClassGenerics<T> {
	
	List<T> lists = new ArrayList<>();
	
	
	public void adicionar(T t) {
		lists.add(t);
	}

	public T getPrimeiro() {
		estaVazia();
		return lists.get(0);
	}
	
	public T getUltimo() {
		estaVazia();
		return lists.get(lists.size() -1);
	}
	
	public T getPosicao(Integer i) {
		estaVazia();
		if (i > lists.size()) {
		throw new TratarException(String.format("Posição %d não existe na lista", i));	
		}
		return lists.get(i);
	}

	
	public void getImprimir() {
		estaVazia();
		System.out.print("List: ");
		for (int i = 0; i < lists.size(); i++) {
		System.out.print(lists.get(i) + ", ");	
		}
	}
	
	private void estaVazia() {
		if (lists.isEmpty()) {
			throw new TratarException("Está vazio!");
		}
	}

}
