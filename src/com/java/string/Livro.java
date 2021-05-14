package com.java.string;

public class Livro {

	
	private String titulo;
	private String isbn;
	private String autor;
	private String assunto;
	private Double valor;
	
	public Livro() {
		// TODO Auto-generated constructor stub
	}

	public Livro(String titulo, String isbn, String autor, String assunto, Double valor) {
		this.titulo = titulo;
		this.isbn = isbn;
		this.autor = autor;
		this.assunto = assunto;
		this.valor = valor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		isbn = isbn;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", isbn=" + isbn + ", autor=" + autor + ", assunto=" + assunto + ", valor="
				+ valor + "]";
	}
	
	
}
