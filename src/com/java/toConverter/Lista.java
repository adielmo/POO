package com.java.toConverter;

public class Lista<T>{
	
	private T[] elementos;
	private int tamanho;
	
	@SuppressWarnings("unchecked")
	public Lista(int capadidade) {
		this.elementos = (T[])new Object[capadidade];
		this.tamanho = 0;
	}	
	
/*	public Lista(int capadidade, Class<T> tipoClasse) {
		this.elementos = (T[]) Array.newInstance(tipoClasse, capadidade);
		this.tamanho = 0;
	}*/
	
	 public boolean adiciona(int posicao, T elemento) {		 
				           
		// Qualquer coisa diferente disso! --> ENTRA
		  this.validarPosicao(posicao);
		  
		  this.aumentarCapacidade();
		  
		for(int i=this.tamanho -1; i >= posicao; i--) {
			this.elementos[i +1] = this.elementos[i];			
		}
		  this.elementos[posicao] = elemento;
		  this.tamanho ++;
		  
		 return true;
		  
	  }

	
	public boolean adiciona(T elemento) {

		this.aumentarCapacidade();
		
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;

			return true;
		}
		return false;
	}
	
	public void aumentarCapacidade() {
		if (this.tamanho == this.elementos.length) {
			
	@SuppressWarnings("unchecked")
	T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
			
		for(int i=0; i < elementos.length; i++) {
			elementosNovos[i] = this.elementos[i];
		}
	    this.elementos = elementosNovos;
			
		}
	}
	
	public void remove(int posicao) {
		
	validarPosicao(posicao);
	
		for(int i=posicao; i < this.tamanho - 1; i++) {
			this.elementos[i] = this.elementos[i +1];
		}
			this.tamanho --;
		
	}
	public T obetem(int posicao) {
		return this.busca(posicao);
	}
	
	public T busca(int posicao) {
	this.validarPosicao(posicao);
		
		return this.elementos[posicao];
	}
	
	public int busca(T elemento) {
		for (int i = 0; i < tamanho; i++) {
			if (this.elementos[i].equals(elemento)) {
				return i;
			}


		}
		return -1;
	}
	public int ultimoIndice(T elemento){
		
		for(int i=this.tamanho-1; i >= 0; i--) {
			if (this.elementos[i].equals(elemento)) {
				return i;
			}
			
		}
		return -1;
	}
	
	public void remove(T elemento) {
		int pos = this.busca(elemento);
            if (pos > -1) {
				this.remove(pos);
			}
	}
	
	public boolean contem(T elemento) {
		return busca(elemento) > -1;
	}

		 
	public void quantidade() {
		System.out.println("Quantidade de posição ocupada " + this.tamanho);
	}
	public void limpar() {
		//this.tamanho =0;
		for(int i=0; i < this.tamanho; i++) {
			this.elementos[i] = null;
		}
		this.tamanho=0;
	}
	
	public int tamanho() {
		return this.tamanho;
	}
	
	@Override
	public String toString() {
	StringBuilder sb = new StringBuilder();
	sb.append("[");
	
	for(int i=0; i < this.tamanho-1; i++) {
		sb.append(this.elementos[i]);
		sb.append(", ");
	}
	
	if (this.tamanho > 0) {
		sb.append(this.elementos[this.tamanho - 1]);
	}
 
	sb.append("]");
	 return sb.toString();
	
	} 


	private void validarPosicao(int posicao) {
		if (!(posicao >= 0 && posicao < this.tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		}
	}
        	
	

}
